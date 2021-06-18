package com.elevenzon.image;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

public class ActivityQuestionnaire extends AppCompatActivity {

    EditText QuesName, CBAmount, STAmount, LVFrom, LVTo;
//    Questionnaire q;

    TextView textView5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_ques);

//        final boolean[] btnView = {false};

        QuesName = (EditText) findViewById(R.id.edit_cbname);
        CBAmount = (EditText) findViewById(R.id.edit_checkbox_amount);
        STAmount = (EditText) findViewById(R.id.edit_satis_amount);
        LVFrom = (EditText) findViewById(R.id.edit_from_level);
        LVTo = (EditText) findViewById(R.id.edit_to_level);

        textView5 = (TextView) findViewById(R.id.textView5);

        Button view = findViewById(R.id.button_view);
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//                btnView[0] = true;

                if (checkInputValid() == false){
                    Toast.makeText(ActivityQuestionnaire.this, "Please recheck your input!!!", Toast.LENGTH_LONG).show();
                }

                //Not Empty
                else  {
                    Toast.makeText(ActivityQuestionnaire.this, "View", Toast.LENGTH_LONG).show();
                    textView5.setText("\tQuestionnaire Name : " + QuesName.getText().toString() + "\n\tCheckbox : " + CBAmount.getText().toString() +
                            "\n\tTable : " + STAmount.getText().toString() + "\n\tLevel : " + LVFrom.getText().toString() + " to " + LVTo.getText().toString());
                }

            }
        });

        Button create = findViewById(R.id.button_create_ques);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(btnView[0] = false){
//                    Toast.makeText(ActivityQuestionnaire.this, "Plese view your input before create!", Toast.LENGTH_LONG).show();
//                }
////
//                else{

                //Not Empty
//                    else  {

                if(checkInputValid() == false){
                    Toast.makeText(ActivityQuestionnaire.this, "Please recheck your input!!!", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(ActivityQuestionnaire.this, "Questionnaire Created!", Toast.LENGTH_LONG).show();
                    sendUserData(QuesName.getText().toString(), CBAmount.getText().toString(), STAmount.getText().toString(), LVFrom.getText().toString(), LVTo.getText().toString());

                }
//                    }

//                }

            }
        });



    }


    public boolean checkInputValid(){
        boolean isValid[] = {false};

        //All Empty
        if (TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Checkbox = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Table = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Level From = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Level To = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Checkbox = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Table = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Checkbox, Table = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Level From = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Checkbox, Level From = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Table, Level From = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Level To = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Checkbox, Level To = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Table, Level To = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Level From, Level To = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Checkbox, Table = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Checkbox, Level From = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Table, Level From = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Checkbox, Table, Level From = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Checkbox, Level To = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Table, Level To = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Checkbox, Table, Level To = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Level From, Level To = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Checkbox, Level From, Level To = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Table, Level From, Level To = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Checkbox, Table, Level From = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Checkbox, Table, Level To = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Checkbox, Level From, Level To = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Questionnaire Name, Table, Level From, Level To = not empty
        else if (!TextUtils.isEmpty(QuesName.getText().toString()) && TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Checkbox, Table, Level From, Level To = not empty
        else if (TextUtils.isEmpty(QuesName.getText().toString()) && !TextUtils.isEmpty(CBAmount.getText().toString())
                && !TextUtils.isEmpty(STAmount.getText().toString()) && !TextUtils.isEmpty(LVFrom.getText().toString())
                && !TextUtils.isEmpty(LVTo.getText().toString())) {
            return isValid[0];
        }

        //Not Empty
        else  {
            isValid[0] = true;
            return isValid[0];
        }
    }

    private void sendUserData(String QuestionnaireName, String CheckboxAmount, String SatisficationAmount, String LevelFrom, String LevelTo) {

        Intent intent = new Intent(ActivityQuestionnaire.this, ActivityCheckbox.class);
        intent.putExtra("textName",QuestionnaireName);
        intent.putExtra("textCheckbox",CheckboxAmount);
        intent.putExtra("textSatis",SatisficationAmount);
        intent.putExtra("textLvFrom",LevelFrom);
        intent.putExtra("textLvTo",LevelTo);
        startActivity(intent);

//        Questionnaire q = new Questionnaire();
//        q.setQuestionnaireName(QuestionnaireName);
//        q.setCheckboxAmount(CheckboxAmount);
//        q.setSatisAmount(SatisficationAmount);
//        q.setLevelFrom(LevelFrom);
//        q.setLevelTo(LevelTo);

//        Intent i = new Intent(ActivityQuestionnaire.this, ActivityCheckbox.class);
//        i.putExtra("ques", new Questionnaire(QuestionnaireName, CheckboxAmount, SatisficationAmount, LevelFrom,LevelTo ));
//        startActivity(i);

    }

}
