package com.example.gusti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gusti.informasi.info_Emesis_Gravidarum;
import com.example.gusti.tips.Tips_BumilAnemia;
import com.example.gusti.tips.Tips_BumilEmeGra;
import com.example.gusti.tips.Tips_BumilHiper;
import com.example.gusti.tips.Tips_BumilPtgSusu;
import com.example.gusti.tips.Tips_BumilSakitPinggang;

public class Tips extends AppCompatActivity {
    Button btnT_BumilEmeGra, btnT_BumilHiper, btnT_BumilAnemia, btnT_BumilPtgSusu, btnT_BumilSakitPinggang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        //Tombol diklik akan berpindah ke layar solusi berdasarkan masing-masing penyakit
        btnT_BumilEmeGra = (Button)findViewById(R.id.btnT_BumilEmeGra);
        btnT_BumilEmeGra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Tips_BumilEmeGra.class);
                startActivity(intent);
            }
        });
        btnT_BumilHiper = (Button)findViewById(R.id.btnT_BumilHiper);
        btnT_BumilHiper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Tips_BumilHiper.class);
                startActivity(intent);
            }
        });
        btnT_BumilAnemia = (Button)findViewById(R.id.btnT_BumilAnemia);
        btnT_BumilAnemia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Tips_BumilAnemia.class);
                startActivity(intent);
            }
        });
        btnT_BumilPtgSusu = (Button)findViewById(R.id.btnT_BumilPtgSusu);
        btnT_BumilPtgSusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Tips_BumilPtgSusu.class);
                startActivity(intent);
            }
        });
        btnT_BumilSakitPinggang = (Button)findViewById(R.id.btnT_BumilSakitPinggang);
        btnT_BumilSakitPinggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Tips_BumilSakitPinggang.class);
                startActivity(intent);
            }
        });
    }
}