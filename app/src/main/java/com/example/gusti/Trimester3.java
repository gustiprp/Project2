package com.example.gusti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Trimester3 extends AppCompatActivity {

    CheckBox CheckG26, CheckG29, CheckG30, CheckG31, CheckG32, CheckG33, CheckG34, CheckG35,
            CheckG42, CheckG44, CheckG45, CheckG46, CheckG47, CheckG48, CheckG49, CheckG08,
            CheckG50, CheckG51, CheckG52, CheckG53, CheckG54, CheckG55, CheckG56, CheckG57,
            CheckG58, CheckG59, CheckG60, CheckG61, CheckG62, CheckG63, CheckG64, CheckG36,
            CheckG65, CheckG66, CheckG67, CheckG68, CheckG69;

    Button btn_deteksi;
    TextView tv_identif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trimester3);

        CheckG26 = (CheckBox)findViewById(R.id.G26);
        CheckG29 = (CheckBox)findViewById(R.id.G29);
        CheckG30 = (CheckBox)findViewById(R.id.G30);
        CheckG31 = (CheckBox)findViewById(R.id.G31);
        CheckG32 = (CheckBox)findViewById(R.id.G32);
        CheckG33 = (CheckBox)findViewById(R.id.G34);
        CheckG34 = (CheckBox)findViewById(R.id.G33);
        CheckG35 = (CheckBox)findViewById(R.id.G35);
        CheckG42 = (CheckBox)findViewById(R.id.G42);
        CheckG44 = (CheckBox)findViewById(R.id.G44);
        CheckG45 = (CheckBox)findViewById(R.id.G45);
        CheckG46 = (CheckBox)findViewById(R.id.G46);
        CheckG47 = (CheckBox)findViewById(R.id.G47);
        CheckG48 = (CheckBox)findViewById(R.id.G48);
        CheckG49 = (CheckBox)findViewById(R.id.G49);
        CheckG08 = (CheckBox)findViewById(R.id.G08);
        CheckG50 = (CheckBox)findViewById(R.id.G50);
        CheckG51 = (CheckBox)findViewById(R.id.G51);
        CheckG52 = (CheckBox)findViewById(R.id.G52);
        CheckG53 = (CheckBox)findViewById(R.id.G53);
        CheckG54 = (CheckBox)findViewById(R.id.G54);
        CheckG55 = (CheckBox)findViewById(R.id.G55);
        CheckG56 = (CheckBox)findViewById(R.id.G56);
        CheckG57 = (CheckBox)findViewById(R.id.G57);
        CheckG58 = (CheckBox)findViewById(R.id.G58);
        CheckG59 = (CheckBox)findViewById(R.id.G59);
        CheckG60 = (CheckBox)findViewById(R.id.G60);
        CheckG61 = (CheckBox)findViewById(R.id.G61);
        CheckG62 = (CheckBox)findViewById(R.id.G62);
        CheckG63 = (CheckBox)findViewById(R.id.G63);
        CheckG64 = (CheckBox)findViewById(R.id.G64);
        CheckG36 = (CheckBox)findViewById(R.id.G36);
        CheckG65 = (CheckBox)findViewById(R.id.G65);
        CheckG66 = (CheckBox)findViewById(R.id.G66);
        CheckG67 = (CheckBox)findViewById(R.id.G67);
        CheckG68 = (CheckBox)findViewById(R.id.G68);
        CheckG69 = (CheckBox)findViewById(R.id.G69);

        btn_deteksi = (Button) findViewById(R.id.button_deteksi);
        tv_identif = (TextView) findViewById(R.id.tv_identifikasi);

        btn_deteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaPenyakit = "";

                //Jenis Gejala untuk Penyakit : Preeklamsia
                if(CheckG29.isChecked() && CheckG30.isChecked() && CheckG31.isChecked() && CheckG32.isChecked()
                        && CheckG33.isChecked() && CheckG34.isChecked() && CheckG35.isChecked()){
                    NamaPenyakit += "\nPreeklamsia";
                }
                //Jenis Gejala untuk Penyakit : Hipertensi Gestasional
                if(CheckG08.isChecked()){
                    NamaPenyakit += "\nHipertensi Gestasional";
                }
                //Jenis Gejala untuk Penyakit : Solusio Plasenta Berat
                if(CheckG44.isChecked() && CheckG45.isChecked() && CheckG46.isChecked() && CheckG47.isChecked()){
                    NamaPenyakit += "\nSolusio Plasenta Berat";
                }
                //Jenis Gejala untuk Penyakit : Solusio Plasenta Sedang
                if(CheckG46.isChecked() && CheckG48.isChecked() && CheckG49.isChecked() && CheckG08.isChecked()){
                    NamaPenyakit += "\nSolusio Plasenta Sedang";
                }
                //Jenis Gejala untuk Penyakit : Solusio Plasenta Ringan
                if(CheckG46.isChecked() && CheckG48.isChecked() && CheckG51.isChecked() && CheckG52.isChecked()){
                    NamaPenyakit += "\nSolusio Plasenta Ringan";
                }
                //Jenis Gejala untuk Penyakit : Plasenta Previa
                if(CheckG67.isChecked() && CheckG68.isChecked() && CheckG26.isChecked() && CheckG69.isChecked()){
                    NamaPenyakit += "\nPlasenta Previa";
                }
                //Jenis Gejala untuk Penyakit : Plasenta Previa Totalis
                if(CheckG42.isChecked() && CheckG53.isChecked() && CheckG54.isChecked()){
                    NamaPenyakit += "\nPlasenta Previa Totalis";
                }
                //Jenis Gejala untuk Penyakit : Plasenta Previa Lateralis
                if(CheckG42.isChecked() && CheckG53.isChecked() && CheckG54.isChecked() && CheckG55.isChecked()){
                    NamaPenyakit += "\nPlasenta Previa Lateralis";
                }
                //Jenis Gejala untuk Penyakit : Plasenta Previa Marginal
                if(CheckG42.isChecked() && CheckG53.isChecked() && CheckG54.isChecked() && CheckG56.isChecked()){
                    NamaPenyakit += "\nPlasenta Previa Marginal";
                }
                //Jenis Gejala untuk Penyakit : Plasenta Previa Letak Rendah
                if(CheckG42.isChecked() && CheckG53.isChecked() && CheckG54.isChecked() && CheckG57.isChecked()){
                    NamaPenyakit += "\nPlasenta Previa Letak Rendah";
                }
                //Jenis Gejala untuk Penyakit : Anemia
                if(CheckG58.isChecked() && CheckG59.isChecked() && CheckG60.isChecked() && CheckG61.isChecked()
                        && CheckG62.isChecked()){
                    NamaPenyakit += "\nAnemia";
                }
                //Jenis Gejala untuk Penyakit : Infeksi Saluran Kemih pada Kehamilan
                if(CheckG63.isChecked() && CheckG64.isChecked() && CheckG65.isChecked() && CheckG36.isChecked()
                        && CheckG66.isChecked()){
                    NamaPenyakit += "\nInfeksi Saluran Kemih pada Kehamilan";
                }

                // Tampilkan Hasil Nama Penyakit di identif_trimister1
                tv_identif.setText(""+NamaPenyakit);

                Intent i = new Intent(Trimester3.this, Identifikasi.class);
                i.putExtra("identifikasi", tv_identif.getText().toString());
                startActivity(i);
            }
        });
    }
}
