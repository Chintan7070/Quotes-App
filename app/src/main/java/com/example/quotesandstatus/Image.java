package com.example.quotesandstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Image extends AppCompatActivity {

    private ImageView image_view;
    private TextView txt_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        image_view=findViewById(R.id.image_view);
        txt_view=findViewById(R.id.txt_view);

       int ps11 = getIntent().getIntExtra("img",0);
       String txt2=getIntent().getStringExtra("txt22");

        image_view.setImageResource(ps11);
        txt_view.setText(txt2);


    }
}