package com.elevenzon.image;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ProcessActivity extends AppCompatActivity {
    private static String NumCheckbox="3";
    private String filePath = null;
    private TextView textView2;
    private ArrayList<String> picList = new ArrayList<>();
    //    private BitmapDrawable drawable;
//    private Bitmap bitmap;
    private String imageString="";
    private PyObject pyo;
    private PyObject pyo2;
    private Python py;
    private ImageView img;
    private Uri imageUri;;
    private ArrayList<Uri> ImageList = new ArrayList<Uri>();
    private String dropdown="";
    private Spinner spinner;
    //    private DatabaseReference dbRef;
    private TextView txt;
    private static String str="";
    private String pathfrom="";
    public static String text="0000";
    private static ArrayList<String> imageList = new ArrayList<>();
    private int count=0;
    private int countNo=0;
    private int countYes=0;
    private String error="";
    private String[] arr;
    private ProgressBar pgsBar;
    private Button showbtn, hidebtn;
    private String rowpython2="2 2 2 3";
    private static String rowsx="5";
    private static String  columnx="10";
    private int inNo[]= new int[50];
    //    private String NumCheckbox="3";
    OnClickListener listener1 = null;
    OnClickListener listener2 = null;
    Button button1;
    Button button2;
    private static ArrayList<Integer> inNo2 = new ArrayList<Integer>();
    private static ArrayList<String> all = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);

//Questionnaire
        final String QuestionnaireName = getIntent().getStringExtra("textName");
        final String CheckboxAmount = getIntent().getStringExtra("textCheckbox");
        final String SatisficationAmount = getIntent().getStringExtra("textSatis");
        final String LevelFrom = getIntent().getStringExtra("textLvFrom");
        final String LevelTo = getIntent().getStringExtra("textLvTo");
        final int level = Math.abs(Integer.valueOf(LevelFrom)-Integer.valueOf(LevelTo))+1;
        String level2=String.valueOf(level);

        //Checkbox
        final ArrayList nameCB = getIntent().getStringArrayListExtra("nameCB");
        final ArrayList ansCB = getIntent().getStringArrayListExtra("ansCB");
        final ArrayList Question2CB = getIntent().getIntegerArrayListExtra("Question2CB");
        final ArrayList Choice2CB = getIntent().getIntegerArrayListExtra("Choice2CB");
//
        final ArrayList row2CB = getIntent().getIntegerArrayListExtra("row2CB");


//
        final ArrayList eachLineCB = getIntent().getIntegerArrayListExtra("eachLineCB");
        final ArrayList eachNoCB = getIntent().getIntegerArrayListExtra("eachNoCB");

        //Table
        final ArrayList Question2TB = getIntent().getIntegerArrayListExtra("Question2TB");
        final ArrayList nameTB = getIntent().getIntegerArrayListExtra("nameTB");



        String tempx="";
        for (int i = 0; i < row2CB.size(); i++){
            if(i==row2CB.size()-1){
                tempx+=row2CB.get(i);
            }else{
                tempx+=row2CB.get(i)+" ";
            }
        }

        rowpython2=tempx;
        rowsx=level2;
        columnx=SatisficationAmount;

        for (int i = 0; i < Question2CB.size(); i++){
            inNo[Integer.parseInt(String.valueOf(Question2CB.get(i)))]++;

        }

        for (int i = 0; i < inNo.length; i++){
            if(inNo[i]==0){

            }else{
                inNo2.add(inNo[i]);
            }
        }



        ArrayList<String> sum = new ArrayList<String>();
        ArrayList<Integer> first = new ArrayList<Integer>();
        for(int i=0;i<Choice2CB.size();i++){
            if(String.valueOf(Choice2CB.get(i)).equalsIgnoreCase("1")){
                first.add(i);
            }
        }
        int num=0;
        for(int i=0;i<first.size();i++){
            sum.add(String.valueOf(nameCB.get(first.get(i))));
        }

        for(int i=0;i<nameTB.size();i++){
            sum.add((String)nameTB.get(i));
        }


        TextView textView7 = findViewById(R.id.textView7);
        textView7.setText(QuestionnaireName+"\n"+CheckboxAmount+"\n"+SatisficationAmount+"\n"+LevelFrom+"\n"+LevelTo+"\n"+"\n"+
                nameCB+"\n"+ansCB+"\n"+Question2CB+"\n"+Choice2CB+"\n"+row2CB+"\n"+eachLineCB+"\n"+eachNoCB+"\n"+"\n"
                +Question2TB+"\n"+nameTB+"\n\n"+tempx+"\n\n"+inNo2+"\n\n"+sum);

//        for(int i=0;i<sum.size();i++){
//            all.add(sum.get(i));
//        }

        for(int i=0;i<sum.size();i++){
            eachLineCB.add(sum.get(i));
        }

        textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        pathfrom = intent.getStringExtra("data");
//        textView2.setText(pathfrom);



        Button Next = findViewById(R.id.Next);
        Next.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
//                System.out.println("Button Clicked");
//                Toast.makeText(ProcessActivity.this, "Please check your usable photo!!!", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(ProcessActivity.this, MainActivity.class);
                intent.putExtra("data2", str);
                intent.putExtra("textName",QuestionnaireName);
                intent.putExtra("textCheckbox",CheckboxAmount);
                intent.putExtra("textSatis",SatisficationAmount);
                intent.putExtra("textLvFrom",LevelFrom);
                intent.putExtra("textLvTo",LevelTo);

                intent.putStringArrayListExtra("nameCB",nameCB);
                intent.putStringArrayListExtra("ansCB",ansCB);
                intent.putIntegerArrayListExtra("Question2CB",Question2CB);
                intent.putIntegerArrayListExtra("Choice2CB",Choice2CB);
                intent.putIntegerArrayListExtra("row2CB",row2CB);
                intent.putIntegerArrayListExtra("eachLineCB",eachLineCB);
                intent.putIntegerArrayListExtra("eachNoCB",eachNoCB);

                intent.putIntegerArrayListExtra("Question2TB",Question2TB);
                intent.putStringArrayListExtra("nameTB",nameTB);

                startActivity(intent);
            }
        });

        Button Back = findViewById(R.id.Back);
        Back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
//                System.out.println("Button Clicked");
                openActivity3();
                imageList.clear();
            }
        });
        imageList.clear();
        String[] image = pathfrom.split("\n");
        for (int i=0;i<image.length;i++){
            String temp="";
            String[] temp2 = image[i].split("/");
            if(temp2[0].equalsIgnoreCase("file:")){
                for (int j=1;j<temp2.length;j++){
                    temp+="/"+temp2[j];
                }
                imageList.add(temp);
            }else if(!temp2[0].equalsIgnoreCase("file:")){
//                for (int j=0;j<temp2.length;j++){
//                    temp+="/"+temp2[j];
//                }
                temp=image[i];
                imageList.add(temp);
            }


        }
//        textView2.setText(pathfrom+"\n"+ imageList);


        if(!Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        py = Python.getInstance();
        pyo = py.getModule("table");
        pyo2 = py.getModule("checkbox");

//        textView2 = (TextView) findViewById(R.id.textView2);


//        final Button cameraBtn = (Button) findViewById(R.id.cameraBtn);
        final Button galleryBtn = (Button) findViewById(R.id.galleryBtn);


//        cameraBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(intent, 0);
//            }
//        });

        galleryBtn.setOnClickListener(new OnClickListener() {

                                          @Override
                                          public void onClick(View v) {
                                              Button Next = findViewById(R.id.Next);
                                              Next.setVisibility(View.VISIBLE);
                                              Button Back = findViewById(R.id.Back);
                                              Back.setVisibility(View.VISIBLE);
//                                              TextView wait = (TextView) findViewById(R.id.wait);
//                                              wait.setVisibility(View.VISIBLE);
//                                              pgsBar.setVisibility(v.VISIBLE);
                                              for(int i=0; i<imageList.size(); i++) {

//                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
//                intent.setType("image/*");
//                startActivityForResult(Intent.createChooser(intent, "Select photo from"), 1);
                                                  String str2 = "";
                                                  str2 = "";
//                uploadImage(ImageList.get(i));

//                filePath = getImageFilePath(ImageList.get(i));
//                filePath = Environment.getExternalStorageDirectory()+ "/storage/emulated/0/Download/image0(1).jpg";
//                filePath="/storage/emulated/0/Download/test(1).jpg";
//                File f = new File(filePath);
//                str2+=filePath;
//                str2+="\n";
//                String fileName = f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf("/")+1);

                                                  String pathname = imageList.get(i);
//                String pathname=pathfrom;
                                                  try {
//                    Uri uri = ImageList.get(i);
//                    Uri uri = Uri.parse("content://com.android.providers.media.documents/document/image%3A36");
//                    String test= String.valueOf(uri);
//                    str2+=test;
//                    str2+="\n";
                                                      //show path of file
//                    filePath = getImageFilePath(uri);
//                    filePath = "/storage/emulated/0/Download/test1.jpeg";
//                    txt.setText(fileName);

//                    str2+=filePath;
//                        str += "\n";

//                ImageProcess(filePath);

                                                      //                        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//                        imageView.getLayoutParams().height = 400;
                                                      //start convert image to bitmap
//                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);

//                    imageUri = Uri.parse("content://com.android.providers.media.documents/document/image%3A37");


                                                      Bitmap bitmap = BitmapFactory.decodeFile(imageList.get(i));


                                                      ExifInterface exif = new ExifInterface(pathname);
                                                      int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                                                      Log.d("EXIF", "Exif: " + orientation);
                                                      Matrix matrix = new Matrix();
                                                      if (orientation == 6) {
                                                          matrix.postRotate(90);
                                                      } else if (orientation == 3) {
                                                          matrix.postRotate(180);
                                                      } else if (orientation == 8) {
                                                          matrix.postRotate(270);
                                                      }
                                                      bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true); // rotating bitmap
                                                      imageString = getStringImage(bitmap);


                                                      PyObject obj = pyo.callAttr("main", imageString,columnx,rowsx);
//                        textView.setText(obj.toString());
                                                      PyObject obj2 = pyo2.callAttr("main", imageString,rowpython2);
//                        str="";
//                        str2+=checkbox.toString();
//                        str2 += obj2.toString();
                                                      String a=obj2.toString();
                                                      String[] arr = a.split("\n");
                                                      ArrayList<Integer> NoCheckBox = new ArrayList<Integer>();
                                                      ArrayList<Integer> BlackCheckBox = new ArrayList<Integer>();
                                                      for(int j=0;j<arr.length;j++){
                                                          String[] temp1 = arr[j].split(" Black pixels:");
                                                          int x=Integer.parseInt(temp1[0]);
                                                          NoCheckBox.add(x);
                                                          int y=Integer.parseInt(temp1[1]);
                                                          BlackCheckBox.add(y);
                                                      }


                                                      int no[] = new int[NoCheckBox.size()];
                                                      int black[] = new int[BlackCheckBox.size()];
                                                      for (int j=0;j<BlackCheckBox.size();j++){
                                                          no[j]=NoCheckBox.get(j);
                                                          black[j]= BlackCheckBox.get(j);
                                                      }

//                        str2+=Arrays.toString(no)+"\n"+Arrays.toString(black);

//                        str2+=Arrays.toString(MaxInCheckBox(no,black));
//                        str2+="\n";
                                                      str2 += "";
                                                      str2+=Checkbox(MaxInCheckBox(no,black));
//                        str2 += "oooooooooooo\n";



//                        str2 += obj.toString();
                                                      String b=obj.toString();
//                        str2+=b;
                                                      String[] arr2 = b.split("\n");
                                                      ArrayList<Integer> NoTable = new ArrayList<Integer>();
                                                      ArrayList<Integer> BlackTable = new ArrayList<Integer>();
                                                      for(int j=0;j<arr2.length;j++){
                                                          String[] temp1 = arr2[j].split(" Black pixels:");
                                                          int x=Integer.parseInt(temp1[0]);
                                                          NoTable.add(x);
                                                          int y=Integer.parseInt(temp1[1]);
                                                          BlackTable.add(y);
                                                      }

                                                      int no2[] = new int[NoTable.size()];
                                                      int black2[] = new int[BlackTable.size()];
                                                      for (int j=0;j<BlackTable.size();j++){
                                                          no2[j]=NoTable.get(j);
                                                          black2[j]= BlackTable.get(j);
                                                      }

//                        str2+=Arrays.toString(no2)+"\n"+Arrays.toString(black2);

//                        str2+=Arrays.toString(MaxInTable(no2,black2));
//                        str2+="\n";
//                        str2+=NoTable+"\n"+BlackTable;
                                                      str2+=Table(MaxInTable(no2,black2));
                                                  } catch (Exception e) {
                                                      error+=pathname+"\n";
                                                      Log.e("Log", "Error on saving file");
                                                      str2 += "oooooooooooo\n";
                                                      str2+="- Please try again later -\n";
                                                      countNo++;
                                                  }

                                                  str += pathname + "\n" + str2 + "xxxxxxxxxxxx\n";
                                                  count++;
                                              }

                                              countYes=count-countNo;

                                              String strlast="You choose photos "+count+" photos \n Please try again later "+countNo+" photos of "+count+" photos";;
                                              TextView txtList = (TextView) findViewById(R.id.txtList);
                                              txtList.setText("\n"+strlast+"\n\n"+error);
//                                              pgsBar.setVisibility(v.GONE);

                                          }
                                      }
        );
    }


    public void openActivity2() {

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("data2", str);
        startActivity(intent);
        //        startActivity(intent);

    }

    public void openActivity3() {

        Intent intent = new Intent(this, ImagesActivity.class);
//        intent.putExtra("data2", str);
        startActivity(intent);
        //        startActivity(intent);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView txt = (TextView) findViewById(R.id.textView);
        //camera

        if (requestCode == 0 && resultCode == Activity.RESULT_OK) {

//            ImageProcess();
            try {
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.getLayoutParams().height = 400;
                imageView.setImageBitmap(imageBitmap);
                Uri tempUri = getImageUri(getApplicationContext(), imageBitmap);
                File f = new File(getRealPathFromURI(tempUri));
//                File f = new  File("/storage/emulated/0/Download/image0(1).jpg");


                filePath = f.toString();

                String fileName = f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf("/") + 1);
                Log.e("filename", fileName + " " + filePath);
                txt.setText(fileName);

            } catch (Exception e) {
                Log.e("filename", "Error from Camera Activity");
            }

        }

        int count=0;


        if(requestCode == 1 && resultCode == RESULT_OK){


            if (data.getClipData() != null) {
                str+="nuttttttttt";
                count = data.getClipData().getItemCount();
                int CurrentImageSelect = 0;
                while (CurrentImageSelect < count) {
                    imageUri = data.getClipData().getItemAt(CurrentImageSelect).getUri();
//                    imageUri = Uri.parse("content://com.android.providers.media.documents/document/image%3A37");
//                    String t = String.valueOf(imageUri);
//                    str+= t;
                    ImageList.add(imageUri);
                    CurrentImageSelect++;
                }
            }
            else{
                str+="toppppppp";
                imageUri = data.getData();
//                imageUri = Uri.parse("content://com.android.providers.media.documents/document/image%3A37");
                ImageList.add(imageUri);
            }
//            checking area
//            TextView txtCount = (TextView) findViewById(R.id.txtCount);
//            txtCount.setText(String.valueOf(count));
            Toast.makeText(ProcessActivity.this, "You Have Selected "+ ImageList.size() +" Pictures" , Toast.LENGTH_SHORT).show();


            for(int i=0; i<ImageList.size(); i++){

            }

//            upload();


        }

//        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
//            try {
//                Uri uri = data.getData();
//                //show path of file
//                filePath = getImageFilePath(uri);
//                File f = new File(filePath);
//                String fileName = f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf("/") + 1);
//                txt.setText(fileName);
////                ImageProcess(filePath);
//
//                try {
//                    ImageView imageView = (ImageView) findViewById(R.id.imageView);
//                    imageView.getLayoutParams().height = 400;
//                    //start convert image to bitmap
//                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
//                    imageString = getStringImage(bitmap);
//
//                    PyObject obj = pyo.callAttr("main",imageString);
//                    textView.setText(obj.toString());
//
//                    imageView.setImageBitmap(bitmap);
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            } catch (Exception e) {
//                Log.e("Log", "Error on saving file");
//            }
//
//        }
    }

    public String getStringImage(Bitmap bitmap){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100,baos);
        byte[] imageBytes = baos.toByteArray();
        String encodedImage = android.util.Base64.encodeToString(imageBytes, Base64.DEFAULT);
        return  encodedImage;
    }

    //    public void ImageProcess() {
//
//    }
    public static int[] MaxInCheckBox(int[] no,int[] black) {
//        int choice[]= {2,4,3};
        int[] choice=new int[inNo2.size()];
        for (int i = 0; i < choice.length; i++){
            choice[i]=inNo2.get(i);
        }
        ArrayList<Integer> MaxNo = new ArrayList<Integer>();
        ArrayList<Integer> MaxScore = new ArrayList<Integer>();

        int sum= no.length;
        int nub = 0;
        for (int j = 0; j < sum; j++) {
            for (int i = 0; i < sum - j; i++) {
                if (no[i] > no[i + 1]) {
                    int z = no[i]; // swap
                    no[i] = no[i + 1];
                    no[i + 1] = z;

                    int z2 = black[i]; // swap
                    black[i] = black[i + 1];
                    black[i + 1] = z2;
                }
                if (i + 1 == no.length - 1) {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(no));
        System.out.println(Arrays.toString(black));
        int a=0;
        int b=1;
        int count=0;
        while(true) {
//			System.out.println(count);

            ArrayList<Integer> TempNo = new ArrayList<Integer>();
            ArrayList<Integer> TempScore = new ArrayList<Integer>();

            for (int i = a; i <= b; i++) {
//				System.out.print(i+" ");

                TempNo.add(i);
                TempScore.add(black[i]);

            }
            int TempNo2[]= new int[TempNo.size()];
            int TempScore2[]= new int[TempScore.size()];
            for (int i = 0; i < TempScore2.length; i++) {
                TempNo2[i]=TempNo.get(i);
                TempScore2[i]=TempScore.get(i);
            }

            System.out.println(Arrays.toString(TempNo2));
            System.out.println(Arrays.toString(TempScore2));
//			System.out.println(TempNo);
//			System.out.println(TempScore);


            int sum2= no.length;
            int nub2 = 0;
            for (int j = 0; j < sum2; j++) {
                for (int i = 0; i < sum2 - j; i++) {
                    if (TempScore2[i] > TempScore2[i + 1]) {
                        int z = TempScore2[i]; // swap
                        TempScore2[i] = TempScore2[i + 1];
                        TempScore2[i + 1] = z;

                        int z2 = TempNo2[i]; // swap
                        TempNo2[i] = TempNo2[i + 1];
                        TempNo2[i + 1] = z2;
                    }
                    if (i + 1 == TempScore2.length - 1) {
                        break;
                    }
                }
            }

            System.out.println(Arrays.toString(TempNo2));
            System.out.println(Arrays.toString(TempScore2));

            MaxNo.add(TempNo2[TempNo2.length-1]);
            MaxScore.add(TempScore2[TempScore2.length-1]);
//			System.out.println(a+" "+b);
            System.out.println();
            if(count==choice.length-1) {
                break;
            }
            count++;
            a=b+1;
            b=b+choice[count];

        }
        int maxNo2[] = new int[MaxNo.size()];
        for(int j=0;j<maxNo2.length;j++){
            maxNo2[j]=MaxNo.get(j);
        }
        System.out.println(MaxNo);
//    String MaxNo2 = String.valueOf(MaxNo);
//    System.out.println(MaxScore);
        return maxNo2;
    }
    public static String Checkbox(int[] max){
        String str="";
        for (int j = 0; j < max.length; j++) {
//            int[] choice= {2,4,3};
            int[] choice=new int[inNo2.size()];
            for (int i = 0; i < choice.length; i++){
                choice[i]=inNo2.get(i);
            }
            int no=choice.length;
            int sum=0;
            for (int i = 0; i < choice.length; i++) {
                sum+=choice[i];
            }
            int number = max[j];
            int a=0;
            int b=1;
            int num=1;
            int nub=1;
            while(true) {

//				System.out.println(a+" "+b);
                int count=0;
                for (int i = a; i <= b; i++) {
//					System.out.println(i);
                    count++;
                    if(i==number) {
                        System.out.println(""+nub);
//                        str+=(""+nub);
                        System.out.println("Score "+count);
//                        str+=(" Score "+count);
                        str+=(count);
                    }
                }
                if(number>=a && number<=b) {
//					System.out.println("Number "+number);

//					int choose=
                    break;
                }
                if(nub==no) {
                    break;
                }
                a=(b+1);
                b+=choice[num];
                num++;
                nub++;

            }
            System.out.println();
            str+="\n";
        }

        return str;
    }

    public  static String Table(int[] max){
        String str="";
//        int NumCheckbox2=Integer.parseInt(NumCheckbox);
        for (int i = 0; i < max.length; i++) {
            int number = max[i];
            int a=1;
            int b=Integer.parseInt(rowsx);
            int num=1;
            int row=Integer.parseInt(columnx);
            int column=Integer.parseInt(rowsx);
            int sum=row*column;
//            str+=Arrays.toString(max);
            while(true) {


                if (number >= a && number <=b) {
//					System.out.println("Number "+number);
                    System.out.println(""+num);
//                    str+=(""+num);
                    if((number%column)==0) {
//                        System.out.println("Score "+column);
//                        str+=(" Score "+column);
                        str+=(column);
                    }else {
                        System.out.println("Score "+number%column);
//                        str+=(" Score "+number%column);
                        str+=(number%column);
                    }

                }

                if(b==sum) {
                    break;
                }

                a+=column;
                b+=column;
                num++;
            }
            System.out.println();
            str+="\n";
        }
        return str;
    }

    public static int[] MaxInTable(int[] no, int[] black){
        int row = Integer.parseInt(columnx);
        int column = Integer.parseInt(rowsx);
        int sum = row * column;
        int a = 1;
        int b = Integer.parseInt(rowsx);

        ArrayList<Integer> MaxNo = new ArrayList<Integer>();
        ArrayList<Integer> MaxScore = new ArrayList<Integer>();
//        int no[] = { 5, 4, 3, 2, 1, 10, 7, 6, 9, 8, 11, 15, 14, 13, 12, 16, 20, 19, 18, 17, 21, 24, 23, 22, 25, 27, 26,
//                29, 28, 30, 32, 31, 35, 34, 33, 36, 38, 37, 40, 39, 41, 44, 43, 42, 45, 46, 48, 47, 50, 49 };

//		System.out.println(no.length);
//        int black[] = { 0, 0, 0, 0, 54, 0, 0, 66, 0, 0, 53, 0, 0, 0, 0, 61, 0, 0, 0, 0, 59, 0, 0, 0, 0, 0, 71, 0, 0, 0,
//                0, 63, 0, 0, 0, 63, 0, 0, 0, 0, 64, 0, 0, 0, 0, 68, 0, 0, 0, 0 };

        ;
//		System.out.println(black.length);
//        int no[] = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6, 15, 14, 13, 12, 11, 20, 19, 18, 17, 16, 25, 24, 23, 22, 21, 30, 29, 28, 27, 26, 35, 34, 33, 32, 31, 40, 39, 38, 37, 36, 44, 43, 42, 41, 45, 50, 49, 48, 47, 46};

//		System.out.println(no.length);
//        int black[] = {2220, 2360, 2400, 2580, 2700, 2220, 2360, 2360, 2520, 2700, 1968, 1880, 1880, 1974, 2115, 2460, 2460, 2400, 2520, 2714, 1720, 1763, 1763, 1849, 1978, 2160, 2214, 2173, 2268, 2484, 2440, 2501, 2501, 2623, 2806, 2480, 2501, 2501, 2623, 2806, 2501, 2501, 2623, 2806, 2400, 2400, 2460, 2624, 2752, 2944};
        int nub = 0;
        for (int j = 0; j < sum; j++) {
            for (int i = 0; i < sum - j; i++) {
                if (no[i] > no[i + 1]) {
                    int z = no[i]; // swap
                    no[i] = no[i + 1];
                    no[i + 1] = z;

                    int z2 = black[i]; // swap
                    black[i] = black[i + 1];
                    black[i + 1] = z2;
                }
                if (i + 1 == no.length - 1) {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(no));
        System.out.println(Arrays.toString(black));

        while (true) {
            System.out.println(a + " " + b);
//			System.out.println(sum);
            ArrayList<Integer> tempNo = new ArrayList<Integer>();
            ArrayList<Integer> tempScore = new ArrayList<Integer>();
            for (int i = a; i <= b; i++) {
//				System.out.println(i);
                for (int j = 0; j < black.length; j++) {
                    if (j == i - 1) {
                        tempScore.add(black[j]);
                    }
                }
                tempNo.add(i);
            }
            System.out.println(tempNo);
            System.out.println(tempScore);

            int[] tempNo2 = new int[column];
            int[] tempScore2 = new int[column];

            for (int i = 0; i <column; i++) {
                tempNo2[i]=tempNo.get(i);
            }

            for (int i = 0; i <column; i++) {
                tempScore2[i]=tempScore.get(i);
            }

            for (int j = 0; j < column; j++) {
                for (int i = 0; i < column - j; i++) {
                    if (tempScore2[i] > tempScore2[i + 1]) {
                        int z = tempScore2[i]; // swap
                        tempScore2[i] = tempScore2[i + 1];
                        tempScore2[i + 1] = z;

                        int z2 = tempNo2[i]; // swap
                        tempNo2[i] = tempNo2[i + 1];
                        tempNo2[i + 1] = z2;
                    }
                    if (i + 1 == tempScore2.length - 1) {
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(tempNo2));
            System.out.println(Arrays.toString(tempScore2));

            MaxNo.add(tempNo2[tempNo2.length-1]);
            MaxScore.add(tempScore2[tempScore2.length-1]);
            if (b == sum) {
                break;
            }
            a = b + 1;
            b += column;
//			System.out.println(b);
            nub++;
        }

        System.out.println(MaxNo);
        System.out.println(MaxScore);
        int[] maxNo3 = new int[MaxNo.size()];
        for(int j=0;j<maxNo3.length;j++){
            maxNo3[j]=MaxNo.get(j);
        }
//        String MaxNo2 = String.valueOf(MaxNo);
//        System.out.println(MaxScore);

        return maxNo3;
    }



    public Uri getImageUri(Context inContext, Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
        return Uri.parse(path);
    }

    public String getRealPathFromURI(Uri uri) {
        String path = "";
        if (getContentResolver() != null) {
            Cursor cursor = getContentResolver().query(uri, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                int idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
                path = cursor.getString(idx);
                cursor.close();
            }
        }
        return path;
    }

    public String getImageFilePath(Uri uri) {
        String path = null, image_id = null;

        Cursor cursor = getContentResolver().query(uri, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
            image_id = cursor.getString(0);
            image_id = image_id.substring(image_id.lastIndexOf(":") + 1);
            cursor.close();
        }
        cursor = getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, MediaStore.Images.Media._ID + " = ? ", new String[]{image_id}, null);
        if (cursor != null) {
            cursor.moveToFirst();
            path = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
            cursor.close();
        }
        return path;
    }



    public void getDataFromStorage() {
//        FirebaseStorage storage = FirebaseStorage.getInstance();
//        StorageReference storageRef = storage.getReference();
////        StorageReference pathReference = storageRef.child("image/");
//
//        storageRef.child("image/LC2/cd678601-6b6a-42d2-b459-ded112a15eec.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//            @Override
//            public void onSuccess(Uri uri) {
//                Log.e("MainActivity", "get uri success");
//                // Got the download URL for 'users/me/profile.png'
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception exception) {
//                Log.e("MainActivity", "get uri fail");
//                // Handle any errors
//            }
//        });
    }
}