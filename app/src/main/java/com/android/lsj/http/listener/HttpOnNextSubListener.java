package com.android.lsj.http.listener;

import rx.Observable;

public interface HttpOnNextSubListener {

    void onNext(Observable observable);
}
