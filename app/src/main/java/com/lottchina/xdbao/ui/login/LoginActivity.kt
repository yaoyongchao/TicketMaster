package com.lottchina.xdbao.ui.login

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.lottchina.baselib.base.BaseActivity
import com.lottchina.xdbao.R
import com.vcaidian.customer.utils.RouteUrl

/**
 * @Author: Austin
 * @Date: 19-3-29
 * @Description: 登录页
 */
@Route(path = RouteUrl.login)
class LoginActivity : BaseActivity() {


    override fun layoutId(): Int {
        return R.layout.activity_login
    }

    override fun initView() {
        showToolbar(View.GONE)
    }

    override fun initData() {
    }

    override fun initListener() {
    }

    override fun isFullScreen(): Boolean {
        return true
    }


}
