import cv2
import numpy as np
import base64

def main(data,rowsx,columnx):

    #img=cv2.imread("S__3710995.jpg")
    #orig=image.copy()
    decoded_data = base64.b64decode(data)
    np_data = np.fromstring(decoded_data,np.uint8)
    img = cv2.imdecode(np_data, cv2.IMREAD_UNCHANGED)

    grey = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

    blurr = cv2.GaussianBlur(grey, (5,5),0)


    edge = cv2.Canny(blurr, 0, 50)

    (contours, _) = cv2.findContours(edge, cv2.RETR_LIST, cv2.CHAIN_APPROX_SIMPLE)
    contours = sorted(contours, key=cv2.contourArea, reverse= True)


    for i in contours:
        elip =  cv2.arcLength(i, True)
        approx = cv2.approxPolyDP(i,0.08*elip, True)

        if len(approx) == 4 :
            doc = approx
            break


    cv2.drawContours(img, [doc], -1, (0, 255, 0), 2)


    doc=doc.reshape((4,2))


    new_doc = np.zeros((4,2), dtype="float32")

    Sum = doc.sum(axis = 1)
    new_doc[0] = doc[np.argmin(Sum)]
    new_doc[2] = doc[np.argmax(Sum)]

    Diff = np.diff(doc, axis=1)
    new_doc[1] = doc[np.argmin(Diff)]
    new_doc[3] = doc[np.argmax(Diff)]

    (tl,tr,br,bl) = new_doc


    dist1 = np.linalg.norm(br-bl)
    dist2 = np.linalg.norm(tr-tl)

    maxLen = max(int(dist1),int(dist2))

    dist3 = np.linalg.norm(tr-br)
    dist4 = np.linalg.norm(tl-bl)

    maxHeight = max(int(dist3), int(dist4))

    dst = np.array([[0,0],[maxLen-1, 0],[maxLen-1, maxHeight-1], [0, maxHeight-1]], dtype="float32")

    N = cv2.getPerspectiveTransform(new_doc, dst)
    warp = cv2.warpPerspective(img, N, (maxLen, maxHeight))

    img2 = cv2.cvtColor(warp, cv2.COLOR_BGR2GRAY)
    img2 = cv2.resize(img2,(1200,1600))

    orig2=img2
    ######################################################################################################################

    def sort_contours(cnts, method="left-to-right"):

        reverse = False
        i = 0

        if method == "right-to-left" or method == "bottom-to-top":
            reverse = True

        if method == "top-to-bottom" or method == "bottom-to-top":
            i = 1

        boundingBoxes = [cv2.boundingRect(c) for c in cnts]
        (cnts, boundingBoxes) = zip(*sorted(zip(cnts, boundingBoxes),key=lambda b: b[1][i], reverse=reverse))

        return (cnts, boundingBoxes)


    print("Reading image..")
    img=orig2
    (thresh, img_bin) = cv2.threshold(img, 128, 255,cv2.THRESH_BINARY | cv2.THRESH_OTSU)  # Thresholding the image
    img_bin = 255-img_bin  # Invert the image

    print("Storing binary image to Images/Image_bin.jpg..")
    print("Applying Morphological Operations..")
    kernel_length = np.array(img).shape[1]//40

    verticle_kernel = cv2.getStructuringElement(cv2.MORPH_RECT, (1, kernel_length))

    hori_kernel = cv2.getStructuringElement(cv2.MORPH_RECT, (kernel_length, 1))
    kernel = cv2.getStructuringElement(cv2.MORPH_RECT, (3, 3))
    img_temp1 = cv2.erode(img_bin, verticle_kernel, iterations=3)
    verticle_lines_img = cv2.dilate(img_temp1, verticle_kernel, iterations=3)
    img_temp2 = cv2.erode(img_bin, hori_kernel, iterations=3)
    horizontal_lines_img = cv2.dilate(img_temp2, hori_kernel, iterations=3)

    alpha = 0.5
    beta = 1.0 - alpha

    img_final_bin = cv2.addWeighted(verticle_lines_img, alpha, horizontal_lines_img, beta, 0.0)
    img_final_bin = cv2.erode(~img_final_bin, kernel, iterations=2)
    (thresh, img_final_bin) = cv2.threshold(img_final_bin, 128, 255, cv2.THRESH_BINARY | cv2.THRESH_OTSU)

    print("Binary image which only contains boxes: Images/img_final_bin.jpg")

    contours, hierarchy = cv2.findContours(img_final_bin, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)

    (contours, boundingBoxes) = sort_contours(contours, method="top-to-bottom")

    print("Output stored in Output directiory!")

    count=0
    for c in contours:

        x, y, w, h = cv2.boundingRect(c)

        if (w > 80 and h > 20) and w > 3*h :
            pass
        else :
            count+=1

    rows=int(rowsx)
    column=int(columnx)
    # rows=10
    # column=5
    print('nutttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt')
    print(rows)
    print(column)
    sum=(rows*column)
    count-=(rows*column)
    count2=0
    count3=1
    idx = 0
    ListX=[]
    ListY=[]
    for c in contours:
        x, y, w, h = cv2.boundingRect(c)

        if (w > 80 and h > 20) and w > 3*h :
            pass
        else :
            idx+=1
            if(idx>count):
                print(count3,' ',count2)
                ListX.append(x)
                ListY.append(y)
                print(x)
                print(y)
                count3+=1

    print('xxxxxxxxxxxxxxxxxxxxxxxxx')
    print(ListX)
    def divide_chunks(l, n):
        for i in range(0, len(l), n):
            yield l[i:i + n]
            print(l[i:i + n])
    x = list(divide_chunks(ListX, column))
    print('xxxxxxxxxxxxxxxxxxxxxxxxx')
    def divide_chunks(l, n):
        for i in range(0, len(l), n):
            yield l[i:i + n]
            print(l[i:i + n])
    y = list(divide_chunks(ListY, column))
    #print(x)
    print('oooooooooooooooooooooo')
    a=x
    b=y
    temp=[]
    temp2=[]
    sortt=[]
    num=1
    sortt2=[]
    for i in range(len(a)):
        temp.clear()
        temp2.clear()
        for j in range(len(a[i])):
            print(num,'x',a[i][j], end=' ')
            print('y',b[i][j], end=' ')
            temp.append(a[i][j])
            temp2.append(b[i][j])
            num+=1
        l=temp
        l2=temp2
        for i in range(len(l)):
            for j in range(i + 1, len(l)):
                if l[i] > l[j]:
                    l[i], l[j] = l[j], l[i]
                    l2[i], l2[j] = l2[j], l2[i]
        print()
        sortt= sortt+l
        sortt2= sortt2+l2
    print('xxxxxxxxxxxxxxxxxxxxxxxxx')
    print(temp)
    print('xxxxxxxxxxxxxxxxxxxxxxxxx')
    print(sortt)
    print(sortt2)
    print('oooooooooooooooooooooooooooo')
    nub=0
    sum=sum
    ans=''
    mylist1=[]
    mylist2=[]
    ans=''
    for c in contours:
        x, y, w, h = cv2.boundingRect(c)

        if (w > 80 and h > 20) and w > 3*h :
            pass
        else :
            idx+=1
            if(idx>count  and w<100 and h<100):
                for x2 in range(sum):
                    if(x==sortt[x2] and y==sortt2[x2]):
                        new_img = img[y+3:y+h-3, x+3:x+w-3]
                        n_pix = np.sum(new_img <= 150)
                        white = np.sum(new_img == 255)
                        print(str(x2+1),' Black pixels:', n_pix)
                        #ans+=str(x2+1),' Black pixels:', str(n_pix),'\n'
                        ans+=str(x2+1)
                        ans+=' Black pixels:'
                        ans+=str(n_pix)
                        ans+='\n'
                        #mylist1.append(str(x2+1))
                        #mylist2.append(str(n_pix))
    #endstring1 = ' '.join(mylist1)
    #endstring2 = ' '.join(mylist2)]
    #endstring3=endstring1+'x'+endstring2
    #print(ans)

    return ans
