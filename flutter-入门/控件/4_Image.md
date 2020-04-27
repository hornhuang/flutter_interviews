## Image

- 官网地址：[https://api.flutter.dev/flutter/widgets/Image-class.html](https://api.flutter.dev/flutter/widgets/Image-class.html)

- 实例代码：

  - ```dart
    class HomeContent extends StatelessWidget {
      @override
      Widget build(BuildContext context) {
        // TODO: implement build
        return Center(
          child: Container(
            child: Image.network(
              "http://www.ionic.wang/statics/index/images/ionic4.png",
    
              // alignment: Alignment.bottomRight,
    
              // color: Colors.blue,
              // colorBlendMode: BlendMode.screen,
    
              // fit:BoxFit.cover,
              // repeat:ImageRepeat.repeat
    
    
    
              
            ),
            width: 300,
            height: 800,
            decoration: BoxDecoration(
              color: Colors.yellow
            ),
    
          )
        );
      }
    }
    ```

- 属性：

  - ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc2feca92b61e?w=766&h=407&f=png&s=101658)
  - ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc304493ac3b6?w=763&h=457&f=png&s=97758)

