package com.example.drop.adapter;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drop.R;
import com.example.drop.Web;
import com.example.drop.WorldTop;

import java.util.List;


public class WorldTopAdapter extends RecyclerView.Adapter<WorldTopAdapter.ViewHolder> {

    private List<WorldTop> mWorldTopList;

    public WorldTopAdapter(List<WorldTop> worldTopList) {
        mWorldTopList = worldTopList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        View worldView;
        ImageView worldImage;
        TextView worldName;

        public ViewHolder(View view){
            super(view);
            worldView = view;
            worldImage = (ImageView) view.findViewById(R.id.WorldTop_image);
            worldName = (TextView) view.findViewById(R.id.WorldTop_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.world_top_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.worldView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                WorldTop worldTop = mWorldTopList.get(position);
                WorldTopAdapter tag = (WorldTopAdapter) view.getTag();
                Intent intent  = new Intent(view.getContext(), Web.class);
                intent.putExtra("name",worldTop.getName());
                view.getContext().startActivity(intent);
            }
        });
        holder.worldImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                WorldTop worldTop = mWorldTopList.get(position);
                WorldTopAdapter tag = (WorldTopAdapter) view.getTag();
                Intent intent  = new Intent(view.getContext(),Web.class);
                intent.putExtra("name",worldTop.getName());
                view.getContext().startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WorldTop worldTop = mWorldTopList.get(position);
        holder.worldImage.setImageResource(worldTop.getImageId());
        holder.worldName.setText(worldTop.getName());
    }

    @Override
    public int getItemCount() {
        return mWorldTopList.size();
    }

}




