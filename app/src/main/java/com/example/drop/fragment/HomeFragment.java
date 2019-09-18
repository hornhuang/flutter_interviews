package com.example.drop.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drop.R;
import com.example.drop.adapter.HomeAdapter;
import com.example.drop.classes.Chat;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private List<Chat> homeList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        initHome_1();
        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.home_list_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        HomeAdapter adapter = new HomeAdapter(homeList);
        recyclerView.setAdapter(adapter);

    }

    private void initHome_1() {
            Chat xiaochou = new Chat("\n 日程",R.drawable.richeng);
            homeList.add(xiaochou);
            Chat guandao = new Chat("\n  邮箱",R.drawable.youxiang);
            homeList.add(guandao);
            Chat xiahu = new Chat("\n  电话",R.drawable.dianhua);
            homeList.add(xiahu);
            Chat lanmo = new Chat("\n  收藏",R.drawable.shouchang);
            homeList.add(lanmo);
            Chat landiao = new Chat("\n  动态",R.drawable.dongtai);
            homeList.add(landiao);

    }



}