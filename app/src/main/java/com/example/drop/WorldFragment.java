package com.example.drop;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.drop.adapter.WorldTopAdapter;
import com.example.drop.classes.WorldTop;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.util.ArrayList;

import java.util.List;

public class WorldFragment extends Fragment implements ViewPager.OnPageChangeListener {

    private RollPagerView mRollViewPager;

    private List<WorldTop> worldTopList = new ArrayList<>();

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    public int time=3000;

    private ViewPager viewPager;

    private int[] imageResIds;

    private ArrayList<ImageView> imageViewList;

    private LinearLayout ll_point_container;

    private String[] contentDescs;

    private TextView tv_desc;

    private int previousSelectedPosition = 0;

    public boolean isRunning = true;
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.world_fragment,container,false);
        mRollViewPager = view.findViewById(R.id.roll_view_pager);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        mRollViewPager.setPlayDelay(1000);
        mRollViewPager.setAnimationDurtion(500);
        mRollViewPager.setAdapter(new TestNormalAdapter());
        mRollViewPager.setHintView(new ColorPointHintView(getActivity(), Color.YELLOW,Color.WHITE));

//        initWorldTop();
//        RecyclerView recyclerView_1 = (RecyclerView) getActivity().findViewById(R.id.recycler_top_view);
//        LinearLayoutManager layoutManager_top = new LinearLayoutManager(getActivity());
//        layoutManager_top.setOrientation(layoutManager_top.HORIZONTAL);
//        recyclerView_1.setLayoutManager(layoutManager_top);
//        recyclerView_1.addItemDecoration(new SpaceItemDecoration(5));
//        WorldTopAdapter adapter_top = new WorldTopAdapter(worldTopList);
//        recyclerView_1.setAdapter(adapter_top);

// 初始化布局 View视图
//        initViews();
//        // Model数据
//        initData();
//        // Controller 控制器
//        initAdapter();
//        // 开启轮询
//        new Thread() {
//            public void run() {
//
//                while (true) {
//                    try {
//                        Thread.sleep(4000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    // 往下跳一位
//                    getActivity().runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
//                        }
//                    });
//                }
//            }
//            ;
//
//        }.start();


        //**********************************************************************************************



        initWorldBottom();
        RecyclerView recyclerView_2 = (RecyclerView) getActivity().findViewById(R.id.recycler_bottom_view);
        StaggeredGridLayoutManager layoutManager_bottom = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView_2.setLayoutManager(layoutManager_bottom);
        recyclerView_2.addItemDecoration(new SpaceItemDecoration(10));
        WorldTopAdapter adapter_bottom = new WorldTopAdapter(worldTopList);
        recyclerView_2.setAdapter(adapter_bottom);

    }

//    private void initWorldTop() {
//        for (int i = 0 ;i < 2; i++){
//            WorldTop xiaochou = new WorldTop("雨林缸",R.drawable.rainforest_tank);
//            worldTopList.add(xiaochou);
//            WorldTop guandao = new WorldTop("南美缸",R.drawable.amazon_tank);
//            worldTopList.add(guandao);
//            WorldTop xiahu = new WorldTop("海缸",R.drawable.sea_tank);
//            worldTopList.add(xiahu);
//            WorldTop lanmo = new WorldTop("草缸",R.drawable.gass_tank);
//            worldTopList.add(lanmo);
//        }
//    }

    public void setIsRunning(Boolean isRunning){
        this.isRunning = isRunning;
    }

    public boolean getIsRunning(){
        return isRunning;
    }

    private void initWorldBottom() {
        for (int i = 0 ;i < 2; i++){
            WorldTop xiaochou = new WorldTop(
                    "小丑鱼",R.drawable.gonzhixiaochou);
            worldTopList.add(xiaochou);
            WorldTop guandao = new WorldTop(
                   "关刀鱼",R.drawable.heibaiguandao);
            worldTopList.add(guandao);
            WorldTop xiahu = new WorldTop(
                    "虾虎鱼",R.drawable.gonzhixiaochou);
            worldTopList.add(xiahu);
            WorldTop lanmo = new WorldTop(
                    "蓝魔鱼",R.drawable.huangweilanmo);
            worldTopList.add(lanmo);
            WorldTop landiao = new WorldTop(
                    "蓝吊鱼",R.drawable.landiao);
            worldTopList.add(landiao);
            WorldTop hongyin = new WorldTop(
                    "红鹰鱼",R.drawable.meiguohongying);
            worldTopList.add(hongyin);
            WorldTop renzidie = new WorldTop(
                    "人字蝶鱼",R.drawable.renzidie);
            worldTopList.add(renzidie);
            WorldTop meigui = new WorldTop(
                    "泗水玫瑰鱼",R.drawable.sishuimeigui);
            worldTopList.add(meigui);
            WorldTop paodan = new WorldTop(
                    "鸳鸯炮弹鱼",R.drawable.yuanyangpaodan);
            worldTopList.add(paodan);
            WorldTop yuemeidie = new WorldTop(
                    "月眉蝶鱼",R.drawable.yuemeidie);
            worldTopList.add(yuemeidie);
            WorldTop leida = new WorldTop(
                    "雷达鱼",R.drawable.zileida);
            worldTopList.add(leida);
        }
    }


    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.drawable.rainforest_tank,
                R.drawable.gass_tank,
                R.drawable.sea_tank,
                R.drawable.amazon_tank,
        };

        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }


        @Override
        public int getCount() {
            return imgs.length;
        }

    }
//    private String getRandomLengthName(String name){
//        Random random = new Random();
//        int length = random.nextInt(20)+1;
//        StringBuilder builder = new StringBuilder();
//
//        return builder.toString();
//    }



    //.........................................................................................

//    public void tingzhi(View v) {
//        bb.setVisibility(View.VISIBLE);
//        tt.setVisibility(View.GONE);
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        isRunning = false;
    }

//    private void initViews() {
//        viewPager = (ViewPager) getActivity().findViewById(R.id.viewpager);
//        viewPager.setOnPageChangeListener(this);// 设置页面更新监听
////		viewPager.setOffscreenPageLimit(1);// 左右各保留几个对象
//        ll_point_container = (LinearLayout) getActivity().findViewById(R.id.ll_point_container);
//        tv_desc = (TextView) getActivity().findViewById(R.id.tv_desc);
//
//    }

    /**
     * 初始化要显示的数据
     */
    private void initData() {
        // 图片资源id数组
        imageResIds = new int[]{R.drawable.rainforest_tank, R.drawable.sea_tank, R.drawable.gass_tank, R.drawable.amazon_tank, R.drawable.sea};

        // 文本描述
        contentDescs = new String[]{
                "美国旧金山水族馆一水獭打哈欠走红",
                "红树又回来啦！引万人注目",
                "海缸总是让人流连忘返",
                "那些绝美的造景总能让人眼前一亮",
                "河南多地现假“海洋馆” 只有几个鱼缸几条鱼"
        };

        // 初始化要展示的5个ImageView
        imageViewList = new ArrayList<ImageView>();
        ImageView imageView;
        View pointView;
        LinearLayout.LayoutParams layoutParams;
        for (int i = 0; i < imageResIds.length; i++) {
            // 初始化要显示的图片对象

            imageView = new ImageView(getActivity());
            imageView.setBackgroundResource(imageResIds[i]);
            imageViewList.add(imageView);

            // 加小白点, 指示器
            pointView = new View(getActivity());
            pointView.setBackgroundResource(R.drawable.selector_bg_point);
            layoutParams = new LinearLayout.LayoutParams(5, 5);
            if (i != 0)
                layoutParams.leftMargin = 10;

            // 设置默认所有都不可用
            pointView.setEnabled(false);
            ll_point_container.addView(pointView, layoutParams);
        }
    }

    private void initAdapter() {
        ll_point_container.getChildAt(0).setEnabled(true);
        tv_desc.setText(contentDescs[0]);
        previousSelectedPosition = 0;
        // 设置适配器
        viewPager.setAdapter(new MyAdapter());
        // 默认设置到中间的某个位置
        int pos = Integer.MAX_VALUE / 2 - (Integer.MAX_VALUE / 2 % imageViewList.size());
        // 2147483647 / 2 = 1073741823 - (1073741823 % 5)
        viewPager.setCurrentItem(5000000); // 设置到某个位置
    }

    class MyAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }
        // 3. 指定复用的判断逻辑, 固定写法
        @Override
        public boolean isViewFromObject(View view, Object object) {
//			System.out.println("isViewFromObject: "+(view == object));
            // 当划到新的条目, 又返回来, view是否可以被复用.
            // 返回判断规则
            return view == object;
        }

        // 1. 返回要显示的条目内容, 创建条目
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            System.out.println("instantiateItem初始化: " + position);
            // container: 容器: ViewPager
            // position: 当前要显示条目的位置 0 -> 4
//			newPosition = position % 5
            int newPosition = position % imageViewList.size();
            ImageView imageView = imageViewList.get(newPosition);
            // a. 把View对象添加到container中
            container.addView(imageView);
            // b. 把View对象返回给框架, 适配器
            return imageView; // 必须重写, 否则报异常

        }

        // 2. 销毁条目
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            // object 要销毁的对象
            System.out.println("destroyItem销毁: " + position);
            container.removeView((View) object);
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset,
                               int positionOffsetPixels) {
        // 滚动时调用
    }

    @Override

    public void onPageSelected(int position) {
        // 新的条目被选中时调用
        System.out.println("onPageSelected: " + position);
        int newPosition = position % imageViewList.size();

        //设置文本
        tv_desc.setText(contentDescs[newPosition]);


        // 把之前的禁用, 把最新的启用, 更新指示器
        ll_point_container.getChildAt(previousSelectedPosition).setEnabled(false);
        ll_point_container.getChildAt(newPosition).setEnabled(true);

        // 记录之前的位置
        previousSelectedPosition = newPosition;



    }



    @Override

    public void onPageScrollStateChanged(int state) {
        // 滚动状态变化时调用

    }
}
