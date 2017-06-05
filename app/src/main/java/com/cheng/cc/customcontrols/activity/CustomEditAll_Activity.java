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
 * @author Created by cc on 17/5/31.
 * @fileName CustomEditAll_Activity
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class CustomEditAll_Activity extends BaseActivity {

    @Override
    public void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_editall);
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

    @OnClick({R.id.btn_editdeletecontent})
    public void onClickViews(View view) {
        switch (view.getId()) {
            case R.id.btn_editdeletecontent:
                startActivity(new Intent(this,EditDeleteContent_Activity.class));
                break;

            default:
                break;
        }

    }


}
