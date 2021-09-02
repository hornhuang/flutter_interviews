## 一、AspectRatio

- 设置宽高比



#### 1.1 使用

- 尽可能大的自适应屏幕

- ```dart
  class LayoutDemo extends StatelessWidget {
   @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return AspectRatio(
          aspectRatio: 3.0/1.0,
          child: Container(
            color: Colors.red,
          ),     
  
      );
    }
  }
  ```



## 二、Card 

- 卡片组件



#### 2.1 基本使用

- 阴影

- ```dart
  class LayoutDemo extends StatelessWidget {
   @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return ListView(
  
        children: <Widget>[
  
            Card(
              margin: EdgeInsets.all(10),
              child: Column(
                children: <Widget>[
                  
                  ListTile(
                    title:Text("张三",style: TextStyle(fontSize: 28)) ,
                    subtitle: Text("高级工程师"),
                  ),
                   ListTile(
                    title:Text("电话：xxxxx") ,                  
                  ),
                  ListTile(
                    title:Text("地址：xxxxxx") ,                  
                  )
                  
                ],
              ),
            ),Card(
              margin: EdgeInsets.all(10),
              child: Column(
                children: <Widget>[
                  
                  ListTile(
                    title:Text("李四",style: TextStyle(fontSize: 28)) ,
                    subtitle: Text("高级工程师"),
                  ),
                   ListTile(
                    title:Text("电话：xxxxx") ,                  
                  ),
                  ListTile(
                    title:Text("地址：xxxxxx") ,                  
                  )
                  
                ],
              ),
            ),
            Card(
              margin: EdgeInsets.all(10),
              child: Column(
                children: <Widget>[
                  
                  ListTile(
                    title:Text("王五",style: TextStyle(fontSize: 28)) ,
                    subtitle: Text("高级工程师"),
                  ),
                   ListTile(
                    title:Text("电话：xxxxx") ,                  
                  ),
                  ListTile(
                    title:Text("地址：xxxxxx") ,                  
                  )
                  
                ],
              ),
            )
        ],
      );
    }
  } 
  ```





#### 2.2 图文列表卡片

- ```dart
  class LayoutDemo extends StatelessWidget {
   @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return ListView(
        children: <Widget>[
  
          Card(
            margin: EdgeInsets.all(10), //设置边距
            child:Column(
                children: <Widget>[
                    AspectRatio(
                      aspectRatio: 20/9,
                      child: Image.network("https://www.itying.com/images/flutter/2.png",fit: BoxFit.cover,),
                    ),
                    ListTile(
                      leading: ClipOval(
                        child: Image.network("https://www.itying.com/images/flutter/2.png",fit: BoxFit.cover,height:60,width: 60),
                      ),
                      title: Text("xxxx"),
                      subtitle: Text("xxxxxxx"),
                      
                    )
  
                ],
            ),
  
          ),
           Card(
            margin: EdgeInsets.all(10),
            child:Column(
                children: <Widget>[
                    AspectRatio(
                      aspectRatio: 20/9,
                      child: Image.network("https://www.itying.com/images/flutter/3.png",fit: BoxFit.cover,),
                    ),
                    ListTile(
                      leading: CircleAvatar( //剪切圆形图片
                        backgroundImage:NetworkImage('https://www.itying.com/images/flutter/3.png')
                      ),
                      title: Text("xxxxxxxx"),
                      subtitle: Text("xxxxxxxxxx"),
                      
                    )
                ],
            ),
  
          )
        ],
      );
    }
  }
  ```





#### 2.3 使用外部数据

- ```dart
  class LayoutDemo extends StatelessWidget {
  
  
  
  
   @override
    Widget build(BuildContext context) {
      // TODO: implement build
      return ListView(
        children: listData.map((value){
          return Card(
            margin: EdgeInsets.all(10),
            child:Column(
                children: <Widget>[
                    AspectRatio(
                      aspectRatio: 20/9,
                      child: Image.network(value["imageUrl"],fit: BoxFit.cover,),
                    ),
                    ListTile(
                      leading: CircleAvatar(
                        backgroundImage:NetworkImage(value["imageUrl"])
                      ),
                      title: Text(value["title"]),
                      subtitle: Text(value["description"],maxLines: 1,overflow: TextOverflow.ellipsis),// 最大一行，多余部分 ‘...’                    
                    )
                ],
            ),
  
          );
  
        }).toList(),
      );
    }
  }
  ```



