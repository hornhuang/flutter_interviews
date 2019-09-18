package com.example.drop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drop.adapter.BookAdapter;
import com.example.drop.classes.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFragment extends Fragment {

    private List<Book> bookList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.book_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initBookBottom();
        RecyclerView recyclerView_2 = (RecyclerView) getActivity().findViewById(R.id.recycler_bottom_view);
        StaggeredGridLayoutManager layoutManager_bottom = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView_2.setLayoutManager(layoutManager_bottom);
        recyclerView_2.addItemDecoration(new SpaceItemDecoration(10));
        BookAdapter adapter_bottom = new BookAdapter(bookList);
        recyclerView_2.setAdapter(adapter_bottom);
    }


    private void initBookBottom() {
            Book xiaochou = new Book(
                    "海水鱼图鉴",R.drawable.haishuiyutujian);
            bookList.add(xiaochou);
            Book guandao = new Book(
                    "热带鱼图鉴",R.drawable.redaiyutujian);
            bookList.add(guandao);
            Book xiahu = new Book(
                    "珊瑚图鉴",R.drawable.shanhutujian);
            bookList.add(xiahu);
            Book lanmo = new Book(
                    "水草图鉴",R.drawable.shuicaotujian);
            bookList.add(lanmo);
            Book landiao = new Book(
                    "雨林植物图鉴",R.drawable.yulinzhiwutujian);
            bookList.add(landiao);
            Book hongyin = new Book(
                    "Empty",R.drawable.empty_book);
            bookList.add(hongyin);
            Book renzidie = new Book(
                    "Empty",R.drawable.empty_book);
            bookList.add(renzidie);
            Book meigui = new Book(
                    "Empty",R.drawable.empty_book);
            bookList.add(meigui);
            Book paodan = new Book(
                    "Empty",R.drawable.empty_book);
            bookList.add(paodan);
            Book yuemeidie = new Book(
                    "Empty",R.drawable.empty_book);
            bookList.add(yuemeidie);
            Book leida = new Book(
                    "Empty",R.drawable.empty_book);
            bookList.add(leida);
    }
}
