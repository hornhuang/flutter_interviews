### 一、CheckBox 

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171eea778a0eecc2?w=698&h=268&f=png&s=58404)



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

