package com.example.drop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.drop.adapter.PageAdapter;
import com.example.drop.classes.Page;

import java.util.ArrayList;
import java.util.List;

public class HaiShuiYuTuJian extends AppCompatActivity {

    private List<Page> pageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hai_shui_yu_tu_jian);

        initPage();
        RecyclerView recyclerView_2 = (RecyclerView) this.findViewById(R.id.recycler_bottom_view);
        StaggeredGridLayoutManager layoutManager_bottom = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        recyclerView_2.setLayoutManager(layoutManager_bottom);
        recyclerView_2.addItemDecoration(new SpaceItemDecoration(10));
        PageAdapter adapter_bottom = new PageAdapter(pageList);
        recyclerView_2.setAdapter(adapter_bottom);
    }



    private void initPage() {

        Page xiaochou = new Page(
                "小丑鱼是对雀鲷科海葵鱼亚科鱼类的俗称，因为脸上都有一条或两条白色条纹，好似京剧中的丑角而得名，是一种热带咸水鱼。已知有28种。",R.drawable.gonzhixiaochou);
        pageList.add(xiaochou);
        Page guandao = new Page(
                "名称：黑白关刀鱼" +
                        "学名：Heniochus acumainatus" +
                        "英文名：Pennant coralfish" +
                        "科名：蝶鱼科" +
                        "别名：头巾蝶鱼、马夫鱼、旗珊瑚鱼。" +
                        "原产地：印度洋、红海的珊瑚礁水域。",R.drawable.heibaiguandao);
        pageList.add(guandao);
        Page xiahu = new Page(
                "虾虎鱼是虾虎鱼科各虾虎鱼种类的统称。它们每一种都有符合各自特征的名字，如 “侏儒虾虎鱼”、“寻常虾虎鱼”等。尽管它们看上去无一例外地傻头傻脑.",R.drawable.gonzhixiaochou);
        pageList.add(xiahu);
        Page lanmo = new Page(
                "中文名：黄尾蓝魔 　英文名：Yellowtail Damselfish 　学名：Chrysiptera parasema" +
                        "最小水族箱尺寸：150升" +
                        "饲养难度：容易 　饲养要求：盐度 1.020-1.025;酸碱度 8.1-8.4 　性情：一定攻击性 ",R.drawable.huangweilanmo);
        pageList.add(lanmo);
        Page landiao = new Page(
                "黄尾副刺尾鱼（学名：Paracanthurus hepatus）体侧扁，口小。鱼体呈鲜艳的宝蓝色，并有明显调色盘状黑带；背鳍与臀鳍皆为宝蓝镶黑色宽.",R.drawable.landiao);
        pageList.add(landiao);
        Page hongyin = new Page(
                "美国红鹰，学名盔新䱵，Neocirrhites armatus（Castelnau, 1873），䱵科新䱵属的一种鱼类。主要产斐济、塔西提岛 ，适合饲养在观赏用的珊瑚缸里。",R.drawable.meiguohongying);
        pageList.add(hongyin);
        Page renzidie = new Page(
                "扬幡蝴蝶鱼（学名：Chaetodon auriga）：俗名人字蝶，为辐鳍鱼纲鲈形目蝴蝶鱼科的其中一种。成鱼背鳍常露出水面，故得名扬幡蝴蝶鱼。",R.drawable.renzidie);
        pageList.add(renzidie);
        Page meigui = new Page(
                "泗水玫瑰， Banggai Cardinal是少数可以在珊瑚水族箱内实现群游的海水观赏鱼之一。泗水玫瑰所属的天竺鲷类几乎都是受欢迎的海水观赏鱼.",R.drawable.sishuimeigui);
        pageList.add(meigui);
        Page paodan = new Page(
                "鸳鸯炮弹黑白交叉的鱼体，前吻有一黄带，是浅海炮弹鱼，食鱼、虾，饲养容易。饲养在水族箱里会口含碎珊瑚可掘坑取乐。会发出“咕咕“的声音。",R.drawable.yuanyangpaodan);
        pageList.add(paodan);
        Page yuemeidie = new Page(
                "月眉蝶鱼和小丑鱼其实是热带海洋观赏鱼的主角，因为它们拥有美艳的体色，娇美的轮廓，蝶鱼两侧扁平椭圆的体型，再加上既尖又小的嘴巴，正符合其天然处所环境-珊瑚礁，",R.drawable.yuemeidie);
        pageList.add(yuemeidie);
        Page leida = new Page(
                "雷达鱼形态娇小可爱，体色艳丽，吻黄，前半身白，后半身鲜红，第二背鳍、臀鳍及尾鳍外缘深红，尤其是第一背鳍之第1棘延长耸立为丝状，象雷达似的。",R.drawable.zileida);
        pageList.add(leida);
    }


}
