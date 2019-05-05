package com.lottchina.xdbao.ui.login

import com.lottchina.baselib.mvp.BaseView
import com.lottchina.cplib.data.base.BaseRequestBody
import com.lottchina.cplib.data.bean.BindingStationBean
import com.vcaidian.baselib.mvp.BaseModel
import com.vcaidian.wclib.mvp.BasePresenter
import com.vcaidian.wclib.mvp.MVPListener

/**
 * Author: Austin
 * Date: 19-3-29
 * Description:
 */
interface LoginContract {
    interface LoginView: BaseView {
        fun loginSuccess(station: BindingStationBean)
    }

    abstract class LoginPresenter<M: BaseModel>: BasePresenter<LoginContract.LoginView,M>() {
        abstract fun login(code: String,password: String,stationId: Int)

    }

    abstract class LoginModel: BaseModel {
        abstract fun login( body: BaseRequestBody, listener: MVPListener<BindingStationBean>)
    }
}