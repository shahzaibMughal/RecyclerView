package com.example.shahzaib.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<ViewHolder>{
    List<UserData> userData = new ArrayList<>();

    public Adapter(List<UserData> userData)
    {
        this.userData = userData;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        UserData tempUserData = userData.get(position);

        holder.itemImageView.setImageResource(tempUserData.image);
        holder.titleTV.setText(tempUserData.Title);
        holder.descriptionTV.setText(tempUserData.Description);
    }

    @Override
    public int getItemCount() {return userData.size(); }
}
