package com.ut.meipai.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.ut.meipai.R;
import com.ut.meipai.base.BaseFragment;

/**
 * Created by LZM on 2017/5/2.
 * Function:
 * Desc:
 */

public class VideoHotFragment extends BaseFragment {

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_video_common;
    }

    public void getHeader(){
        View view = LayoutInflater.from(mContext).inflate(R.layout.header_fragment_video_hot, null);
    }
}