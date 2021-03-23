package com.example.gusti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Identifikasi extends AppCompatActivity {

    TextView tv_outputnamapenyakit;
    Button btn_solusi, btn_hubbidan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifikasi);

        String hasil = getIntent().getExtras().getString("identifikasi");
        tv_outputnamapenyakit = (TextView)findViewById(R.id.tv_outputnamapenyakit);
        tv_outputnamapenyakit.setText(hasil);

        btn_solusi = (Button)findViewById(R.id.btn_solusi);
        btn_hubbidan = (Button)findViewById(R.id.btn_hubbidan);

        //Tombol diklik akan berpindah ke layar Solusi
        btn_solusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Identifikasi.this.startActivity(new Intent(Identifikasi.this, Solusi.class));
            }
        });

        //Tombol diklik akan berpindah ke layar HubBidan
        btn_hubbidan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Identifikasi.this.startActivity(new Intent(Identifikasi.this, HubBidan.class));
            }
        });
    }
}
