package com.oprabin.workshopapp;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class ContentAdaptor extends RecyclerView.Adapter<ContentAdaptor.MyViewHolder> {

    ArrayList<Information> informationArrayList = new ArrayList<>();

    public ContentAdaptor(ArrayList<Information> informationArrayList) {
        this.informationArrayList = informationArrayList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ImageView imageView = holder.imageView;
        TextView textTitle = holder.textViewTitle;
        TextView textDesc = holder.textViewDesc;

        textTitle.setText(informationArrayList.get(position).getName());
        textDesc.setText(informationArrayList.get(position).getDescription());
        imageView.setImageResource(informationArrayList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return informationArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewDesc;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            textViewTitle = (TextView) itemView.findViewById(R.id.rowTitle);
            textViewDesc = (TextView) itemView.findViewById(R.id.rowDesc);
            imageView = (ImageView) itemView.findViewById(R.id.image);



        }
    }
}
