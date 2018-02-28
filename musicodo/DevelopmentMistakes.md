## 开发中遇到的问题
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
* 当我写aidl知识时候,出现了如下的错误:
  ```
  Error:Execution failed for task ':musicodo:compileDebugAidl'.
  > java.io.IOException: com.android.ide.common.process.ProcessException:
  Error while executing process D:\Android\sdk\build-tools\27.0.2\aidl.exe
  with arguments {-pD:\Android\sdk\platforms\android-27\framework.aidl
  -oE:\acode\Android_Studio\Music\musicodo\build\generated\source\aidl\debug
  -IE:\acode\Android_Studio\Music\musicodo\src\main\aidl
  -IE:\acode\Android_Studio\Music\musicodo\src\debug\aidl
  -IC:\Users\yueyue\.gradle\caches\transforms-1\files-1.1\support-media-compat-27.0.2.aar\b55c72b725cce39a388f642dd59b4856\aidl
  -IC:\Users\yueyue\.gradle\caches\transforms-1\files-1.1\support-compat-27.0.2.aar\fc870247ce067e1074f7b2d3c7d2ca6c\aidl
  -dC:\Users\yueyue\AppData\Local\Temp\aidl1445730691971564396.d
  E:\acode\Android_Studio\Music\musicodo\src\main\aidl\com\yueyue\musicdodo\IOnDataIsReadyListener.aidl}
  ```
  刚看到的时候真的不知所措,幸好看了这篇文章所言:[关于Android AIDL 编译报错问题 - 简书]( https://www.jianshu.com/p/e5f591d94e80)
