## Wrap

- 流式布局



#### 1.0 对比

- 普通线性布局 - 只能一行
- ![](https://user-gold-cdn.xitu.io/2020/5/4/171db455dbda1595?w=974&h=513&f=png&s=376348)
- wrap 流式布局 - 自动换行
- ![](https://user-gold-cdn.xitu.io/2020/5/4/171db46b9f777439?w=907&h=505&f=png&s=340078)



#### 1.1 参数

- ![](https://user-gold-cdn.xitu.io/2020/5/4/171db47ef52353c2?w=644&h=275&f=png&s=56065)



## 二、使用



#### 2.1  封装自定义 View （Button）

- ```dart
  class MyButton extends StatelessWidget{
    final String text;
    const MyButton(this.text,{Key key}) : super(key: key); 
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return RaisedButton(
        child: Text(this.text),
        textColor:Theme.of(context).accentColor,
        onPressed: (){        
        }
      );
    }
  }
  ```

- 



#### 2.2 元素之间的距离

- ```dart
  class LayoutDemo extends StatelessWidget {
   @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Wrap(
            spacing:10, //子控件水平之间的距离
            runSpacing: 10, //子控件竖直之间的距离
            // direction: Axis.vertical,
            // alignment:WrapAlignment.spaceEvenly,
            // runAlignment: WrapAlignment.center,
            children: <Widget>[
                  MyButton("第1集"),
                  MyButton("第2集"),
                  MyButton("第3集"),
                  MyButton("第4集"),
                  MyButton("第5集"),
                  MyButton("第6集"),
                  MyButton("第7集"),
                  MyButton("第8集"),
                  MyButton("第9集"),
                  MyButton("第10集"),
                  MyButton("第11集"),
                   MyButton("第3集"),
                  MyButton("第4集"),
                  MyButton("第5集"),
                  MyButton("第6集"),
                  MyButton("第7集"),
                  MyButton("第8集"),
                  MyButton("第9集"),
                  MyButton("第10集"),
                  MyButton("第11集"),
            ],
        
      );
    }
  }
  
  class MyButton extends StatelessWidget{
    final String text;
    const MyButton(this.text,{Key key}) : super(key: key); 
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return RaisedButton(
        child: Text(this.text),
        textColor:Theme.of(context).accentColor,
        onPressed: (){        
        }
      );
    }
  }
  ```





#### 2.3 竖直排列

- ```dart
  class LayoutDemo extends StatelessWidget {
   @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Container(
        height: 600,
        width: 400,
        color: Colors.pink,
        padding: EdgeInsets.all(10),
        child: Wrap(
            spacing:10,
            runSpacing: 10,
            direction: Axis.vertical,// 纵轴显示
            // alignment:WrapAlignment.spaceEvenly,
            // runAlignment: WrapAlignment.center,
            children: <Widget>[
                  MyButton("第1集"),
                  MyButton("第2集"),
                  MyButton("第3集"),
                  MyButton("第4集"),
                  MyButton("第5集"),
                  MyButton("第6集"),
                  MyButton("第7集"),
                  MyButton("第8集"),
                  MyButton("第9集"),
                  MyButton("第10集"),
                  MyButton("第11集"),
                  MyButton("第3集"),
                  MyButton("第4集"),
                  MyButton("第5集"),
                  MyButton("第6集"),
                  MyButton("第7集"),
                  MyButton("第8集"),
                  MyButton("第9集"),
                  MyButton("第10集"),
                  MyButton("第11集"),
            ],
          ),
      );
    }
  }
  
  class MyButton extends StatelessWidget{
    final String text;
    const MyButton(this.text,{Key key}) : super(key: key); 
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return RaisedButton(
        child: Text(this.text),
        textColor:Theme.of(context).accentColor,
        onPressed: (){        
        }
      );
    }
  }
  ```

- 