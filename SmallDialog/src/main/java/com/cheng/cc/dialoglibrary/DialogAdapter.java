package com.cheng.cc.dialoglibrary;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by cc on 17/6/5.
 * @fileName DialogAdapter
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class DialogAdapter extends BaseAdapter<String> implements AdapterView.OnItemClickListener{

    private onItemClickListener mListener;
    private int mTextColor;
    private int mTextSize;
    private Map<Integer, Integer> mColorMap;
    private Map<Integer, Integer> mSizeMap;


    public DialogAdapter(Context context) {
        super(context);
    }

    public void setOnItemClickListener(onItemClickListener listener) {
        mListener = listener;
    }


    @Override
    public int getLayoutId() {
        return R.layout.item_basedialog;
    }

    @Override
    public void onBindItemHolder(BaseViewHolder holder, final int position) {
        TextView contentTV = holder.getView(R.id.dialog_item_tv);
        if (mTextColor != 0) {
            contentTV.setTextColor(mTextColor);
        }
        if (mColorMap != null && mColorMap.get(position) != null) {
            contentTV.setTextColor(mColorMap.get(position));
        }
        if (mTextSize != 0) {
            contentTV.setTextSize(mTextSize);
        }
        if (mSizeMap != null && mSizeMap.get(position) != null) {
            contentTV.setTextSize(mSizeMap.get(position));
        }
        if (position == getItemCount() - 1){
            contentTV.setBackgroundResource(R.drawable.bgdialog_item_bottom);
        } else {
            contentTV.setBackgroundResource(R.drawable.bgdialog_item);
        }
        String text = mList.get(position);
        contentTV.setText(TextUtils.isEmpty(text) ? "" : text);
//        contentTV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mListener != null) {
//                    mListener.onItemClick(position);
//                }
//            }
//        });
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if (mListener != null) {
            mListener.onItemClick(position);
        }
    }


    public interface onItemClickListener {
        void onItemClick(int position);
    }

    public int getmTextSize() {
        return mTextSize;
    }

    public void setmTextSize(int mTextSize) {
        this.mTextSize = mTextSize;
        notifyDataSetChanged();
    }

    public void setmTextSize(int position,int mTextSize) {
        if (mSizeMap == null) {
            mSizeMap = new HashMap<>();
        }
        mSizeMap.put(position, mTextSize);
        notifyDataSetChanged();
    }


    public int getmTextColor() {
        return mTextColor;
    }

    public void setmTextColor(int mTextColor) {
        this.mTextColor = mTextColor;
        notifyDataSetChanged();
    }

    public void setmTextColor(int position,int mTextColor) {
        if (mColorMap == null) {
            mColorMap = new HashMap<>();
        }
        mColorMap.put(position, mTextColor);
        notifyDataSetChanged();
    }


}
