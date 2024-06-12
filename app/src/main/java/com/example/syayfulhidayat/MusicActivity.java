package com.example.syayfulhidayat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    //NAMA  : SYAYFUL HIDAYAT
    //NIM   : 10120912

    VideoView videoView;
    ListView listView, listMusic;
    ArrayList<String>videoList;
    ArrayList<String>musicList;
    ArrayAdapter adapter;

    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicActivity.this, MainActivity.class);
                startActivity(intent);
                finish();            }
        });

        videoView = findViewById(R.id.videoview);
        listView = findViewById(R.id.lvideo);
        listMusic = findViewById(R.id.lmusic);

        videoList = new ArrayList<>();
        videoList.add("video");
        videoList.add("video2");
        videoList.add("videolucu");
        videoList.add("videopantai");
        videoList.add("videoupin");

        musicList = new ArrayList<>();
        musicList.add("naruto_jutsu");
        musicList.add("adaakudisini");
        musicList.add("lagujazz");
        musicList.add("lagupenyemangat");
        musicList.add("melukissenja");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,videoList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName() + "/" +R.raw.video));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName() + "/" +R.raw.video2));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName() + "/" +R.raw.videolucu));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName() + "/" + R.raw.videopantai));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName() + "/" + R.raw.videoupin));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName() + "/" + R.raw.naruto_jutsu));
                        break;
                    default:
                        break;
                }
                videoView.setMediaController(new MediaController(MusicActivity.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,musicList);
        listMusic.setAdapter(adapter);
        listMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.naruto_jutsu));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.adaakudisini));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lagujazz));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lagupenyemangat));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.melukissenja));
                        break;
                    default:
                        break;
                }
                videoView.setMediaController(new MediaController(MusicActivity.this));
                videoView.requestFocus();
                videoView.start();
            }
        });

    }
}
