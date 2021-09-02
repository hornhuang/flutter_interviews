## 路由替换/返回根路由

- 

####  1.1 返回上一级目录

- Navigator.pop();





#### 1.2 路由替换

- 用户进行一系列原子操作后，回到起始界面
- 每次跳转，不是跳转到新路由，而是替换当前路由

- ```dart
  class RegisterFirstPage extends StatelessWidget {
    const RegisterFirstPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text("第一步-输入手机号")
        ),
        body:Column(
          children: <Widget>[
            SizedBox(height: 40),
            Text("这是注册的第一步,请输入您的手机号 然后点击下一步"),
            SizedBox(height: 40),
            RaisedButton(
              child: Text('下一步'),
              onPressed: (){
                  //替换路由
                  Navigator.of(context).pushReplacementNamed('/registerSecond');
              },
            )
          ],
        )
      );
    }
  }
  ```

- 





#### 1.3 返回根路由

- 有三种思路



##### 1.3.1 用替换路由返回

- 首先过程中每个路由使用：

  - ```
    Navigator.of(context).pushReplacementNamed('/registerSecond');
    ```

- 这样就保证了始终只有一个路由

- 最后一个操作完成后，使用 pop 退出当前这个唯一的路由即可 

  - ```
    Navigator.of(context).pop();
    ```





##### 1.3.2 普通使用

- 使用普通方法，直接跳转
- 然后一直按返回，直到返回到了根目录





##### 1.3.3 pushAndRemoveUntil 跳转到根目录

- 跳转到指定界面，并把两者之间路由置空

- ```dart
  //引入tabs
  
  import '../Tabs.dart';
  
  class RegisterThirdPage extends StatelessWidget {
    const RegisterThirdPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text("第三步-完成注册")
        ),body:Column(
          children: <Widget>[
            SizedBox(height: 40),
            Text("输入密码完成注册"),
            SizedBox(height: 40),
            RaisedButton(
              child: Text('确定'),
              onPressed: (){
                
                  //返回根
                  Navigator.of(context).pushAndRemoveUntil(
                    new MaterialPageRoute(builder: (context) => new Tabs()),                  
                     (route) => route == null
                  );
              },
            )
          ],
        )
      );
    }
  }
  ```

- 





##### 1.3.4 pushAndRemoveUntil 跳转到指定路由

- 重写 Tabs 构造方法

- 接收目的路由的 index

- ```dart
  class Tabs extends StatefulWidget {
    final index;
    Tabs({Key key,this.index=0}) : super(key: key);
  
    _TabsState createState() => _TabsState(this.index);
  }
  
  class _TabsState extends State<Tabs> {
  
    int _currentIndex;
    _TabsState(index){
      this._currentIndex=index;
    }
  
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
            ...
            ],
          ),
        );
    }
  }
  ```

- 传入目的界面的 index 进行跳转

- ```dart
  class RegisterThirdPage extends StatelessWidget {
    const RegisterThirdPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text("第三步-完成注册")
        ),body:Column(
          children: <Widget>[
            SizedBox(height: 40),
            Text("输入密码完成注册"),
            SizedBox(height: 40),
            RaisedButton(
              child: Text('确定'),
              onPressed: (){
                
                  //返回根
                  Navigator.of(context).pushAndRemoveUntil(
                    new MaterialPageRoute(builder: (context) => new Tabs(index:2)),                  
                     (route) => route == null
                  );
              },
            )
          ],
        )
      );
    }
  }
  ```

- 