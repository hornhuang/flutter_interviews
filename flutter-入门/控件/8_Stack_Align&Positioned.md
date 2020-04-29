### Stack

- 类似 RelativeLayout 绝对布局
-  ![](https://user-gold-cdn.xitu.io/2020/4/29/171c4f570cbca03e?w=767&h=97&f=png&s=14698)


####  使用系统自带方位

- 使用

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Center(
        child: Stack(
          alignment: Alignment.topLeft,
          children: <Widget>[              
            Container(
              height: 400,
              width: 300,
              color: Colors.red,
            ),
            Text('我是一个文本',style: TextStyle(
              fontSize: 40,
              color: Colors.white
            ))           
          ],
        ),
      );
    }
  }
  ```



#### 使用自定义方位

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Center(
        child: Stack(
          alignment: Alignment(1,0.3),
          children: <Widget>[              
            Container(
              height: 400,
              width: 300,
              color: Colors.red,
            ),
            Text('我是一个文本',style: TextStyle(
              fontSize: 20,
              color: Colors.white
            ))           
          ],
        ),
      );
    }
  }
  ```

- 





### Stack + Align 实现各个布局精准定位（正规用法）



##### 属性：

- ![](https://user-gold-cdn.xitu.io/2020/4/29/171c5023326bb26c?w=774&h=106&f=png&s=14598)



##### 代码：

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Center(
        child:  Container(
              height: 400,
              width: 300,
              color: Colors.red,
              child: Stack(
                // alignment: Alignment.center,
                children: <Widget>[
                  Align(
                    alignment: Alignment(1,-0.2),
                    child: Icon(Icons.home,size: 40,color: Colors.white),
                  ),
                  Align(
                    alignment: Alignment.center,
                    child: Icon(Icons.search,size: 30,color: Colors.white),
                  ),
                  Align(
                    alignment: Alignment.bottomRight,
                    child: Icon(Icons.settings_applications,size: 30,color: Colors.white),
                  )
                ],
              ),
        ),
      );
    }
  }
  ```

- 



#### Stack + Positioned 实现各个布局精准定位（正规用法）



##### 属性：

- ![](https://user-gold-cdn.xitu.io/2020/4/29/171c502d4c8d50fa?w=778&h=187&f=png&s=28833)



##### 代码：

- ```dart
  class LayoutDemo extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Center(
        child:  Container(
              height: 400,
              width: 300,
              color: Colors.red,
              child: Stack(
                // alignment: Alignment.center,
                children: <Widget>[
                  Positioned(
                  //  left: 10,
                    child: Icon(Icons.home,size: 40,color: Colors.white),
                  ),
                  Positioned(
                   bottom: 0,
                   left: 100,
                    child: Icon(Icons.search,size: 30,color: Colors.white),
                  ),
                  Positioned(
                    right: 0,
                    child: Icon(Icons.settings_applications,size: 30,color: Colors.white),
                  )
                ],
              ),
        ),
      );
    }
  }
  ```

- 