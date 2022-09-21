package com.raytech.spinnerkullanimi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Con2Activity extends AppCompatActivity {

    //spinner
    private String[] workOrderTypes = {"Ağaç Kesim", "Bakım", "Uzaktan Sayaç Okuma"};
    private Spinner spinnerWorkOrderTypes;
    private ArrayAdapter<String> veriAdapterWorkOrderTypes;
    //button
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con2);
        //spinner
        spinnerWorkOrderTypes = (Spinner) findViewById(R.id.spinnerWorkOrderType);
        veriAdapterWorkOrderTypes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, workOrderTypes);
        veriAdapterWorkOrderTypes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerWorkOrderTypes.setAdapter(veriAdapterWorkOrderTypes);
        spinnerWorkOrderTypes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), "Seçiminiz: " + workOrderTypes[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//button
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(Con2Activity.this, Con3Activity.class);
                startActivity(go);
            }
        });
    }
}