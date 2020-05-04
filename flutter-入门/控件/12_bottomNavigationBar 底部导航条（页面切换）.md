## BottomNavigationBar

- 底部导航栏



#### 1.1  基本使用

- ```dart
  class MyApp extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      return MaterialApp(
        home: Scaffold(
          appBar: AppBar(
            title: Text("flutter Demo")
          ),
          body: Text("tabBar"),
          bottomNavigationBar: BottomNavigationBar(
            items: [
              BottomNavigationBarItem(
                icon: Icon(Icons.home),
                title: Text("首页")
              ),
              BottomNavigationBarItem(
                icon: Icon(Icons.category),
                title: Text("分类")
              ),
              BottomNavigationBarItem(
                icon: Icon(Icons.settings),
                title: Text("设置")
              )
            ]
          ),
        )
      );
    }
  }
  ```



#### 1.2 点击选中按钮
- 快捷键 statefulW 生成自定义组件

- 将 home 里的代码抽离出来

- 三个以上要单独设置 选中/未选中 的颜色

- ```dart
  class MyApp extends StatelessWidget {  
    @override
    Widget build(BuildContext context) {
      return MaterialApp(
        home:Tabs()
      );
    }
  }
  
  
  class Tabs extends StatefulWidget {
    Tabs({Key key}) : super(key: key);
  
    _TabsState createState() => _TabsState();
  }
  
  class _TabsState extends State<Tabs> {
  
    int _currentIndex=0;
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          appBar: AppBar(
            title: Text("Flutter Demo"),
          ),
          body: Text("tabBar"),
          bottomNavigationBar: BottomNavigationBar(
  
            currentIndex: this._currentIndex,
            onTap: (int index){
                setState(() {
                    this._currentIndex=index;
                });
            },
            items: [
              BottomNavigationBarItem(
                icon: Icon(Icons.home),
                title: Text("首页")
              ),
               BottomNavigationBarItem(
                icon: Icon(Icons.category),
                title: Text("分类")
              ),
              
               BottomNavigationBarItem(
                icon: Icon(Icons.settings),
                title: Text("设置")
              )
            ],
          ),
        );
    }
  }
  ```



#### 1.3 点击切换

- 新建目录把代码抽离出去





##### 1.3.1 抽离 Tabs

- ```dart
  void main() => runApp(MyApp());
  class MyApp extends StatelessWidget {  
    @override
    Widget build(BuildContext context) {
      return MaterialApp(
        home:Tabs()
      );
    }
  }
  ```

- ![](https://user-gold-cdn.xitu.io/2020/5/4/171ddee2963baa1c?w=1140&h=732&f=png&s=613586)



##### 1.3.2 三个 items 的界面设置



###### 1.3.2.1 首页 home

- ```dart
  import '../Search.dart';
  
  class HomePage extends StatefulWidget {
    HomePage({Key key}) : super(key: key);
  
    _HomePageState createState() => _HomePageState();
  }
  
  class _HomePageState extends State<HomePage> {
    @override
    Widget build(BuildContext context) {
      return Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisAlignment: MainAxisAlignment.center,
        children: <Widget>[
          RaisedButton(
              child: Text("跳转到搜索页面"),
              onPressed: () {
                //路由跳转
                Navigator.of(context).push(
                  MaterialPageRoute(
                    builder: (context)=>SearchPage()
                  )
                );
  
              },
              color: Theme.of(context).accentColor,
              textTheme: ButtonTextTheme.primary
          ),
          SizedBox(height: 20),        
  
        ],
      );
    }
  }
  
  ```

- 



###### 1.3.2.2 分类 Category

- ```dart
  import 'package:flutter/material.dart';
  
  import '../Form.dart';
  
  class CategoryPage extends StatefulWidget {
    CategoryPage({Key key}) : super(key: key);
  
    _CategoryPageState createState() => _CategoryPageState();
  }
  
  class _CategoryPageState extends State<CategoryPage> {
    @override
    Widget build(BuildContext context) {
      return Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisAlignment: MainAxisAlignment.center,
        children: <Widget>[
          RaisedButton(
            child: Text("跳转到表单页面"),
            onPressed: (){
  
              Navigator.of(context).push(
                  MaterialPageRoute(
                    builder: (context)=>FormPage(title:'我是跳转传值')
                  )
              );
            },
          )
        ],
      );
    }
  }
  ```

- 



###### 1.3.2.3 设置 setting

- ```dart
    SettingPage({Key key}) : super(key: key);
  
    _SettingPageState createState() => _SettingPageState();
  }
  
  class _SettingPageState extends State<SettingPage> {
    @override
    Widget build(BuildContext context) {
      return ListView(
        children: <Widget>[
          ListTile(
            title: Text("我是一个文本"),
          ),
           ListTile(
            title: Text("我是一个文本"),
          ),
           ListTile(
            title: Text("我是一个文本"),
          ),
           ListTile(
            title: Text("我是一个文本"),
          )
        ],
      );
    }
  }
  ```

- 



##### 1.3.3  Tabs 实现点击替换功能

- ```dart
  import 'package:flutter/material.dart';
  import 'tabs/Home.dart';
  import 'tabs/Category.dart';
  import 'tabs/Setting.dart';
  
  class Tabs extends StatefulWidget {
    Tabs({Key key}) : super(key: key);
  
    _TabsState createState() => _TabsState();
  }
  
  class _TabsState extends State<Tabs> {
  
    int _currentIndex=0;
    List _pageList=[
      HomePage(),
      CategoryPage(),
      SettingPage(),
    ];
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          appBar: AppBar(
            title: Text("Flutter Demo"),
          ),
          body: this._pageList[this._currentIndex],
          bottomNavigationBar: BottomNavigationBar(
            currentIndex: this._currentIndex,   //配置对应的索引值选中
            onTap: (int index){
                setState(() {  //改变状态
                    this._currentIndex=index;
                });
            },
            iconSize:36.0,      //icon的大小
            fixedColor:Colors.red,  //选中的颜色  
            type:BottomNavigationBarType.fixed,   //配置底部tabs可以有多个按钮
            items: [
              BottomNavigationBarItem(
                icon: Icon(Icons.home),
                title: Text("首页")
              ),
               BottomNavigationBarItem(
                icon: Icon(Icons.category),
                title: Text("分类")
              ),
              
               BottomNavigationBarItem(
                icon: Icon(Icons.settings),
                title: Text("设置")
              )
            ],
          ),
        );
    }
  }
  ```

- 





#### 1.4 三个以上 Tab 的问题

- 四个以上是挤压问题
- ![](https://user-gold-cdn.xitu.io/2020/5/4/171ddfd0a5e11a05?w=1064&h=740&f=png&s=490684)



#### 1.4.1 设置 type 解决挤压

- ```dart
  class Tabs extends StatefulWidget {
    Tabs({Key key}) : super(key: key);
  
    _TabsState createState() => _TabsState();
  }
  
  class _TabsState extends State<Tabs> {
  
    int _currentIndex=0;
    List _pageList=[
      HomePage(),
      CategoryPage(),
      SettingPage(),
    ];
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          bottomNavigationBar: BottomNavigationBar(
            ...
            type:BottomNavigationBarType.fixed,   //配置底部tabs可以有多个按钮
            ...
          ),
        );
    }
  }
  ```

- 