package com.example.full_screen_image;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class screen extends AppCompatActivity {
ImageView fullScreenImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        fullScreenImageView=findViewById(R.id.image);
        Intent callActivityIntent=getIntent();
        if(callActivityIntent !=null){

            Uri imageUri=callActivityIntent.getData();
            if (imageUri!=null && fullScreenImageView !=null)
            {
                Glide.with(this)
                        .load(imageUri)
                        .into(fullScreenImageView);
            }
        }


    }
}