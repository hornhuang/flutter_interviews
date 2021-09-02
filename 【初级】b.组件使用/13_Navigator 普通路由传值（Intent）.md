## Navigator 路由

- 路由跳转/传值



#### 1.1 新建目的地界面 Search

- ```dart
  class SearchPage extends StatelessWidget {
    const SearchPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar:AppBar(
          title: Text("搜索页面"),
        ) ,
        body: Text("搜索页面内容区域"),
      );
    }
  }
  
  ```

- ![](https://user-gold-cdn.xitu.io/2020/5/4/171de02d978a0b32?w=1155&h=677&f=png&s=479104)





#### 1.2 在 15 navigationBar 的 Home 界面代码中设置跳转

- ```dart
  import 'package:flutter/material.dart';
  
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

- ![](https://user-gold-cdn.xitu.io/2020/5/4/171de051d9ed0dac?w=1389&h=688&f=png&s=605468)







#### 1.3  跳转页面并传值

- 构造方法传值




##### 1.3.1  开始界面，跳转时传值

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





##### 1.3.2 FormPage 表单界面，接收传值

- 新建传值表单页面目的

- ```dart
  import 'package:flutter/material.dart';
  
  class FormPage extends StatelessWidget {
  
    String title;
    FormPage({this.title="表单"});
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        floatingActionButton: FloatingActionButton(
          child: Text('返回'),
          onPressed: (){
            Navigator.of(context).pop();
          },
        ),
        appBar: AppBar(
          title: Text(this.title),
        ),
        body: ListView(
          children: <Widget>[
  
            ListTile(
              title: Text('我是表单页面'),
            ),
               ListTile(
              title: Text('我是表单页面'),
            ),
               ListTile(
              title: Text('我是表单页面'),
            ),
               ListTile(
              title: Text('我是表单页面'),
            )
          ],
        ),
      );
    }
  }
  ```





####  1.4 返回上级页面

- pop()

- ```dart
  class FormPage extends StatelessWidget {
  
    String title;
    FormPage({this.title="表单"});
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        floatingActionButton: FloatingActionButton(
          child: Text('返回'),
          onPressed: (){
            Navigator.of(context).pop();
          },
        ),
        ...
      );
    }
  }
  ```

- ![](https://user-gold-cdn.xitu.io/2020/5/4/171de10603d3a891?w=772&h=449&f=png&s=166061)