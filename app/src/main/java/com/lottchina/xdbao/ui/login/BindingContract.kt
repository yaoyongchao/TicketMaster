package com.lottchina.xdbao.ui.login

import com.lottchina.baselib.mvp.BaseView
import com.vcaidian.baselib.mvp.BaseModel
import com.vcaidian.wclib.mvp.BasePresenter

/**
 * Author: Austin
 * Date: 19-3-29
 * Description:
 */
interface BindingContract {
    interface BindingView: BaseView {
        fun bindingSuccess(str: String)
    }

    abstract class BindingPresenter<M: BaseModel>: BasePresenter<BindingView,M>() {

    }

    abstract class BindingModel: BaseModel {
//        abstract fun bindingShop(username: String,listener: MVPListener<>)
    }
}