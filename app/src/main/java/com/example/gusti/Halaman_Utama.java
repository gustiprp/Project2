package com.example.gusti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman_Utama extends AppCompatActivity {

    Button btn_identifikasi, btn_tipsinfo, btn_musik, btn_hubbidan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_utama);

        btn_identifikasi = (Button)findViewById(R.id.button_identifikasi);
        btn_tipsinfo = (Button)findViewById(R.id.button_informasi);
        btn_musik = (Button)findViewById(R.id.button_musik);
        btn_hubbidan = (Button)findViewById(R.id.button_hubbidan);

        //Tombol diklik akan berpindah ke layar Trimester
        btn_identifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Halaman_Utama.this.startActivity(new Intent(Halaman_Utama.this, Trimester.class));
            }
        });

        //Tombol diklik akan berpindah ke layar Tips & Informasi
        btn_tipsinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Halaman_Utama.this.startActivity(new Intent(Halaman_Utama.this, TipsInfo.class));
            }
        });

        //Tombol diklik akan berpindah ke layar Musik
        btn_musik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Halaman_Utama.this.startActivity(new Intent(Halaman_Utama.this, Musik.class));
            }
        });

        //Tombol diklik akan berpindah ke layar Hubungi Bidan
        btn_hubbidan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Halaman_Utama.this.startActivity(new Intent(Halaman_Utama.this, HubBidan.class));
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Halaman_Utama.this, Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        startActivity(intent);
        finish();
    }
}

