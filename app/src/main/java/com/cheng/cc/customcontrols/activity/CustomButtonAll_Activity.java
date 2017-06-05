package com.cheng.cc.customcontrols.activity;

import android.os.Bundle;

import com.cheng.cc.customcontrols.AppActivityManager;
import com.cheng.cc.customcontrols.BaseActivity;
import com.cheng.cc.customcontrols.R;

import butterknife.ButterKnife;

/**
 * @author Created by cc on 17/6/1.
 * @fileName CustomButtonAll_Activity
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class CustomButtonAll_Activity extends BaseActivity{
    @Override
    public void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_buttonall);
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



}
