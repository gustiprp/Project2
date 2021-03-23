package com.example.gusti.informasi;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gusti.R;

public class info_Kehamilan_Ektopik_Terganggu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.info_kehamilan_ektopik_terganggu);
    }
}