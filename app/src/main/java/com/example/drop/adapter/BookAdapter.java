package com.example.drop.adapter;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drop.classes.Book;
import com.example.drop.HaiShuiYuTuJian;
import com.example.drop.R;
import com.example.drop.ReDaiYuTuJian;

import java.util.List;


public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    private Context mContext;

    private List<Book> mBookList;

    public BookAdapter(List<Book> bookList) {
        mBookList = bookList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView bookView;
        ImageView bookImage;
        TextView bookName;


        public ViewHolder(View view){
            super(view);
            bookView = (CardView) view;
            bookImage = (ImageView) view.findViewById(R.id.page_image);
            bookName = (TextView) view.findViewById(R.id.page_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.page_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.bookView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Book book = mBookList.get(position);
                BookAdapter tag = (BookAdapter) view.getTag();
                select(view, book);
            }
        });
        holder.bookImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Book Book = mBookList.get(position);
                BookAdapter tag = (BookAdapter) view.getTag();
                select(view, Book);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Book book = mBookList.get(position);
        holder.bookImage.setImageResource(book.getImageId());
        holder.bookName.setText(book.getName());

    }

    @Override
    public int getItemCount() {
        return mBookList.size();
    }


    public void select(View view, Book book){
        Intent intent;
        switch (book.getName()){
            case "海水鱼图鉴":
                intent = new Intent(view.getContext(), HaiShuiYuTuJian.class);
                view.getContext().startActivity(intent);
                break;
            case "热带鱼图鉴":
                intent  = new Intent(view.getContext(), ReDaiYuTuJian.class);
                view.getContext().startActivity(intent);
                break;
            case "珊瑚图鉴":
                Toast.makeText(view.getContext(),"您尚未购买",Toast.LENGTH_SHORT).show();
                break;
            case "水草图鉴":
                Toast.makeText(view.getContext(),"您尚未购买",Toast.LENGTH_SHORT).show();
                break;
            case "雨林植物":
                Toast.makeText(view.getContext(),"您尚未购买",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(view.getContext(),"尚未推出敬请期待",Toast.LENGTH_SHORT).show();
                break;

        }
    }

}



