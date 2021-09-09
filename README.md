![](https://github.com/hornhuang/PictureRepository/blob/master/flutter_interviews/image_01.png)

# # 目录

整理内容较多，为了方便大家快速阅读，可以点击下列文字进行锚点跳转

> **[优秀项目](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#-%E4%BC%98%E7%A7%80%E9%A1%B9%E7%9B%AE)**
- [# 应用程序](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#-%E5%BA%94%E7%94%A8%E7%A8%8B%E5%BA%8F)
  - [flutter_deer](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#flutter_deer)
  - [gsy_github_app_flutter](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#gsy_github_app_flutter)
- [# 全平台](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#-%E5%85%A8%E5%B9%B3%E5%8F%B0)
  - [gsy_github_app_flutter](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#flutter-folio)
- [# 框架、脚手架](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#-%E6%A1%86%E6%9E%B6%E8%84%9A%E6%89%8B%E6%9E%B6)
  - [getx](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#getx)
  - [flutter_ume](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#flutter_ume)
  - [flutter_boost](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#flutter_boost)

> **[framework 层相关](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#-framework)**

> **[engine 相关](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#-engine)**
- [# 编译引擎](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#-%E7%BC%96%E8%AF%91)
  - [搭建Flutter Engine源码编译环境](http://gityuan.com/2019/08/03/flutter_engine_setup/)
- [# 源码设计](https://github.com/hornhuang/flutter_interviews/blob/master/README.md#-%E6%BA%90%E7%A0%81)
  - [Flutter源码阅读分析：引擎初始化与启动](https://blog.csdn.net/dongzhong1990/article/details/105678124)

</br>
</br>

# # 优秀项目
这里分享的优秀项目主要包含三个方面：
1. 优秀的应用程序 - 盘点那些 GitHub 上热气颇高的优质完整项目，通过阅读源码可以快速掌握使用 flutter 架构项目的方法。
2. 优秀的跨平台范例 - 作为跨平台方案 flutter 几乎支持了，包括移动端、网页、pc 在内的所有平台，所以还是有必要学习下一套代码多个平台的设计，比如我的 [GitHub page hornhuang.github.io](https://hornhuang.github.io/) 就是基于 flutter 搭建，逻辑代码在[这里 hornhuang_github_io ](https://github.com/hornhuang/hornhuang_github_io)欢迎大家参考
3. 优秀的框架、脚手架

## # 应用程序

我们在开发应用时，需要同时兼容 iOS 和 Android 两种平台时有两种技术选择：走原生开发路线，把界面和逻辑在不同平台分别实现；抑或用同一套代码兼容多个平台，但这往往意味着运行速度和产品体验的损失。除了原生外，目前跨平台技术一般是混合开发，如采用 H5、React Native、Weex、小程序等技术实现跨平台应用。不过这些或多或少都能感觉到卡顿和体验不流畅，并且开发和学习成本非常高，而且都有各自的局限性。
Flutter 的出现就是为我们提供了一套两全其美的解决方案：既能用原生代码直接调用的方式来加速图形渲染和 UI 绘制，又能同时运行在两大主流移动操作系统上，并且体验和流畅度和原生基本一致、开发效率也非常高、学习难度和成本低。

#### flutter_deer
- 本项目为学习Flutter的练习项目（主要为UI练习）。通过设置、修改、组合自带部件以及自定义来实现具体的设计效果，满足日常开发的需求。本项目设计图见design目录，你可以通过我提供的设计图有目标的去练习。所有的实现仅是个人的学习理解，如果有更好的实现方案欢迎交流。

[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=jonataslaw&repo=getx&show_owner=true)](https://github.com/simplezhli/flutter_deer)

#### gsy_github_app_flutter
- 一款跨平台的开源Github客户端App，提供更丰富的功能，更好体验，旨在更好的日常管理和维护个人Github，提供更好更方便的驾车体验～～Σ(￣。￣ﾉ)ﾉ。项目涉及各种常用控件、网络、数据库、设计模式、主题切换、多语言、Redux等。在开发学习过程中，提供丰富的同款对比.

[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=CarGuo&repo=gsy_github_app_flutter&show_owner=true)](https://github.com/CarGuo/gsy_github_app_flutter)

</br>

## # 全平台

Google发布了 Flutter 2.0的正式版本，至2018年Flutter 1.0版本发布以来，在最近的3年的时间礼，Flutter进行了大量的升级以支持更多平台的开发需求。作为 Flutter 的重大升级，Flutter 2.0 增加了对桌面和 Web 应用程序的支持。
所以到目前为止，使用 Flutter 2.0 开发的应用可以发布到iOS，Android，Windows，macOS 和 Linux五个操作系统； 以及运行到 Chrome 、 Firefo， Safari 或 Edge等浏览器的 Web 版本上，甚至嵌入到 Cars， TVs 和智能家电中。可以说，把Flutter说成是一个全平台的开发框架也不为过。

#### flutter-folio
- 这是一款演示应用，展示fltter如何针对iOS、Android、MacOS、Windows、Linux和Web提供出色的多平台体验。fltter_folio由gskinner与谷歌(Google)合作打造，它有目的地考虑用户的期望、输入设备和每个平台的习惯用法，确保它在每一台设备上都有宾至如归的感觉。除了这里提供的麻省理工学院许可代码，你还可以在fltter_folio Showcase网站上查看更多信息。

[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=gskinnerTeam&repo=flutter-folio&show_owner=true)](https://github.com/gskinnerTeam/flutter-folio)

</br>

## # 框架、脚手架

优秀的开原框架、组件库


#### getx
- GetX 是 Flutter 上的一个轻量且强大的解决方案：高性能的状态管理、智能的依赖注入和便捷的路由管理。

[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=jonataslaw&repo=getx&show_owner=true)](https://github.com/jonataslaw/getx)


#### flutter_ume
- Flutter 应用内调试工具平台

[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=bytedance&repo=flutter_ume&show_owner=true)](https://github.com/bytedance/flutter_ume)


#### flutter_boost
- UME (读音：油米~) 是一个 Flutter 调试工具包，内部集成了丰富的调试小工具，设计UI、网络、监控、性能、logger 等，无论是研发、PM、还是 QA 均能使用。

[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=alibaba&repo=flutter_boost&show_owner=true)](https://github.com/alibaba/flutter_boost)

</br>
</br>

# # framework
Framework(Dart)：该层是Dart库，google实现一套用Dart语言开发的基础库，包括Widget，手势，绘图，动画等，有Material和Cupertino风格。这里是 framework 层有关的文章，包括架构源码分析等干货汇总。

## # 源码
- [flutter Java 类源码功能及使用文档](https://api.flutter.dev/javadoc)

</br>
</br>

# # engine
Engine(C/C++)：用C++编写，实现了Flutter的核心库，包括Dart虚拟机、动画和图形、文字渲染、通信通道、事件通知、插件架构等。引擎渲染采用的是2D图形渲染库Skia，虚拟机采用的是面向对象语言Dart VM，并将它们托管到平台的中间层代码(Embedder)。以下是 flutter 引擎相关湿货，从源码架构到编译打包，自定义开发物美价廉，客官来点？

## # 编译
- [搭建Flutter Engine源码编译环境](http://gityuan.com/2019/08/03/flutter_engine_setup/)
- [官方文档架构概述 ：Flutter architectural overview](https://flutter.dev/docs/resources/architectural-overview)

</br>

## # 源码
- [Flutter Engine API 功能与使用文档](https://engine.chinmaygarde.com/classflutter_1_1_android_shell_holder.html#details)
- [Flutter源码阅读分析：引擎初始化与启动](https://blog.csdn.net/dongzhong1990/article/details/105678124)
- [AliFlutter圖片解決方案與優化](https://blog.cti.app/archives/6663)

</br>
</br>

# # 参考文献
本仓库的建设参考了一些优秀的文章，这里表示诚挚的感谢 😘

> [Flutter Engine层核心逻辑梳理](https://zhuanlan.zhihu.com/p/340729824)</br>
> [为什么要掌握 Flutter？](https://zhuanlan.zhihu.com/p/73145822)</br>
> [Google发布Flutter 2.0正式版，支持全平台程序构建](https://zhuanlan.zhihu.com/p/354634474)</br>

</br>

# # MIT License

```
Copyright (c) 2021 hornhuang

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
