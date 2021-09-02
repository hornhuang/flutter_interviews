## AppBar

- 顶部导航按钮图标、颜色 以及 TabBar 定义顶部 Tab 切换



### 一、 AppBar 自定义顶部按钮图标颜色

#### 1.1 属性
- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e3181525fc842?w=640&h=272&f=png&s=53149)



#### 1.2 背景

- backgroundColor: Colors.red,
- ```dart
  class AppBarDemoPage extends StatelessWidget {
    const AppBarDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title:Text("AppBarDemoPage"), 
          // backgroundColor: Colors.red, 
          ...
        ),
        body: Text('1111'),
      );
    }
  }
  ```

  



#### 1.3 左边添加图标

- leading: Icon(Icons.menu),

- 只添加图标，无点击事件

- ```dart
  class AppBarDemoPage extends StatelessWidget {
    const AppBarDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title:Text("AppBarDemoPage"), 
          // backgroundColor: Colors.red, 
          leading: Icon(Icons.menu),
          ...
        ),
        body: Text('1111'),
      );
    }
  }
  ```



#### 1.4 左边添加可点击图标

- 带点击事件

- ```dart
  class AppBarDemoPage extends StatelessWidget {
    const AppBarDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title:Text("AppBarDemoPage"), 
          // backgroundColor: Colors.red, 
          centerTitle:true,
          leading: IconButton(
            icon: Icon(Icons.menu),
            onPressed: (){
              print('menu');
            },
          ), 
          ...
        ),
        body: Text('1111'),
      );
    }
  }
  ```





#### 1.5 右边添加按钮

- **如果是二级界面，添加新按钮后，默认返回按钮就会被取消**

- 可点击，发现被 debug 遮住

- ```dart
  class AppBarDemoPage extends StatelessWidget {
    const AppBarDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title:Text("AppBarDemoPage"), 
          ...
          actions: <Widget>[
            IconButton(
              icon: Icon(Icons.search),
              onPressed: (){
                print('search');
              },
            ),
          ],
  
        ),
        body: Text('1111'),
      );
    }
  }
  ```

- 在 MyApp 去掉 debug

- ```dart
  void main() => runApp(MyApp());
  class MyApp extends StatelessWidget {  
    
    @override
    Widget build(BuildContext context) {
      return MaterialApp(
        debugShowCheckedModeBanner:false ,  //去掉debug图标
        // home:Tabs(),   
        initialRoute: '/appBarDemo',     //初始化的时候加载的路由
        onGenerateRoute: onGenerateRoute     
      );
    }
  }
  ```





#### 1.6 右边添加按钮

- 添加一个按钮

- ```dart
  class AppBarDemoPage extends StatelessWidget {
    const AppBarDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title:Text("AppBarDemoPage"), 
          // backgroundColor: Colors.red, 
          // centerTitle:true,
          leading: IconButton(
            icon: Icon(Icons.menu),
            onPressed: (){
              print('menu');
            },
          ), 
          actions: <Widget>[
            IconButton(
              icon: Icon(Icons.search),
              onPressed: (){
                print('search');
              },
            )
          ],
  
        ),
        body: Text('1111'),
      );
    }
  }
  ```

- 添加多个按钮

- ```dart
  class AppBarDemoPage extends StatelessWidget {
    const AppBarDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title:Text("AppBarDemoPage"), 
          // backgroundColor: Colors.red, 
          // centerTitle:true,
          leading: IconButton(
            icon: Icon(Icons.menu),
            onPressed: (){
              print('menu');
            },
          ), 
          actions: <Widget>[
            IconButton(
              icon: Icon(Icons.search),
              onPressed: (){
                print('search');
              },
            ),
            IconButton(
              icon: Icon(Icons.settings),
              onPressed: (){
                print('settings');
              },
            )
          ],
  
        ),
        body: Text('1111'),
      );
    }
  }
  ```



#### 1.7 AppBar - title 居中

- centerTitle:true,

- ```dart
  class AppBarDemoPage extends StatelessWidget {
    const AppBarDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title:Text("AppBarDemoPage"), 
          // backgroundColor: Colors.red, 
          // centerTitle:true,
          ...
        ),
        body: Text('1111'),
      );
    }
  }
  ```





### 二、TabBar 顶部 Tab 切换菜单



#### 2.1 属性

- ![image-20200505180236031](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200505180236031.png)



#### 2.2 根路由顶部 tab 切换 

- ````dart
  class AppBarDemoPage extends StatelessWidget {
    const AppBarDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return DefaultTabController(
        length:2 ,// 配置 tab 个数
        child: Scaffold(
            appBar: AppBar(
              title:Text("AppBarDemoPage"), 
              centerTitle:true,
              bottom: TabBar(
                tabs: <Widget>[
                  Tab(text: "热门"),
                  Tab(text: "推荐")
                ],
              ),
  
  
            ),
            body: TabBarView(
              children: <Widget>[
                ListView(
                  children: <Widget>[
                    ListTile(
                      title:Text("第一个tab")
                    ),
                    ListTile(
                      title:Text("第一个tab")
                    ),
                    ListTile(
                      title:Text("第一个tab")
                    )
                  ],
                ),
                 ListView(
                  children: <Widget>[
                    ListTile(
                      title:Text("第二个tab")
                    ),
                    ListTile(
                      title:Text("第二个tab")
                    ),
                    ListTile(
                      title:Text("第二个tab")
                    )
                  ],
                )
              ],
            ),
          ),
      );
    }
  }
  ````





#### 2.3 子路由

- 如果依然在 bottom 里加，会出现主页和和当前页面 tabbar 同时出现

- 解决方法：在 title 里设置

- ```dart
  class _CategoryPageState extends State<CategoryPage> {
    @override
    Widget build(BuildContext context) {
      return DefaultTabController(
        length: 4,
        child: Scaffold(
          appBar: AppBar(
  
            backgroundColor: Colors.black26,
            title: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Expanded(
                    child:TabBar(
                      indicatorColor:Colors.blue,
                      labelColor:Colors.blue,
                      unselectedLabelColor: Colors.white,
                      indicatorSize:TabBarIndicatorSize.label ,
                      
                      tabs: <Widget>[
                        Tab(text: "热销"),
                        Tab(text: "推荐"),
                        Tab(text: "推荐"),
                        Tab(text: "推荐")
                      ],
                 ) ,
                )
              ],
            ),
            
          ),
          body:TabBarView(
            children: <Widget>[
  
              ListView(
                  children: <Widget>[
                    ListTile(
                      title:Text("第一个tab")
                    ),
                    ListTile(
                      title:Text("第一个tab")
                    ),
                    ListTile(
                      title:Text("第一个tab")
                    )
                  ],
                ),
              ListView(
                  children: <Widget>[
                    ListTile(
                      title:Text("第二个tab")
                    ),
                    ListTile(
                      title:Text("第二个tab")
                    ),
                    ListTile(
                      title:Text("第二个tab")
                    )
                  ],
                ),
                ListView(
                  children: <Widget>[
                    ListTile(
                      title:Text("第3个tab")
                    ),
                    ListTile(
                      title:Text("第3个tab")
                    ),
                    ListTile(
                      title:Text("第一个tab")
                    )
                  ],
                ),
              ListView(
                  children: <Widget>[
                    ListTile(
                      title:Text("第4个tab")
                    ),
                    ListTile(
                      title:Text("第二个tab")
                    ),
                    ListTile(
                      title:Text("第二个tab")
                    )
                  ],
                )
            ],
          )
        ),
      );
    }
  }
  ```



#### 2.4 使 Tabs 可以滑动

- item 过多相互遮盖
- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e4e1fb7cadf41?w=438&h=596&f=png&s=51080)

- isScrollable:true, //如果多个按钮的话可以滑动

- ```dart
  class _CategoryPageState extends State<CategoryPage> {
    @override
    Widget build(BuildContext context) {
      return DefaultTabController(
        length: 8,
        child: Scaffold(
          appBar: AppBar(
  
            backgroundColor: Colors.black26,
            title: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Expanded(
                    child:TabBar(
                      isScrollable:true,  //如果多个按钮的话可以滑动
                      indicatorColor:Colors.yellow,
                      labelColor:Colors.yellow,
                      unselectedLabelColor: Colors.white,
                      indicatorSize:TabBarIndicatorSize.label ,
                      ...
                 ) ,
                )
              ],
            ),
            
          ),
          ...
      );
    }
  }
  ```

- 