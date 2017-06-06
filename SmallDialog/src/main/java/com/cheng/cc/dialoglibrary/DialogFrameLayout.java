package com.cheng.cc.dialoglibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * @author Created by cc on 17/6/5.
 * @fileName DialogFrameLayout
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class DialogFrameLayout extends FrameLayout {


    public DialogFrameLayout(Context context) {
        super(context);
    }

    public DialogFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DialogFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }
}
