package com.example.ejerciciosmas40;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;

import androidx.appcompat.widget.Toolbar;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
import java.util.List;

public class ReportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);


        int[] yentries = new int[]{75, 74, 70, 72, 68, 67, 67, 64, 66, 65};

        List<Entry> entries = new ArrayList<>();
        for(int i=0; i < 10; i++){
            int xentry = i;
            int yentry = yentries[i];

            entries.add(new Entry(xentry, yentry));
        }

        LineDataSet lineDataSet = new LineDataSet(entries, "Peso(Kg)");
        lineDataSet.setColor(getResources().getColor(R.color.colorPrimaryLight));

        LineData lineData = new LineData(lineDataSet);
        LineChart lineChart = findViewById(R.id.chart);
        lineChart.setDrawBorders(true);
        lineChart.setBorderColor(R.color.colorPrimaryDark);
        lineChart.setDescription(null);
        lineChart.setData(lineData);
        //lineChart.animateY(1000);
        lineChart.animateX(1000);

    }
}