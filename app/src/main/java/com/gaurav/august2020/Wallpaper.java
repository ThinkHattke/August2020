package com.gaurav.august2020;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

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

        new DownloadImage(wallpaper_image).execute(url);

    }

    class DownloadImage extends AsyncTask<String, Void, Bitmap> {

        ImageView wallpaper_image;

        DownloadImage(ImageView wallpaper_image) {
            this.wallpaper_image = wallpaper_image;
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            String url = strings[0];
            Bitmap bitmap = null;

            try {
                InputStream inputStream = new URL(url).openStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Exception e) {

            }

            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            wallpaper_image.setImageBitmap(bitmap);
        }
    }

}