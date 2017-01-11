package com.sxwz.myapplication.ui;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sxwz.myapplication.R;
import com.sxwz.myapplication.adapter.FragmentAdapter;
import com.sxwz.myapplication.fragment.BusinessFragment;
import com.sxwz.myapplication.fragment.ProductFragment;
import com.sxwz.myapplication.fragment.ReviewFragment;
import com.sxwz.qcodelib.base.ZActivity;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.OnClick;

/*****************************************************
 * author:      wz
 * email:       wangzhong0116@foxmail.com
 * version:     1.0
 * date:        2017/1/10
 * description:
 *****************************************************/
public class ProductByActivity extends ZActivity implements ViewPager.OnPageChangeListener {


    @Bind(R.id.tab1_tv)
    TextView tab1Tv;
    @Bind(R.id.tab2_tv)
    TextView tab2Tv;
    @Bind(R.id.tab3_tv)
    TextView tab3Tv;
    @Bind(R.id.cursor)
    View cursor;
    @Bind(R.id.third_vp)
    ViewPager thirdVp;

    // fragment对象集合
    private ArrayList<Fragment> fragmentsList;
    // 记录当前选中的tab的index
//    private int currentIndex = 0;
    // 指示器的偏移量
    private int offset = 0;
    // 左margin
//    private int leftMargin = 0;
    // 屏幕宽度
    private int screenWidth = 0;
    // 屏幕宽度的三分之一
    private int screen1_3;
    //
    private LinearLayout.LayoutParams lp;

    @Override
    protected int getLayoutId() {
        isSideBack=false;
        return R.layout.product_by_view;
    }


    @Override
    protected void initView() {
        super.initView();
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        screenWidth = dm.widthPixels;
        screen1_3 = screenWidth / 3;

        lp = (LinearLayout.LayoutParams) cursor.getLayoutParams();
//        leftMargin = lp.leftMargin;

    }

    @Override
    protected void initData() {
        super.initData();

        fragmentsList = new ArrayList<>();
        Fragment fragment = new ProductFragment();
        fragmentsList.add(fragment);
        fragment = new ReviewFragment();
        fragmentsList.add(fragment);
        fragment = new BusinessFragment();
        fragmentsList.add(fragment);


        thirdVp.setAdapter(new FragmentAdapter(getSupportFragmentManager(),
                fragmentsList));
        thirdVp.setCurrentItem(0);
        thirdVp.setOffscreenPageLimit(2);
        thirdVp.setOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        offset = (screen1_3 - cursor.getLayoutParams().width) / 2;
        Log.d("111", position + "--" + positionOffset + "--"
                + positionOffsetPixels);
        final float scale = getResources().getDisplayMetrics().density;
        if (position == 0) {// 0<->1
            lp.leftMargin = (int) (positionOffsetPixels / 3) + offset;
        } else if (position == 1) {// 1<->2
            lp.leftMargin = (int) (positionOffsetPixels / 3) + screen1_3 +offset;
        }
        cursor.setLayoutParams(lp);
//        currentIndex = position;
        upTextcolor(position);
    }

    private void upTextcolor(int position){
        if (position==0){
            tab1Tv.setTextColor(getResources().getColor(R.color.title_bag));
            tab2Tv.setTextColor(getResources().getColor(R.color.text_color_context));
            tab3Tv.setTextColor(getResources().getColor(R.color.text_color_context));
        }else if(position==1){
            tab1Tv.setTextColor(getResources().getColor(R.color.text_color_context));
            tab2Tv.setTextColor(getResources().getColor(R.color.title_bag));
            tab3Tv.setTextColor(getResources().getColor(R.color.text_color_context));
        }else if(position==2){
            tab1Tv.setTextColor(getResources().getColor(R.color.text_color_context));
            tab2Tv.setTextColor(getResources().getColor(R.color.text_color_context));
            tab3Tv.setTextColor(getResources().getColor(R.color.title_bag));
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    @OnClick({R.id.tab1_tv, R.id.tab2_tv, R.id.tab3_tv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tab1_tv:
                thirdVp.setCurrentItem(0);
                break;
            case R.id.tab2_tv:
                thirdVp.setCurrentItem(1);
                break;
            case R.id.tab3_tv:
                thirdVp.setCurrentItem(2);
                break;
        }
    }
}
