## TextField

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee98a0eda4261?w=705&h=271&f=png&s=58561)



#### 1.1 基础使用

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        ...
        body: Padding(
          padding: EdgeInsets.all(20),
          // child:TextDemo() ,    
          child:Column(
            children: <Widget>[
              TextField(
                ...
              ),
  ```

- 



#### 1.2 Hint 提示 - 点击消失

- decoration: InputDecoration

- ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        ...
        body: Padding(
          padding: EdgeInsets.all(20),
          // child:TextDemo() ,    
          child:Column(
            children: <Widget>[
              TextField(
                decoration: InputDecoration(
                  hintText: "请输入用户名"
                ),
                ...
              ),
  ```



#### 1.3 边框

- border: OutLineInputBorder()

- ```
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        ...
        body: Padding(
          padding: EdgeInsets.all(20),
          // child:TextDemo() ,    
          child:Column(
            children: <Widget>[
              TextField(
                decoration: InputDecoration(
                  hintText: "请输入用户名"
                  border: OutLineInputBorder()
                ),
                ...
              ),
  ```

- 





#### 1.4 多行文本框

- maxLine = 4；

- ```dart
              TextField(
                maxLine:4,
                ...
              ),
  ```





#### 1.5 密码框

- obscureText: true,

- ```dart
              TextField(
                obscureText: true,
                decoration: InputDecoration(
                  hintText: "密码"
                ),             
                onChanged: (value){
                   setState(() {
                      this._password=value; 
                   });
                },
              ),
  ```



#### 1.6 Google 输入框

- labelText: "用户名"

- ```dart
              TextField(
                decoration: InputDecoration(
                  hintText: "请输入用户名"
                  labelText: "用户名"
                  border: OutLineInputBorder()
                ),
                ...
              ),
  ```

- 可以修改 Label 的 Style 样式

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee81db57f7109?w=744&h=390&f=png&s=196729)





#### 1.7 文本前加图标

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee8302f041f76?w=867&h=332&f=png&s=193160)





#### 1.8 获取表单内容

- 有初始值时借用 TextEditingController（主要是为设定初始值）

- 五初始值时直接定义一个变量存



##### 1.8.1 定义初始值

- ```dart
  class _TextFieldDemoPageState extends State<TextFieldDemoPage> {
  
    var _username=new TextEditingController();   //初始化的时候给表单赋值
    var _password;
  
    @override
    void initState() {
      // TODO: implement initState
      super.initState();
      _username.text='初始值';
    }
  ```

- 





##### 1.8.2 使用初始值

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee88610169f00?w=539&h=315&f=png&s=167499)







##### 1.8.3 获取初始值

- 点击按钮获得初始值
- 当文本框，输入内容改变时，会调用 onChanged 方法，参数 value 时当前内容，我们将其保存到 _username.text 里
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee8e19bae355f?w=583&h=315&f=png&s=14601)

- 获取时直接读取 _username.text 即可
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee905c85c09c0?w=682&h=354&f=png&s=176670)





#### 1.8.4 不使用 TextEditingController

- 只当定义变量 
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee9470e50f7da?w=559&h=200&f=png&s=9986)
- 改变时赋值

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee953a8c684d6?w=554&h=252&f=png&s=12999)
- 使用时直接获取
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ee95c2a32c320?w=613&h=204&f=png&s=14802)

