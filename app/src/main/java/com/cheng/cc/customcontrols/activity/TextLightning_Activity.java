package com.cheng.cc.customcontrols.activity;

import android.os.Bundle;

import com.cheng.cc.customcontrols.AppActivityManager;
import com.cheng.cc.customcontrols.BaseActivity;
import com.cheng.cc.customcontrols.R;
import com.cheng.cc.customcontrols.views.Lightning_Text;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Created by cc on 17/6/2.
 * @fileName TextLightning_Activity
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class TextLightning_Activity extends BaseActivity {
    @BindView(R.id.lightning)
    Lightning_Text lightning;


    @Override
    public void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_lightning);
        ButterKnife.bind(this);
        AppActivityManager.getAppManager().addActivity(this);

    }

    @Override
    public void initInstall() {
        lightning.setText("LIGHTNING TEXTVIEW");
        lightning.setTextSize(50);
    }

    @Override
    public void initData() {

    }

    @Override
    public void evenControl() {

    }

}
