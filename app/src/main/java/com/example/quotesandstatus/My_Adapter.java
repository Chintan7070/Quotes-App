package com.example.quotesandstatus;

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

import com.example.quotesandstatus.My_Adapter2.My_Adapter22;

public class My_Adapter extends RecyclerView.Adapter<My_Adapter.ViewData> {


    private final Activity activity;
    private final int[] cat_img;
    private final String[] cate_gory;

    public My_Adapter(MainActivity mainActivity, String[] category, int[] cat_img) {
        activity = mainActivity;
        this.cate_gory = category;
        this.cat_img= cat_img;

    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.first_cate,parent,false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, @SuppressLint("RecyclerView") int position) {
      holder.image.setBackgroundResource(cat_img[position]);
      holder.text.setText(cate_gory[position]);

      holder.image.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(activity, ""+cate_gory[position], Toast.LENGTH_SHORT).show();

              Intent intent=new Intent(activity,MainActivity2.class);
              intent.putExtra("ps",position);
              activity.startActivity(intent);

          }
      });
    }



    @Override
    public int getItemCount() {
        return cat_img.length;
    }

    class ViewData extends RecyclerView.ViewHolder {
        private final LinearLayout image;
        private final TextView text;

        public ViewData(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
            image=itemView.findViewById(R.id.image);

        }
    }


}
