package com.sxwz.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/*****************************************************
 * author:      wz
 * email:       wangzhong0116@foxmail.com
 * version:     1.0
 * date:        2017/1/10 14:20
 * description:
 *****************************************************/
public class FragmentAdapter extends FragmentPagerAdapter {

	private ArrayList<Fragment> list;
	FragmentManager fm;

	public FragmentAdapter(FragmentManager fm, ArrayList<Fragment> list) {
		super(fm);
		this.fm = fm;
		this.list = list;
	}

	@Override
	public Fragment getItem(int arg0) {
		return list.get(arg0);
	}

	@Override
	public int getCount() {
		return list.size();
	}



}
