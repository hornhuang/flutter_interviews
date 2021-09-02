## **FloatingActionButton**



### 一、简单使用





#### 1.1 属性

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ed3c2cf06c24c?w=639&h=226&f=png&s=49001)



#### 1.2 简单使用

- ```dart
  class ButtonDemoPage extends StatelessWidget {
    const ButtonDemoPage({Key key}) : super(key: key);
  
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          floatingActionButton: FloatingActionButton(
            child: Icon(Icons.add,color: Colors.black,size: 40,),
            onPressed: (){
              print('FloatingActionButton');
            },
            backgroundColor: Colors.yellow // 背景色
  
          ),
          ...
          ));
    }
  }
  ```

- 







### 二、实战底部导航

- 目标
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171edf9afa58559c?w=259&h=460&f=png&s=143313)





#### 2.1 实现思路

- 用floatingActionButton 将 BottomNavigationView 覆盖
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171edf7360e8a4e6?w=369&h=552&f=png&s=41264)





#### 2.2 按钮移动到中间

- 设置 floatingActionButtonLocation

- ```dart
  floatingActionButtonLocation: FloatingActionButtonLocation.centerFloat,
  ```

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171edfc0e5ff497a?w=510&h=191&f=png&s=31535)



#### 2.3 按钮移动到底部中间

- ```dart
  floatingActionButtonLocation: FloatingActionButtonLocation.centerDocked,
  ```

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171edff1e82c1b1a?w=473&h=127&f=png&s=23797)





#### 2.4 修改按钮位置、大小，遮盖原有 ‘分类’ 图标

- floatingActionButtonLocation 本身没有位置和大小
- 解决：在外城加一个 Container设置宽高

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          floatingActionButton: Container(
            height: 80,
            width: 80,
            
            child: FloatingActionButton(
              child: Icon(Icons.add),
              onPressed: (){
                 setState(() {  //改变状态
                      this._currentIndex=1;
                  });
  
              },
              backgroundColor: this._currentIndex==1?Colors.red:Colors.yellow,
            ),
          ),
  ```

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee080bccc43f2?w=474&h=166&f=png&s=31507)





#### 2.5 在按钮外层加一个圆圈

- 把 container 切割成圆形

- 设置圆形 Container 的 margin 间距

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          floatingActionButton: Container(
            height: 80,
            width: 80,
            padding: EdgeInsets.all(8),
            margin: EdgeInsets.only(top: 10),// 下移
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(40),
              color: Colors.white,
            ),
            
            child: FloatingActionButton(
              child: Icon(Icons.add),
              onPressed: (){
                 setState(() {  //改变状态
                      ...
                  });
  
              },
              backgroundColor: this._currentIndex==1?Colors.red:Colors.yellow,
            ),
          ),
  ```



#### 2.6 将 floatingActionButton 下移

- ​     margin: EdgeInsets.only(top: 10),

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          ...
          floatingActionButton: Container(
            height: 80,
            width: 80,
            padding: EdgeInsets.all(8),
            margin: EdgeInsets.only(top: 10),
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(40),
              color: Colors.white,
            ),
  ```



#### 2.7 点击事件

- 设置 CurrentIndex

- ```dart
  class _TabsState extends State<Tabs> {
  
    int _currentIndex;
    _TabsState(index){
      this._currentIndex=index;
    }
  
    List _pageList=[
      HomePage(),
      CategoryPage(),
      SettingPage(),
    ];
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          floatingActionButton: Container(
            height: 80,
            width: 80,
            padding: EdgeInsets.all(8),
            margin: EdgeInsets.only(top: 10),
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(40),
              color: Colors.white,
            ),
            
            child: FloatingActionButton(
              child: Icon(Icons.add),
              onPressed: (){
                 setState(() {  //改变状态
                      this._currentIndex=1;
                  });
  
              },
            ),
          ),
          floatingActionButtonLocation: FloatingActionButtonLocation.centerDocked,
          body: this._pageList[this._currentIndex],
  ```

- 



#### 2.8 点击按钮变色

- 三目运算

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
          floatingActionButton: Container(
            ...
            child: FloatingActionButton(
              ...
              backgroundColor: this._currentIndex==1?Colors.red:Colors.yellow,
            ),
          ),
  ```

- 