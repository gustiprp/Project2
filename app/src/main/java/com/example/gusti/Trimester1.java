package com.example.gusti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Trimester1 extends AppCompatActivity {

    CheckBox CheckG01, CheckG02, CheckG03, CheckG04, CheckG05, CheckG06, CheckG07, CheckG08,
            CheckG09, CheckG10, CheckG11, CheckG12, CheckG13, CheckG14, CheckG15, CheckG16,
            CheckG17, CheckG18, CheckG19, CheckG20, CheckG21, CheckG22, CheckG23, CheckG24,
            CheckG25, CheckG26, CheckG27, CheckG28, CheckG58, CheckG59, CheckG60, CheckG61,
            CheckG62, CheckG63, CheckG64, CheckG36, CheckG65, CheckG66;

    Button btn_deteksi;
    TextView tv_identif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trimester1);

        CheckG01 = (CheckBox)findViewById(R.id.G01);
        CheckG02 = (CheckBox)findViewById(R.id.G02);
        CheckG03 = (CheckBox)findViewById(R.id.G03);
        CheckG04 = (CheckBox)findViewById(R.id.G04);
        CheckG05 = (CheckBox)findViewById(R.id.G05);
        CheckG06 = (CheckBox)findViewById(R.id.G06);
        CheckG07 = (CheckBox)findViewById(R.id.G07);
        CheckG08 = (CheckBox)findViewById(R.id.G08);
        CheckG09 = (CheckBox)findViewById(R.id.G09);
        CheckG10 = (CheckBox)findViewById(R.id.G10);
        CheckG11 = (CheckBox)findViewById(R.id.G11);
        CheckG12 = (CheckBox)findViewById(R.id.G12);
        CheckG13 = (CheckBox)findViewById(R.id.G13);
        CheckG14 = (CheckBox)findViewById(R.id.G14);
        CheckG15 = (CheckBox)findViewById(R.id.G15);
        CheckG16 = (CheckBox)findViewById(R.id.G16);
        CheckG17 = (CheckBox)findViewById(R.id.G17);
        CheckG18 = (CheckBox)findViewById(R.id.G18);
        CheckG19 = (CheckBox)findViewById(R.id.G19);
        CheckG20 = (CheckBox)findViewById(R.id.G20);
        CheckG21 = (CheckBox)findViewById(R.id.G21);
        CheckG22 = (CheckBox)findViewById(R.id.G22);
        CheckG23 = (CheckBox)findViewById(R.id.G23);
        CheckG24 = (CheckBox)findViewById(R.id.G24);
        CheckG25 = (CheckBox)findViewById(R.id.G25);
        CheckG26 = (CheckBox)findViewById(R.id.G26);
        CheckG27 = (CheckBox)findViewById(R.id.G27);
        CheckG28 = (CheckBox)findViewById(R.id.G28);
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

        btn_deteksi = (Button) findViewById(R.id.button_deteksi);
        tv_identif = (TextView) findViewById(R.id.tv_identifikasi);

        btn_deteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String NamaPenyakit = "";

                //Jenis Gejala untuk Penyakit : Emesis Gravidarum
                if(CheckG01.isChecked() && CheckG02.isChecked()){
                    NamaPenyakit += "\nEmesis Gravidarum";
                }
                //Jenis Gejala untuk Penyakit : Hiperemesis Gravidarum Tipe I
                if(CheckG03.isChecked() && CheckG04.isChecked() && CheckG05.isChecked() && CheckG06.isChecked()
                        && CheckG07.isChecked() && CheckG08.isChecked() && CheckG09.isChecked() && CheckG10.isChecked()
                        && CheckG11.isChecked() && CheckG12.isChecked()){
                    NamaPenyakit += "\nHiperemesis Gravidarum Tipe I";
                }
                //Jenis Gejala untuk Penyakit : Hiperemesis Gravidarum Tipe II
                if(CheckG13.isChecked() && CheckG06.isChecked() && CheckG14.isChecked() && CheckG15.isChecked()
                        && CheckG16.isChecked() && CheckG09.isChecked() && CheckG17.isChecked() && CheckG18 .isChecked()){
                    NamaPenyakit += "\nHiperemesis Gravidarum Tipe II";
                }
                //Jenis Gejala untuk Penyakit : Hiperemesis Gravidarum Tipe III
                if(CheckG19.isChecked() && CheckG20.isChecked() && CheckG21.isChecked() && CheckG18.isChecked()
                        && CheckG11.isChecked() && CheckG22.isChecked()){
                    NamaPenyakit += "\nHiperemesis Gravidarum Tipe III";
                }
                //Jenis Gejala untuk Penyakit : Abortus Iminens
                if(CheckG23.isChecked() && CheckG24.isChecked()){
                    NamaPenyakit += "\nAbortus Iminens";
                }
                //Jenis Gejala untuk Penyakit : Abortus Insipiens
                if(CheckG25.isChecked()){
                    NamaPenyakit += "\nAbortus Insipiens";
                }
                //Jenis Gejala untuk Penyakit : Abortus Inkompletus
                if(CheckG26.isChecked() && CheckG27.isChecked()){
                    NamaPenyakit += "\nAbortus Inkompletus";
                }
                //Jenis Gejala untuk Penyakit : Abortus Kompletus
                if(CheckG26.isChecked() && CheckG28.isChecked()){
                    NamaPenyakit += "\nAbortus Kompletus";
                }
                //Jenis Gejala untuk Penyakit : Anemia
                if(CheckG58.isChecked() && CheckG59.isChecked() && CheckG60.isChecked() && CheckG61.isChecked()
                        && CheckG62.isChecked()){
                    NamaPenyakit += "\nAnemia";
                }
                //Jenis Gejala untuk Penyakit : Infeksi Saluran Kemih pada Kehamilan
                if(CheckG63.isChecked() && CheckG64.isChecked() && CheckG36.isChecked() && CheckG65.isChecked()
                        && CheckG66.isChecked()){
                    NamaPenyakit += "\nInfeksi Saluran Kemih pada Kehamilan";
                }

                // Tampilkan Hasil Nama Penyakit di identif_trimister1
                    tv_identif.setText(""+NamaPenyakit);

                Intent i = new Intent(Trimester1.this, Identifikasi.class);
                i.putExtra("identifikasi", tv_identif.getText().toString());
                startActivity(i);
            }
        });

    }
}
