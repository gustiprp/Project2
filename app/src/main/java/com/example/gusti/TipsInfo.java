package com.example.gusti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TipsInfo extends AppCompatActivity {

    Button btn_tips, btn_informasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsinfo);

        btn_tips = (Button) findViewById(R.id.button_tips);
        //Tombol diklik akan berpindah ke layar Tips
        btn_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TipsInfo.this.startActivity(new Intent(TipsInfo.this, Tips.class));
            }
        });

        btn_informasi = (Button) findViewById(R.id.button_informasi);
        //Tombol diklik akan berpindah ke layar Informasi
        btn_informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TipsInfo.this.startActivity(new Intent(TipsInfo.this, Informasi.class));
            }
        });
    }
}
