package com.android.lsj.my;

import com.android.lsj.BaseView;

import java.util.List;

/**
 * Created by dianjoy on 2017/3/7.
 */

public interface MyView extends BaseView{
    void  getNewsList(List<String> data);
    void  showMessage(String message);
}
