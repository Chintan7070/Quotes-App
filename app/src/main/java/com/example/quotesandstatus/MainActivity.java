package com.example.quotesandstatus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String[] category={"Attitude","Inspirational","Success","Money","Student","Positive","Romantic","Love","Festivals","Friendship","god","Good Night"};
    int[] cat_img={R.drawable.attitude,R.drawable.inspiration,R.drawable.success,R.drawable.money,R.drawable.student,R.drawable.positive,R.drawable.romantic,R.drawable.love,R.drawable.festival,R.drawable.friendship,R.drawable.god,R.drawable.good_night};
    private RecyclerView rc_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rc_view=findViewById(R.id.rc_view);

        My_Adapter adapter=new My_Adapter(MainActivity.this,category,cat_img);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        rc_view.setLayoutManager(layoutManager);
        rc_view.setAdapter(adapter);




    }
}