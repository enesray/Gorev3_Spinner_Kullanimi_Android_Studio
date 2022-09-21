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

public class Con1Activity extends AppCompatActivity {

    //spinner kullanımı için tanımlamalar
    private String[] routes = {"Karşıyaka", "Çeşme", "Bayraklı"};
    private Spinner spinnerRoutes;
    private ArrayAdapter<String> veriAdapterRoutes;

//sayfa geçişi için buton
    public Button btnRay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con1);

        //spinner kullanımı
        spinnerRoutes = (Spinner) findViewById(R.id.spinnerRoute);
        veriAdapterRoutes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, routes);
        veriAdapterRoutes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRoutes.setAdapter(veriAdapterRoutes);
        spinnerRoutes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getBaseContext(), "Seçiminiz: " + routes[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//button
        btnRay = findViewById(R.id.btnRay);
        btnRay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(Con1Activity.this, Con2Activity.class);
                startActivity(go);
            }
        });
    }
}