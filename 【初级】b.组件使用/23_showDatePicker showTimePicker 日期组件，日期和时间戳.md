## 日期组件

- 官方
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef282e32cb125?w=612&h=285&f=png&s=94641)

- 第三方
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef2872b5efa27?w=632&h=170&f=png&s=46458)





### 一、Flutter 互动二当前日期和时间戳



#### 1.1 获取日期/时间戳 - 转换

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef29c05b5db11?w=754&h=72&f=png&s=50443)

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef2bba12433c2?w=381&h=242&f=png&s=71427)
- 相互转换：
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef2d488beeb59?w=877&h=375&f=png&s=142731)





#### 1.2 导入需要的库/包

- 打开  ![](http://pub.dev/)

- 搜索：比如格式化时间/日期
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef360186be87d?w=927&h=445&f=png&s=194238)
- 在 VS Code 中配置
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef380b8cfedd2?w=1537&h=469&f=png&s=316396)
- 配置完 按： ctrl+s 保存
- 这是就会自动从服务器拉去这个包，我们需要注意哦内阁制太有没有报错

- 看文档，迎入到代码中：
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef3afebf45fec?w=1496&h=412&f=png&s=254284)
- 使用：
- 看文档进行使用：
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef3c855a50856?w=994&h=824&f=png&s=89738)
- 加入代码中使用
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef3d552f2fadf?w=710&h=398&f=png&s=193012)







### 二、自带日期、时间组件

- 目标效果
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef3e4ce4b3e05?w=393&h=92&f=png&s=5667)
- ![image-20200507210648143](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200507210648143.png)







#### 2.1 简单布局

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef4179c136250?w=572&h=453&f=png&s=152028)





#### 2.2 打开日期组件

- 封装一个打开日期组件的方法
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef4508e3354ba?w=674&h=354&f=png&s=159764)
- 语言是英文，可以配置（大概如下，具体自行百度）
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef5e62ee38c36?w=927&h=462&f=png&s=193933)
- 代码复制到，入口文件（runApp）里
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef5f1291540d4?w=343&h=437&f=png&s=81103)
- 使用时设置现实的地区
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef5f9c65c9e8f?w=452&h=311&f=png&s=70364)





#### 2.3 获得所选的日期

- 源码看到返回一个 Future 对象，这是个异步方法的对象：
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef47b214a7157?w=684&h=273&f=png&s=174263)



##### 2.3.1 使用方法一

- 使用 Future 的 then()

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef488275a712b?w=369&h=381&f=png&s=156438)





##### 2.3.2 使用  await 关键字

- 构造方法使用  await 关键字

- 等待返回值了再赋值

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef4d798320f33?w=416&h=195&f=png&s=66894)





#### 2.4 显示日期到屏幕上

- 赋值到 _nowDate 上
- ![image-20200507212627727](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200507212627727.png)
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef51cd507d975?w=666&h=273&f=png&s=102623)
- 把获得的日期显示出来：
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef532935ad49e?w=644&h=233&f=png&s=85052)
- 引入格式化库，把日期转化为年月日格式
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef54089fbacef?w=645&h=111&f=png&s=63899)





#### 2.5 把事件显示到屏幕上

- 时间按钮
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef5624e32f62a?w=615&h=247&f=png&s=109699)
- 使用 showTimePicker 获得时间
- 由其构造方法可知，其构造方法需要传入一个 TimeOfDay 对象，需要先实例化一个
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef580946624e8?w=581&h=184&f=png&s=76299)

- 对显示的日期进行格式化
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef5c19651d867?w=456&h=177&f=png&s=76730)





### 三、三方时间日期组件

- flutter_cupertino_date_picker





#### 3.1 查找/使用 三方库的方法

- **查找** 
- https://pub.dev/ 搜目标的类型，如 ‘datepicker’
- 从上往下一个个找，有没有合适自己的
- **使用**
- 看 dev 的文档，如果 pub.dev 文档不全
- 区 github 搜索该库，在 github 上看文档





#### 3.2 配置

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef75697c76736?w=1246&h=206&f=png&s=82242)
- ctrl + s



#### 3.3 简单使用

- 现在文档里找到范例
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef8501683147d?w=462&h=992&f=png&s=102398)
- 对应的找到范例 Demo 地址

- 把文档的Demo对应内容全部复制过来
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef8325bfa9106?w=690&h=1005&f=png&s=105579)
- 从 pub.dev 或者 github 上找
- 然后抽离核心代码，修改称自己需要的形式

- 教程![](https://www.bilibili.com/video/BV1S4411E7LY?p=41)



