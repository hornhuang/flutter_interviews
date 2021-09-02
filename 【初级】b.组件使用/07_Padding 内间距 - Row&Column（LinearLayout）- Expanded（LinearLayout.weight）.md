### 一、Padding



#### 1.1 属性

- ![](https://user-gold-cdn.xitu.io/2020/4/29/171c4c7031d7f67f?w=1139&h=143&f=png&s=22595)



#### 1.2 代码

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      return Padding(
        padding: EdgeInsets.fromLTRB(0, 0, 10, 0),
        child: GridView.count(
          crossAxisCount: 2,
          childAspectRatio: 1.7,
          children: <Widget>[
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/1.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/2.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/3.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/4.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/5.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/6.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/1.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/2.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/3.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/4.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/5.png',
                  fit: BoxFit.cover),
            ),
            Padding(
              padding: EdgeInsets.fromLTRB(10, 10, 0, 0),
              child: Image.network('https://www.itying.com/images/flutter/6.png',
                  fit: BoxFit.cover),
            )
          ],
      ));
    }
  }
  ```





### 二、自定义（按钮）组件



#### 2.1 范例

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      return IconContainer(Icons.search,color: Colors.black);
    }
  }
  
  
  class IconContainer extends StatelessWidget{
    double size=32.0;
    Color color=Colors.red;
    IconData icon;
    IconContainer(this.icon,{this.color,this.size});
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Container(
        height: 100.0,
        width: 100.0,
        color: this.color,
        child: Center(
          child: Icon(this.icon,size: this.size,color: Colors.white)
        ),
      );
    }
  }
  ```





### 三、Row 水平布局组件

- 把组件放在一行



#### 3.1 属性

- ![](https://user-gold-cdn.xitu.io/2020/4/29/171c4d0a9f28dae6?w=1137&h=186&f=png&s=36976)



#### 3.2 代码

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      return Container(
        height: 800.0,
        width: 400.0,
        color: Colors.pink,
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,    
          crossAxisAlignment: CrossAxisAlignment.start,     //用的比较少
          children: <Widget>[
            IconContainer(Icons.search,color: Colors.blue),
            IconContainer(Icons.home,color: Colors.orange),
            IconContainer(Icons.select_all,color: Colors.red),
          ],
        ),
      );
    }
  }
  
  
  class IconContainer extends StatelessWidget{
    double size=32.0;
    Color color=Colors.red;
    IconData icon;
    IconContainer(this.icon,{this.color,this.size});
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Container(
        height: 100.0,
        width: 100.0,
        color: this.color,
        child: Center(
          child: Icon(this.icon,size: this.size,color: Colors.white)
        ),
      );
    }
  }
  ```





### 四、Column 竖直布局



#### 4.1 属性

- ![](https://user-gold-cdn.xitu.io/2020/4/29/171c4d3ee7720c29?w=1139&h=183&f=png&s=36938)





#### 4.2 代码

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      return Container(
        height: 800.0,
        width: 400.0,
        color: Colors.pink,
        child: Column(    
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          crossAxisAlignment: CrossAxisAlignment.end,   
          children: <Widget>[
            IconContainer(Icons.search,color: Colors.blue),
            IconContainer(Icons.home,color: Colors.orange),
            IconContainer(Icons.select_all,color: Colors.red),
          ],
        ),
      );
    }
  }
  
  
  class IconContainer extends StatelessWidget{
    double size=32.0;
    Color color=Colors.red;
    IconData icon;
    IconContainer(this.icon,{this.color,this.size});
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Container(
        height: 100.0,
        width: 100.0,
        color: this.color,
        child: Center(
          child: Icon(this.icon,size: this.size,color: Colors.white)
        ),
      );
    }
  }
  ```





### 五、Expanded 布局比例 （类似 LinearLayout 的 weight 属性）

- 类似 Android LinearLayout 的 weight 属性



#### 5.1 属性

- ![](https://user-gold-cdn.xitu.io/2020/4/29/171c4d7dfe79129b?w=1150&h=150&f=png&s=25182)



#### 5.2 代码

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      return Row(    
       
          children: <Widget>[
            Expanded(
              flex: 1,
              child: IconContainer(Icons.search,color: Colors.blue)
            ),
             Expanded(
              flex: 2,
              child: IconContainer(Icons.home,color: Colors.orange),  
            ),
             Expanded(
              flex: 1,
              child: IconContainer(Icons.select_all,color: Colors.red),  
            ),
                 
          ],    
      );
    }
  }
  
  
  class IconContainer extends StatelessWidget{
    double size=32.0;
    Color color=Colors.red;
    IconData icon;
    IconContainer(this.icon,{this.color,this.size});
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Container(
        height: 100.0,
        width: 100.0,
        color: this.color,
        child: Center(
          child: Icon(this.icon,size: this.size,color: Colors.white)
        ),
      );
    }
  }
  ```





### 六、实战



#### 6.1 效果

- ![](https://user-gold-cdn.xitu.io/2020/4/29/171c4e02fb539fba?w=590&h=519&f=png&s=314984)



#### 6.2 代码

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      return Row(    
       
          children: <Widget>[
            Expanded(
              flex: 1,
              child: IconContainer(Icons.home,color: Colors.orange),  
            ),
            IconContainer(Icons.search,color: Colors.blue)
                 
          ],    
      );
    }
  }
  
  
  class IconContainer extends StatelessWidget{
    double size=32.0;
    Color color=Colors.red;
    IconData icon;
    IconContainer(this.icon,{this.color,this.size});
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Container(
        height: 100.0,
        width: 100.0,
        color: this.color,
        child: Center(
          child: Icon(this.icon,size: this.size,color: Colors.white)
        ),
      );
    }
  }
  ```

