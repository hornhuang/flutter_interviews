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

- 传入 for 循环生成 list

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

- 加载外部 List （网络下载 / 文件读取）

  - ```
    
    ```

  - 