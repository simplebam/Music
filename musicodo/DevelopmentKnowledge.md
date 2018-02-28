## 项目中用到的知识
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
     * Service:
        * [Android Service完全解析，关于服务你所需知道的一切(上) - CSDN博客](http://blog.csdn.net/guolin_blog/article/details/11952435/)
        * [Android Service完全解析，关于服务你所需知道的一切(下) - CSDN博客](http://blog.csdn.net/guolin_blog/article/details/9797169)
        * [Android之AIDL知识总结-布布扣-bubuko.com](http://www.bubuko.com/infodetail-2041900.html)
        * [关于Android AIDL 编译报错问题 - 简书 ](https://www.jianshu.com/p/e5f591d94e80)
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
