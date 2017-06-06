package com.cheng.cc.customcontrols.activity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.cheng.cc.customcontrols.AppActivityManager;
import com.cheng.cc.customcontrols.BaseActivity;
import com.cheng.cc.customcontrols.R;
import com.cheng.cc.dialoglibrary.BaseDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Created by cc on 17/6/5.
 * @fileName CustomDialogAll_Activity
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class CustomDialogAll_Activity extends BaseActivity implements BaseDialog.onDismissListener,BaseDialog.onItemClickListener{

    private BaseDialog mBaseDialog;
    String[] contentArray = {"第一项", "第二项", "第三项"};
    String[] array = {"取消", "确认"};

    @Override
    public void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_dialogall);
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

    @OnClick({R.id.btn_disfade_center, R.id.btn_disfade_bottom,
            R.id.btn_fade_center, R.id.btn_fade_bottom,
            R.id.btn_styles_center, R.id.btn_styles_bottom,
            R.id.btn_disListener, R.id.btn_changemargin, R.id.btn_changeanim
    })
    public void onClickViews(View view) {
        switch (view.getId()) {
            case R.id.btn_disfade_center:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.Center, array,
                        "中间", "点击外部不可关闭", this);
                mBaseDialog.setCancelable(false);
                break;
            case R.id.btn_disfade_bottom:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.DownSheet, contentArray,
                        "底部", "点击外部不可关闭", this);
                mBaseDialog.setItemTextColorAt(1, getResources().getColor(R.color.colorAccent));
                break;
            case R.id.btn_fade_center:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.Center,contentArray,
                        "中间","点击外部关闭",this);
                break;
            case R.id.btn_fade_bottom:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.DownSheet,contentArray,
                        "底部","点击外部关闭",this);
                mBaseDialog.setDismissListener(this);
                break;
            case R.id.btn_styles_center:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.Center, array,
                        "中间自定义样式", "点击外部可取消", this);
                mBaseDialog.setItemTextColor(getResources().getColor(R.color.bgColor_overlay));
                mBaseDialog.setMsgTextColor(getResources().getColor(R.color.colorAccent));
                mBaseDialog.setItemTextColorAt(1, getResources().getColor(R.color.colorPrimary));
                mBaseDialog.setItemTextColorAt(2, getResources().getColor(R.color.colorAccent));
                mBaseDialog.setItemTextColorAt(10, getResources().getColor(R.color.colorAccent));
                break;
            case R.id.btn_styles_bottom:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.DownSheet, contentArray,
                        "底部自定义样式", "点击外部不可取消", this);
                mBaseDialog.setTitleTextColor(getResources().getColor(R.color.colorAccent));
                mBaseDialog.setItemTextColor(getResources().getColor(R.color.colorAccent));
                mBaseDialog.setMsgTextColor(getResources().getColor(R.color.bgColor_overlay));
                break;
            case R.id.btn_disListener:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.Center, contentArray,
                        "消失监听", "点击外部取消并监听到消失事件", this);
                mBaseDialog.setDismissListener(this);
                break;
            case R.id.btn_changemargin:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.Center, contentArray,
                        "更改边距", "通过外边距更改宽度", this);
                mBaseDialog.setMargin(
                        0, 0, 0, 50);
                break;
            case R.id.btn_changeanim:
                mBaseDialog = new BaseDialog(CustomDialogAll_Activity.this, BaseDialog.Style.DownSheet, contentArray,
                        "更改动画", "自定义动画设置", this);
                mBaseDialog.setInAnim(AnimationUtils.loadAnimation(this,R.anim.slide_in_bottom));
                mBaseDialog.setOutAnim(AnimationUtils.loadAnimation(this,R.anim.slide_out_bottom));
                break;

            default:
                break;
        }
        mBaseDialog.show();

    }


    @Override
    public void onDismissClick(Object object) {
        if (object == mBaseDialog) {
            Toast.makeText(this, "点击外部取消并监听到消失事件", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onItemClick(Object object, int position) {
        if (object == mBaseDialog) {
            Toast.makeText(this, "这个位置被点击了" + position, Toast.LENGTH_SHORT).show();
            if (position == 0) {
                mBaseDialog.dismissImmediately();
            }
        }

    }
}
