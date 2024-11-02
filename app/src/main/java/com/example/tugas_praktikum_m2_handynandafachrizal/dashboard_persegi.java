package com.example.tugas_praktikum_m2_handynandafachrizal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class dashboard_persegi extends AppCompatActivity {

    private Button buttonLuasp, buttonKelilingp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_persegi);

        // Inisialisasi tombol
        buttonLuasp = findViewById(R.id.Bluasp);
        buttonKelilingp = findViewById(R.id.Bkelilingp);

        // Set listener untuk tombol luas
        buttonLuasp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_persegi.this, luas_persegi.class);
                startActivity(intent);
            }
        });

        // Set listener untuk tombol keliling
        buttonKelilingp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_persegi.this, keliling_persegi.class);
                startActivity(intent);
            }
        });
    }

}