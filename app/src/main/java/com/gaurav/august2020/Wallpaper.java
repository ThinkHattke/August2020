package com.gaurav.august2020;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;

public class Wallpaper extends AppCompatActivity {

    ImageView wallpaper_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        wallpaper_image = findViewById(R.id.wallpaper_image);

        String url = "https://cdn.vox-cdn.com/thumbor/iS9cu8-U-hh8rUGhUnc4ulkJ1wE=/0x0:2040x1360/1820x1213/filters:focal(860x1034:1186x1360)/cdn.vox-cdn.com/uploads/chorus_image/image/59377089/wjoel_180413_1777_android_001.1523625143.jpg";

        Picasso.get().load(url).into(wallpaper_image);

    }
    
}