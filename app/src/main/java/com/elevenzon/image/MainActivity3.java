package com.elevenzon.image;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity3 extends AppCompatActivity {
    TextView textView3;
    BarChart barChart;

    // variable for our bar data.
    BarData barData;

    // variable for our bar data set.
    BarDataSet barDataSet;
    private Button button;
    // array list for storing entries.
    ArrayList barEntriesArrayList;
    private String str="xxxxxxxxxxxxxxxxxx";
    final ArrayList<Student> listStudent = Student.getSampleStudentData(30);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

//        textView3 = findViewById(R.id.textView3);
//        textView3.setText(str);

//        BarChart chart = (BarChart) findViewById(R.id.bar_chart);
//
//        final ArrayList<BarEntry> entries = new ArrayList<>();
//        int index = 0;
//        for (Student student : listStudent) {
//            entries.add(new BarEntry(index, student.getScore()));
//            index++;
//        }
//
//        BarDataSet dataset = new BarDataSet(entries, "#");
//
//
//        dataset.setValueTextSize(8);
//        dataset.setColors(ColorTemplate.COLORFUL_COLORS); // set the color
//
//        ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
//        dataSets.add(dataset);
//
//        BarData data = new BarData(dataSets);
////        data.setBarSpacePercent(10f);
//        chart.setData(data);
//
//        chart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
//        chart.getXAxis().setLabelRotationAngle(80);
//
//
//        final XAxis xAxis = chart.getXAxis();
//        xAxis.setTextSize(12);
//        xAxis.setCenterAxisLabels(true);
//
//        xAxis.setValueFormatter(new AxisValueFormatter() {
//            @Override
//            public String getFormattedValue(float value, AxisBase axis) {
//                Log.d("benznest", "value = " + value);
//                if (value < 0 || value >= listStudent.size()) {
//                    return "";
//                }
//                return listStudent.get((int) value).getName();
//            }
//
//            @Override
//            public int getDecimalDigits() {
//                return 0;
//            }
//        });
//
//        YAxis RightAxis = chart.getAxisRight();
//        RightAxis.setEnabled(false);
//
//        chart.animateY(3000);

/////////////////////////////////////////////////////////////////////////////



        barChart = findViewById(R.id.idBarChart);

        // calling method to get bar entries.
//        getBarEntries();
        barEntriesArrayList = new ArrayList<>();
        Intent intent = getIntent();
        String [] labels = intent.getStringArrayExtra("txtGraph2");
        String [] arrGraph = intent.getStringArrayExtra("arrGraph2");
        String [] choiceGraph = intent.getStringArrayExtra("choiceGraph2");
        // adding new entry to our array list with bar
        // entry and passing x and y axis value to it.
        for (int i=0;i<arrGraph.length;i++){
            if(arrGraph[i].equalsIgnoreCase(" ")){

            }else{
                String i2= String.valueOf(i);
                String i3= arrGraph[i];
//            String i3="f"+i2;
                barEntriesArrayList.add(new BarEntry(Float.parseFloat(i2), Float.parseFloat(i3)));
            }

        }
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(Arrays.toString(labels)+"\n"+Arrays.toString(choiceGraph)+"\n"+Arrays.toString(arrGraph));
        // creating a new bar data set.
        barDataSet = new BarDataSet(barEntriesArrayList, "Geeks for Geeks");

        // creating a new bar data and
        // passing our bar data set.
        barData = new BarData(barDataSet);

        // below line is to set data
        // to our bar chart.
        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(true);
        barChart.setData(barData);



        ArrayList<String> sum = new ArrayList<String>();
        for(int i=0;i<choiceGraph.length;i++){
            if(choiceGraph[i].equalsIgnoreCase(" ")){
                sum.add(" ");
            }else{
                String temp=labels[i]+" ("+choiceGraph[i]+")";
                sum.add(temp);
            }

        }

//        final String[] labels = new String[] {"Dummy", "Jan", "Feb", "March", "April", "May"};
        xAxis.setValueFormatter(new IndexAxisValueFormatter(sum));
        xAxis.setGranularity(1f);
        xAxis.setGranularityEnabled(true);
        // adding color to our bar data set.
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        // setting text color.
        barDataSet.setValueTextColor(Color.BLACK);

        // setting text size
        barDataSet.setValueTextSize(16f);

//        XAxis xAxis = barChart.getXAxis();
//        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//        xAxis.setDrawGridLines(true);

//        barDataSet.setBarSpacePercent(16f);
//        barData.setBarWidth(1f);
//        barChart.getDescription().setEnabled(false);
    }
    public void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
    String graphX="f";
    String graphY="4";
    private void getBarEntries() {
        // creating a new array list
        barEntriesArrayList = new ArrayList<>();

        // adding new entry to our array list with bar
        // entry and passing x and y axis value to it.
        for (int i=0;i<50;i++){
            String i2= String.valueOf(i);
//            String i3="f"+i2;
            barEntriesArrayList.add(new BarEntry(Float.parseFloat(i2), Float.parseFloat(i2)));
        }
//        barEntriesArrayList.add(new BarEntry(1f, 6));
//        barEntriesArrayList.add(new BarEntry(2f, 6));
//        barEntriesArrayList.add(new BarEntry(3f, 8));
//        barEntriesArrayList.add(new BarEntry(4f, 2));
//        barEntriesArrayList.add(new BarEntry(5f, 4));
//        barEntriesArrayList.add(new BarEntry(6f, 1));


    }


}