package com.yueyue.musicodo.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.yueyue.musicodo.R;
import com.yueyue.musicodo.app.manager.ActivityManager;
import com.yueyue.musicodo.main.MainActivity;
import com.yueyue.musicodo.shared.DialogProvider;
import com.yueyue.musicodo.util.ColorUtils;
import com.yueyue.musicodo.util.Utils;

import java.util.Random;

public class SplashActivity extends InspectActivity {

    private TextView[] ts;

    private View container;
    private boolean animComplete;
    private boolean initComplete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (ActivityManager.getInstance().getActivity(MainActivity.class.getName()) != null) {
            // 应用已经启动并未被杀死，直接启动 MainActivity
            startMainActivity();
            return;
        }

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        // 初始化小米应用统计服务
        xiaomiServiceInit();

        //权限检查完成后回调 permissionGranted 或 permissionDenied
        checkPermission();

    }

    @Override
    public void permissionGranted(int requestCode) {
        initViews();
        initDataAndStartService();
    }

    @Override
    public void permissionDenied(int requestCode) {
        finish();
    }

    private void initViews() {
        container = findViewById(R.id.splash_container);
        //GradientDrawable 动态设置背景的使用 - CSDN博客
        //           http://blog.csdn.net/qq_35522272/article/details/60871677
        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TL_BR,
                new int[]{
                        getResources().getColor(R.color.colorPrimary),
                        getResources().getColor(R.color.colorPrimaryDark)
                });
        container.setBackground(gd);
        container.setClickable(false);

        ts = new TextView[]{
                (TextView) findViewById(R.id.splash_m),
                (TextView) findViewById(R.id.splash_u),
                (TextView) findViewById(R.id.splash_s),
                (TextView) findViewById(R.id.splash_i),
                (TextView) findViewById(R.id.splash_c),
                (TextView) findViewById(R.id.splash_o),
                (TextView) findViewById(R.id.splash_d),
                (TextView) findViewById(R.id.splash_o1)
        };
        ts[0].post(new Runnable() {
            @Override
            public void run() {
                for (TextView t : ts) {
                    t.setVisibility(View.VISIBLE);
                    startTextInAnim(t);
                }
            }
        });
    }

    private void startTextInAnim(@Nullable TextView t) {
        Random r = new Random();
        DisplayMetrics metrics = Utils.getMetrics(this);
        int x = r.nextInt(metrics.widthPixels * 4 / 3);
        int y = r.nextInt(metrics.heightPixels * 4 / 3);
        float s = r.nextFloat() + 4.0f;
        //translation:平移  scale:缩放  alpha:透明度   rotate:旋转
        ValueAnimator tranY = ObjectAnimator.ofFloat(t, "translationY", y - t.getY(), 0);
        ValueAnimator tranX = ObjectAnimator.ofFloat(t, "translationX", x - t.getX(), 0);
        ValueAnimator scaleX = ObjectAnimator.ofFloat(t, "scaleX", s, 1.0f);
        ValueAnimator scaleY = ObjectAnimator.ofFloat(t, "scaleY", s, 1.0f);
        ValueAnimator alpha = ObjectAnimator.ofFloat(t, "alpha", 0.0f, 1.0f);

        AnimatorSet set = new AnimatorSet();
        set.setDuration(1800);
        set.setInterpolator(new AccelerateDecelerateInterpolator());
        set.play(tranX).with(tranY).with(scaleX).with(scaleY).with(alpha);
        if (t.getId() == R.id.splash_o1) {
            set.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    startFinalAnim();
                }

                @Override
                public void onAnimationCancel(Animator animation) {

                }

                @Override
                public void onAnimationRepeat(Animator animation) {

                }
            });
        }
        set.start();
    }

    private void startFinalAnim() {
        final ImageView image = (ImageView) findViewById(R.id.splash_logo);
        final TextView name = (TextView) findViewById(R.id.splash_name);
        //ObjectAnimator详解 - CSDN博客 http://blog.csdn.net/xiaochuanding/article/details/73290917
        ValueAnimator alpha = ObjectAnimator.ofFloat(image, "alpha", 0.0f, 1.0f);
        alpha.setDuration(1000);
        ValueAnimator alphaN = ObjectAnimator.ofFloat(name, "alpha", 0.0f, 1.0f);
        alphaN.setDuration(1000);
        ValueAnimator tranY = ObjectAnimator.ofFloat(image, "translationY", -image.getHeight() / 3, 0);
        tranY.setDuration(1000);
        ValueAnimator wait = ObjectAnimator.ofInt(0, 100);
        wait.setDuration(1000);
        wait.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (initComplete) {
                            startMainActivity();
                        } else {
                            animComplete = true;
                        }
                    }
                });
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        AnimatorSet set = new AnimatorSet();
        set.setInterpolator(new LinearInterpolator());
        set.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                image.setVisibility(View.VISIBLE);
                name.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        set.play(alpha).with(alphaN).with(tranY).before(wait);
        set.start();
    }

    private void initDataAndStartService() {

        new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... params) {
                return init();
            }

            @Override
            protected void onPostExecute(Boolean b) {
                startOrFinish(b);
            }
        }.execute();

    }

    // 媒体库为空退出，否则启动主 Activity
    private void startOrFinish(Boolean b) {
        if (b) {
            if (animComplete) {
                startMainActivity();
            } else {
                initComplete = true;
            }
        } else {
            handleEmptyLibrary();
        }
    }

    // 准备数据
    private boolean init() {

        // 耗时
        prepareData();

        // 检查设备上是否有媒体文件
        if (mediaManager.emptyMediaLibrary(this, false)) {
            return false;
        }

        //   耗时
        initAppDataIfNeed();

        //   耗时，启动服务之前先准备好数据
        startService();

        return true;
    }

    private void xiaomiServiceInit() {
        Init.initXiaomiStatisticalervices(this);
    }

    private void handleEmptyLibrary() {
        container.setClickable(true);
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (TextView t : ts) {
                    startTextInAnim(t);
                }

                int color = ColorUtils.getRandomBrunetColor();
                GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TL_BR,
                        new int[]{
                                android.support.v4.graphics.ColorUtils.setAlphaComponent(color, 100),
                                color,
                        });
                v.setBackground(gd);
            }
        });

        DialogProvider p = new DialogProvider(this);
        AlertDialog dialog = p.createInfosDialog(getString(R.string.tip),
                getString(R.string.info_empty_library_when_start));
        dialog.setCancelable(true);
        dialog.show();
    }

    private void startMainActivity() {
        MainActivity.launch(this);
        finish();
    }

}

