## Musicodo
音乐是一款开源Android手机本地音乐文件播放器,致敬Musicoco


### 功能特点
* 通过耳机和通知栏快捷控制音乐播放
* 创建歌单
* 本地歌曲搜索
* 歌曲多选操作
* 记忆播放
* 自动切换到夜间模式
* 定时停止播放
* 应用主题自定义
* 播放界面风格选择。

应用开启了单独的播放服务进程，在服务进程中控制音乐播放逻辑

仿照开源项目:[DuanJiaNing/Musicoco](https://github.com/DuanJiaNing/Musicoco)

### 项目截图
<a href="../art/musicodo_main1.jpg"><img src="../art/musicodo_main1.jpg" width="20%" height="20%"/></a><img height="0" width="10px"/><a href="../art/musicodo_main2.jpg"><img src="../art/musicodo_main2.jpg" width="20%"  height="20%"/></a><img height="0" width="10px"/><a href="../art/musicodo_play1.jpg"><img src="../art/musicodo_play1.jpg" width="20%"  height="20%"/></a>

App体验地址:[SimpleMusic - fir.im ](https://fir.im/simm)

### 项目中用到的知识
* 命名规范:
  * 主要参考[Android 开发规范（完结版） - 简书](https://www.jianshu.com/p/45c1675bec69)
  * [《阿里巴巴Java开发手册》](https://yq.aliyun.com/articles/69327)
  * 上面阿里那本手册不懂的地方看这个系列的解读版：[阿里巴巴java开发手册解读1-命名规约|香辣猪蹄儿](http://yvshuo.me/blog/docs/alibaba/index.html)
* Android基础:
  * Android基础知识复习:[尚硅谷15天Android基础(复习笔记) - CSDN博客](http://blog.csdn.net/simplebam/article/details/70213167)
  * 四大组件:
     * Activity:
        * 启动模式:[Activity的四种启动模式-图文并茂 – Android开发中文站](http://www.androidchina.net/3173.html)
        * 状态保存与恢复:[Android Activity 和 Fragment 状态保存与恢复的最佳实践](https://www.jianshu.com/p/45cc7775a44b)
        * 动画切换:[酷炫的Activity切换动画，打造更好的用户体验 - 简书](https://www.jianshu.com/p/37e94f8b6f59)
        * 标签属性:[Android Activity标签属性 - 简书](https://www.jianshu.com/p/8598825222cc)
     * PreferenceActivity:
        * [Android开发之PreferenceActivity的使用 - 简书](https://www.jianshu.com/p/4a65f4a912c6)
        * [Preference 三种监听事件说明 - wangjicong_215的博客 - CSDN博客](http://blog.csdn.net/wangjicong_215/article/details/52209380)
     * Fragment
        * [实现Activity和Fragment之前通信 - CSDN博客](http://blog.csdn.net/xuxian361/article/details/75529810)
        * [死磕 Fragment 的生命周期 - MeloDev的博客 - CSDN博客](http://blog.csdn.net/MeloDev/article/details/53406019)
        * [android fragment onHiddenChanged的使用 - CSDN博客](http://blog.csdn.net/bzlj2912009596/article/details/62851537)
           ,这里是为了解释第二篇博文准备的
        * [Fragment的setUserVisibleHint方法实现懒加载，但
          setUserVisibleHint 不起作用？ - Leevey·L - 博客园](http://www.cnblogs.com/leevey/p/5678037.html)
          ,这里是为了解释第二篇博文准备的
        * [TabLayout使用详解 - 简书](https://www.jianshu.com/p/7f79b08f5afa)
          ,这里是为了解释第二篇博文准备的
        * [套在ViewPagerz中的Fragment在各种状态下的生命周期 - CSDN博客](http://blog.csdn.net/jemenchen/article/details/52645380)
        * [Android -- Fragment 基本用法、生命周期与细节注意 - 简书](https://www.jianshu.com/p/1ff18ec1fb6b)
        * [Fragment全解析系列（一）：那些年踩过的坑 - 简书](https://www.jianshu.com/p/d9143a92ad94)
          ,这系列的四篇都很经典,建议你可以看看
        * 还不知道怎么入门解析Fragment的可以看我的面经,里面涉及了(卖个广告),
          [Android面经-基础篇(持续更新...) - CSDN博客](http://blog.csdn.net/simplebam/article/details/77989675)
        * 关于保存和恢复Fragment目前最正确的状态:[The Real Best Practices to Save/Restore Activity's and Fragment's state. (StatedFragment is now deprecated)](https://inthecheesefactory.com/blog/fragment-state-saving-best-practices/en)
  * Android UI:
    * ImageView:[Android android:scaleType属性 图片按比例缩放 - CSDN博客](http://blog.csdn.net/CodeFarmerCXY/article/details/55215453)
      以及 [Android imageView图片按比例缩放 - CSDN博客 ](http://blog.csdn.net/hhbgk/article/details/8101676)
    * GradientDrawable: [GradientDrawable 动态设置背景的使用 - CSDN博客](http://blog.csdn.net/qq_35522272/article/details/60871677)
      以及 [图文详解Andorid中用Shape定义GradientDrawable - CSDN博客](http://blog.csdn.net/iispring/article/details/50437731)
  * Material Design:
    * [Android Theme.AppCompat 中，你应该熟悉的颜色属性 - 简书 ](https://www.jianshu.com/p/15c6397685a0)
      这家伙的关于MD文章也是值得一看的,简短but精辟
    * Toolbar:
        * [ToolBar使用心得(如何改变item的位置) - 泡在网上的日子](http://www.jcodecraeer.com/plus/view.php?aid=7667)
        * [Toolbar+DrawerLayout+NavigationView使用心得](http://www.jcodecraeer.com/a/anzhuokaifa/2017/0317/7694.html)
        * [Android ToolBar 使用完全解析 - 简书]( https://www.jianshu.com/p/ae0013a4f71a)
    * CoordinatorLayout(本身就是一个加强版的FrameLayout)可以监听其所有子控件
      的各种事件,然后自动帮助我们做出最为最为合理的响应 <--(寄生) AppBarLayout
      (垂直的LinearLayout加强版),它在内部做了很多滚动事件的封装
      <--(寄生) CollapsingToolBarLayout(可折叠式标题栏)
        * CoordinatorLayout:[CoordinatorLayout与滚动的处理-泡在网上的日子](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0717/3196.html)
        * DrawLayout:
          * [android官方侧滑菜单DrawerLayout详解 - 泡在网上的日子](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2014/0925/1713.html)
          * [用Android自带的DrawerLayout和ActionBarDrawerToggle实现侧滑效
            果 - CSDN博客](http://blog.csdn.net/miyuexingchen/article/details/52232751)
          * [Drawer 详解 ·Material Design Part 3 - Android - 掘金](https://juejin.im/entry/5825c76d67f3560058d23657)
    * RecyclerView:
        * [RecyclerView简单使用总结 - 简书](https://www.jianshu.com/p/9b3949f7cb0f)
        * [RecyclerView使用完全指南，是时候体验新控件了（一） - 简书](https://www.jianshu.com/p/4fc6164e4709)
    * SwipeRefreshLayout:
        * [SwipeRefreshLayout详解和自定义上拉加载更多 - 简书 ](https://www.jianshu.com/p/d23b42b6360b)
        * [SwipeRefreshLayout+RecyclerView冲突的几种解决方案 - 简书](https://www.jianshu.com/p/34cbaddb668b)
    * 看不懂物料设计的话建议买郭霖先生的《第二行代码》好一点，这本书内容对于初级
      开发者来说还是蛮不错的
  * 异步消息机制:[Android异步消息处理机制完全解析，带你从源码的角度彻底理解](http://blog.csdn.net/guolin_blog/article/details/9991569)
* 签名文件的生成:
  * [Android Studio apk打包，keystore.jks文件生成，根据keystore密钥获取
    SHA1安全码 - 切切歆语 - 博客园 ](https://www.cnblogs.com/zhangqie/p/6439052.html)
  * [keyStore 和.jks的签名的区别 - CSDN博客 ](http://blog.csdn.net/wolfking0608/article/details/78888249)
  * [Android Studio的两种模式及签名配置 - CoddingMan - 博客园](http://www.cnblogs.com/details-666/p/keystore.html)
* 代码混淆
  * [android 常用混淆 | 刘楠的博客](http://ln0491.coding.me/2016/11/16/android-%E5%B8%B8%E7%94%A8%E6%B7%B7%E6%B7%86/)
* Android 权限
  * Android自定义权限与使用
    * [Android自定义权限与使用 - CSDN博客 ](http://blog.csdn.net/u014088294/article/details/51924223)
  * Android 运行时权限功能 - 针对6.0 / Android M 以上系统而言
    * 作用:用户不需要在安装软件的时候一次性授权所有申请的权限，而是可以在软件的
      使用过程中再对某一项权限申请进行授权。比如说一款相讥应用在运行时申请了地理
      位置定位权限，就算我拒绝了这个权限，但我应该依然可以使用这个应用的其他功能，
      而不是像之前那样直接无法安装它。
    * 运行时权限的核心：说白了就是在程序运行过程中由用户授权我们去执行某些危险操
      作，程序是不可以擅自做主去执行这些危险操作的。
    * 我们在进行运行时权限处理时使用的是权限名，但是一旦用户同意授权了，那么该
      权限所对应的权限组的其他权限也同时被授权。
    * 基础篇：[《Android 第一行代码》](http://www.ituring.com.cn/book/1841)
      里面第7章的开头，其对应的源码：[RuntimePermissionTest](https://github.com/guolindev/booksource/tree/master/chapter7/RuntimePermissionTest)
      或者 [Android 6.0权限管理及最佳实践 - 简书](https://www.jianshu.com/p/cdcbd3038902)
    * 全面篇：[Android 6.0 运行时权限处理完全解析 - CSDN博客 ](http://blog.csdn.net/lmj623565791/article/details/50709663)
    * 实战篇：[Android权限管理详解 - CSDN博客](http://blog.csdn.net/shangmingchao/article/details/70312824)
    * 补充篇：[关于Android 6.0 运行时权限 | Android Notes ](https://bxbxbai.github.io/2016/05/27/android-runtime-permission/)
             以及 [targetSdkVersion 23以下6.0中调用checkSelfPermission的问题 - 海阔天空玩世不恭](https://my.oschina.net/u/990728/blog/549914)
* [android 代码混淆及问题大集锦 - stupidhod - 博客园](https://www.cnblogs.com/stupidhod/p/5224754.html)
* LruCache和DiskLruCache
    * LruCache
      * [Android高效加载大图、多图解决方案，有效避免程序OOM - CSDN博客](http://blog.csdn.net/guolin_blog/article/details/9316683)
      * [Android照片墙应用实现，再多的图片也不怕崩溃 - CSDN博客](http://blog.csdn.net/guolin_blog/article/details/9526203)
    * DiskLruCache
      * [Android DiskLruCache完全解析，硬盘缓存的最佳方案 - CSDN博客](http://blog.csdn.net/guolin_blog/article/details/28863651)
    * LruCache & DiskLruCache : [Android照片墙完整版，完美结合LruCache和DiskLruCache - CSDN博客](http://blog.csdn.net/guolin_blog/article/details/34093441)
* Github知识:
    * stormzhang的开源书籍:[从 0 开始学习 GitHub 系列-CSDN下载 ](http://download.csdn.net/download/simplebam/9745564)
      ,你也可以关注公众号 stormzhang ，id：googdev，聊天页面回复"github"关键
      字，即可获取，完全免费,但我本人感觉他公众号完全发鸡汤,没什么卵用,所以自己
      load下来上传到csdn博客
    * [Git教程 - 廖雪峰的官方网站](https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000)
      ,我更愿意推荐他的,通俗易懂,我建议可以配合[Pro Git（中文版）](http://git.oschina.net/progit/)一起看效果更佳
    * [github release 功能的使用及问题解决 - Eggy2015的博客 - CSDN博客](http://blog.csdn.net/Eggy2015/article/details/52138751)


### Android 开发Tips && 性能优化
* Android开发Tips ：
  * [Android开发一点小技巧和建议献上 - 掘金](https://juejin.im/post/5a66bea86fb9a01caf378d33)
  * [Android 开发注意事项 - 简书](https://www.jianshu.com/p/0b40c02b6119)
* Android 性能优化：
  * [Android内存优化（使用SparseArray和ArrayMap代替HashMap） - CSDN博客 ](http://blog.csdn.net/u010687392/article/details/47809295)
  * [Android 基础1：SparseArray 和 ArrayMap （HashMap替代） - 简书 ](https://www.jianshu.com/p/38b3e72d6fea)


### 项目中的用到的开源框架
* ButterKnife
  * [ButterKnife8.5.1 使用方法教程总结 - CSDN博客](http://blog.csdn.net/niubitianping/article/details/54893571)
* GreenDao-数据存储
  * [GreenDao3.2使用笔记（一） - 简书 ](https://www.jianshu.com/p/4c4c79c06596)
  * [Android实战——GreenDao3.2的使用，爱不释手 - CSDN博客 ](http://blog.csdn.net/qq_30379689/article/details/54410838)
  * GreenDao的配置有点繁重,这里我个人建议大家可以尝试使用郭霖先生的LitePal
    (原理上跟GreenDao一样的),升级数据库可以不清数据
    * [Android数据库高手秘籍(一)——SQLite命令 - 郭霖的专栏 - CSDN博客](http://blog.csdn.net/guolin_blog/article/details/38461239)
    * [LitePal 1.6.0版本来袭，数据加解密功能保障你的应用数据安全](http://mp.weixin.qq.com/s/TSp36cnKLxUmAHjT86UCrQ)
* bugtags-移动时代首选 Bug 管理系统:[Bugtags 使用说明 - CSDN博客](http://blog.csdn.net/ObjectivePLA/article/details/51037804)
* Gson-解析Json数据
  * 关于使用Alibaba的fastJson或者Google的Gson框架,我个人更喜欢使用Gson框架,
    不是因为fastJson不好,其实fastJson性能更优秀:[Android总结之json解析
    （FastJson Gson 对比）](http://www.cnblogs.com/whoislcj/p/5468420.html)
  * fastJson教程:[Android okHttp网络请求之Json解析 - 总李写代码 - 博客园](http://www.cnblogs.com/whoislcj/p/5533548.html)
  * Gson教程(这个作者写的这四篇Gson文章真的很好):[你真的会用Gson吗?Gson使用指
    南（一） - 简书 ](https://www.jianshu.com/p/e740196225a4)
* Glide
  * [Android图片加载框架最全解析（一），Glide的基本用法 - 郭霖的专栏](http://blog.csdn.net/guolin_blog/article/details/53759439)
    郭霖写的东西都很赞,值得推荐阅读
  * [Google推荐的图片加载库Glide介绍 - 泡在网上的日子](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0327/2650.html)
  * [Glide 一个专注于平滑滚动的图片加载和缓存库 - 简书](https://www.jianshu.com/p/4a3177b57949)
  * [Glide V4 框架新特性（Migrating from v3 to v4） - HeXinGen的博客 - CSDN博客](http://blog.csdn.net/hexingen/article/details/72578066)
* glide-transformations
  * 网上出现了很多Glide的图片变换开源库，其中做的最出色的应该要数glide-transformations这个库了
  * [Android图片加载框架最全解析（五），Glide强大的图片变换功能 - 郭霖](http://blog.csdn.net/guolin_blog/article/details/71524668)
  * [Glide、Picasso、Fresco进阶 - 图像转换 - 简书 ](https://www.jianshu.com/p/976c86fa72bc)
  * 还是不会用Glide的话,那么推荐使用[panpf/sketch: Sketch 是 Android 上一个
    强大且全面的图片加载器,支持 GIF，手势缩放以及分块显示超大图片](https://github.com/panpf/sketch)
    无需关心TAG，因为根本就不使用TAG来关联，也自带多种图片处理效果，圆形的、圆角
    的、高斯模糊的等等
* [AlipayZeroSdk-支付宝转账工具类](https://github.com/fython/AlipayZeroSdk)
   * [如何在app中打开支付宝进行打赏开发者 - CSDN博客](http://blog.csdn.net/qq_24531461/article/details/72858868)
   * 二维码可以在支付宝手机客户端或者网页[支付宝条码支付 - 扫码](https://qr.alipay.com/paipai/personal.htm)
     获取,得到的后面参数不太一样的,然后使用[在线二维码解码器](http://jiema.wwei.cn/)
     解析出参数即可
   * 这里也有很多人推荐使用第三方支付集成库易支付:[EasyPay(易支付)，两分钟集成三种Android支付方式 - 简书](https://www.jianshu.com/p/bd4d44c33532)
     ,开源项目地址:[yansongda/easyPay - 码云 Gitee.com ](https://gitee.com/yansongda/pay)
* 小米统计 MiStats
   * 说真的目前小米统计最新版本 1_9_11 ,但很遗憾就是该链接因为重定向过多而导致
     部分浏览器如 QQ 浏览器等无法获取下载资源,但百度搜索得到的靠近页面居然还是
     1_9_6 版本,真的让我感觉到汗颜


### 开发中遇到的问题
* [解决 Android 26 无法查看系统源码的问题](https://www.jianshu.com/p/37751162c720)
* Android Studio3.0的debug的apk安装包放置在/app/build/intermediates/
  instant-run-apk/debug下面!!!
* 在原项目中预留了Bugly用来捕捉App中的crash,看了一下官方文档以及相关教程[Bugly的使用 - CSDN博客](http://blog.csdn.net/u011531708/article/details/70158515)
  ,感觉有点繁琐,这里我决定使用bugtags作为替补
* 当打release包时候由于 minifyEnabled true (开启了代码混淆),导致报了okio代码
  混淆导致的错误:
  ```
  Warning:okio.DeflaterSink: can't find referenced class org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
  Warning:okio.Okio: can't find referenced class org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
  Warning:there were 3 unresolved references to classes or interfaces.
  ```
  百度了一下,找到了解决办法:[android代码混淆Warning:okio.DeflaterSink:
  can't find referenced class - yunianshu的博客](http://blog.csdn.net/yunianshu/article/details/73822237?utm_source=itdadao&utm_medium=referral)
* 在看RootActivity 时候，我发现一个很有趣的问题，如下代码：
  ```
      //检查权限是否获取
      public boolean checkPermission(Context context, String... permission) {

          boolean nr = true;

          for (int i = 0; i < permission.length; i++) {
              if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                  // targetSdkVersion >= Android M, we can
                  // use Context#checkSelfPermission
                  nr = context.checkSelfPermission(permission[i])
                          == PackageManager.PERMISSION_GRANTED;
              } else {
                  // targetSdkVersion < Android M, we have to use PermissionChecker
                  nr = PermissionChecker.checkSelfPermission(context, permission[i])
                          == PermissionChecker.PERMISSION_GRANTED;
              }

              if (!nr) {
                  break;
              }
          }
          return nr;
      }
  ```
  这里可以看出，细心的小伙伴发现检查权限时候分两种情况，一种是App 的
  targetSdkVersion >= M(6.0) 时候，我们使用
  context/ContextCompat.checkSelfPermission ；另外一种情况是是App 的
  targetSdkVersion < M(6.0) 时，我们使用 PermissionChecker.checkSelfPermission
  。其实这里是为了解决[targetSdkVersion 23以下6.0中调用checkSelfPermission的问题](https://my.oschina.net/u/990728/blog/549914)
  ,关于原因，看这篇：[关于Android 6.0 运行时权限 | Android Notes ](https://bxbxbai.github.io/2016/05/27/android-runtime-permission/)
* 在原项目中把小米的appid以及appkey配置在 AndroidManifest.xml 中，然后再获取，
  还不懂看这篇：[Android获取Manifest中<meta-data>元素的值 - CSDN博客](http://blog.csdn.net/xx326664162/article/details/50727941)


### 后续计划
* 由于bugstag需要在gradle配置NDK指名支持的芯片so库,导致调试过程中小米4c手机安
  装不上,所以bugstag到最后接通
* 等小米开发者通过之后,集成小米统计Api
