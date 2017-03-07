package com.android.lsj;

/**
 * Created by dianjoy on 2017/3/7.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
    void showLoading();
    void hideLoading();
}
