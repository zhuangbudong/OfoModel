package com.zhuangbudong.ofo.activity.inter;

import com.lawrence.core.lib.core.mvp.IBaseView;

/**
 * Created by wangxu on 17/2/9.
 */
public interface ISignInActivity extends IBaseView {
    void showLoading();

    void dismissLoading();

    void startIntent();
}
