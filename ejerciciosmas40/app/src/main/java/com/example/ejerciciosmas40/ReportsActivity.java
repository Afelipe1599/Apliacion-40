package com.example.ejerciciosmas40;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
import java.util.List;

public class ReportsActivity extends AppCompatActivity {
    int weightDiff, firstValue, lastValue;
    double imc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);

        int[] yentries = new int[]{74, 72, 70, 72, 68, 67, 65};
        firstValue = yentries[0];
        lastValue=0;
        List<Entry> entries = new ArrayList<>();
        for(int i=0; i < yentries.length; i++){
            int xentry = i;
            int yentry = yentries[i];
            lastValue = yentry;

            entries.add(new Entry(xentry, yentry));
        }

        weightDiff = firstValue-lastValue;

        imc = lastValue/Math.pow(1.6, 2);

        TextView imcTextView = findViewById(R.id.imcTextView);
        imcTextView.setText(String.valueOf(Math.round(imc)));

        TextView weightTextView = findViewById(R.id.weightTextView);
        weightTextView.setText(String.valueOf(weightDiff+" Kg"));


        LineDataSet lineDataSet = new LineDataSet(entries, "Peso(Kg)");
        lineDataSet.setColor(getResources().getColor(R.color.colorPrimaryDark));

        LineData lineData = new LineData(lineDataSet);
        LineChart lineChart = findViewById(R.id.chart);
        lineChart.setDrawBorders(true);
        lineChart.setBorderColor(getResources().getColor(R.color.colorPrimaryDark));
        lineChart.setDescription(null);
        lineChart.setData(lineData);
        lineChart.setDrawBorders(true);
        lineChart.animateX(1000);


        ImageView lowWeight = findViewById(R.id.imageViewLowWeight);
        ImageView normalRange = findViewById(R.id.imageViewNormalRange);
        ImageView overWeight = findViewById(R.id.imageViewOverweight);
        ImageView obesity = findViewById(R.id.imageViewObesity);

        TextView lowWeightTextView = findViewById(R.id.textViewLowWeight);
        TextView normalRangeTextView = findViewById(R.id.textViewNormalRange);
        TextView overWeightTextView = findViewById(R.id.textViewOverweight);
        TextView obesityTextView = findViewById(R.id.textViewObesity);

        if(imc < 18.5){
            lowWeight.setColorFilter(getResources().getColor(R.color.colorPrimaryDark));
            lowWeightTextView.setText("Bajo peso");
        }else if(imc >= 18.5 && imc < 24.9){
            normalRange.setColorFilter(getResources().getColor(R.color.colorPrimaryDark));
            normalRangeTextView.setText("Normal");
        }else if(imc >= 25.0 && imc < 29.9) {
            overWeight.setColorFilter(getResources().getColor(R.color.colorPrimaryDark));
            overWeightTextView.setText("Sobrepeso");
        }else if(imc >= 30.0 && imc < 34.9){
            obesity.setColorFilter(getResources().getColor(R.color.colorPrimaryDark));
            obesityTextView.setText("Obesidad I");
        }else if(imc >= 35 && imc < 39.9){
            obesity.setColorFilter(getResources().getColor(R.color.colorPrimaryDark));
            obesityTextView.setText("Obesidad II");
        }else if(imc >= 40.0){
            obesity.setColorFilter(getResources().getColor(R.color.colorPrimaryDark));
            obesityTextView.setText("Obesidad III");
        }

    }
}