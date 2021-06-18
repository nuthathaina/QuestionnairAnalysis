package com.elevenzon.image;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private String str="";
    private Button btn_restart;
    private int Number=13;
    int[][] arr2D = new int[Number+1][20];
    private Context context;
    private  ArrayList<String> arr2 = new ArrayList<String>();
    private  static ArrayList<String> arrGraph = new ArrayList<String>();
    private  static ArrayList<String> txtGraph = new ArrayList<String>();
    private  static ArrayList<String> choiceGraph = new ArrayList<String>();
    private String[] txtGraph2;
    private String[] arrGraph2;
    private String[] choiceGraph2;
    private String datacsv="";
    private String datacsv2="";
    private static String allno ="Name picture,";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Questionnaire
        final String QuestionnaireName = getIntent().getStringExtra("textName");
        datacsv=QuestionnaireName;
        datacsv2=QuestionnaireName;
        datacsv+=".csv";
        final String CheckboxAmount = getIntent().getStringExtra("textCheckbox");
        final String SatisficationAmount = getIntent().getStringExtra("textSatis");
        final String LevelFrom = getIntent().getStringExtra("textLvFrom");
        final String LevelTo = getIntent().getStringExtra("textLvTo");

        //Checkbox
        final ArrayList nameCB = getIntent().getStringArrayListExtra("nameCB");
        final ArrayList ansCB = getIntent().getStringArrayListExtra("ansCB");
        final ArrayList Question2CB = getIntent().getIntegerArrayListExtra("Question2CB");
        final ArrayList Choice2CB = getIntent().getIntegerArrayListExtra("Choice2CB");
        final ArrayList row2CB = getIntent().getIntegerArrayListExtra("row2CB");
        final ArrayList eachLineCB = getIntent().getIntegerArrayListExtra("eachLineCB");
        final ArrayList eachNoCB = getIntent().getIntegerArrayListExtra("eachNoCB");

        //Table
        final ArrayList Question2TB = getIntent().getIntegerArrayListExtra("Question2TB");
        final ArrayList nameTB = getIntent().getIntegerArrayListExtra("nameTB");
        Button Graph = findViewById(R.id.Graph);
        Graph.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                System.out.println("Button Clicked");
                openActivity2();
            }
        });

        btn_restart = findViewById(R.id.home);
        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                finish();
//                startActivity(getIntent());
//                overridePendingTransition(0,0);

                Intent restartIntent = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
                restartIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(restartIntent);
//                Intent intent = new Intent(ProcessActivity.this, MainActivity.class);
//                startActivity(intent);
            }
        });

        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                System.out.println("Button Clicked");
                openActivity3();
            }
        });
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data2");
        String[] arr = data.split("xxxxxxxxxxxx\n");
        for(int i=0;i<arr.length;i++){

            String strOrig = arr[i];
            int intIndex = strOrig.indexOf("- Please try again later -");
            if(intIndex == - 1) {
//                System.out.println("not found");
//                if(i==arr.length-1){
//
//                }else{
                String replaceString=arr[i].replace('\n',',');
                String temp="";
                for(int j=0;j<replaceString.length();j++){
                    if(j==replaceString.length()-1){

                    }else{
                        temp+=replaceString.charAt(j);
                    }

                }
                arr2.add(temp);
//                }

            } else {

            }
        }

        data+="\n";
        data+=arr2;
        data+="xxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        StringBuilder data2 = new StringBuilder();
//        data2.append("1,2,3,4,5,6,7,8,9,10,11,12,13,14");
        String data3="\n";
        for(int i = 0; i<arr2.size(); i++){
            String[] No = arr2.get(i).split(",");
            for(int j = 0; j<No.length; j++){
                if(j==0){

                }else{
                    int temp= Integer.parseInt(No[j]);
                    arr2D[j][temp]+=1;
                }
            }
            data2.append("\n"+arr2.get(i));
        }

        for(int i = 0; i<arr2D.length; i++){
            for(int j = 0; j<arr2D.length; j++){
                data3+=arr2D[i][j];
            }
            data3+="\n";
        }

        String data4="\n";

        for(int i = 0; i<arr2D.length; i++){
            for(int j = 0; j<arr2D.length; j++){
                int number = Integer.parseInt(String.valueOf(arr2D[i][j]));
                if(number==0){

                }else{
                    arrGraph.add(String.valueOf(arr2D[i][j]));
                    txtGraph.add(String.valueOf(i));
                    choiceGraph.add(String.valueOf(j));
                }
            }

            if(i==0){

            }else{
                arrGraph.add(" ");
                txtGraph.add(" ");
                choiceGraph.add(" ");
            }

        }
        data4+=arrGraph+"\n"+txtGraph+"\n"+choiceGraph;

        arrGraph2=new String[arrGraph.size()];
        txtGraph2 = new String[txtGraph.size()];
        choiceGraph2 = new String[choiceGraph.size()];

        for(int i = 0; i<arrGraph.size(); i++){
            arrGraph2[i]=arrGraph.get(i);
        }

        for(int i = 0; i<txtGraph.size(); i++){
            txtGraph2[i]=txtGraph.get(i);
            choiceGraph2[i]=choiceGraph.get(i);
        }

//        Intent intent2 = new Intent(this, MainActivity3.class);
//        intent2.putExtra("txtGraph2", txtGraph2);
//        context.startActivity(intent2);

        textView.setText(data+data2+data3+data4+"\n\n"+eachLineCB);
//        "1,2,3,4,5,6,7,8,9,10,11,12,13,14"
        for(int i=0;i<eachLineCB.size();i++){
            if(i==eachLineCB.size()-1){
                allno+=eachLineCB.get(i);
            }else{
                allno+=eachLineCB.get(i)+",";
            }

        }
    }


    public void openActivity2() {

        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("txtGraph2", txtGraph2);
        intent.putExtra("arrGraph2", arrGraph2);
        intent.putExtra("choiceGraph2", choiceGraph2);
        startActivity(intent);
//        startActivity(intent);

    }

    public void openActivity3() {

        Intent intent = new Intent(this, Detail.class);
//        intent.putExtra("data2", str);
        startActivity(intent);
//        startActivity(intent);

    }

    public void export(View view){
        //generate data
        StringBuilder data = new StringBuilder();
        data.append(allno);
        for(int i = 0; i<arr2.size(); i++){
            data.append("\n"+arr2.get(i));
        }

        try{
            //saving the file into device
            FileOutputStream out = openFileOutput(datacsv, Context.MODE_PRIVATE);
            out.write((data.toString()).getBytes());
            out.close();

            //exporting
            Context context = getApplicationContext();
            File filelocation = new File(getFilesDir(), datacsv);
            Uri path = FileProvider.getUriForFile(context, "com.example.exportcsv.fileprovider", filelocation);
            Intent fileIntent = new Intent(Intent.ACTION_SEND);
            fileIntent.setType("text/csv");
            fileIntent.putExtra(Intent.EXTRA_SUBJECT, datacsv2);
            fileIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            fileIntent.putExtra(Intent.EXTRA_STREAM, path);
            startActivity(Intent.createChooser(fileIntent, "Send mail"));
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
