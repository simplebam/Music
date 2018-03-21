# Music  - 暂时搁置了(项目开发难度大,恢复期未知)
音乐播放器的集合


## [Android开源在线音乐播放器——波尼音乐 - 简书 ](https://www.jianshu.com/p/1c0f5c4f64fa)
* 该项目依赖库很少,没有涉及RxJava,retrofit等框架,是一个很好的打基础项目
* 本来也是我首选模仿的Music项目,但由于模仿过程中发现作者的项目架构不明显(没按
   模块化进行开发)以及涉及的逻辑复杂,只好忍心割痛放弃


### 功能特点
* 播放本地音乐与在线音乐
* 在线音乐排行榜，如热歌榜、新歌榜等
* 高仿云音乐的黑胶唱片专辑封面
* 歌词显示，自动搜索歌词
* 编辑歌曲信息
* 夜间模式
* 定时关闭


仿照开源项目:[Android开源在线音乐播放器——波尼音乐 - 简书](https://www.jianshu.com/p/1c0f5c4f64fa)

### 项目截图


App体验地址:[波尼音乐](https://www.pgyer.com/ponymusic)


## ListenerMusicPlayer
一款优雅的遵循"Material Design"的开源音乐播放器，UI参考"腾讯轻听"音乐播放器,
  使用Lastfm Api与酷狗歌词Api。项目架构采用mvp-clean，基于Retrofit2 +
  Dagger2 + RxJava + RxBus + Glide。


### 功能特点
* 我的歌曲：展示本地所有的音乐文件，由歌曲、歌手、专辑三个标签页分类展示，数据取自系统媒体库。为了防止媒体库数据与本地不同步，应用启动时会主动刷新媒体库。
* 正在播放：该模块体现为固定在每个页面下方的播放控制区，展开后可查看全部操作，包括标记喜欢、打开播放列表及查看歌词。歌词API由酷狗提供。
* 文件夹：展示本地所有包含音乐文件个文件夹
* 我的歌单：展示用户创建的歌单
* 我喜欢：展示用户标记为喜欢的歌曲
* 最近播放：展示用户最近播放的歌曲
* 最近添加：展示最近添加的歌曲
* 播放排行：综合歌曲过去每周的播放历史和当前周播放次数得出歌曲排行
* 本地搜索：根据关键词搜索相关的歌曲、专辑和歌手
* 设置：该模块包括切换日夜间模式和更换出题

### 导入问题
  * 这个项目导入时候可能麻烦以下的问题:
    ```
    Error:Could not find com.tencent.mm:AndResGuard-gradle-plugin:1.2.0.
    Searched in the following locations:
        file:/D:/Android/Android Studio/gradle/m2repository/com/tencent/mm/AndResGuard-gradle-plugin/1.2.0/AndResGuard-gradle-plugin-1.2.0.pom
        file:/D:/Android/Android Studio/gradle/m2repository/com/tencent/mm/AndResGuard-gradle-plugin/1.2.0/AndResGuard-gradle-plugin-1.2.0.jar
        https://jcenter.bintray.com/com/tencent/mm/AndResGuard-gradle-plugin/1.2.0/AndResGuard-gradle-plugin-1.2.0.pom
        https://jcenter.bintray.com/com/tencent/mm/AndResGuard-gradle-plugin/1.2.0/AndResGuard-gradle-plugin-1.2.0.jar
    Required by:
        :ListenerMusicPlayer:unspecified
    ```

    解决也很简单啦:[【Android笔记-异常-8】在引入AndResGuard时异常 - CSDN博客](http://blog.csdn.net/xihuandaxiaojie/article/details/78713808)
    ,按照教程所言的把这个插件更新更新到最新版即可,该插件的地址:[传送门](https://github.com/shwenzhang/AndResGuard)


## 其他优秀项目
* [simplebam/Weather: 天气应用App合集](https://github.com/simplebam/Weather)
  * 很多朋友看完郭神的[第一行代码](http://blog.csdn.net/guolin_blog/article/details/52032038)
    之后就开始信心足足去博客或者公众号找优质的资源,有些人收到的效果很好,但有些人
    像我这样不仅模仿不到位还导致进入迷惑圈导致效果甚微,这里的话看底子,如果你从
    Java后台转Android开发,码ListenerMusicPlayer项目无疑是最好的,但如果你像我
    这样基础不给力的话,我建议还是分散来学习,一个项目掌握一两个就好,虽然笨拙,但总
    比以前好很多,所以不妨试试这个项目集
* [yangchong211/YCAudioPlayer: 音频播放器，基础播放功能有：播放，暂停，下一首，上一首；可以设置多种播放类型：顺序播放，随机播放，单曲循环；可以设置播放进度快慢，参考混沌大学APP；支持后台播放，可以扫描本地音频，有效处理了捕获/丢弃音频焦点逻辑，支持耳机线控。通知栏，底部音频播放控制栏，音频List页面和播放详情页数据同步。持续更新中……](https://github.com/yangchong211/YCAudioPlayer)

## 推荐阅读-推荐的不仅仅是技术
* [对不起，我的文案已经比不过00后了！-情书参考](http://mp.weixin.qq.com/s/GMSKJnX3JyrdnguKsMQD_Q)
* [推荐3个优质学习项目](http://mp.weixin.qq.com/s/nTo7rqt0Y839r6O28uQW8Q)
* [开源一款超级好用的mp3剪切器app](http://mp.weixin.qq.com/s/9OK1gJgsctnt6WA04LCYCA)
* [程序员接私活的途径以及正确方式](https://mp.weixin.qq.com/s/9a1QsOj3sJ6N4CaeZfWdvQ)
* [软件开发知识体系 ](https://mp.weixin.qq.com/s/A5n9PG0aUl2z2z3zakZF3A)


## Support
最近在项目中学习,在项目中成长,所以亲们会看到我在项目里面写博客啦,哈哈哈 <br/>
如果你喜欢这个repository，请我喝杯咖啡，我会让它更完美~ <br/>

<a href="get_me_a_drink.png"><img src="get_me_a_drink.png" width="30%" height="30%"/></a><img height="0" width="8px"/>
