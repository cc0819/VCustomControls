package com.cheng.cc.customcontrols;

import android.view.View;

import butterknife.OnClick;

/**
 * 控件选择页
 */
public class MainActivity extends BaseActivity {


    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        AppActivityManager.getAppManager().addActivity(this);
    }

    @Override
    public void initInstall() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void evenControl() {

    }

    @OnClick({R.id.btn_textview, R.id.btn_editview, R.id.btn_buttonview, R.id.btn_progressview, R.id.btn_otherview})
    public void onClickView(View v) {

        switch (v.getId()) {
            case R.id.btn_textview:
                break;
            case R.id.btn_editview:
                break;
            default:
                break;
        }


    }


}
