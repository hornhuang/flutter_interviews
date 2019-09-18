package com.example.drop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.drop.adapter.PageAdapter;

import java.util.ArrayList;
import java.util.List;

public class ReDaiYuTuJian extends AppCompatActivity {

    private List<Page> pageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_dai_yu_tu_jian);

        initPage();
        RecyclerView recyclerView_2 = (RecyclerView) this.findViewById(R.id.recycler_bottom_view);
        StaggeredGridLayoutManager layoutManager_bottom = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        recyclerView_2.setLayoutManager(layoutManager_bottom);
        recyclerView_2.addItemDecoration(new SpaceItemDecoration(10));
        PageAdapter adapter_bottom = new PageAdapter(pageList);
        recyclerView_2.setAdapter(adapter_bottom);
    }



    private void initPage() {
        Page  q= new Page(
                "玻璃猫：原产地泰国、爪哇、苏门答腊、马来西亚、婆罗洲及印尼一带。又叫猫头水晶鱼，非常好看，最大的特点就是鱼体是透明的，骨骼清晰看见，内脏只占全身的5%不到。",R.drawable.bolimao_book);
        pageList.add(q);
        Page  a= new Page(
                "接吻鱼：又叫亲嘴鱼、吻鱼、桃花鱼、吻嘴鱼、香吻鱼、接吻斗鱼等，在分类学上隶属于鲈形目、吻鲈科、钉嘴鱼属，以鱼喜相互“接吻”而闻名。接吻鱼的体长一般为20～30厘米。身体呈长圆形。头大，嘴大，尤其是嘴唇又厚又大，并有细的锯齿。",R.drawable.jiewenyu);
        pageList.add(a);
        Page  z= new Page(
                "盲鱼：原产于墨西哥。它是一种非常美丽的观赏鱼，体长大约为8厘米，身披亮银色鳞片，所有的鳍部均呈奶油色。",R.drawable.mangyu);
        pageList.add(z);
        Page  w= new Page(
                "斑马鱼：又名蓝条鱼、花条鱼。原产地印度和孟加拉。斑马鱼体里梭形，长5厘米左右，胸腹部较圆，尾部侧扁。全身基调黄色，背部橄榄色，从背部至腹部、臀鳍，有多条深蓝色纵条纹直达尾鳍，满身条纹似斑马而得名。",R.drawable.banmayu);
        pageList.add(w);
        Page  s= new Page(
                "珍珠马甲：原产地亚洲的泰国、马来西亚、印度尼西亚。珍珠马甲也许是斗鱼科热带鱼中最美丽，也是最受水族爱好者欢迎的鱼类。银褐色的身体，乃至鳍边均布满了珍珠状的斑点，显得格外雍容华贵，这也是它名字的由来。",R.drawable.zhenzhumajia);
        pageList.add(s);
        Page  x= new Page(
                "小精灵：以蔓生藻及变异种的强大破坏力而闻名。即使如此，特的个性却十分羞涩内向，很容易在食藻时受到其他同居者干扰。",R.drawable.xiaojingling);
        pageList.add(x);
        Page  e= new Page(
                "黄鳍鲳：原产地东南亚沿海到南非洲沿海。身长10-23厘米，菱形，侧扁，背鳍与臀鳍形状、大小相近，臀鳍前端后弯如手指状。体色银白，背鳍和尾部呈金黄色，头部有2条黑色横条纹贯通眼和鳃盖后缘。",R.drawable.huangqichang);
        pageList.add(e);
        Page  d= new Page(
                "黑莲灯：又名黑霓红灯鱼，黑灯鱼。原产地巴西。体形与红莲灯鱼相似。体色偏暗。体侧有三条纵向条纹，最上条呈黄绿色，中间一条为白色，下面一条为较宽的黑色带。鳍均为透明。",R.drawable.heiliangdeng);
        pageList.add(d);
        Page  c= new Page(
                "头尾灯：又名电灯鱼。原产地南美洲的圭亚那和亚马逊河流域。体长4~5厘米。体长而侧扁，头短，腹圆。两眼上部和尾部各有一块金黄色斑，在灯光照射下，反射出金黄色和红色的色彩。",R.drawable.touweideng);
        pageList.add(c);
        Page  r= new Page(
                "孔雀鱼：又名彩虹鱼、百万鱼。原地产委内瑞拉、圭亚那、西印度群岛等地。孔雀鱼体形修长，有着极为美丽的花尾巴，故名孔雀鱼。雄鱼体长4厘米左右，尾部(包括尾柄及尾鳍)长占全长的2/3左右;雌鱼体长达5-6厘米，尾长占全长的1/2以上。",R.drawable.kongqueyu);
        pageList.add(r);
        Page  f= new Page(
                "网球鱼：分布南美洲亚马逊河 圭亚拿身长:约10CM水温22~~26(为宜)水质:弱酸性至中性,体长梭形,头尖.体银灰色鱼鳞很大,每片鱼鳞都有黑色点,因此在整个鱼体上有均匀的黑色点,体侧有一条由头到尾部的黑线",R.drawable.wangqiuyu);
        pageList.add(f);
    }
}
