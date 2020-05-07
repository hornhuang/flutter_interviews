## Swiper 轮播图

- pub.dev - swiper

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef9795f142147?w=544&h=381&f=png&s=50351)



#### 1.1 配置依赖

- ![](https://pub.dev/packages/flutter_swiper#-installing-tab-)



#### 1.2 简单使用（抄文档 Demo）

- 引入
- ![image-20200507224706825](C:\Users\30797\AppData\Roaming\Typora\typora-user-images\image-20200507224706825.png)

- 配置 imaList

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef9c2cae140da?w=553&h=329&f=png&s=123434)

- 抄代码
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171ef9ee4683a229?w=894&h=605&f=png&s=580243)





#### 1.3 顶部轮播使用

- 目标效果：（使用东西包它）
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171efa1a0d11496b?w=770&h=416&f=png&s=31059)





#### 1.3.1 简单实现

- 在外面包一个 Container
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171efa54304bd93d?w=717&h=529&f=png&s=225225)
- 效果（发现被压缩）
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171efa5f9b90ea95?w=447&h=156&f=png&s=114098)
- 使用 Aspect 按宽高比例，配置界面
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171efa7ada6b253f?w=709&h=302&f=png&s=125342)
- 如果此时 x 轴不能铺满屏幕，则配置Container 的 width
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171efa8a802595ee?w=373&h=166&f=png&s=57327)





##### 1.3.2 自动轮播及其他

- ![](https://user-gold-cdn.xitu.io/2020/5/7/171efab726cd166e?w=625&h=350&f=png&s=180308)
- 更多功能
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171efaa336aeeaf8?w=703&h=331&f=png&s=189676)

- 直接复制 Demo 代码
- ![](https://user-gold-cdn.xitu.io/2020/5/7/171efad6391a1536?w=717&h=597&f=png&s=143419)
- 修改为自己的图片、铺满屏幕等等![](https://user-gold-cdn.xitu.io/2020/5/7/171efadc00d6873e?w=911&h=187&f=png&s=103693)