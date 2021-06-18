package com.elevenzon.image;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
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
import android.animation.LayoutTransition;
import android.content.Context;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class ActivityCheckbox extends AppCompatActivity {
    private TextView textView4;
    private ArrayList<String> Question = new ArrayList<>();
    private ArrayList<String> Choice = new ArrayList<>();
    private ArrayList<String> row = new ArrayList<>();

    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> ans = new ArrayList<>();


    private ArrayList<Integer> Question2 = new ArrayList<>();
    private ArrayList<Integer> Choice2 = new ArrayList<>();
    private ArrayList<Integer> row2 = new ArrayList<>();

    private ArrayList<Integer> eachLine = new ArrayList<>();
    private ArrayList<Integer> eachNo = new ArrayList<>();

    Set<Integer> quesSet;
    Set<Integer> choiceSet;
    Set<Integer> rowSet;

    ArrayList<CheckboxInfo> cList = new ArrayList<>();

    private static ArrayList<String> str2 = new ArrayList<>();
    EditText textIn;
    EditText textIn2;
    EditText nameQues, ansQues;
    Button buttonAdd;
    Button button;
    LinearLayout container;
    String str="";
    int no =1;

    private ArrayList<String> nameall = new ArrayList<>();
    private ArrayList<String> ansall = new ArrayList<>();
    private ArrayList<Integer> Question2all = new ArrayList<>();
    private ArrayList<Integer> Choice2all = new ArrayList<>();
    private ArrayList<Integer> row2all = new ArrayList<>();
    private ArrayList<Integer> eachLineall = new ArrayList<>();
    private ArrayList<Integer> eachNoall = new ArrayList<>();

    private ArrayList<Integer> rowlast2 = new ArrayList<Integer>();
    //    int number =0;
//    String s="";
//    String s2="";
    private TextView noQues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_checkbox);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityCheckbox.this);
                //Yes Button
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Yes button Clicked", Toast.LENGTH_LONG).show();
                        Log.i("Code2care ", "Yes button Clicked!");
                        dialog.dismiss();
                    }
                });




                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.custom_dialog2, null);

                builder.setView(dialoglayout);
                builder.show();
            }
        });



        final boolean[] btnAdd = {false};
        final boolean[] btnView = {false};



        cList = new ArrayList<CheckboxInfo>();


        textIn = (EditText)findViewById(R.id.textin);
        textIn2 = (EditText)findViewById(R.id.textin2);
        nameQues = (EditText)findViewById(R.id.edit_cbname);
        ansQues = (EditText)findViewById(R.id.edit_cbanswer);
        textView4 = (TextView) findViewById(R.id.textView4);
        buttonAdd = (Button)findViewById(R.id.add);
        container = (LinearLayout)findViewById(R.id.container);

        final String QuestionnaireName = getIntent().getStringExtra("textName");
        final String CheckboxAmount = getIntent().getStringExtra("textCheckbox");
        final String SatisficationAmount = getIntent().getStringExtra("textSatis");
        final String LevelFrom = getIntent().getStringExtra("textLvFrom");
        final String LevelTo = getIntent().getStringExtra("textLvTo");

        final int number = Integer.parseInt(CheckboxAmount);

        buttonAdd.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {

                LayoutInflater layoutInflater =
                        (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.row, null);
                final TextView textOut = (TextView)addView.findViewById(R.id.textout);


                if(checkInputValid() == false){
                    Toast.makeText(ActivityCheckbox.this, "Please recheck your input!!!", Toast.LENGTH_LONG).show();

                }

                //Not Empty
                else{


                    textOut.setText("\t\t\t\t\t\t\t\tChoice "+textIn.getText().toString()+"\t\t\t\t\t\tRow "+textIn2.getText().toString());

                    textOut.setText("\t\tQ "+noQues.getText().toString()+".\t"+nameQues.getText().toString()+"\t\t("+textIn.getText().toString()+")"+"\t(Row "+textIn2.getText().toString()+")");

//                textOut.setText();
//                Question.add("1");
//                Choice.add(textIn.getText().toString());
//                row.add(textIn2.getText().toString());

                    Button buttonRemove = (Button)addView.findViewById(R.id.remove);
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
                            Choice.set(index, " ");
                            row.set(index, " ");
                            name.set(index, " ");
                            ans.set(index, " ");

//                        }

                            str+="\n"+String.valueOf(String.valueOf(addView));

                        }});

                    container.addView(addView, 0);

                    String[] temp = String.valueOf(addView).split("V.E.");
                    str2.add(temp[0]);
                    Question.add(noQues.getText().toString());
                    Choice.add(textIn.getText().toString());
                    row.add(textIn2.getText().toString());
                    name.add(nameQues.getText().toString());
                    ans.add("ansQues.getText().toString()");

                    Question2.clear();
                    Choice2.clear();
                    row2.clear();

                    for(int i=0;i<Question.size();i++){
                        if(Question.get(i).equalsIgnoreCase(" ")){

                        }else{
                            Question2.add(Integer.valueOf(Question.get(i)));
                        }

                        if(Choice.get(i).equalsIgnoreCase(" ")){

                        }else{
                            Choice2.add(Integer.valueOf(Choice.get(i)));
                        }

                        if(row.get(i).equalsIgnoreCase(" ")){

                        }else{
                            row2.add(Integer.valueOf(row.get(i)));
                        }

                        if(name.get(i).equalsIgnoreCase(" ")){

                        }
                        else{
                        }

                        if(ans.get(i).equalsIgnoreCase(" ")){

                        }
                        else{
                        }

                    }

                    int row3[]=new int[20];
                    for (int i = 0; i < row2.size(); i++) {
                        row3[row2.get(i)]++;
                    }

                    int n = Integer.parseInt(CheckboxAmount);

                    int checkboxTotal=0, eachLineAmount=0;
                    int eachNoAmount=0;
                    quesSet = new HashSet<Integer>(Question2);
                    choiceSet = new HashSet<Integer>(Choice2);
                    rowSet = new HashSet<Integer>(row2);


                    //Array 2 4 3
                    for (int m=1; m<n+1;m++) {
                        eachNoAmount = Collections.frequency(Question2, m);
                        eachLine.add(eachNoAmount);
//                    System.out.println(" Each No Amount: "+eachNoAmount);
                    }

                    // 9
                    for (Integer q : quesSet) {
                        checkboxTotal += Collections.frequency(Question2, q);
                    }

                    //Array 2 2 2 3
                    for (Integer r : rowSet) {
                        eachLineAmount = Collections.frequency(row2, r);
                        eachNo.add(eachLineAmount);
//                    System.out.println(r + " Each Line Amount: "+eachLineAmount);
                    }

//                        for(int i=0;i<Question2.size();i++){
//                            cList.add(new CheckboxInfo(String.valueOf(Question2.get(i)), String.valueOf(name.get(i)), String.valueOf(ans.get(i)), String.valueOf(Choice2.get(i)), String.valueOf(row2.get(i)), eachNo, eachLine, String.valueOf(checkboxTotal)));
//
//                        }

                }
//                EditText edit_cbname = (EditText)findViewById(R.id.edit_cbname);
                EditText edit_cbanswer = (EditText)findViewById(R.id.edit_cbanswer);
                EditText textin = (EditText)findViewById(R.id.textin);
                EditText textin2 = (EditText)findViewById(R.id.textin2);
//                edit_cbname.getText().clear();
                edit_cbanswer.getText().clear();
                textin.getText().clear();
                textin2.getText().clear();

            }});


        Button view = findViewById(R.id.button_view);
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rowlast2.clear();
                nameall.clear();
                ansall.clear();
                Question2all.clear();
                Choice2all.clear();
                row2all.clear();

//                Question.add(noQues.getText().toString());
//                Choice.add(textIn.getText().toString());
//                row.add(textIn2.getText().toString());
//                name.add(nameQues.getText().toString());
//                ans.add(ansQues.getText().toString());

//                ArrayList<String> Question = new ArrayList<>();
//                ArrayList<String> Choice = new ArrayList<>();
                int arrcount[] = new int[50];
                ArrayList<Integer> arrcount2 = new ArrayList<Integer>();
                ArrayList<Integer> Choice3 = new ArrayList<Integer>();
//		int checkbox=3;
//                Question.add("3");
//                Question.add("3");
//                Question.add("3");
//                Question.add("1");
//                Question.add("1");
//                Question.add("2");
//                Question.add("2");
//                Question.add("2");
//                Question.add("2");
//
//                Choice.add("3");
//                Choice.add("2");
//                Choice.add("1");
//                Choice.add("2");
//                Choice.add("1");
//                Choice.add("3");
//                Choice.add("2");
//                Choice.add("1");
//                Choice.add("4");

                int Question2[] = new int[Question.size()];
                int Choice2[] = new int[Choice.size()];

                System.out.println(Question);
                for (int i = 0; i < Choice2.length; i++) {
                    if(Question.get(i).equalsIgnoreCase(" ")){

                    }else{
                        Question2[i] = Integer.valueOf(Question.get(i));
                        Choice2[i] = Integer.valueOf(Choice.get(i));
                    }


                }

                for (int i = 0; i < Question.size(); i++) {
                    for (int j = i + 1; j < Question.size(); j++) {
                        if (Question2[i] > Question2[j]) {
                            int temp = Question2[i];
                            Question2[i] = Question2[j];
                            Question2[j] = temp;

                            int temp2 = Choice2[i];
                            Choice2[i] = Choice2[j];
                            Choice2[j] = temp2;

                        }
                    }
                }

                for (int i = 0; i < arrcount.length; i++) {

                    for (int j = 0; j < Choice2.length; j++) {
                        if (i == Question2[j]) {
                            arrcount[i] += 1;
                        }
                    }
                }

                System.out.println(Arrays.toString(arrcount));
                System.out.println(Arrays.toString(Question2));
                System.out.println(Arrays.toString(Choice2));
                int count = 0;
                for (int i = 0; i < arrcount.length; i++) {
                    if (arrcount[i] == 0) {

                    } else {
                        arrcount2.add(arrcount[i]);
                        count += arrcount[i];
                    }
                }

                System.out.println(arrcount2);

                int a = 0;
                int b = arrcount2.get(0) - 1;
                ArrayList<Integer> temp = new ArrayList<Integer>();

                for (int i = 0; i < arrcount2.size(); i++) {
                    temp.clear();
                    for (int j = a; j <= b; j++) {
//					System.out.print(j+" ");
                        temp.add(Choice2[j]);
                    }
//				temp.sort(c);
                    Collections.sort(temp);
                    for (int j = 0; j < temp.size(); j++) {
                        Choice3.add(temp.get(j));
                    }
//				System.out.println("xxxxx"+temp);
//				System.out.println();
//				System.out.println(a+" "+b);
                    a = b + 1;
                    if (i == arrcount2.size() - 1) {
                        break;
                    }
                    b = a + arrcount2.get(i + 1) - 1;
//				System.out.println();

                }
//			if(b==7) {
                System.out.println(Arrays.toString(Question2));
                System.out.println(Choice3);

                TextView textView4 = (TextView) findViewById(R.id.textView4);


                for(int i=0;i<Question2.length;i++){
                    for(int j=0;j<Question2.length;j++){
                        String Question4=String.valueOf(Question2[i]);
                        String Choice4=String.valueOf(Choice3.get(i));

                        String Question5=String.valueOf(Question.get(j));
                        String Choice5=String.valueOf(Choice.get(j));

                        if(Question4.equalsIgnoreCase(Question5)&&Choice4.equalsIgnoreCase(Choice5)){
                            nameall.add(name.get(j));
                            ansall.add(ans.get(j));
                            Question2all.add(Integer.valueOf(Question.get(j)));
                            Choice2all.add(Integer.valueOf(Choice.get(j)));
                            row2all.add(Integer.valueOf(row.get(j)));
                        }

                    }
                }

//                textView4.setText("\n\n"+Arrays.toString(Question2)+"\n"+Choice3+
//                        "\n\n"+Question+"\n"+name+"\n"+ans+"\n"+Choice+"\n"+row);




//                ArrayList<Integer> rowlast = new ArrayList<Integer>();
//                ArrayList<Integer> rowlast2 = new ArrayList<Integer>();
//                rowlast.add(1);
//                rowlast.add(1);
//                rowlast.add(2);
//                rowlast.add(2);
//                rowlast.add(3);
//                rowlast.add(3);
//                rowlast.add(4);
//                rowlast.add(4);
//                rowlast.add(4);

                /////////////////////////////////////////////////
                int rowlast1[]=new int[20];
                for (int i = 0; i < row2all.size(); i++) {
                    rowlast1[row2all.get(i)]++;
                }


                System.out.println(Arrays.toString(rowlast1));
                for (int i = 0; i < rowlast1.length; i++) {
                    if(rowlast1[i]==0) {

                    }else {
                        rowlast2.add(rowlast1[i]);
                    }
                }

                System.out.println(rowlast2);

//                textView4.setText(
//                        Question2all+"\n"+nameall+"\n"+ansall+"\n"+Choice2all+"\n"+rowlast2);

                String str="Check your input:\n";
                for(int i=0;i<rowlast2.size();i++){
                    str+="Line "+(i+1)+": sum choice "+rowlast2.get(i)+"\n";
                }
//                textView4.setText(
//                        Question2all+"\n"+nameall+"\n"+ansall+"\n"+Choice2all+"\n"+row2all);
                textView4.setText(str);

            }

//            }
        });

        Button NextQues = findViewById(R.id.nextQues);
        noQues = (TextView) findViewById(R.id.no_ques);
        NextQues.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edit_cbname = (EditText)findViewById(R.id.edit_cbname);
                EditText edit_cbanswer = (EditText)findViewById(R.id.edit_cbanswer);
                EditText textin = (EditText)findViewById(R.id.textin);
                EditText textin2 = (EditText)findViewById(R.id.textin2);
                edit_cbname.getText().clear();
                edit_cbanswer.getText().clear();
                textin.getText().clear();
                textin2.getText().clear();

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

        Button PreviousQues = findViewById(R.id.previousQues);
        PreviousQues.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edit_cbname = (EditText)findViewById(R.id.edit_cbname);
                EditText edit_cbanswer = (EditText)findViewById(R.id.edit_cbanswer);
                EditText textin = (EditText)findViewById(R.id.textin);
                EditText textin2 = (EditText)findViewById(R.id.textin2);
                edit_cbname.getText().clear();
                edit_cbanswer.getText().clear();
                textin.getText().clear();
                textin2.getText().clear();
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


        Button submit = findViewById(R.id.button_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//
//                if(btnView[0] = false){
//                    Toast.makeText(ActivityCheckbox.this, "Plese view your input before submit!", Toast.LENGTH_LONG).show();
//                }
//
//                else {


//                if(checkInputValid() == false){
//                    Toast.makeText(ActivityCheckbox.this, "Please recheck your input!!!", Toast.LENGTH_LONG).show();
//                }
//                else {

                Toast.makeText(ActivityCheckbox.this, "Submit", Toast.LENGTH_LONG).show();
                sendtoTable(QuestionnaireName, CheckboxAmount, SatisficationAmount, LevelFrom, LevelTo);

//                }


//                }

            }
        });

        LayoutTransition transition = new LayoutTransition();
        container.setLayoutTransition(transition);

    }

    public static boolean checkEquality(String[] s1, String[] s2)
    {
        if (s1 == s2) {
            return true;
        }

        if (s1 == null || s2 == null) {
            return false;
        }

        int n = s1.length;
        if (n != s2.length) {
            return false;
        }

        for (int i = 0; i < n; i++)
        {
            if (!s1[i].equals(s2[i])) {
                return false;
            }
        }

        return true;
    }

    public boolean checkInputValid(){
        boolean isValid[] = {false};

        //All Empty
        if (TextUtils.isEmpty(nameQues.getText().toString()) && TextUtils.isEmpty("ansQues.getText().toString()")
                && TextUtils.isEmpty(textIn.getText().toString()) && TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Name = not epmty
        else if (!TextUtils.isEmpty(nameQues.getText().toString()) && TextUtils.isEmpty("ansQues.getText().toString()")
                && TextUtils.isEmpty(textIn.getText().toString()) && TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Answer = not epmty
        else if (TextUtils.isEmpty(nameQues.getText().toString()) && !TextUtils.isEmpty("ansQues.getText().toString()")
                && TextUtils.isEmpty(textIn.getText().toString()) && TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Choice = not epmty
        else if (TextUtils.isEmpty(nameQues.getText().toString()) && TextUtils.isEmpty("ansQues.getText().toString()")
                && !TextUtils.isEmpty(textIn.getText().toString()) && TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Line = not epmty
        else if (TextUtils.isEmpty(nameQues.getText().toString()) && TextUtils.isEmpty("ansQues.getText().toString()")
                && TextUtils.isEmpty(textIn.getText().toString()) && !TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Name, Answer = not epmty
        else if (!TextUtils.isEmpty(nameQues.getText().toString()) && !TextUtils.isEmpty("ansQues.getText().toString()")
                && TextUtils.isEmpty(textIn.getText().toString()) && TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Name, Choice = not epmty
        else if (!TextUtils.isEmpty(nameQues.getText().toString()) && TextUtils.isEmpty("ansQues.getText().toString()")
                && !TextUtils.isEmpty(textIn.getText().toString()) && TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Answer, Choice = not epmty
        else if (TextUtils.isEmpty(nameQues.getText().toString()) && !TextUtils.isEmpty("ansQues.getText().toString()")
                && !TextUtils.isEmpty(textIn.getText().toString()) && TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Name, Line = not epmty
        else if (!TextUtils.isEmpty(nameQues.getText().toString()) && TextUtils.isEmpty("ansQues.getText().toString()")
                && TextUtils.isEmpty(textIn.getText().toString()) && !TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Answer, Line = not epmty
        else if (TextUtils.isEmpty(nameQues.getText().toString()) && !TextUtils.isEmpty("ansQues.getText().toString()")
                && TextUtils.isEmpty(textIn.getText().toString()) && !TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Choice, Line = not epmty
        else if (TextUtils.isEmpty(nameQues.getText().toString()) && TextUtils.isEmpty("ansQues.getText().toString()")
                && !TextUtils.isEmpty(textIn.getText().toString()) && !TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Name, Answer, Choice = not epmty
        else if (!TextUtils.isEmpty(nameQues.getText().toString()) && !TextUtils.isEmpty("ansQues.getText().toString()")
                && !TextUtils.isEmpty(textIn.getText().toString()) && TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Name, Answer, Line = not epmty
        else if (!TextUtils.isEmpty(nameQues.getText().toString()) && !TextUtils.isEmpty("ansQues.getText().toString()")
                && TextUtils.isEmpty(textIn.getText().toString()) && !TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Name, Choice, Line = not epmty
        else if (!TextUtils.isEmpty(nameQues.getText().toString()) && TextUtils.isEmpty("ansQues.getText().toString()")
                && !TextUtils.isEmpty(textIn.getText().toString()) && !TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }

        //Answer, Choice, Line = not epmty
        else if (TextUtils.isEmpty(nameQues.getText().toString()) && !TextUtils.isEmpty("ansQues.getText().toString()")
                && !TextUtils.isEmpty(textIn.getText().toString()) && !TextUtils.isEmpty(textIn2.getText().toString())) {
            return isValid[0];
        }
        else{
            isValid[0] = true;
            return isValid[0];

        }

    }
    public void openDialog() {
        ExampleDialog2 exampleDialog2 = new ExampleDialog2();
        exampleDialog2.show(getSupportFragmentManager(), "example dialog");
    }
    public void sendtoTable(String QuestionnaireName, String CheckboxAmount, String SatisficationAmount, String LevelFrom, String LevelTo){


        Intent intent = new Intent(ActivityCheckbox.this, ActivitySatisfication.class);

        intent.putExtra("textName",QuestionnaireName);
        intent.putExtra("textCheckbox",CheckboxAmount);
        intent.putExtra("textSatis",SatisficationAmount);
        intent.putExtra("textLvFrom",LevelFrom);
        intent.putExtra("textLvTo",LevelTo);



        intent.putStringArrayListExtra("nameCB",nameall);
        intent.putStringArrayListExtra("ansCB",ansall);
        intent.putIntegerArrayListExtra("Question2CB",Question2all);
        intent.putIntegerArrayListExtra("Choice2CB",Choice2all);
        intent.putIntegerArrayListExtra("row2CB",rowlast2);

        intent.putIntegerArrayListExtra("eachLineCB",eachLineall);
        intent.putIntegerArrayListExtra("eachNoCB",eachNoall);

        startActivity(intent);

    }

}