package com.sxwz.myapplication;


import com.sxwz.qcodelib.base.ZActivity;
import com.sxwz.qcodelib.widget.ProgressDialog;


/*****************************************************
 * author:      wz
 * email:       wangzhong0116@foxmail.com
 * version:     1.0
 * date:        2017/1/10
 * description:
 *****************************************************/
public class MainActivity extends ZActivity {

    private ProgressDialog progressDialog;

    @Override
    protected int getLayoutId() {
        return R.layout.review_view;
    }

    @Override
    protected void initData() {
        super.initData();
        progressDialog = ProgressDialog.createDialog(this);
        progressDialog.setMessage("====");
        progressDialog.show();
    }
}
