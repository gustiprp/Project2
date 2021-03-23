package com.example.gusti;


import android.app.Activity;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import co.mobiwise.library.InteractivePlayerView;
import co.mobiwise.library.OnActionClickedListener;

public class Musik extends Activity implements OnActionClickedListener, AdapterView.OnItemClickListener {

    private InteractivePlayerView ipv;
    private Button control;
    private MediaPlayer mediaPlayer;

    private ListView listView;
    private String[] number;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musik);

        mediaPlayer = MediaPlayer.create(Musik.this, R.raw.beethoven_fur_elise);

        number = getResources().getStringArray(R.array.listmusic);
        listView = (ListView) findViewById(R.id.ListMusic);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, number);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        // call music
        uri = Uri.parse("android.resource://com.example.gusti/raw/beethoven_fur_elise");
        MediaMetadataRetriever mmr = new MediaMetadataRetriever();
        mmr.setDataSource(Musik.this, uri);

        String durastionString = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
        int milli = Integer.parseInt(durastionString);
        milli = milli / 1000;

        ipv = (InteractivePlayerView) findViewById(R.id.ipv);
        ipv.setMax(milli);
        ipv.setProgress(0);
        ipv.setOnActionClickedListener(this);

        control = (Button) findViewById(R.id.btnPlay);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!ipv.isPlaying()) {
                    ipv.start();
                    control.setText("PAUSE");

                    mediaPlayer.start();
                } else {
                    ipv.stop();
                    control.setText("PLAY");

                    mediaPlayer.pause();
                }
            }
        });
    }

    @Override
    public void onActionClicked(int id) {
        switch (id) {
            case 1:
                Toast.makeText(Musik.this, "Pilihan Shuffled", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(Musik.this, "Pilihan Love", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(Musik.this, "Pilihan Repeat", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView textView = (TextView) view;
        String parameterNilai = String.valueOf(textView.getText());

        if (parameterNilai.equals("Beethoven - Für Elise")) {
            cekMusikPlay();

            uri = Uri.parse("android.resource://com.example.gusti/raw/beethoven_fur_elise");
            mediaPlayer = MediaPlayer.create(Musik.this, R.raw.beethoven_fur_elise);

            MediaMetadataRetriever mmr = new MediaMetadataRetriever();
            mmr.setDataSource(Musik.this, uri);
            String durastionString = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
            int milli = Integer.parseInt(durastionString);
            milli = milli / 1000;
            ipv = (InteractivePlayerView) findViewById(R.id.ipv);
            ipv.setMax(milli);
            ipv.setProgress(0);

            cekMusikEnd();
        } else if (parameterNilai.equals("Beethoven - Moonlight Sonata")) {
            cekMusikPlay();
            
            uri = Uri.parse("android.resource://com.example.gusti/raw/beethoven_moonlight_sonata");
            mediaPlayer = MediaPlayer.create(Musik.this, R.raw.beethoven_moonlight_sonata);

            MediaMetadataRetriever mmr = new MediaMetadataRetriever();
            mmr.setDataSource(Musik.this, uri);
            String durastionString = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
            int milli = Integer.parseInt(durastionString);
            milli = milli / 1000;
            ipv = (InteractivePlayerView) findViewById(R.id.ipv);
            ipv.setMax(milli);
            ipv.setProgress(0);

            cekMusikEnd();
        } else if (parameterNilai.equals("Beethoven - Ode an die Freude/Ode to Joy 1")) {
            cekMusikPlay();

            uri = Uri.parse("android.resource://com.example.gusti/raw/beethoven_ode_an_die_freude_ode_to_joy_1");
            mediaPlayer = MediaPlayer.create(Musik.this, R.raw.beethoven_ode_an_die_freude_ode_to_joy_1);

            MediaMetadataRetriever mmr = new MediaMetadataRetriever();
            mmr.setDataSource(Musik.this, uri);
            String durastionString = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
            int milli = Integer.parseInt(durastionString);
            milli = milli / 1000;
            ipv = (InteractivePlayerView) findViewById(R.id.ipv);
            ipv.setMax(milli);
            ipv.setProgress(0);

            cekMusikEnd();
        } else if (parameterNilai.equals("Mozart - Cannon in D major")) {
            cekMusikPlay();

            uri = Uri.parse("android.resource://com.example.gusti/raw/mozart_cannon_in_d_major");
            mediaPlayer = MediaPlayer.create(Musik.this, R.raw.mozart_cannon_in_d_major);

            MediaMetadataRetriever mmr = new MediaMetadataRetriever();
            mmr.setDataSource(Musik.this, uri);
            String durastionString = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
            int milli = Integer.parseInt(durastionString);
            milli = milli / 1000;
            ipv = (InteractivePlayerView) findViewById(R.id.ipv);
            ipv.setMax(milli);
            ipv.setProgress(0);

            cekMusikEnd();
        } else if (parameterNilai.equals("Mozart - Piano Concerto No. 17 in G, K. 453")) {
            cekMusikPlay();

            uri = Uri.parse("android.resource://com.example.gusti/raw/mozart_piano_concerto_no_17_in_g_k_453");
            mediaPlayer = MediaPlayer.create(Musik.this, R.raw.mozart_piano_concerto_no_17_in_g_k_453);

            MediaMetadataRetriever mmr = new MediaMetadataRetriever();
            mmr.setDataSource(Musik.this, uri);
            String durastionString = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
            int milli = Integer.parseInt(durastionString);
            milli = milli / 1000;
            ipv = (InteractivePlayerView) findViewById(R.id.ipv);
            ipv.setMax(milli);
            ipv.setProgress(0);

            cekMusikEnd();
        } else if (parameterNilai.equals("Yiruma - Kiss the Rain")) {
            cekMusikPlay();

            uri = Uri.parse("android.resource://com.example.gusti/raw/yiruma_kiss_the_rain");
            mediaPlayer = MediaPlayer.create(Musik.this, R.raw.yiruma_kiss_the_rain);

            MediaMetadataRetriever mmr = new MediaMetadataRetriever();
            mmr.setDataSource(Musik.this, uri);
            String durastionString = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
            int milli = Integer.parseInt(durastionString);
            milli = milli / 1000;
            ipv = (InteractivePlayerView) findViewById(R.id.ipv);
            ipv.setMax(milli);
            ipv.setProgress(0);

            cekMusikEnd();
        } else {
            cekMusikPlay();

            uri = Uri.parse("android.resource://com.example.gusti/raw/yiruma_river_flows_in_you");
            mediaPlayer = MediaPlayer.create(Musik.this, R.raw.yiruma_river_flows_in_you);

            MediaMetadataRetriever mmr = new MediaMetadataRetriever();
            mmr.setDataSource(Musik.this, uri);
            String durastionString = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
            int milli = Integer.parseInt(durastionString);
            milli = milli / 1000;
            ipv = (InteractivePlayerView) findViewById(R.id.ipv);
            ipv.setMax(milli);
            ipv.setProgress(0);

            cekMusikEnd();
        }
    }

    private void cekMusikPlay() {
        if (ipv.isPlaying()) {
            ipv.stop();
            control.setText("PLAY");
            mediaPlayer.pause();
        }
    }

    private void cekMusikEnd() {
            ipv.start();
            control.setText("PAUSE");
            mediaPlayer.start();
        }
}
