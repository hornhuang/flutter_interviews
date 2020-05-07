### 一、CheckBox 

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eeaad8414e1de?w=706&h=106&f=png&s=17584)
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eeab1a6ceef53?w=699&h=33&f=png&s=6728)



#### 1.1 简单使用

- ```dart
  class _CheckBoxDemoState extends State<CheckBoxDemo> {
  
    var flag=true;
    
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
  
              Row(children: <Widget>[
                Checkbox(
                  value: this.flag,
                  onChanged: (v){
                    setState(() {
                       this.flag=v;
                    });
                  },
                  activeColor: Colors.red,
                )
              ]),
  ```

- 



#### 1.2 结合文本框显示输入状态

- 效果
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eeac9d913b6cb?w=489&h=86&f=png&s=6304)

- ```dart
  class _CheckBoxDemoState extends State<CheckBoxDemo> {
  
    var flag=true;
    
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
  
              Row(children: <Widget>[
                Checkbox(
                  value: this.flag,
                  onChanged: (v){
                    setState(() {
                       this.flag=v;
                    });
                  },
                  activeColor: Colors.red,
                )
              ]),
              Row(
                children: <Widget>[
                  Text(this.flag?"选中":"未选中")
                ],
              ),
  ```

- 





### CheckBoxListTile



#### 2.1 基本使用

- 效果;

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eead14eeaae0d?w=465&h=73&f=png&s=13087)

- 实现

- ```dart
              CheckboxListTile(
                 value: this.flag,
                  onChanged: (v){
                    setState(() {
                       this.flag=v;
                    });
                  },
                  title: Text("标题"),
                  subtitle:Text("这是二级标题") ,
              ),
  ```





#### 2.2 带图片的 ChackBocListTile

- 效果：
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eeaf47245a03e?w=531&h=77&f=png&s=12691)
- 代码：

- ```
              CheckboxListTile(
                 value: this.flag,
                  onChanged: (v){
                    setState(() {
                       this.flag=v;
                    });
                  },
                  title: Text("标题"),
                  subtitle:Text("这是二级标题") ,
                  secondary:Icon(Icons.help)
              )
  ```

- 





### 三、Radio



#### 3.1 普通按钮组

- 声明一个 int 变量用于分组
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eebe23df56c4b?w=450&h=112&f=png&s=48984)
- group value 相等的会成为一个分组
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eebf0cd2f9de3?w=264&h=408&f=png&s=78581)
- 效果:只能选一个
- ![image-20200507184754125](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200507184754125.png)





#### 3.2 获得选中内容

- 效果

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eec304aab494a?w=358&h=75&f=png&s=15117)

- 添加男女文本框用于区分
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eec2208bb0f71?w=230&h=375&f=png&s=75307)
- 获取选择情况
- ![image-20200507185112008](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200507185112008.png)





### 四、RadioListTile

- 和 ChecjBoxListTile 属性类似，就多一个 GroupValue 参数
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eec4309243059?w=730&h=218&f=png&s=77900)





#### 4.1 简单使用

- 效果
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eec651f37065c?w=359&h=104&f=png&s=20977)

- 和 Radio 类似，一个是没意义的，一般作为按钮组存在
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eec5790e85f8e?w=285&h=475&f=png&s=137810)
- 



#### 4.2 seleted 参数：true / false（文字是否高亮）

- 实现
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eec8562a84733?w=709&h=288&f=png&s=121909)
- checkBox 也有这个功能

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eec7697a5dc62?w=552&h=282&f=png&s=87510)







### 五、Switch 开关



#### 2.1 简单使用 + 获得信息

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eec99fc39b8df?w=643&h=356&f=png&s=102124)







### 六、实战



#### 6.1 目标效果

- 目标效果：获得表单数据
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eecd1290a6045?w=716&h=485&f=png&s=190851)





#### 6.2 实现

- ```dart
  import 'package:flutter/material.dart';
  
  class FormDemoPage extends StatefulWidget {
    FormDemoPage({Key key}) : super(key: key);
  
    _FormDemoPageState createState() => _FormDemoPageState();
  }
  
  class _FormDemoPageState extends State<FormDemoPage> {
  
    String username;
    int sex=1;
    String info='';
  
    List hobby=[
      {
        "checked":true,
        "title":"吃饭"
      },
       {
        "checked":false,
        "title":"睡觉"
      },
       {
        "checked":true,
        "title":"写代码"
      }
    ];
  
    List<Widget> _getHobby(){
  
      List<Widget> tempList=[];
  
      for(var i=0;i<this.hobby.length;i++){
  
          tempList.add(
            Row(
              children: <Widget>[
                Text(this.hobby[i]["title"]+":"),
                Checkbox(
                  value: this.hobby[i]["checked"],
                  onChanged: (value){
                    setState(() {
                      this.hobby[i]["checked"]=value; 
                    });
                  }
                )
              ],
            )
          );
  
      }
      return tempList;
  
    }
  
    void _sexChanged(value){
      setState(() {
        this.sex=value; 
      });
    }
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text("学员信息登记系统"),
        ),
        body: Padding(
          padding: EdgeInsets.all(20),
          child: Column(
            children: <Widget>[
  
               TextField(
                 decoration: InputDecoration(
                   hintText: "输入用户信息"
                 ),
                 onChanged: (value){
                   setState(() {
                      this.username=value;
                   });
                 },
               ),
                SizedBox(height:10),
               Row(
                 children: <Widget>[
                   Text("男"),
                   Radio(
                     value: 1,
                     onChanged: this._sexChanged,
                     groupValue: this.sex
                   ),
                   SizedBox(width: 20),
                   Text("女"),
                   Radio(
                     value: 2,
                     onChanged:this._sexChanged,
                     groupValue: this.sex
                   )
                 ],
               ),
  
              //爱好
              SizedBox(height:40),
              Column(
                children: this._getHobby(),
              ),
  
              TextField(
                maxLines: 4,
                 decoration: InputDecoration(
                   hintText: "描述信息",
                   border: OutlineInputBorder()
                 ),
                 onChanged: (value){
                  setState(() {
                    this.info=value;
                  });
                 },
               ),
  
  
             SizedBox(height:40),
               Container(
                width: double.infinity,
                height: 40,
                child: RaisedButton(
                  child: Text("提交信息"),
                  onPressed: (){
                    print(this.sex);
                    print(this.username);
                    print(this.hobby);
                  },
                  color: Colors.blue,
                  textColor: Colors.white,
                ),
              )
            ],
          ),
        ),
      );
    }
  }
  ```

- 