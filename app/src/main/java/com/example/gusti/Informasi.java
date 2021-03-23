package com.example.gusti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gusti.informasi.info_Abortus_Iminens;
import com.example.gusti.informasi.info_Abortus_Inkompletus;
import com.example.gusti.informasi.info_Abortus_Insipiens;
import com.example.gusti.informasi.info_Abortus_Kompletus;
import com.example.gusti.informasi.info_Anemia;
import com.example.gusti.informasi.info_Emesis_Gravidarum;
import com.example.gusti.informasi.info_Hiperemesis_Gravidarum_Tipe1;
import com.example.gusti.informasi.info_Hiperemesis_Gravidarum_Tipe2;
import com.example.gusti.informasi.info_Hiperemesis_Gravidarum_Tipe3;
import com.example.gusti.informasi.info_Hipertensi_Gestasional;
import com.example.gusti.informasi.info_Infeksi_Saluran_Kemih;
import com.example.gusti.informasi.info_Kehamilan_Ektopik_Terganggu;
import com.example.gusti.informasi.info_Mola_Hidatidosa;
import com.example.gusti.informasi.info_Plasenta_Previa;
import com.example.gusti.informasi.info_Plasenta_Previa_Letak_Rendah;
import com.example.gusti.informasi.info_Plasenta_Previa_Leteralis;
import com.example.gusti.informasi.info_Plasenta_Previa_Marginal;
import com.example.gusti.informasi.info_Plasenta_Previa_Totalis;
import com.example.gusti.informasi.info_Preeklamsia;
import com.example.gusti.informasi.info_Solusio_Plasenta_Berat;
import com.example.gusti.informasi.info_Solusio_Plasenta_Ringan;
import com.example.gusti.informasi.info_Solusio_Plasenta_Sedang;

public class Informasi extends AppCompatActivity {

    Button btn_EmesisGravidarum,btn_HiperemesisGravidarumTipeI,btn_HiperemesisGravidarumTipeII,btn_HiperemesisGravidarumTipeIII,btn_Preeklamsia,
            btn_HipertensiGestasional,btn_AbortusIminens,btn_AbortusInsipiens,btn_AbortusInkompletus,btn_AbortusKompletus,btn_KehamilanEktopikTerganggu,
            btn_MolaHidatidosa,btn_SolusioPlasentaBerat,btn_SolusioPlasentaSedang,btn_SolusioPlasentaRingan,btn_PlasentaPrevia,btn_PlasentaPreviaTotalis,
            btn_PlasentaPreviaLateralis,btn_PlasentaPreviaMarginal,btn_PlasentaPreviaLetakRendah,btn_Anemia,btn_InfeksiSaluranKemihPadaKehamilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        //Tombol diklik akan berpindah ke layar solusi berdasarkan masing-masing penyakit
        btn_EmesisGravidarum = (Button)findViewById(R.id.btn_EmesisGravidarum);
        btn_EmesisGravidarum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Emesis_Gravidarum.class);
                startActivity(intent);
            }
        });
        btn_HiperemesisGravidarumTipeI = (Button)findViewById(R.id.btn_HiperemesisGravidarumTipeI);
        btn_HiperemesisGravidarumTipeI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Hiperemesis_Gravidarum_Tipe1.class);
                startActivity(intent);
            }
        });
        btn_HiperemesisGravidarumTipeII = (Button)findViewById(R.id.btn_HiperemesisGravidarumTipeII);
        btn_HiperemesisGravidarumTipeII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Hiperemesis_Gravidarum_Tipe2.class);
                startActivity(intent);
            }
        });
        btn_HiperemesisGravidarumTipeIII = (Button)findViewById(R.id.btn_HiperemesisGravidarumTipeIII);
        btn_HiperemesisGravidarumTipeIII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Hiperemesis_Gravidarum_Tipe3.class);
                startActivity(intent);
            }
        });
        btn_Preeklamsia = (Button)findViewById(R.id.btn_Preeklamsia);
        btn_Preeklamsia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Preeklamsia.class);
                startActivity(intent);
            }
        });
        btn_HipertensiGestasional = (Button)findViewById(R.id.btn_HipertensiGestasional);
        btn_HipertensiGestasional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Hipertensi_Gestasional.class);
                startActivity(intent);
            }
        });
        btn_AbortusIminens = (Button)findViewById(R.id.btnT_BumilEmeGra);
        btn_AbortusIminens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Abortus_Iminens.class);
                startActivity(intent);
            }
        });
        btn_AbortusInsipiens = (Button)findViewById(R.id.btnT_BumilHiper);
        btn_AbortusInsipiens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Abortus_Insipiens.class);
                startActivity(intent);
            }
        });
        btn_AbortusInkompletus = (Button)findViewById(R.id.btnT_BumilAnemia);
        btn_AbortusInkompletus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Abortus_Inkompletus.class);
                startActivity(intent);
            }
        });
        btn_AbortusKompletus = (Button)findViewById(R.id.btnT_BumilPtgSusu);
        btn_AbortusKompletus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Abortus_Kompletus.class);
                startActivity(intent);
            }
        });
        btn_KehamilanEktopikTerganggu = (Button)findViewById(R.id.btn_KehamilanEktopikTerganggu);
        btn_KehamilanEktopikTerganggu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Kehamilan_Ektopik_Terganggu.class);
                startActivity(intent);
            }
        });
        btn_MolaHidatidosa = (Button)findViewById(R.id.btn_MolaHidatidosa);
        btn_MolaHidatidosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Mola_Hidatidosa.class);
                startActivity(intent);
            }
        });
        btn_SolusioPlasentaBerat = (Button)findViewById(R.id.btn_SolusioPlasentaBerat);
        btn_SolusioPlasentaBerat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Solusio_Plasenta_Berat.class);
                startActivity(intent);
            }
        });
        btn_SolusioPlasentaSedang = (Button)findViewById(R.id.btn_SolusioPlasentaSedang);
        btn_SolusioPlasentaSedang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Solusio_Plasenta_Sedang.class);
                startActivity(intent);
            }
        });
        btn_SolusioPlasentaRingan = (Button)findViewById(R.id.btn_SolusioPlasentaRingan);
        btn_SolusioPlasentaRingan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Solusio_Plasenta_Ringan.class);
                startActivity(intent);
            }
        });
        btn_PlasentaPrevia = (Button)findViewById(R.id.btn_PlasentaPrevia);
        btn_PlasentaPrevia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Plasenta_Previa.class);
                startActivity(intent);
            }
        });
        btn_PlasentaPreviaTotalis = (Button)findViewById(R.id.btn_PlasentaPreviaTotalis);
        btn_PlasentaPreviaTotalis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Plasenta_Previa_Totalis.class);
                startActivity(intent);
            }
        });
        btn_PlasentaPreviaLateralis = (Button)findViewById(R.id.btn_PlasentaPreviaLateralis);
        btn_PlasentaPreviaLateralis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Plasenta_Previa_Leteralis.class);
                startActivity(intent);
            }
        });
        btn_PlasentaPreviaMarginal = (Button)findViewById(R.id.btn_PlasentaPreviaMarginal);
        btn_PlasentaPreviaMarginal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Plasenta_Previa_Marginal.class);
                startActivity(intent);
            }
        });
        btn_PlasentaPreviaLetakRendah = (Button)findViewById(R.id.btn_PlasentaPreviaLetakRendah);
        btn_PlasentaPreviaLetakRendah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Plasenta_Previa_Letak_Rendah.class);
                startActivity(intent);
            }
        });
        btn_Anemia = (Button) findViewById(R.id.btnT_BumilSakitPinggang);
        btn_Anemia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Anemia.class);
                startActivity(intent);
            }
        });
        btn_InfeksiSaluranKemihPadaKehamilan = (Button)findViewById(R.id.btn_InfeksiSaluranKemihPadaKehamilan);
        btn_InfeksiSaluranKemihPadaKehamilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), info_Infeksi_Saluran_Kemih.class);
                startActivity(intent);
            }
        });
    }
}