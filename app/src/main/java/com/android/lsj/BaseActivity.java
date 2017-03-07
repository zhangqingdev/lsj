package com.android.lsj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dianjoy on 2017/3/7.
 */

public abstract class BaseActivity<V,T extends  BasePresenter<V>> extends AppCompatActivity {

    public T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attach((V)this);
    }

    @Override
    protected void onDestroy() {
        presenter.dettach();
        super.onDestroy();
    }

    public abstract T initPresenter();
}
