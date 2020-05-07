## Dialog 系统内置对话框

- 自定义看下篇





#### 基本使用

- 放在 showDialog 方法里
- 在 showDialog 的 builder 中返回对应 Dialog

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171efdf22b7e225a?w=637&h=507&f=png&s=283305)



### 一、AlertDialog 普通对话框



#### 1.1 效果

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171efe503f33e67d?w=261&h=151&f=png&s=22060)

  

  

#### 1.2 实现

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171efe46e5e091b1?w=503&h=188&f=png&s=72362)

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171efe3ffb7f9d60?w=387&h=545&f=png&s=176974)



#### 1.3 异步获得选择结果

- 结果保存在 result 中
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171efe73ef042773?w=516&h=524&f=png&s=207361)





### 二、SimpleDialog 单选列表

- 



#### 2.1 效果

- 点击完返回用户选择的结果

- ![image-20200508001245905](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200508001245905.png)



#### 2.2 使用

- 异步读取，结果存在result 中

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171efe9f0491063a?w=416&h=436&f=png&s=165232)



### 三、ModelBottomSheet 底部弹出





#### 3.1 使用

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171efeec1edd17c5?w=528&h=537&f=png&s=209910)









### 四、Toast 吐司

- pub.dev 搜索 toast 选择版本最高的 ：fluttertoast



#### 4.1 配置

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171eff19baed4666?w=457&h=322&f=png&s=14134)



#### 4.2 直接 CV 直接用

- 使用三方库报错时，从新 run flutter





#### 4.3 使用

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171eff2dfa9ff32a?w=736&h=369&f=png&s=173083)