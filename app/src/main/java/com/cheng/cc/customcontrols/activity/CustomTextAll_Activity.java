package com.cheng.cc.customcontrols.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cheng.cc.customcontrols.AppActivityManager;
import com.cheng.cc.customcontrols.BaseActivity;
import com.cheng.cc.customcontrols.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Created by cc on 17/5/30.
 * @fileName CustomTextAll_Activity
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567git
 */

public class CustomTextAll_Activity extends BaseActivity {

    @Override
    public void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_textall);
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

    @OnClick({R.id.btn_lightning})
    public void onClickViews(View v) {
        switch (v.getId()) {

            case R.id.btn_lightning:
                startActivity(new Intent(CustomTextAll_Activity.this, TextLightning_Activity.class));
                break;

            default:
                break;
        }

    }
}
