package com.gaurav.august2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;
import java.util.Set;

public class Wallpaper extends AppCompatActivity {

    ImageView wallpaper_image_1, wallpaper_image_2, wallpaper_image_3, wallpaper_image_4, wallpaper_image_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        wallpaper_image_1 = findViewById(R.id.wallpaper_image_1);
        wallpaper_image_2 = findViewById(R.id.wallpaper_image_2);
        wallpaper_image_3 = findViewById(R.id.wallpaper_image_3);
        wallpaper_image_4 = findViewById(R.id.wallpaper_image_4);
        wallpaper_image_5 = findViewById(R.id.wallpaper_image_5);

        final String[] urls = {
                "https://cutewallpaper.org/21/4k-wallapers/Ultra-HD-Wallpapers-4K-73-background-pictures.jpg",
                "https://cdn.vox-cdn.com/thumbor/iS9cu8-U-hh8rUGhUnc4ulkJ1wE=/0x0:2040x1360/1820x1213/filters:focal(860x1034:1186x1360)/cdn.vox-cdn.com/uploads/chorus_image/image/59377089/wjoel_180413_1777_android_001.1523625143.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ9ZYWs4BeLCG7cntNVIXq8pdYKVckRrHOAHg&usqp=CAU",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSFHM4fwR9dgKb9iMn-nmyzkO-xX3PsumZPfw&usqp=CAU",
                "https://free-download-free.com/wp-content/uploads/2019/04/Orange-Windows-10-Wallapers.jpg"};

        Picasso.get().load(urls[0]).into(wallpaper_image_1);
        Picasso.get().load(urls[1]).into(wallpaper_image_2);
        Picasso.get().load(urls[2]).into(wallpaper_image_3);
        Picasso.get().load(urls[3]).into(wallpaper_image_4);
        Picasso.get().load(urls[4]).into(wallpaper_image_5);

        wallpaper_image_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Wallpaper.this, SetWallpaper.class);
                intent.putExtra("imageURL",urls[0]);
                startActivity(intent);

            }
        });

        wallpaper_image_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Wallpaper.this, SetWallpaper.class);
                intent.putExtra("imageURL",urls[1]);
                startActivity(intent);

            }
        });

        wallpaper_image_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Wallpaper.this, SetWallpaper.class);
                intent.putExtra("imageURL",urls[2]);
                startActivity(intent);

            }
        });
        wallpaper_image_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Wallpaper.this, SetWallpaper.class);
                intent.putExtra("imageURL",urls[3]);
                startActivity(intent);

            }
        });
        wallpaper_image_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Wallpaper.this, SetWallpaper.class);
                intent.putExtra("imageURL",urls[4]);
                startActivity(intent);

            }
        });
    }

}