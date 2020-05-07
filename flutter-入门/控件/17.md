## Drawer 侧边栏

- 侧边栏、以及侧边栏内容布局



### 一、侧边栏

#### 1.1 找到侧边栏 Scaffold 组件

- 由于 Tabs 内容在 body 里，所以 Scaffold 在 Tabs 中

- ```dart
  class _TabsState extends State<Tabs> {
  
    ...
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          appBar: AppBar(
            title: Text("Flutter App"),
          ),
          body: this._pageList[this._currentIndex],
          bottomNavigationBar: BottomNavigationBar(
            ...
          ),
          ...
        );
    }
  }
  ```





#### 1.2 定义抽屉，左侧/右侧 侧边栏

- 在 BottomNavigationBar 下边定义抽屉

- ```dart
  class _TabsState extends State<Tabs> {
  
    ...
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          appBar: AppBar(
            title: Text("Flutter App"),
          ),
          body: this._pageList[this._currentIndex],
          bottomNavigationBar: BottomNavigationBar(
            ...
          ),
  
          drawer: Drawer(
            ...
          ),
          endDrawer: Drawer(
            child: Text('右侧侧边栏'),
          ),
        );
    }
  }
  ```

- 添加右侧侧边栏

- ```dart
          endDrawer: Drawer(
            child: Text('右侧侧边栏'),
          ),
  ```

- 



#### 1.3 左侧侧边栏内容

- 列表形式展现

- ```dart
  class _TabsState extends State<Tabs> {
  
    ...
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          appBar: AppBar(
            title: Text("Flutter App"),
          ),
          body: this._pageList[this._currentIndex],
          bottomNavigationBar: BottomNavigationBar(
            ...
          ),
  
          drawer: Drawer(
            child: Column(
              children: <Widget>[
  
                ...
                ListTile(
                  leading: CircleAvatar(
                    child: Icon(Icons.home)
                  ),
                  title: Text("我的空间"),
                ),
                  Divider(),// 列表间划线
                 ListTile(
                  leading: CircleAvatar(
                    child: Icon(Icons.people)
                  ),
                  title: Text("用户中心"),
                ),
                Divider(),
                ListTile(
                  leading: CircleAvatar(
                    child: Icon(Icons.settings)
                  ),
                  title: Text("设置中心"),
                ),
                  Divider(),
              ],
            ),
  
  
          ),
          endDrawer: Drawer(
            child: Text('右侧侧边栏'),
          ),
        );
    }
  }
  ```

- 



#### 1.4 给侧边栏添加头部布局

- 属性：
- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e52706d724102?w=647&h=132&f=png&s=15902)

- 使用 Row 使其铺满整个屏幕

- ```dart
  class _TabsState extends State<Tabs> {
  
    ...
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          appBar: AppBar(
            title: Text("Flutter App"),
          ),
          body: this._pageList[this._currentIndex],
          bottomNavigationBar: BottomNavigationBar(
            ...
          ),
  
          drawer: Drawer(
            child: Column(
              children: <Widget>[
  
                Row(
                  children: <Widget>[
                    Expanded(
                      child: DrawerHeader(
                        child: Text("你好flutter"),
                        decoration:BoxDecoration(
                          color: Colors.yellow,
                          image: DecorationImage(
                            image: NetworkImage("https://www.itying.com/images/flutter/2.png"),
                            fit:BoxFit.cover,
                          )
                          
                        )
                      )
                    )
                  ],
                ),
                ListTile(
                  ...
                ),
              ],
            ),
  
          ),
          endDrawer: Drawer(
            child: Text('右侧侧边栏'),
          ),
        );
    }
  }
  ```





#### 1.5 UserAccountsDrawerHeader 高级侧边栏头部

- 自带很多常用主题、属性
- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e52cb202dc150?w=644&h=180&f=png&s=26133)

- ```dart
  class _TabsState extends State<Tabs> {
  
  ...
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          drawer: Drawer(
            child: Column(
              children: <Widget>[
  
                Row(
                  children: <Widget>[
                    Expanded(
                      child: UserAccountsDrawerHeader(
                        accountName:Text("大地老师"),
                        accountEmail: Text("dadi@itying.com"),
                        currentAccountPicture: CircleAvatar(
                          backgroundImage: NetworkImage("https://www.itying.com/images/flutter/3.png"),                        
                        ),
                        decoration:BoxDecoration(                        
                          image: DecorationImage(
                            image: NetworkImage("https://www.itying.com/images/flutter/2.png"),
                            fit:BoxFit.cover,
                          )
                          
                        ),
                       otherAccountsPictures: <Widget>[
                         Image.network("https://www.itying.com/images/flutter/4.png"),
                         Image.network("https://www.itying.com/images/flutter/5.png"),
                       ],
                      )
                    )
                  ],
                ),
                ListTile(
                  ...
                ),
              ],
            ),
  
  
          ),
          endDrawer: Drawer(
            child: Text('右侧侧边栏'),
          ),
        );
    }
  }
  ```

- 效果

- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e5337560f0140?w=296&h=519&f=png&s=105954)







### 二、点击侧边栏跳转







#### 2.1 新建 User.dart 文件

- 一个简单的页面，作为跳转的目的地

- ```dart
  import 'package:flutter/material.dart';
  
  class UserPage extends StatelessWidget {
    const UserPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text("用户中心"),
        ),
      );
    }
  }
  ```

- 





#### 2.2 跳转功能

- ```dart
  class _TabsState extends State<Tabs> {
    ...
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          drawer: Drawer(
            child: Column(
              children: <Widget>[
                ...
                  Divider(),
                 ListTile(
                  leading: CircleAvatar(
                    child: Icon(Icons.people)
                  ),
                  title: Text("用户中心"),
                  onTap: (){
                    Navigator.of(context).pop();  //隐藏侧边栏
                    Navigator.pushNamed(context, '/user');
                  },
                ),
                ...
              ],
            ),
  
  
          ),
          endDrawer: Drawer(
            child: Text('右侧侧边栏'),
          ),
        );
    }
  }
  ```

- 