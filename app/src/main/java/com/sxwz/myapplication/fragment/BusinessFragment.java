package com.sxwz.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sxwz.myapplication.R;

import static com.sxwz.myapplication.R.id.activity_main;
import static com.sxwz.myapplication.R.id.textView;

/*****************************************************
 * author:      wz
 * email:       wangzhong0116@foxmail.com
 * version:     1.0
 * date:        2017/1/10 11:57
 * description:
 *****************************************************/

public class BusinessFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.business_view, null);
        initView(view);
        return view;
    }


    private void initView(View view) {
    }
}
