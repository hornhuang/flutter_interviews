package com.example.drop.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drop.classes.Page;
import com.example.drop.R;

import java.util.List;

public class PageAdapter extends RecyclerView.Adapter<PageAdapter.ViewHolder> {

    private Context mContext;

    private List<Page> mPageList;

    public PageAdapter(List<Page> pageList) {
        mPageList = pageList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView pageView;
        ImageView pageImage;
        TextView pageName;


        public ViewHolder(View view) {
            super(view);
            pageView = (CardView) view;
            pageImage = (ImageView) view.findViewById(R.id.page_image);
            pageName = (TextView) view.findViewById(R.id.page_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.page_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.pageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Page page = mPageList.get(position);
                PageAdapter tag = (PageAdapter) view.getTag();
            }
        });
        holder.pageImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Page page = mPageList.get(position);
                PageAdapter tag = (PageAdapter) view.getTag();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Page page = mPageList.get(position);
        holder.pageImage.setImageResource(page.getImageId());
        holder.pageName.setText(page.getName());

    }

    @Override
    public int getItemCount() {
        return mPageList.size();
    }


}