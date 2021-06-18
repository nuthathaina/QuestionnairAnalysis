
import base64
import cv2
import numpy as np

def main(data,rowx):
    #image_path='que.jpg'
    #image = cv2.imread(image_path)
    print(rowx.split())
    print('xxxxxxxxxxxx')

    decoded_data = base64.b64decode(data)
    np_data = np.fromstring(decoded_data,np.uint8)
    image = cv2.imdecode(np_data, cv2.IMREAD_UNCHANGED)

    print(image.shape)
    ori = image.copy()
    image = cv2.resize(image, (image.shape[1]//10,image.shape[0]//10))
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    gray = cv2.GaussianBlur(gray, (11,11), 0)
    edged = cv2.Canny(gray, 75, 200)
    print("STEP 1: Edge Detection")
    cnts = cv2.findContours(edged.copy(), cv2.RETR_LIST, cv2.CHAIN_APPROX_SIMPLE)
    cnts = sorted(cnts[0], key = cv2.contourArea, reverse = True)[:5]

    for c in cnts:

        peri = cv2.arcLength(c, True)
        approx = cv2.approxPolyDP(c, 0.01 * peri, True)
        screenCnt = approx
        if len(approx) == 4:
            screenCnt = approx
            break
        print("STEP 2: Finding Boundary")


    cv2.drawContours(image, [screenCnt], -1, (0, 255, 0), 2)


    ###############################################################


    plot_flag=True
    save_output=True
    out_folder='outs'

    decoded_data2 = base64.b64decode(data)
    np_data2 = np.fromstring(decoded_data2,np.uint8)
    image2 = cv2.imdecode(np_data2, cv2.IMREAD_UNCHANGED)

    ###############################################################
    x,y,w,h = cv2.boundingRect(screenCnt)
    h=h*10
    w=w*10
    x=x*10
    y=y*10
    cv2.rectangle(image2, (x, y), (x+w, y+h), (0, 255,0), 2)
    center = (x,y)
    center2 = (x+w,y+h)

    print(center)
    print(center2)


    new_img = image2[y+30:y+h,x+30:x+w]

    cv2.imwrite('image_edge5.jpg',new_img)

    ###############################################################



    image=new_img

    def plot(image,cmap=None):
        pass

    if plot_flag:
        plot(image)

    gray_scale=cv2.cvtColor(image,cv2.COLOR_BGR2GRAY)
    th1,img_bin = cv2.threshold(gray_scale,150,225,cv2.THRESH_BINARY)
    img_bin=~img_bin
    if plot_flag:
        plot(img_bin,'gray')
    if save_output:
        pass
    line_min_width = 15


    kernal_h = np.ones((1,line_min_width), np.uint8)
    kernal_v = np.ones((line_min_width,1), np.uint8)

    img_bin_h = cv2.morphologyEx(img_bin, cv2.MORPH_OPEN, kernal_h)
    if plot_flag:
        plot(img_bin_h,'gray')
    if save_output:
        pass
    img_bin_v = cv2.morphologyEx(img_bin, cv2.MORPH_OPEN, kernal_v)
    if plot_flag:
        plot(img_bin_v,'gray')
    if save_output:
        pass
    img_bin_final=img_bin_h|img_bin_v
    if plot_flag:
        plot(img_bin_final,'gray')
    if save_output:
        pass

    final_kernel = np.ones((3,3), np.uint8)
    img_bin_final=cv2.dilate(img_bin_final,final_kernel,iterations=1)
    if plot_flag:
        plot(img_bin_final,'gray')
    if save_output:
        pass
    ret, labels, stats,centroids = cv2.connectedComponentsWithStats(~img_bin_final, connectivity=8, ltype=cv2.CV_32S)
    def imshow_components(labels):
        label_hue = np.uint8(179*labels/np.max(labels))
        empty_channel = 255*np.ones_like(label_hue)
        labeled_img = cv2.merge([label_hue, empty_channel, empty_channel])
        labeled_img = cv2.cvtColor(labeled_img, cv2.COLOR_HSV2BGR)
        labeled_img[label_hue==0] = 0
        return labeled_img

    out_image=imshow_components(~labels)
    if plot_flag:
        plot(out_image)
    if save_output:
        pass
    AnsFinal=''
    #row=[2,2,2,3]
    rowx2=rowx.split()

    #list = ['1' , '2', '3']
    row = []
    for i in range(len(rowx2)):
        t = int(rowx2[i])
        row.append(t)

    #print row

    num=0
    List=[]
    ListX=[]
    ListY=[]
    ListX1=[]
    ListY1=[]
    AllX=[]
    AllY=[]
    #cropped_dir_path="./Output3/"
    for x,y,w,h,area in stats[2:]:
        #     cv2.putText(image,'box',(x-10,y-10),cv2.FONT_HERSHEY_SIMPLEX, 1.0,(0,255,0), 2)
        cv2.rectangle(image,(x,y),(x+w,y+h),(255,255,255),2)
        new_img = image[y:y+h, x:x+w]
        if(h<=10 or w<=10):
            pass
        else:
            n_pix = np.sum(new_img <= 167)
            #print(str(num),' Black pixels:', n_pix)
            #print(str(num),x,' ',y)
            #print(str(num),h,' ',w)
            List.append(h)
            List.append(w)
            minH1=List[0]+3
            minH2=List[0]-3
            minW1=List[1]+3
            minW2=List[1]-3
            #cv2.imwrite( cropped_dir_path+str(num) + '.png', new_img)
            if(h>minH2 and h<minH1 and w>minW2 and w<minW1):
                print(str(num),y,' ',x)
                ListX.append(y)
                ListY.append(x)
                ListX1.append(y)
                ListY1.append(x)
                AllX.append(y)
                AllY.append(x)
                #print(str(num),h,' ',w)
                pass
                num+=1
    print('xxxxxxxxxxx')
    All=[]
    for i in range(len(AllX)):






        tempX=AllX[i]
        tempY=AllY[i]
        temp=[tempX,tempY]
        All.append(temp)

    print(All)
    for i in range(len(All)):
        for j in range(len(All[i])):
            print(All[i][j], end=' ')
        print()


    print(sorted(All, key = lambda x: x[0]))
    num1=0
    num2=-1
    num3=0
    temp=[]
    tempArr=[]
    ArrSortX=[]
    ArrSortY=[]
    for i in range(len(row)):
        temp.clear()
        tempArr.clear()
        if(i==0):
            num3=0

        if(i==1):
            num3=row[i-1]

        print(num3)
        temp.append(num3)
        for num1 in range(row[i]):
            #print(All[num1])
            num1+=1
            num2+=1

        num3=num2+1
        print(num2)
        temp.append(num2)
        for x in range(temp[0],temp[1]+1):
            print(All[x])
            tempArr.append(All[x])
        print(tempArr)
        tempSort=sorted(tempArr, key = lambda x: x[1])
        print(tempSort)
        print('xxxxxxx')
        for i in range(len(tempSort)):
            for j in range(len(tempSort[i])):
                print(tempSort[i][j], end=' ')
                #print(j)
            ArrSortX.append(tempSort[i][0])
            ArrSortY.append(tempSort[i][1])
            print()

    print(ArrSortX)
    print(ArrSortY)
    #print(temp)
    num=0
    List=[]
    ListX=[]
    ListY=[]
    ListX1=[]
    ListY1=[]
    AllX=[]
    AllY=[]
    ans=''
    #cropped_dir_path="./Output3/"
    for x,y,w,h,area in stats[2:]:
        #     cv2.putText(image,'box',(x-10,y-10),cv2.FONT_HERSHEY_SIMPLEX, 1.0,(0,255,0), 2)
        cv2.rectangle(image,(x,y),(x+w,y+h),(255,255,255),2)
        new_img = image[y:y+h, x:x+w]
        if(h<=10 or w<=10):
            pass
        else:
            n_pix = np.sum(new_img <= 167)

            if(h>minH2 and h<minH1 and w>minW2 and w<minW1):

                for i in range(len(ArrSortX)):
                    if(y==ArrSortX[i] and x==ArrSortY[i]):
                        #print(str(num),y,' ',x)
                        #AllX.append(y)
                        #AllY.append(x)
                        n_pix = np.sum(new_img <= 167)
                        white = np.sum(new_img == 255)
                        print(str(i),' Black pixels:', n_pix)
                        ans+=str(i)
                        ans+=' Black pixels:'
                        ans+=str(n_pix)
                        ans+='\n'
                        #cv2.imwrite( cropped_dir_path+str(i) + '.png', new_img)
                        #pass
                pass
                num+=1


    print(ans)
    if plot_flag:
        plot(image)
    if save_output:
        pass
    ans2='xxxxxx'
    return ans
