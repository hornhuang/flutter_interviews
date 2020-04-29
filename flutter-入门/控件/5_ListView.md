## ListView

- 官方文档 []()



### 一、静态 ListView

- 使用自带 ListTile：

  - ```dart
    class HomeContent extends StatelessWidget {
      @override
      Widget build(BuildContext context) {
        // TODO: implement build
        return ListView(
          padding: EdgeInsets.all(10),
          children: <Widget>[
             
              ListTile(
                  leading:Image.network("https://www.itying.com/images/flutter/1.png"),
                  title: Text('华北黄淮高温雨今起强势登场'),
                  subtitle: Text("中国天气网讯 21日开始，华北黄淮高温雨今起强势登场"),
              ),
                ListTile(
                  leading:Image.network("https://www.itying.com/images/flutter/2.png"),
                  title: Text('保监局50天开32罚单 “断供”违规资金为房市降温'),
                  subtitle: Text("中国天气网讯 保监局50天开32罚单 “断供”违规资金为房市降温"),
              ),
              ListTile(
                 
                  title: Text('华北黄淮高温雨今起强势登场'),
                  subtitle: Text("中国天气网讯 21日开始，华北黄淮高温雨今起强势登场"),
                  trailing:Image.network("https://www.itying.com/images/flutter/2.png")
              ),
              ListTile(              
                  title: Text('华北黄淮高温雨今起强势登场'),
                  subtitle: Text("中国天气网讯 21日开始，华北黄淮高温雨今起强势登场"),
                  trailing:Icon(Icons.home),
              ),
              ListTile(
                  leading:Icon(Icons.pages),
                  title: Text('华北黄淮高温雨今起强势登场'),
                  subtitle: Text("中国天气网讯 21日开始，华北黄淮高温雨今起强势登场"),
              ),
              ListTile(
                  leading:Icon(Icons.settings),
                  title: Text('华北黄淮高温雨今起强势登场'),
                  subtitle: Text("中国天气网讯 21日开始，华北黄淮高温雨今起强势登场"),
              ),
              ListTile(
                  leading:Icon(Icons.home,color: Colors.yellow,),
                  title: Text('华北黄淮高温雨今起强势登场'),
                  subtitle: Text("中国天气网讯 21日开始，华北黄淮高温雨今起强势登场"),
              ),
              ListTile(
                  leading:Icon(Icons.pages),
                  title: Text('华北黄淮高温雨今起强势登场'),
                  subtitle: Text("中国天气网讯 21日开始，华北黄淮高温雨今起强势登场"),
              )
              
          ],
        );
      }
    }
    
    ```

- 自定义样式 ListView：

  - ```dart
    class HomeContent extends StatelessWidget {
      @override
      Widget build(BuildContext context) {
        // TODO: implement build
        return ListView(
          padding: EdgeInsets.all(10),
          children: <Widget>[
              Image.network("https://www.itying.com/images/flutter/1.png"),
    
              Container(
                child: Text(
                    '我是一个标题',
                    textAlign: TextAlign.center, 
                    style: TextStyle(
                      fontSize: 28,
                    ),            
                ),
                height: 60,
                padding:EdgeInsets.fromLTRB(0, 10, 0, 10),
              ),
    
              Image.network("https://www.itying.com/images/flutter/2.png"),
              Container(
                child: Text(
                    '我是一个标题',
                    textAlign: TextAlign.center, 
                    style: TextStyle(
                      fontSize: 28,
                    ),            
                ),
                height: 60,
                padding:EdgeInsets.fromLTRB(0, 10, 0, 10),
              ),
    
              Image.network("https://www.itying.com/images/flutter/3.png"),
              Container(
                child: Text(
                    '我是一个标题',
                    textAlign: TextAlign.center, 
                    style: TextStyle(
                      fontSize: 28,
                    ),            
                ),
                height: 60,
                padding:EdgeInsets.fromLTRB(0, 10, 0, 10),
              ),
    
              Image.network("https://www.itying.com/images/flutter/4.png"),
              Container(
                child: Text(
                    '我是一个标题',
                    textAlign: TextAlign.center, 
                    style: TextStyle(
                      fontSize: 28,
                    ),            
                ),
                height: 60,
                padding:EdgeInsets.fromLTRB(0, 10, 0, 10),
              ),
    
              Image.network("https://www.itying.com/images/flutter/1.png"),
              Container(
                child: Text(
                    '我是一个标题',
                    textAlign: TextAlign.center, 
                    style: TextStyle(
                      fontSize: 28,
                    ),            
                ),
                height: 60,
                padding:EdgeInsets.fromLTRB(0, 10, 0, 10),
              ),
    
              Image.network("https://www.itying.com/images/flutter/2.png"),
              Container(
                child: Text(
                    '我是一个标题',
                    textAlign: TextAlign.center, 
                    style: TextStyle(
                      fontSize: 28,
                    ),            
                ),
                height: 60,
                padding:EdgeInsets.fromLTRB(0, 10, 0, 10),
              ),
    
              Image.network("https://www.itying.com/images/flutter/3.png"),
              Container(
                child: Text(
                    '我是一个标题',
                    textAlign: TextAlign.center, 
                    style: TextStyle(
                      fontSize: 28,
                    ),            
                ),
                height: 60,
                padding:EdgeInsets.fromLTRB(0, 10, 0, 10),
              ),
    
              Image.network("https://www.itying.com/images/flutter/1.png"),
              Image.network("https://www.itying.com/images/flutter/2.png"),
              Image.network("https://www.itying.com/images/flutter/3.png"),
    
          ],
        );
      }
    }
    ```

- 属性：

  - ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc481487df2aa?w=765&h=177&f=png&s=32782)
  - ![](https://user-gold-cdn.xitu.io/2020/4/27/171bc48693cc94e1?w=763&h=45&f=png&s=7579)





### 二、动态 ListView

#### 2.1 外部封装数组

- 代码：

- ```dart
  class HomeContent extends StatelessWidget {  
  
    //自定义方法
    List<Widget> _getData(){
      return [
          ListTile(
            title: Text("我是一个列表"),
          ),
           ListTile(
            title: Text("我是一个列表"),
          ),
           ListTile(
            title: Text("我是一个列表"),
          )
        ];
    }
  
    @override
    Widget build(BuildContext context) {    
      // TODO: implement build
      return ListView(
        children: this._getData(),
      );
    }
  }
  ```



#### 2.2 传入 for 循环生成 list

  - ```dart
    class HomeContent extends StatelessWidget {  
    
    
      //自定义方法
      List<Widget> _getData(){    
        List<Widget> list=new List();
        for(var i=0;i<20;i++){
          list.add(ListTile(
              title: Text("我是$i列表"),
          ));
        }    
        return list;
      }
    
      @override
      Widget build(BuildContext context) {    
        // TODO: implement build
        return ListView(
          children: this._getData(),
        );
      }
    }
    ```

#### 2.3 加载外部 List （网络下载 / 文件读取）

  - ```
    import 'res/listData.dart';
    
class HomeContent extends StatelessWidget {  
    
      //自定义方法
      List<Widget> _getData(){      
        var tempList=listData.map((value){
            return ListTile(
              leading:Image.network(value["imageUrl"]),
              title:Text(value["title"]),
              subtitle:Text(value["author"])
            );
        });
        // map 后 格式为：('124124','124214')，需要转 List
        return tempList.toList();
      }
    
      @override
      Widget build(BuildContext context) {    
        // TODO: implement build
        return ListView(
          children: this._getData(),
        );
      }
    }
    ```
    



#### 2.4 采用 ListView.builder

- ```dart
  import 'res/listData.dart';
  
  class HomeContent extends StatelessWidget {  
  
    List list=new List();
    HomeContent(){
       for(var i=0;i<20;i++){
          this.list.add('我是第$i条');
        }
    }  
    @override
    Widget build(BuildContext context) {    
      // TODO: implement build
      return ListView.builder(
          itemCount:this.list.length,
          itemBuilder:(context,index){
            return ListTile(
              title: Text(this.list[index]),
            );
          }
      );
    }
  }
  ```



#### 2.5 采用 ListView.builder 读取外部数据

- ```dart
  import 'res/listData.dart';
  
  class HomeContent extends StatelessWidget {  
  
    //自定义方法
    Widget _getListData(context,index){
          return ListTile(           
              title: Text(listData[index]["title"]),
              leading:Image.network(listData[index]["imageUrl"]),          
              subtitle:Text(listData[index]["author"])
          );
    }
  
    @override
    Widget build(BuildContext context) {    
      // TODO: implement build
      return ListView.builder(
          itemCount:listData.length,
          itemBuilder:this._getListData
      );
    }
  }
  ```

  