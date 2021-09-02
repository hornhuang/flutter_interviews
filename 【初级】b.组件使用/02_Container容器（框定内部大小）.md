## Container
- 官方文档：[https://docs.flutter.io/flutter/painting/TextStyle-class.html](https://docs.flutter.io/flutter/painting/TextStyle-class.html)
- 基本属性
  - ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc231900916c6?w=861&h=365&f=png&s=81739)
- TextSyle 参数：
  - ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc23f2f1a1344?w=852&h=314&f=png&s=70065)
  - ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc2442e90e0ad?w=851&h=212&f=png&s=44858)
- 代码 
  - ```dart
  class HomeContent extends StatelessWidget{
    @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return Center(
            child: Container(
                child: Text( '各位同学大家好我是主讲老师大地，各位同学大家好我是主讲老师大地',),
                height: 300.0,
                width: 300.0,
                decoration: BoxDecoration(
                  color: Colors.yellow,
                  border: Border.all(
                    color: Colors.blue,
                    width: 2.0
                  ),
                  borderRadius: BorderRadius.all(
                  //  Radius.circular(150),    //圆形
                    Radius.circular(10),  
                  )
                ),
                // padding:EdgeInsets.all(20),
  
                // padding:EdgeInsets.fromLTRB(10, 30, 5, 0)
  
                margin: EdgeInsets.fromLTRB(10, 30, 5, 0),
  
                // transform:Matrix4.translationValues(100,0,0)
  
                // transform:Matrix4.rotationZ(0.3)
  
                // transform:Matrix4.diagonal3Values(1.2, 1, 1)
  
                alignment: Alignment.bottomLeft,
              
  
  
            ),
      );
    }
    
  }
  ```

- 