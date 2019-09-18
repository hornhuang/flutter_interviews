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
import com.example.drop.adapter.ChatAdapter;
import com.example.drop.classes.Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

//    private Spinner spinner_iRobot;
//    private Spinner spinner_iFriend;
//    private Spinner spinner_iBlackList;
//
//
//    private List<String> datalist_irobot;
//    private List<String> datalist_ifriend;
//    private List<String> datalist_iblacklist;
//
//    private ArrayAdapter<String> arr_adapter_iRobot;
//    private ArrayAdapter<String> arr_adapter_iFriend;
//    private ArrayAdapter<String> arr_adapter_iBlackList;
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.chat_fragment,container,false);
//        return view;
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        spinner_iRobot = (Spinner) getActivity().findViewById(R.id.spinner_iRobot);
//        //数据
//        datalist_irobot = new ArrayList<String>();
//        datalist_irobot.add("iRobot");
//        datalist_irobot.add("微软小冰");
//        datalist_irobot.add("QQ小冰");
//        datalist_irobot.add("Baby_Q");
//
//        //适配器
//        arr_adapter_iRobot= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, datalist_irobot);
//
//        //设置样式
//        arr_adapter_iRobot.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        //加载适配器
//        spinner_iRobot.setAdapter(arr_adapter_iRobot);
//        //----------------------------------------------------------------------------------------------------------
//
//        spinner_iFriend = (Spinner) getActivity().findViewById(R.id.spinner_iFriend);
//
//        datalist_ifriend = new ArrayList<String>();
//        datalist_ifriend.add("iFriends");
//        datalist_ifriend.add("约翰·冯·诺依曼");
//        datalist_ifriend.add("阿兰·麦席森·图灵");
//        datalist_ifriend.add("李纳斯·托沃兹");
//        datalist_ifriend.add("阿米特·辛格");
//        datalist_ifriend.add("黎普曼");
//
//        arr_adapter_iFriend= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, datalist_ifriend);
//
//        arr_adapter_iFriend.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        spinner_iFriend.setAdapter(arr_adapter_iFriend);
//        //----------------------------------------------------------------------------------------------------------
//        spinner_iBlackList = (Spinner) getActivity().findViewById(R.id.spinner_iBlackList);
//
//        datalist_iblacklist = new ArrayList<String>();
//        datalist_iblacklist.add("iBlackList");
//        datalist_iblacklist.add("Bill·gates");
//        datalist_iblacklist.add("Steve·jobs");
//
//        arr_adapter_iBlackList= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, datalist_iblacklist);
//
//        arr_adapter_iBlackList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        spinner_iBlackList.setAdapter(arr_adapter_iBlackList);
//
//
//
//
//    }

    private List<Chat> chatList_1 = new ArrayList<>();
    private List<Chat> chatList_2 = new ArrayList<>();
    private List<Chat> chatList_3 = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chat_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initChat_1();
        RecyclerView recyclerView_1 = (RecyclerView) getActivity().findViewById(R.id.recycler_top_view_1);
        LinearLayoutManager layoutManager_top_1 = new LinearLayoutManager(getActivity());
        recyclerView_1.setLayoutManager(layoutManager_top_1);
        ChatAdapter adapter_top_1 = new ChatAdapter(chatList_1);
        recyclerView_1.setAdapter(adapter_top_1);

        initChat_2();
        RecyclerView recyclerView_2 = (RecyclerView) getActivity().findViewById(R.id.recycler_top_view_2);
        LinearLayoutManager layoutManager_top_2 = new LinearLayoutManager(getActivity());
        recyclerView_2.setLayoutManager(layoutManager_top_2);
        ChatAdapter adapter_top_2 = new ChatAdapter(chatList_2);
        recyclerView_2.setAdapter(adapter_top_2);

        initChat_3();
        RecyclerView recyclerView_3 = (RecyclerView) getActivity().findViewById(R.id.recycler_top_view_3);
        LinearLayoutManager layoutManager_top_3 = new LinearLayoutManager(getActivity());
        recyclerView_3.setLayoutManager(layoutManager_top_3);
        ChatAdapter adapter_top_3 = new ChatAdapter(chatList_3);
        recyclerView_3.setAdapter(adapter_top_3);

    }


    private void initChat_1() {
        for (int i = 0 ;i < 2; i++){
            Chat xiaochou = new Chat("安卓",R.drawable.android);
            chatList_1.add(xiaochou);
            Chat guandao = new Chat("图灵",R.drawable.tuling);
            chatList_1.add(guandao);
            Chat xiahu = new Chat("微软小冰",R.drawable.mincrosoftxiaobing);
            chatList_1.add(xiahu);
            Chat lanmo = new Chat("QQ小冰",R.drawable.qqxiaobin);
            chatList_1.add(lanmo);
            Chat landiao = new Chat("BabyQ",R.drawable.babyq);
            chatList_1.add(landiao);
            Chat xiaodu = new Chat("小度",R.drawable.baidurobot);
            chatList_1.add(xiaodu);
        }
    }

    private void initChat_2() {
        for (int i = 0 ;i < 2; i++){
            Chat xiaochou = new Chat("小丑鱼",R.drawable.gonzhixiaochou);
            chatList_2.add(xiaochou);
            Chat guandao = new Chat("关刀鱼",R.drawable.heibaiguandao);
            chatList_2.add(guandao);
            Chat xiahu = new Chat("虾虎鱼",R.drawable.gonzhixiaochou);
            chatList_2.add(xiahu);
            Chat lanmo = new Chat("蓝魔鱼",R.drawable.yuanyangpaodan);
            chatList_2.add(lanmo);
            Chat landiao = new Chat("蓝吊鱼",R.drawable.landiao);
            chatList_2.add(landiao);
        }
    }

    private void initChat_3() {
        for (int i = 0 ;i < 2; i++){
            Chat xiaochou = new Chat("小丑鱼",R.drawable.sishuimeigui);
            chatList_3.add(xiaochou);
            Chat guandao = new Chat("关刀鱼",R.drawable.heibaiguandao);
            chatList_3.add(guandao);
            Chat xiahu = new Chat("虾虎鱼",R.drawable.gonzhixiaochou);
            chatList_3.add(xiahu);
            Chat lanmo = new Chat("蓝魔鱼",R.drawable.huangweilanmo);
            chatList_3.add(lanmo);
            Chat landiao = new Chat("蓝吊鱼",R.drawable.landiao);
            chatList_3.add(landiao);
        }
    }



}
