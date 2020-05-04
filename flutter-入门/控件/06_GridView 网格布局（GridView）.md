## GrideView



### 一、属性

- ![](https://user-gold-cdn.xitu.io/2020/4/29/171c3c5d387d173c?w=826&h=495&f=png&s=103480)



### 二、GridView.count



#### 2.1 普通使用

- ```dart
  class LayoutDemo extends StatelessWidget {  
    @override
    Widget build(BuildContext context) {    
      return GridView.count(
  
          crossAxisCount: 2,  //一行的 Widget 数量
          children: <Widget>[
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本'),
            Text('这是一个文本')
          ],
      );
    }
  }
  ```



#### 2.2 将 item 封装成 Container

- Container 封装
- 添加边距

- ```dart
  class LayoutDemo extends StatelessWidget {  
  
  
    List<Widget> _getListData() {
        List<Widget> list = new List();
  
        for (var i = 0; i < 20; i++) {
          list.add(Container(
            alignment: Alignment.center,
            child: Text(
              '这是第$i条数据',
              style: TextStyle(color: Colors.white, fontSize: 20),
            ),
            color: Colors.blue,        
            // height: 400,  //设置高度没有反应，他是根据内部元素确定高度的
              // 但可以使用GridView.count 的 childAspectRatio 设定比例
              // 由于宽度不变，所以高度改变
          ));
        }
        return list;
    }
  
  
    @override
    Widget build(BuildContext context) {    
      return GridView.count(
          crossAxisSpacing:20.0 ,   //水平子 Widget 之间间距
          mainAxisSpacing: 20.0,    //垂直子 Widget 之间间距
          padding: EdgeInsets.all(10),
          crossAxisCount: 2,  //一行的 Widget 数量
          childAspectRatio:0.7,  //宽度和高度的比例
          children: this._getListData(),
      );
    }
  }
  ```



#### 读取外部文件数据

- ```dart
  class LayoutDemo extends StatelessWidget {  
  
  
    List<Widget> _getListData() {
        var tempList=listData.map((value){
            return Container(            
              child:Column(// Column 类似 LinearLayout
                  children: <Widget>[
                    Image.network(value['imageUrl']),
                    SizedBox(height: 12),
                    Text(
                      value['title'],
                      textAlign: TextAlign.center,
                      style: TextStyle(
                        fontSize: 20
                      ),
                    )
                  ],
  
              ),
              decoration: BoxDecoration(
  
                border: Border.all(
                  color:Color.fromRGBO(233, 233,233, 0.9),
                  width: 1
                )
              ),
                
              // height: 400,  //设置高度没有反应
            );
  
        });
        // ('xxx','xxx')
        return tempList.toList();
    }
  
  
    @override
    Widget build(BuildContext context) {    
      return GridView.count(
          crossAxisSpacing:10.0 ,   //水平子 Widget 之间间距
          mainAxisSpacing: 10.0,    //垂直子 Widget 之间间距
          padding: EdgeInsets.all(10),
          crossAxisCount: 2,  //一行的 Widget 数量
          // childAspectRatio:0.7,  //宽度和高度的比例
          children: this._getListData(),
      );
    }
  }
  ```

  



### 三、GridView.builder



#### 3.1 使用 GridView.builder

- ```dart
  class LayoutDemo extends StatelessWidget {  
  
  
    Widget _getListData (context,index) {
          return Container(            
              child:Column(
                  children: <Widget>[
                    Image.network(listData[index]['imageUrl']),
                    SizedBox(height: 12),
                    Text(
                      listData[index]['title'],
                      textAlign: TextAlign.center,
                      style: TextStyle(
                        fontSize: 20
                      ),
                    )
                  ],
  
              ),
              decoration: BoxDecoration(
                border: Border.all(
                  color:Color.fromRGBO(233, 233,233, 0.9),
                  width: 1
                )
              ),
                
              // height: 400,  //设置高度没有反应
            );
    }
  
  
    @override
    Widget build(BuildContext context) {    
      return GridView.builder(
          
          //注意
          gridDelegate:SliverGridDelegateWithFixedCrossAxisCount(
            crossAxisSpacing:10.0 ,   //水平子 Widget 之间间距
            mainAxisSpacing: 10.0,    //垂直子 Widget 之间间距          
            crossAxisCount: 2,  //一行的 Widget 数量
          ),
          itemCount: listData.length,
          itemBuilder:this._getListData,
      );
    }
  }
  ```

- 

