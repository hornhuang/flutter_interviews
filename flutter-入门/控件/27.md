## GET & POST 网络







### 一、JSON 字符串和 Map 类型转换

- ![image-20200508105518901](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200508105518901.png)





#### 1.1 引入 convert 库

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f2366367457c0?w=319&h=88&f=png&s=21614)





#### 1.2 Map 转 JSON 串

- ![image-20200508105726345](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200508105726345.png)





#### 1.3 JSON 串转 Map 

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f2392478d2a03?w=667&h=204&f=png&s=79286)





### 二、GET POST 网络请求

- 推荐使用：
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f23ab12c713d1)
- POST 提交数据  &  GET 请求数据
- 由于请求是异步的，所以要用 await





#### 2.1 导包 + 引入

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f24a37f9129aa?w=175&h=103&f=png&s=1375)

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f2458945f6107?w=508&h=88&f=png&s=39660)





### 三、 请求数据


#### 3.1 大体流程

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f24c296c4398b?w=608&h=371&f=png&s=151785)

- 



#### 3.2 显示到页面上
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f24d100e47498?w=507&h=114&f=png&s=38998)

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f2502457ec2f4?w=580&h=364&f=png&s=160267)
- 显示到界面上

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f250d56772ec7?w=800&h=250&f=png&s=139145)





### 四、提交数据



#### 4.1 POST 提交

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f259067f5a397?w=799&h=298&f=png&s=139638)



#### 4.2 测试

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f25a4c9881f18?w=509&h=192&f=png&s=90576)

- 可以看到 NodeJS 服务器收到数据
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f25bb3fee4365?w=462&h=185&f=png&s=60176)

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f25c123f0e3f4?w=501&h=83&f=png&s=28608)







### 五、实战：请求真实接口，渲染页面 

- 测试接口：![](http://a.itying.com/api/productlist)
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f2606238a7300?w=658&h=416&f=png&s=83568)





#### 5.1 基本思路

- 在 iniState() [ 这个方法相当于 onCreate() ] 中调用 _getData() 方法，获取数据
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f26392f755211?w=708&h=569&f=png&s=211862)
- 请求数据方法
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f263e873ff396?w=700&h=310&f=png&s=125627)





#### 5.2 将 JSON 串转成 List 对象

- 获取的 JSON 串，使用 ![](https://www.bejson.com/) 转化格式，方便看
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f266b615c5e41?w=751&h=480&f=png&s=211502)
- 可以看到，我们需要的数据，是以数组的形式存在 result 的 list 键中的，所以我们要先拿到 result 在拿到 list 数组

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f268e1ea85d9d?w=662&h=319&f=png&s=158263)



#### 5.3 将 List  数据显示到界面上

- 由于加载需要时间，所以加载出来前，需要‘加载中’的过渡动画
- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f272239736284?w=614&h=313&f=png&s=127979)
- 循环遍历生成 List

- ![](https://user-gold-cdn.xitu.io/2020/5/8/171f275d9185c49c?w=757&h=317&f=png&s=195338)