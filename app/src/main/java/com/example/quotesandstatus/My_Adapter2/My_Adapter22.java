package com.example.quotesandstatus.My_Adapter2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotesandstatus.Image;
import com.example.quotesandstatus.MainActivity2;
import com.example.quotesandstatus.My_Adapter;
import com.example.quotesandstatus.R;

public class My_Adapter22 extends RecyclerView.Adapter<My_Adapter22.ViewData2> {



    private final int[] img2;
    private final Activity activity2;
    private final String[] shyari2;

    public My_Adapter22(MainActivity2 mainActivity2, String[] shayari, int[] img2) {
        activity2=mainActivity2;
        this.shyari2=shayari;
        this.img2=img2;

    }

    @NonNull
    @Override
    public ViewData2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(activity2).inflate(R.layout.second_cate,parent,false);
        return new ViewData2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData2 holder, @SuppressLint("RecyclerView") int position) {
    holder.image2.setBackgroundResource(img2[position]);
    holder.text2.setText(shyari2[position]);
    holder.image2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent2=new Intent(activity2,Image.class);
            intent2.putExtra("img",img2[position]);
            intent2.putExtra("txt22",shyari2[position]);
            activity2.startActivity(intent2);

        }
    });

    }

    @Override
    public int getItemCount() {
        return img2.length;
    }

    class ViewData2 extends RecyclerView.ViewHolder {


        private final LinearLayout image2;
        private final TextView text2;

        public ViewData2(@NonNull View itemView) {
            super(itemView);
            image2=itemView.findViewById(R.id.image2);
            text2=itemView.findViewById(R.id.text2);
        }
    }
    }

