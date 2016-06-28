package com.lhj.mvpbase.base;

import rx.Observer;

/**
 * Created by jingyou on 2016/6/27.
 */
public class BasePresenter <T extends IBaseView,V> implements IBasePresenter, Observer<V> {

    public IBaseView iView;

    /**
     * 构造方法
     *
     * @param view 具体业务的接口对象
     */
    public BasePresenter(T view) {
        this.iView = view;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }


    @Override
    public void onCompleted() {
        iView.hideProgress();
    }

    @Override
    public void onError(Throwable e) {
        iView.loadDataError(e);
        iView.hideProgress();
    }

    @Override
    public void onNext(V t) {
        iView.loadDataSuccess(t);
    }
}
