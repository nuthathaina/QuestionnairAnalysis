package com.elevenzon.image;

import android.animation.LayoutTransition;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class ActivitySatisfication extends AppCompatActivity {
    private TextView textViewTB;
    private ArrayList<String> Question = new ArrayList<>();
    private ArrayList<String> Choice = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> name2 = new ArrayList<>();

    private ArrayList<Integer> Question2 = new ArrayList<>();
    private ArrayList<TableInfo> tList = new ArrayList<>();

    private static ArrayList<String> str2 = new ArrayList<>();

    EditText nameQues;
    Button buttonAdd;
    LinearLayout container;
    String str="";
    int no =1;
    private TextView noQues;
    ArrayList<String> cList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_satisfication);
        nameQues = (EditText)findViewById(R.id.textin_tb);
        textViewTB = (TextView) findViewById(R.id.textViewTB);
        TextView show = (TextView) findViewById(R.id.show);
        buttonAdd = (Button)findViewById(R.id.addTB);
        container = (LinearLayout)findViewById(R.id.container_tb);

        final boolean[] btnAdd = {false};
        final boolean[] btnView = {false};
        final boolean[] btnSubmit = {false};

        final String QuestionnaireName = getIntent().getStringExtra("textName");
        final String CheckboxAmount = getIntent().getStringExtra("textCheckbox");
        final String SatisficationAmount = getIntent().getStringExtra("textSatis");
        final String LevelFrom = getIntent().getStringExtra("textLvFrom");
        final String LevelTo = getIntent().getStringExtra("textLvTo");

        final ArrayList nameCB = getIntent().getStringArrayListExtra("nameCB");
        final ArrayList ansCB = getIntent().getStringArrayListExtra("ansCB");
        final ArrayList Question2CB = getIntent().getIntegerArrayListExtra("Question2CB");
        final ArrayList Choice2CB = getIntent().getIntegerArrayListExtra("Choice2CB");
        final ArrayList row2CB = getIntent().getIntegerArrayListExtra("row2CB");
        final ArrayList eachLineCB = getIntent().getIntegerArrayListExtra("eachLineCB");
        final ArrayList eachNoCB = getIntent().getIntegerArrayListExtra("eachNoCB");

        final int number = Integer.parseInt(SatisficationAmount);
        int amount = Integer.parseInt(SatisficationAmount);
        final String[] arr = new String[amount+1];

//        Log.d("TAG",nameCB.toString());
//        Log.d("TAG",ansCB.toString());
//        Log.d("TAG",Question2CB.toString());
//        Log.d("TAG",Choice2CB.toString());
//        Log.d("TAG",row2CB.toString());
//        Log.d("TAG",eachLineCB.toString());
//        Log.d("TAG",eachNoCB.toString());
        show.setText(SatisficationAmount);

//        final ArrayList<CheckboxInfo> cList =  getIntent().getParcelableArrayListExtra("cList");

//        ArrayList<String> cList = (ArrayList<String>) getIntent().getSerializableExtra("cList");


//        qq = bundle.getParcelable("ques");
//        cList = getIntent().getStringArrayListExtra("cList");
//        tb.setTableAmount(SatisAmount);

//        Intent intent = this.getIntent();
//        Bundle bundle = intent.getExtras();
//        final ArrayList<CheckboxInfo> cList = (ArrayList<CheckboxInfo>)bundle.getSerializable("arrayCheckbox");
//        final ArrayList<String> s = (ArrayList<String>)bundle.getSerializable("arrayCheckbox");

        buttonAdd.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
//                btnAdd[0] = true;
                LayoutInflater layoutInflater =
                        (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.row_tb, null);
                final TextView textOut = (TextView)addView.findViewById(R.id.textout_tb);

                if(checkInputValid() == false){
                    Toast.makeText(ActivitySatisfication.this, "Please recheck your input!!!", Toast.LENGTH_LONG).show();

                }

                else{

                    textOut.setText("\t\t\t"+noQues.getText().toString()+".\t"+nameQues.getText().toString());
//                textOut.setText();
//                Question.add("1");
//                Choice.add(textInTB.getText().toString());
//                row.add(textIn2.getText().toString());

                    Button buttonRemove = (Button)addView.findViewById(R.id.remove_tb);
                    buttonRemove.setOnClickListener(new OnClickListener(){
                        @Override
                        public void onClick(View v) {

                            ((LinearLayout)addView.getParent()).removeView(addView);
//                        textView4 = (TextView);
                            String[] temp = String.valueOf(addView).split("V.E.");
//                        str2.add(temp[0]);
//                        for(int i=0;i<str2.size();i++){
                            int index = str2.indexOf(temp[0]);
                            str2.set(index, " ");
                            Question.set(index, " ");
                            name.set(index, " ");

//                        }

                            str+="\n"+ String.valueOf(String.valueOf(addView));
                        }});

                    container.addView(addView, 0);

                    String[] temp = String.valueOf(addView).split("V.E.");
                    str2.add(temp[0]);
                    Question.add(noQues.getText().toString());
//                Question.add("1");
                    name.add(nameQues.getText().toString());
                }

            }});

//        Button view = findViewById(R.id.button_view);
//        view.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//            }
//        });

        Button NextQues = findViewById(R.id.nextQuesTB);
        noQues = (TextView) findViewById(R.id.no_quesTB);
        NextQues.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edit = (EditText)findViewById(R.id.edit);
                edit.getText().clear();

                EditText nameQues = (EditText)findViewById(R.id.textin_tb);
                nameQues.getText().clear();

                noQues.setText("");
                if(no==number){
                    no = number;
                    noQues.setText(String.valueOf(no));
                }
                else{
                    no +=1;
                    noQues.setText(String.valueOf(no));
                }

            }
        });

        Button PreviousQues = findViewById(R.id.previousQuesTB);
        PreviousQues.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edit = (EditText)findViewById(R.id.edit);
                edit.getText().clear();
                noQues.setText("");
                if(no==1){
                    no=1;
                    noQues.setText(String.valueOf(no));
                }
                else{
                    no -=1;
                    noQues.setText(String.valueOf(no));
                }
            }
        });

        Button ok = findViewById(R.id.ok);
        ok.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        Button button_view2 = findViewById(R.id.button_view2);
        button_view2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
//                for(int i=0;i<arr.length;i++){
//                    EditText edit = (EditText)findViewById(R.id.edit);
//                    arr[no]=edit.getText().toString();
//                }
                for(int i=0;i<arr.length;i++){
                    EditText edit = (EditText)findViewById(R.id.edit);
                    arr[no]=edit.getText().toString();
                }
                TextView textViewTB2 = (TextView)findViewById(R.id.textViewTB2);
                String str="";
                for(int i=1;i<arr.length;i++){
                    if(arr[i]==null){

                    }else{
                        str+=i+". "+arr[i]+"\n";
                    }

                }
                textViewTB2.setText(str);
            }
        });

        Button submit = findViewById(R.id.button_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for(int i=1;i<arr.length;i++){
                    name2.add(arr[i]);
                }
//                if(btnView[0] = false){
//                    Toast.makeText(ActivitySatisfication.this, "Plese view your input before submit!", Toast.LENGTH_LONG).show();
//                }
//
//                else{

//                if(checkInputValid()==false){
//                    Toast.makeText(ActivitySatisfication.this, "Please recheck your input!!!", Toast.LENGTH_LONG).show();
//
//                }
//
//                else{
                    Toast.makeText(ActivitySatisfication.this, "Submit", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(ActivitySatisfication.this, Detail.class);

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

                    intent.putIntegerArrayListExtra("Question2TB",Question2);
                    intent.putStringArrayListExtra("nameTB",name2);

                    startActivity(intent);

//                }


//                for(int i=0;i<Question2.size();i++){
//                    tList.add(new TableInfo(String.valueOf(Question2.get(i)), String.valueOf(name.get(i)), SatisficationAmount));
//                }
//                sendtoDetail(cList, tList);

//                }

            }
        });


        LayoutTransition transition = new LayoutTransition();
        container.setLayoutTransition(transition);
    }

    public boolean checkInputValid() {
        boolean isValid[] = {false};

        if (TextUtils.isEmpty(nameQues.getText().toString())) {
            return isValid[0];
        }
        else{
            isValid[0] = true;
            return isValid[0];
        }
    }


//    public void sendtoDetail(ArrayList<CheckboxInfo> clist, ArrayList<TableInfo> tlist){
//        Intent send = new Intent(this, ActivitySatisfication.class);
//        Bundle b = new Bundle();
////        b.putSerializable("serialzableQuestionnaire", qq);
//        b.putSerializable("arrayCheckbox", clist);
//        b.putSerializable("arrayTable", tlist);
//        send.putExtras(b);
//        startActivity(send);
//
//    }

}

