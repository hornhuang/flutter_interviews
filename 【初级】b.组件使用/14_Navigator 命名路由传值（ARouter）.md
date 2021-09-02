## Navigator 命名路由



### 一、命名路由



#### 1.1 定义命名路由

- 现在根组件中进行全局的配置

- 也就是在 MaterialApp 中定义

- ```dart
  import 'pages/Tabs.dart';
  import 'pages/Form.dart';
  import 'pages/Search.dart';
  
  void main() => runApp(MyApp());
  class MyApp extends StatelessWidget {  
    @override
    Widget build(BuildContext context) {
      return MaterialApp(
        home:Tabs(),
        routes: {
          '/form':(context)=>FormPage(),// 全局配置
          '/search':(context)=>SearchPage(),// 全局配置
        }
      );
    }
  }
  ```



#### 1.2 使用

- 直接使用

- ```dart
  class _HomePageState extends State<HomePage> {
    @override
    Widget build(BuildContext context) {
      return Column(
        crossAxisAlignment: CrossAxisAlignment.center,
        mainAxisAlignment: MainAxisAlignment.center,
        children: <Widget>[
          RaisedButton(
              child: Text("跳转到搜索页面"),
              onPressed: () {
                //路由跳转
                Navigator.pushNamed(context, '/search');// context + key
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





### 二、命名路由传值



#### 2.1 根组件配置

- 配置代码固定不下复制即可

- ```dart
  import 'routes/Routes.dart';
  
  void main() => runApp(MyApp());
  class MyApp extends StatelessWidget {  
    
    @override
    Widget build(BuildContext context) {
      return MaterialApp(
        // home:Tabs(),   
        initialRoute: '/',     //初始化的时候加载的路由
        onGenerateRoute: onGenerateRoute
       
      );
    }
  }
  ```

- 

 

#### 2.2 把  剥离出来，成为单独类

- 使用 arguments 传值

- ```dart
  import 'package:flutter/material.dart';
  
  import '../pages/Tabs.dart';
  import '../pages/Form.dart';
  import '../pages/Search.dart';
  import '../pages/Product.dart';
  import '../pages/ProductInfo.dart';
  
  //配置路由
  final routes={
        '/':(context)=>Tabs(),
        '/form':(context)=>FormPage(),
        '/product':(context)=>ProductPage(),
      // 需要配置所传参数 arguments 为可选参数
        '/productinfo':(context,{arguments})=>ProductInfoPage(arguments:arguments),
        '/search':(context,{arguments})=>SearchPage(arguments:arguments),
  };
  
  //固定写法
  var onGenerateRoute=(RouteSettings settings) {
        // 统一处理
        final String name = settings.name; 
        final Function pageContentBuilder = routes[name];
        if (pageContentBuilder != null) {
          if (settings.arguments != null) {
            final Route route = MaterialPageRoute(
                builder: (context) =>
                    pageContentBuilder(context, arguments: settings.arguments));
            return route;
          }else{
              final Route route = MaterialPageRoute(
                builder: (context) =>
                    pageContentBuilder(context));
              return route;
          }
        }
  };
  ```

- 



#### 2.4 发送数据

- ```dart
  class ProductPage extends StatefulWidget {
    ProductPage({Key key}) : super(key: key);
  
    _ProductPageState createState() => _ProductPageState();
  }
  
  class _ProductPageState extends State<ProductPage> {
    @override
    Widget build(BuildContext context) {
      return Scaffold(
  
        appBar: AppBar(
          title: Text('商品页面'),
        ),
         body:Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
          
            RaisedButton(
                child: Text("跳转到商品详情"),
                onPressed: () {
                  Navigator.pushNamed(context, '/productinfo',arguments: {
                    "pid":456
                  });
                }
            ),      
  
          ],
         )
      );
    }
  }
  ```

- 



#### 2.4 StatelessWidget 组件接收参数

- 构造方法接收参数

- ```dart
  class SearchPage extends StatelessWidget {
    
    final arguments;
  
    SearchPage({this.arguments});
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar:AppBar(
          title: Text("搜索页面"),
        ) ,
        body: Text("搜索页面内容区域${arguments != null ? arguments['id'] : '0'}"),
      );
    }
  }
  ```

- 





#### 2.5 StatefulWidget 组件接收参数

- ```dart
  class ProductInfoPage extends StatefulWidget {
    final Map arguments;
    ProductInfoPage({Key key,this.arguments}) : super(key: key);
  
    _ProductInfoPageState createState() => _ProductInfoPageState(arguments:this.arguments);
  }
  
  class _ProductInfoPageState extends State<ProductInfoPage> {
    Map arguments;
    _ProductInfoPageState({this.arguments});
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text('商品详情'),
        ),
        body: Container(
          child: Text("pid=${arguments["pid"]}"),
        ),
      );
    }
  }
  ```

- 