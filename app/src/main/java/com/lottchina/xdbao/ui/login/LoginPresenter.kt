package com.lottchina.xdbao.ui.login

import com.lottchina.baselib.utils.L
import com.lottchina.cplib.data.bean.BindingStationBean
import com.lottchina.cplib.data.body.login.LoginReqBody
import com.vcaidian.wclib.mvp.MVPListener

/**
 * Author: Austin
 * Date: 19-4-10
 * Description:
 */
class LoginPresenter : LoginContract.LoginPresenter<LoginModel>() {
    override fun login(code: String,password: String,stationId: Int) {
        var body = LoginReqBody()
        body.code = code
        body.login_pass = password
        body.station_id = stationId
        mModel?.login(body,object : MVPListener<BindingStationBean>{
            override fun onSuccess(data: BindingStationBean) {
                L.i("BindingPresenter--数据请求成功:$data")
                obtainView()?.loginSuccess(data)
            }

            override fun onError(error: String) {
                obtainView()?.loadFailure(error)
            }
        })

    }

}