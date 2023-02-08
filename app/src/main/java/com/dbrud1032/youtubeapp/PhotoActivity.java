package com.dbrud1032.youtubeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PhotoActivity extends AppCompatActivity {

    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        imgPhoto = findViewById(R.id.imgPhoto);

        // 이미지를 표시하려면, url 있어야 한다.
        // 따라서, 메인엑티비티로부터, url 받아온다.
        String url = getIntent().getStringExtra("highUrl");

        Glide.with(PhotoActivity.this).load(url).placeholder(R.drawable.baseline_ondemand_video_24).into(imgPhoto);

    }
}