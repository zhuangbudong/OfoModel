package com.zhuangbudong.ofo.presenter;

import android.content.Context;

import com.lawrence.core.lib.core.mvp.BaseFragmentPresenter;
import com.lawrence.core.lib.core.mvp.IBaseFragmentView;
import com.lawrence.core.lib.core.mvp.IBaseView;
import com.lawrence.core.lib.core.mvp.BasePresenter;
import com.zhuangbudong.ofo.application.OfoApplication;
import com.zhuangbudong.ofo.model.UserRepository;
import com.zhuangbudong.ofo.net.ApiService;
import com.zhuangbudong.ofo.net.RetrofitNetApi;

/**
 * Created by wangxu on 17/2/9.
 */

class OfoBasePresenter<T extends IBaseView> extends BasePresenter<T> {

    public ApiService apiService;
    public UserRepository userRepository;


    public OfoBasePresenter(T iView, Context context) {
        super(iView, context);
        apiService = RetrofitNetApi.getApiServiceInstance();
        userRepository = OfoApplication.getInstance().getUserRepository();
    }
}
