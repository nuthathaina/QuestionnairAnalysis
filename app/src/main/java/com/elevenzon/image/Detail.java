package com.elevenzon.image;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Detail extends AppCompatActivity {

    boolean btnQues = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

//        final boolean[] btnQues = {false};

        //Questionnaire
        final String QuestionnaireName = getIntent().getStringExtra("textName");
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


        Button questionnaire = findViewById(R.id.button_choose_ques);
        questionnaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                btnQues[0] = true;
//                Toast.makeText(Detail.this, "Detail", Toast.LENGTH_LONG).show();
                goForm();
            }
        });

        Button scan = findViewById(R.id.button_scan_paper);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(btnQues[0] = false){
//                    Toast.makeText(Detail.this, "Please input your questionnaire detail!", Toast.LENGTH_LONG).show();
//                    Log.d("Button", String.valueOf(btnQues[0]));
//                }
//              else {

                Intent intent = new Intent(Detail.this, ImagesActivity.class);

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
//                    Toast.makeText(Detail.this, "Import", Toast.LENGTH_LONG).show();
//                    Log.d("Button", String.valueOf(btnQues[0]));
////                    goCamera();
//                }
            }
        });


    }

//    public void sendtoCamera(ArrayList<CheckboxInfo> clist, ArrayList<TableInfo> tlist){
//        Intent send = new Intent(this, ActivitySatisfication.class);
//        Bundle b = new Bundle();
////        b.putSerializable("serialzableQuestionnaire", qq);
//        b.putSerializable("arrayCheckbox", clist);
//        b.putSerializable("arrayTable", tlist);
//        send.putExtras(b);
//        startActivity(send);
//
//    }

    public void goForm()
    {
        Intent intent = new Intent(this,ActivityQuestionnaire.class);
        startActivity(intent);
    }

}
