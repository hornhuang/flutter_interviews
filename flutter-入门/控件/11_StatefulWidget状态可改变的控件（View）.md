 ## StatefulWidget

- 界面可改变的 View
- 使用 StatelessWidget 能节约能耗



#### 用 StatelessWidget 实现界面

- 界面内容无法更新的问题
- ![](https://user-gold-cdn.xitu.io/2020/5/4/171dda1647599ae9?w=934&h=807&f=png&s=515887)





####  1.2 StatefulWidget 基本结构

- ```dart
  //自定义有状态组件
  class HomePage extends StatefulWidget {
    HomePage({Key key}) : super(key: key);
    _HomePageState createState() => _HomePageState();
  }
  
  class _HomePageState extends State<HomePage> {
    int countNum=0;
    @override
    Widget build(BuildContext context) {
      return Widget();// 在这里写我们 自定义组件/页面 代码
      );
    }
  }
  
  ```





#### 1.3 StatefulWidget 使用

- ```dart
  //自定义有状态组件
  class HomePage extends StatefulWidget {
    HomePage({Key key}) : super(key: key);
    _HomePageState createState() => _HomePageState();
  }
  
  class _HomePageState extends State<HomePage> {
    int countNum=0;
    @override
    Widget build(BuildContext context) {
      return Column(
        children: <Widget>[
          SizedBox(height: 200),
          Chip(
            label:Text('${this.countNum}') ,
          ),
          SizedBox(height: 20),
          RaisedButton(
            child: Text('按钮'),
            onPressed: (){
               setState(() {   //只有有状态组件里面才有
                    this.countNum++;
               });
            },
          )
        ],
      );
    }
  }
  ```





#### 1.4 在 ListView 动态增加数据

- ```dart
  class HomePage extends StatefulWidget {
    HomePage({Key key}) : super(key: key);
  
    _HomePageState createState() => _HomePageState();
  }
  
  class _HomePageState extends State<HomePage> {
  
    List list=new List();
    @override
    Widget build(BuildContext context) {
      return ListView(
  
        children: <Widget>[
          Column(
            children: this.list.map((value){
              return ListTile(
                title: Text(value),
              );
            }).toList()
          ),
          SizedBox(height: 20),
          RaisedButton(
            child: Text("按钮"),
            onPressed: (){
              setState(() {
                  this.list.add('新增数据1');
                  this.list.add('新增数据2');
              });
            },
          )
        ],
      );
    }
  }
  
  ```

- ![](https://user-gold-cdn.xitu.io/2020/5/4/171ddb0f4dd063e8?w=552&h=827&f=gif&s=421612)

