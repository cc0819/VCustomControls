package com.cheng.cc.customcontrols;

import android.content.Intent;
import android.view.View;

import com.cheng.cc.customcontrols.activity.CustomButtonAll_Activity;
import com.cheng.cc.customcontrols.activity.CustomDialogAll_Activity;
import com.cheng.cc.customcontrols.activity.CustomEditAll_Activity;
import com.cheng.cc.customcontrols.activity.CustomStudyAll_Activity;
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

    @OnClick({R.id.btn_studyview,R.id.btn_textview, R.id.btn_editview, R.id.btn_buttonview, R.id.btn_progressview,
            R.id.btn_imageview,R.id.btn_dialogview,R.id.btn_otherview})
    public void onClickViews(View v) {
        switch (v.getId()) {
            case R.id.btn_studyview:
                startActivity(new Intent(this, CustomStudyAll_Activity.class));
                break;
            case R.id.btn_textview:
                startActivity(new Intent(this, CustomTextAll_Activity.class));
                break;
            case R.id.btn_editview:
                startActivity(new Intent(this, CustomEditAll_Activity.class));
                break;
            case R.id.btn_buttonview:
                startActivity(new Intent(this, CustomButtonAll_Activity.class));
                break;
            case R.id.btn_progressview:

                break;
            case R.id.btn_imageview:

                break;
            case R.id.btn_dialogview:
                startActivity(new Intent(this, CustomDialogAll_Activity.class));
                break;
            case R.id.btn_otherview:

                break;
            default:
                break;
        }


    }


}
