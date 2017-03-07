package com.android.lsj;

/**
 * Created by dianjoy on 2017/3/7.
 */

public abstract class BasePresenter<T> {
 public T mView;

    public void attach(T mView){
        this.mView=mView;
    }

    public void dettach(){
        mView=null;
    }
}
