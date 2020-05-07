##  Button 按钮

- 常见按钮组件

- **RaisedButton** ：凸起的按钮，其实就是 Material Design 风格的 Button 
- **FlatButton** ：扁平化的按钮 
- **OutlineButton**：线框按钮 
- **IconButton** ：图标按钮 
- **ButtonBar**:按钮组 
- **FloatingActionButton:**浮动按钮



#### 共有属性

- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e557b68ef3c2b?w=489&h=101&f=png&s=20045)
- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e559cbc5f76b3?w=489&h=366&f=png&s=49250)



#### 设置按钮宽高

- 外层包一个 Container ，这个 Container 宽高就是按钮宽高
- 即自适应，屏幕多大，他多大

- ```dart
  class ButtonDemoPage extends StatelessWidget {
    const ButtonDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              ...
              SizedBox(height: 10),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Container(
                    height: 50,
                    width: 400,
                    child: RaisedButton(
                      child: Text('宽度高度'),
                      color: Colors.blue,
                      textColor: Colors.white,
                      elevation: 20,
                      onPressed: () {
                        print("宽度高度");
                      },
                    ),
                  )
                ],
              ),
              ...
            ],
          ));
    }
  }
  ```



#### 自适应宽高按钮

- 在 Expanded 布局中嵌套 Button

- ```dart
  class ButtonDemoPage extends StatelessWidget {
    const ButtonDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              ...
              SizedBox(height: 10),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Expanded(
                    child: Container(
                      height: 60,
                      margin: EdgeInsets.all(10),
                      child: RaisedButton(
                        child: Text('自适应按钮'),
                        color: Colors.blue,
                        textColor: Colors.white,
                        elevation: 20,
                        onPressed: () {
                          print("自适应按钮");
                        },
                      ),
                    ),
                  )
                ],
              ),
              ...
            ],
          ));
    }
  }
  ```

- 




### 一、RaisedButton 普通按钮

#### 1.1 普通使用

- ```dart
  class ButtonDemoPage extends StatelessWidget {
    const ButtonDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  RaisedButton(
                    child: Text('普通按钮'),
                    onPressed: () {
                      print("普通按钮");
                    },
                  ),
                  ...
                ],
              ),
              ...
            ],
          ));
    }
  }
  ```

#### 1.2 颜色按钮

- ```dart
                  RaisedButton(
                    child: Text('颜色按钮'),
                    color: Colors.blue,
                    textColor: Colors.white,
                    onPressed: () {
                      print("有颜色按钮");
                    },
                  ),
  ```

#### 1.3 阴影按钮

- ```dart
                  SizedBox(width: 5),
                  RaisedButton(
                    child: Text('阴影按钮'),
                    color: Colors.blue,
                    textColor: Colors.white,
                    elevation: 20,
                    onPressed: () {
                      print("有阴影按钮");
                    },
                  ),
  ```

#### 1.3 图标按钮

- ```dart
                  RaisedButton.icon(
                      icon: Icon(Icons.search),
                      label: Text('图标按钮'),
                      color: Colors.blue,
                      textColor: Colors.white,
                      // onPressed: null,// 设为空时可以无法点击
                      onPressed: () {
                        print("图标按钮");
                      })
  ```

- 





### 二、圆角按钮

- shape 属性




#### 2.1 圆角按钮

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              ...
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  RaisedButton(
                      child: Text('圆角按钮'),
                      color: Colors.blue,
                      textColor: Colors.white,
                      elevation: 20,
                      shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.circular(10)),
                      onPressed: () {
                        print("圆角按钮");
                      }),
                  ...
            ],
          ));
    }
  }
  ```

- 



#### 2.2 圆形按钮

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              ...
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  ...
                  Container(
                    height: 80,
                    child: RaisedButton(
                        child: Text('圆形按钮'),
                        color: Colors.blue,
                        textColor: Colors.white,
                        elevation: 20,
                        splashColor: Colors.red,
                        shape:
                            CircleBorder(side: BorderSide(color: Colors.white)),
                        onPressed: () {
                          print("圆形按钮");
                        }),
                  ),
                  ...
            ],
          ));
    }
  }
  ```

- 



#### 2.3 修改点击时的水波纹

- 长按出现
- splashColor: Colors.red,
-   ![](https://user-gold-cdn.xitu.io/2020/5/5/171e5677c20316a8?w=1183&h=534&f=png&s=388869)





### 三、FlatButton 扁平化的按钮 



#### 3.1 使用

- ```dart
  class ButtonDemoPage extends StatelessWidget {
    const ButtonDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              ...
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  ...
                  FlatButton(
                    child: Text("按钮"),
                    color: Colors.blue,
                    textColor: Colors.yellow,
                    onPressed: () {
                      print('FlatButton');
                    },
                  ),
                  ...
            ],
          ));
    }
  }
  ```



#### 3.2 效果

- 和普通按钮基本一样

- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e56b313c4d1c6?w=1086&h=393&f=png&s=261599)



### 四、OutlineButton 线框按钮 



#### 4.1 使用

- 带边框按钮

- ```dart
    @override
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              ...
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  ...
                  SizedBox(width: 10),
                  OutlineButton(
                      child: Text("按钮"),
                      //  color: Colors.red,  //没有效果
                      //  textColor: Colors.yellow,
                      onPressed: () {
                        print('FlatButton');
                      })
                ],
              ),
              SizedBox(height: 10),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Expanded(
                    child: Container(
                      margin: EdgeInsets.all(20),
                      height: 50,
                      child: OutlineButton(child: Text("注册"), onPressed: () {}),
                    ),
                  )
                ],
              ),
              ...
            ],
          ));
    }
  }  Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              ...
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  ...
                  SizedBox(width: 10),
                  OutlineButton(
                      child: Text("按钮"),
                      //  color: Colors.red,  //没有效果
                      //  textColor: Colors.yellow,
                      onPressed: () {
                        print('FlatButton');
                      })
                ],
              ),
              ...
            ],
          ));
    }
  }
  ```



#### 4.2 效果

- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e584b8be37d40?w=1158&h=392&f=png&s=337160)



### 五、IconButton 图标按钮 

- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e588180bad711?w=582&h=477&f=png&s=121802)



### 六、ButtonBar 按钮组 



#### 6.1 使用

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              ...
              Row(
                mainAxisAlignment: MainAxisAlignment.end,// 显示位置
                children: <Widget>[
                  ButtonBar(
                    children: <Widget>[
  
                      RaisedButton(
                        child: Text('登录'),
                        color: Colors.blue,
                        textColor: Colors.white,
                        elevation: 20,
                        onPressed: () {
                          print("宽度高度");
                        },
                      ),
                      RaisedButton(
                        child: Text('注册'),
                        color: Colors.blue,
                        textColor: Colors.white,
                        elevation: 20,
                        onPressed: () {
                          print("宽度高度");
                        },
                      ),
                      MyButton(text: "自定义按钮",height: 60.0,width: 100.0,pressed: (){
                        print('自定义按钮');
                      })
                      
                    ],
                  )
                ],
              )
            ],
          ));
    }
  }
  ```



#### 6.2 效果

- ![](https://user-gold-cdn.xitu.io/2020/5/5/171e58e2f86b844e?w=1083&h=555&f=png&s=418794)



### 七、FloatingActionButton 浮动按钮

- 下一篇详细讲





### 八、自定义按钮

- 代码

- ```dart
  //自定义按钮组件
  
  class MyButton extends StatelessWidget {
    final text;
    final pressed;
    final width;
    final height;
    const MyButton({this.text='',this.pressed=null,this.width=80,this.height=30}) ;
  
    @override
    Widget build(BuildContext context) {
      return Container(
        height: this.height,
        width: this.width,
        child: RaisedButton(
          child: Text(this.text),
          onPressed:this.pressed ,
        ),
      );
    }
  }
  ```

- 使用

- ```dart
                      MyButton(text: "自定义按钮",height: 60.0,width: 100.0,pressed: (){
                        print('自定义按钮');
                      })
  ```

- 效果
- ![](https://user-gold-cdn.xitu.io/2020/5/6/171e59116913d59e?w=544&h=189&f=png&s=40141)