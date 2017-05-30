package com.cheng.cc.customcontrols;

import android.content.Intent;
import android.view.View;

import com.cheng.cc.customcontrols.activity.CustomTextAll_Activity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 控件选择页
 */
public class MainActivity extends BaseActivity {


    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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
    public void onClickViews(View v) {
        switch (v.getId()) {
            case R.id.btn_textview:
                Intent intent = new Intent(this, CustomTextAll_Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_editview:

                break;
            case R.id.btn_buttonview:

                break;
            case R.id.btn_progressview:

                break;
            case R.id.btn_otherview:

                break;
            default:
                break;
        }


    }


}
