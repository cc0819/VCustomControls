package com.cheng.cc.customcontrols.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;

import com.cheng.cc.customcontrols.R;

/**
 * @author Created by cc on 17/6/4.
 * @fileName DeleteContent_Edit
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class DeleteContent_Edit extends EditText {

    private Context mContext;
    private Drawable deleteImg;



    public DeleteContent_Edit(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init(attrs);
    }

    public DeleteContent_Edit(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init(attrs);
    }


    private void init(AttributeSet attrs) {
        TypedArray typedArray = mContext.obtainStyledAttributes(attrs, R.styleable.DeleteContent_Edit);
        deleteImg = typedArray.getDrawable(R.styleable.DeleteContent_Edit_deleteImg);
        typedArray.recycle();
        if (deleteImg != null){
            addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    setDeleteImg();
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }

    }

    private void setDeleteImg() {
        if (length()< 1){
            setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
        }else {
            setCompoundDrawablesWithIntrinsicBounds(null,null,deleteImg,null);
        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (deleteImg != null && event.getAction() == MotionEvent.ACTION_UP){
            getText().clear();
        }
        return super.onTouchEvent(event);
    }
}
