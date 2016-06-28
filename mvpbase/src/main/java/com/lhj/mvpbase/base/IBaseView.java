package com.lhj.mvpbase.base;

/**
 * Created by jingyou on 2016/6/27.
 */
public interface IBaseView<T> {
    /**
     * 显示提示消息
     *
     * @param msg
     */
    void toast(String msg);

    /**
     * 显示进度
     *
     * @param progress
     */
    void showProgress(int progress);

    /**
     * 隐藏进度
     */
    void hideProgress();

    /**
     * 请求成功
     * @param data
     */
    void loadDataSuccess(T data);

    /**
     * 请求错误
     * @param throwable
     */
    void loadDataError(Throwable throwable);

    /**
     * 开始加载
     */
    void startLoading();
}
