## TabBar  + tabContraller

- 解决 16 中，单独 TabBar 不同页面切换/上拉加载实现麻烦的问题





#### 1.1 新建 TabController 界面

- 需要继承自 StatefulWidget

- ```dart
  import 'package:flutter/material.dart';
  
  class TabBarControllerPage extends StatefulWidget {
    TabBarControllerPage({Key key}) : super(key: key);
  
    _TabBarControllerPageState createState() => _TabBarControllerPageState();
  }
  
  class _TabBarControllerPageState extends State<TabBarControllerPage> with SingleTickerProviderStateMixin {
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text("TabBarControllerPage"),
          
        ),
      );
    }
  }
  ```

- 





#### 1.2 配置路由

- 引入 tabBarController.dart 组件

- ```dart
  import '../pages/TabBarController.dart';
  
  
  //配置路由
  final routes={
        '/':(context)=>Tabs(),
        '/appBarDemo':(context)=>AppBarDemoPage(),   
        '/tabBarController':(context)=>TabBarControllerPage(),     
        
  };
  ```

- 





#### 1.3 在 Home 中跳转到待测试页面

- （非必要，只是为了测试）

- ```dart
  class _HomePageState extends State<HomePage> {
    @override
    Widget build(BuildContext context) {
      return Center(
        child: Row(       
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            ...
            RaisedButton(
                child: Text("TabController定义顶部tab切换 "),
                onPressed: () {
                  //路由跳转
                  Navigator.pushNamed(context, '/tabBarController');
                 
            })
          ],
        ),
      );
    }
  }
  ```





#### 1.5 实现 SingleTickerProviderStateMixin 接口

- ```dart
  class _TabBarControllerPageState extends State<TabBarControllerPage> with SingleTickerProviderStateMixin {
  
    TabController _tabController;
  
    @override
    void dispose() {   //生命周期函数
      // TODO: implement dispose
      super.dispose();
      _tabController.dispose();
    }
  
    @override
    void initState() {   //生命周期函数
      // TODO: implement initState
      super.initState();
      _tabController=new TabController(
        vsync: this,
        length: 2
      );
      // _tabController.addListener((){
  
      //   print(_tabController.index);     
      // });
    }  
  
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text("TabBarControllerPage"),
          bottom: TabBar(
            controller: this._tabController,  //注意
            tabs: <Widget>[
              Tab(text:"热销"),
              Tab(text:"推荐"),
            ],
          ),
        ),
        body: TabBarView(
          controller: this._tabController,  //注意
          children: <Widget>[
            Center(child: Text("热销")),
            Center(child: Text("推荐"))
            
          ],
        ),
      );
    }
  }
  ```

- 首先定义 TabController

- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e4fe2252de3d5?w=594&h=330&f=png&s=19486)

- 组件初始化时赋值 initState() 初始化操作，传入 this 和 tab 的 长度
- ![image-20200505212146644](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200505212146644.png)

- 实现我们的 TabBar 过程和非 Cotroller 的普通写法一样
- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e5018a374d922?w=581&h=612&f=png&s=32761)
- 需要注意，将 TabBar 和 TabBarView 里对 controller 赋值

- ```dart
  controller: this._tabController,  //注意
  ```

- 优势：在 TabController 里调用 addListener() 监听 TabBar 的改变，然后可以做一系列操作

- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e5042764e4693?w=615&h=503&f=png&s=230918)







#### 1.6 监听组件销毁的 dispose() 方法

- 可以在这里释放 controller 对象，或其它操作

- ```dart
  class _TabBarControllerPageState extends State<TabBarControllerPage> with SingleTickerProviderStateMixin {
  
    TabController _tabController;
  
    @override
    void dispose() {   //生命周期函数
      // TODO: implement dispose
      super.dispose();
      _tabController.dispose();
    }
  ```

- 