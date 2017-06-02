package com.cheng.cc.customcontrols.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author Created by cc on 17/6/2.
 * @fileName LightningTextView
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class LightningTextView extends TextView {

    private int mViewWidth;
    private int mTranslate;
    private Paint mPaint;
    private LinearGradient mLinearGradient;
    private Matrix mGradientMatrix;


    public LightningTextView(Context context) {
        super(context);
    }

    public LightningTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LightningTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mViewWidth == 0){
            mViewWidth = getMeasuredWidth();
            if (mViewWidth > 0){
                mPaint = getPaint();
                mLinearGradient = new LinearGradient(0,0,mViewWidth,0,
                        new int[]{Color.BLUE,Color.YELLOW,Color.RED},
                        null, Shader.TileMode.CLAMP);//设置线性渲染的颜色
                // CLAMP表示重复最后一种颜色直到该View结束的地方
                // REPEAT表示着色器在水平或者垂直方向上对控件进行重复着色
                // MIRROR模式会在水平方向或者垂直方向上以镜像的方式进行渲染
                mPaint.setShader(mLinearGradient);
                mGradientMatrix = new Matrix();

            }

        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mGradientMatrix != null){
            mTranslate += mViewWidth / 5 ;//已控件宽度的五分之一移动渲染的矩阵达到闪动效果
            if (mTranslate > 2*mViewWidth){
                mTranslate = -mViewWidth;
            }
            mGradientMatrix.setTranslate(mTranslate,0);
            mLinearGradient.setLocalMatrix(mGradientMatrix);
            postInvalidateDelayed(80);

        }
    }




}
