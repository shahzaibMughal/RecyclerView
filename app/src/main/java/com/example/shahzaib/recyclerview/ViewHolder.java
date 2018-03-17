package com.example.shahzaib.recyclerview;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder{

    public ImageView itemImageView;
    public TextView  titleTV, descriptionTV;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        itemImageView = itemView.findViewById(R.id.item_imageView);
        titleTV = itemView.findViewById(R.id.titleTV);
        descriptionTV = itemView.findViewById(R.id.descriptionTV);

    }
}
