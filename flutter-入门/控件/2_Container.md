## Container



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