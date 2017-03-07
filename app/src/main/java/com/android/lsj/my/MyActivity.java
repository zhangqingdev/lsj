package com.android.lsj.my;

import android.os.Bundle;

import com.android.lsj.BaseActivity;

import java.util.List;

/**
 * Created by dianjoy on 2017/3/7.
 */

public class MyActivity extends BaseActivity<MyView,MyPresenter> implements MyView {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mvp);
//        mvpListView = (ListView)findViewById(R.id.mvp_listview);
//        mvpListView.setOnItemClickListener(this);
//        pb = (ProgressBar) findViewById(R.id.mvp_loading);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public MyPresenter initPresenter() {
        return new MyPresenter();
    }

    @Override
    public void getNewsList(List<String> data) {

    }

    @Override
    public void showMessage(String message) {
        //Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {
       // pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        //pb.setVisibility(View.GONE);
    }
}
