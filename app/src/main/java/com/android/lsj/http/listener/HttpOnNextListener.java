package com.android.lsj.http.listener;

import com.android.lsj.http.exception.ApiException;

public interface  HttpOnNextListener {
    /**
     * 成功后回调方法
     * @param resulte
     * @param mothead
     */
   void onNext(String resulte, String mothead);

    /**
     * 失败
     * 失败或者错误方法
     * 自定义异常处理
     * @param e
     */
    void onError(ApiException e);
}
