## Text



- 

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