package com.elevenzon.image;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    int a =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);



        Button questionnaire = findViewById(R.id.button_start);
        questionnaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goDetail();
            }
        });

//        Button showinfo  = findViewById(R.id.button_showinfo);
//        showinfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                goShowInfo();
//            }
//        });
//
//        Button checkbox  = findViewById(R.id.button_checkbox);
//        checkbox.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                goCheckbox();
//            }
//        });
//
//        Button table  = findViewById(R.id.button_table);
//        table.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                goTable();
//            }
//        });



    }


    public void goDetail()
    {
        Intent intent = new Intent(this,Detail.class);
        startActivity(intent);
    }

}