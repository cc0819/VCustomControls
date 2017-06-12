package com.cheng.cc.customcontrols.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.cheng.cc.customcontrols.BaseAdapter;
import com.cheng.cc.customcontrols.BaseViewHolder;

/**
 * @author Created by cc on 17/6/12.
 * @fileName FilterAdapter
 * @githublink https://github.com/cc0819
 * @csdnlink http://blog.csdn.net/qq_25404567
 */

public class FilterAdapter extends BaseAdapter {

    private Context mContext;

    public FilterAdapter(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public void onBindItemHolder(BaseViewHolder holder, int position) {

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }
}
