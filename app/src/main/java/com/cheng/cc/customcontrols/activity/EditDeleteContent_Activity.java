package com.cheng.cc.customcontrols.activity;

import com.cheng.cc.customcontrols.AppActivityManager;
import com.cheng.cc.customcontrols.BaseActivity;
import com.cheng.cc.customcontrols.R;

import butterknife.ButterKnife;

/**
 * @author Created by cc on 17/6/4.
 * @fileName EditDeleteContent_Activity
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class EditDeleteContent_Activity extends BaseActivity {


    @Override
    public void initView() {
        setContentView(R.layout.activity_deletecontent);
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
