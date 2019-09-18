package com.example.drop.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drop.classes.Chat;
import com.example.drop.R;
import com.example.drop.activity.ChatPageActivity;

import java.util.List;


public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private List<Chat> mHomeList;

    public ChatAdapter(List<Chat> homeList) {
        mHomeList = homeList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        View homeView;
        ImageView homeImage;
        TextView homeName;

        public ViewHolder(View view){
            super(view);
            homeView = view;
            homeImage = (ImageView) view.findViewById(R.id.Chat_image);
            homeName = (TextView) view.findViewById(R.id.Chat_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.homeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ChatPageActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        holder.homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ChatPageActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chat chat = mHomeList.get(position);
        holder.homeImage.setImageResource(chat.getImageId());
        holder.homeName.setText(chat.getName());
    }


    @Override
    public int getItemCount() {
        return mHomeList.size();
    }

}

