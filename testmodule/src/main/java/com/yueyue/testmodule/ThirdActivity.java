package com.yueyue.testmodule;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity implements View.OnClickListener {

    private Button btn_click;
    private Button btn_click1;
    private Button btn_click2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initView();
    }


    private void initView() {
        btn_click1 = (Button) findViewById(R.id.btn_click1);
        btn_click2 = (Button) findViewById(R.id.btn_click2);

        btn_click1.setText("前往第1个界面");
        btn_click2.setText("前往第2个界面");

        btn_click1.setOnClickListener(this);
        btn_click2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_click1:
                activityStart(MainActivity.class);
                break;
            case R.id.btn_click2:
                activityStart(SecondActivity.class);
//                finish();
                break;
        }
    }
}
