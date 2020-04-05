package com.awesomeness.glidedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button loadImageButton;
    String url = "https://i.picsum.photos/id/619/200/200.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing views of the activity.
        imageView = findViewById(R.id.image_to_load);
        loadImageButton = findViewById(R.id.load_image_button);

        loadImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Loading the URL in the ImageView using Glide
                Glide.with(MainActivity.this)
                        .load(url)
                        .centerCrop()
                        .placeholder(R.drawable.square_placeholder)
                        .into(imageView);
            }
        });
    }
}
