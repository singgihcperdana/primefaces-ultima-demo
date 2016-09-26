#primefaces-ultima-demo
PrimeFaces的Ultima布局与主题的演示程序

## 项目说明
primefaces-ultima与primefaces-ultima-demo是对[官网ultima演示程序](http://www.primefaces.org/ultima/)进行分析，通过逆向工程得到的。
换句话说，就是crack，没钱的程序员想[吃霸王餐](http://www.primefaces.org/layouts/ultima.html)。
这两个项目现在已经可以运行了 :-)
欢迎其他人员加入，大家一起交流、测试、改进、试用，都欢迎。

* QQ群名：primefaces
* QQ群号：31551213

## 项目介绍
首先，其实有两个项目：

一个是[primefaces-ultima](http://git.oschina.net/ratking/primefaces-ultima)，它提供Ultima响应式页面布局(layout)与主题风格(theme)，
最后会生成一个primefaces-ultima.jar包，供基于PrimeFaces的Web项目使用。
使用的技术包括JSF、jQuery、CSS……

另一个是[primefaces-ultima-demo](http://git.oschina.net/ratking/primefaces-ultima-demo)，这是一个使用primefaces-ultima.jar的web演示程序，
最后会生成一个primefaces-ultima-demo.war包，可以部署到Java EE 6或Java EE 7（比如GlassFish 4.x、Payara 4.1.1或WildFly 10）里运行。
使用的技术主要是PrimeFaces 6.0、JSF 2.x、CDI 1.x、一点儿HTML 5、OmniFaces 2.x……

## Ultima布局与主题预览
<p align="center"><img src="http://www.primefaces.org/images/market/ultima/ultima.png" alt="Ultima布局与主题"/></p>

## 源码地址
primefaces-ultima的GIT源代码位于

    http://git.oschina.net/ratking/primefaces-ultima

primefaces-ultima-demo的GIT源代码位于

    http://git.oschina.net/ratking/primefaces-ultima-demo

## 官网原址
关于Ultima的官方介绍，详见

    http://www.primefaces.org/layouts/ultima.html

关于Ultima的官方演示程序，详见

    http://www.primefaces.org/ultima/

## 编译步骤
使用GIT客户端软件（比如git命令行或TortoiseGIT图形界面）下载上面的两个项目源代码后，
还需要maven编译打包，使用命令行：

    git clone http://git.oschina.net/ratking/primefaces-ultima
    cd primefaces-ultima
    mvn clean install

    git clone http://git.oschina.net/ratking/primefaces-ultima-demo
    cd primefaces-ultima-demo
    mvn clean package

也可以不用maven而使用NetBeans或Eclipse来编译打包。
