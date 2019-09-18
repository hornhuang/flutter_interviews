package com.example.drop.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drop.classes.Chat;
import com.example.drop.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<Chat> mHomeList;

    public HomeAdapter(List<Chat> chatList) {
        mHomeList = chatList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        View homeView;
        ImageView homeImage;
        TextView homeName;

        public ViewHolder(View view){
            super(view);
            homeView = view;
            homeImage = (ImageView) view.findViewById(R.id.home_image);
            homeName = (TextView) view.findViewById(R.id.home_name);
        }
    }


    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item,parent,false);
        final HomeAdapter.ViewHolder holder = new HomeAdapter.ViewHolder(view);
        holder.homeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"功能尚未推出敬请期待",Toast.LENGTH_SHORT).show();
            }
        });
        holder.homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"功能尚未推出敬请期待",Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        Chat home = mHomeList.get(position);
        holder.homeImage.setImageResource(home.getImageId());
        holder.homeName.setText(home.getName());
    }

    @Override
    public int getItemCount() {
        return mHomeList.size();
    }
}
