## Text
- 官网文档：[https://api.flutter.dev/flutter/widgets/Container-class.html](https://api.flutter.dev/flutter/widgets/Container-class.html)


- 基础属性：
	
	- ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc26851ea453d?w=721&h=777&f=png&s=124688)
	
	- ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc275396e6779?w=723&h=131&f=png&s=18688)
	
- 代码：

  - ```dart
                  child: Text(
                    '各位同学大家好我是主讲老师大地，各位同学大家好我是主讲老师大地',
                    textAlign:TextAlign.left,
                    overflow:TextOverflow.ellipsis ,
                    // overflow:TextOverflow.fade ,
                    maxLines: 2,
                    textScaleFactor: 1.8,
                    style:TextStyle(
                      fontSize: 16.0,
                      color:Colors.red,
                      // color:Color.fromARGB(a, r, g, b)
                      fontWeight: FontWeight.w800,
                      fontStyle: FontStyle.italic,
                      decoration:TextDecoration.lineThrough,
                      decorationColor:Colors.white,
                      decorationStyle: TextDecorationStyle.dashed,
                      letterSpacing: 5.0
    
                    )
                  
                  ),
    ```

    

