package com.example.gusti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Trimester extends AppCompatActivity {

    Button btn_trimes1, btn_trimes2, btn_trimes3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trimester);

        btn_trimes1 = (Button)findViewById(R.id.button_trimester1);
        btn_trimes2 = (Button)findViewById(R.id.button_trimester2);
        btn_trimes3 = (Button)findViewById(R.id.button_trimester3);

        //Tombol diklik akan berpindah ke layar Trimester1
        btn_trimes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Trimester.this.startActivity(new Intent(Trimester.this, Trimester1.class));
            }
        });

        //Tombol diklik akan berpindah ke layar Trimester2
        btn_trimes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Trimester.this.startActivity(new Intent(Trimester.this, Trimester2.class ));
            }
        });

        //Tombol diklik akan berpindah ke layar Trimester3
        btn_trimes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Trimester.this.startActivity(new Intent(Trimester.this, Trimester3.class));
            }
        });

    }
}
