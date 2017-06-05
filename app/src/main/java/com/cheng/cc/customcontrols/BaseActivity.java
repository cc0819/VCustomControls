package com.cheng.cc.customcontrols;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 *Activity基类
 */
public abstract class BaseActivity extends FragmentActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        initView (savedInstanceState);
        initInstall();
        initData();
        evenControl();

    }

    /**
     * 初始化布局
     */
    abstract public void initView(Bundle savedInstanceState);


    /***
     * 初始化设置
     */
    abstract public void initInstall();


    /***
     * 初始化数据
     */
    abstract public void initData();


    /***
     * 事件控制
     */
    abstract public void evenControl();



}
