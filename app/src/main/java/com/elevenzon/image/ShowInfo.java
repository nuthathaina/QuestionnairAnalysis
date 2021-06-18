package com.elevenzon.image;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
//import androidx.appcompat.app.ActionBar;


public class ShowInfo extends AppCompatActivity implements Serializable  {

    Questionnaire qq;
    CheckboxInfo cb;
    TableInfo tb;

    String QuestionnaireName="",CheckboxAmount="",SatisficationAmount="",LevelFrom="",LevelTo="";
    int numCheckboxNo =0;
//    private ArrayList<CheckboxInfo> cList;
    private ArrayList<TableInfo> tList;

    String QuesnameTXT="", CheckboxSentence ="", TableSentence="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_info);
        TextView result = findViewById(R.id.text_result);

        //Label
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("Questionnaire Information");

        qq = (Questionnaire) getIntent().getSerializableExtra("serialzableTable");
//
//        //Get to show
//        QuestionnaireName = qq.getQuestionnaireName();
//        CheckboxAmount = qq.getCheckboxAmount();
//        SatisficationAmount = qq.getSatisAmount();
//        LevelFrom = qq.getLevelFrom();
//        LevelTo = qq.getLevelTo();

//        tList = (ArrayList<TableInfo>) getIntent().getSerializableExtra("ZipTableArray");


        ArrayList<CheckboxInfo> cList = (ArrayList<CheckboxInfo>) getIntent().getSerializableExtra("ZipCheckboxArray");


//        numCheckboxNo = Integer.valueOf();

//        QuesnameTXT = "Questionnaire Name: " + QuestionnaireName +
//                        "\nLevel: From " + LevelFrom + " To " + LevelTo;
//        for(int i=0;i<9;i++){
//            CheckboxSentence = "\nCheckbox: " + cList.get(i).getCheckboxTotal() +
//                            "\n\tNo. " + cList.get(i).getCheckboxNo() +
//                            " : " + cList.get(i).getCheckboxName() +
//                            "\n\t\tChoice: " + cList.get(i).getCheckboxChoice() + " Row: " + cList.get(i).getCheckboxRow();
//        }

//
//        for(int j=0;j<tList.size();j++){
//            TableSentence = "\nTable: " + tList.get(j).getTableAmount() +
//                    "\n\tNo. " + tList.get(j).getTableNo() +
//                    " : " + tList.get(j).getTableName();
//        }

//        result.setText(QuesnameTXT + CheckboxSentence + TableSentence);
        result.setText(CheckboxSentence);


        //Pass Value to checkbox
//        Intent send = new Intent(ShowInfo.this, ActivityCheckbox.class);
//        send.putExtra("serialzable2", CheckboxAmount);
//        send.putExtra("serialzable22", SatisficationAmount);
//        startActivity(send);


        //setText
        result.setText("\nName: " + QuestionnaireName + "\nCheckbox: " + CheckboxAmount +
                "\nSatisfication: " + SatisficationAmount + "\nLevel From: " + LevelFrom + "\nLevel To: " + LevelTo);

//        Button back = findViewById(R.id.button_backto_infoques);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                goInfoQues();
//            }
//        });
//
//        Button next = findViewById(R.id.button_nextto_checkbox);
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                goCheckbox();
//                Intent send = new Intent(ShowInfo.this, ActivityCheckbox.class);
//                send.putExtra("serialzable2", CheckboxAmount);
//                send.putExtra("serialzable22", SatisficationAmount);
//                startActivity(send);
//            }
//        });

    }

    public void goInfoQues()
    {
        Intent intent = new Intent(this,ActivityQuestionnaire.class);
        startActivity(intent);
    }

    public void goCheckbox()
    {
        Intent intent = new Intent(this,ActivityCheckbox.class);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        qq = null;
    }
}