package com.lottchina.xdbao.ui.login

import com.lottchina.cplib.data.body.login.BindingRequBody
import com.vcaidian.wclib.mvp.MVPListener

/**
 * Author: Austin
 * Date: 19-4-10
 * Description:
 */
class BindingPresenter : BindingContract.BindingPresenter<BindingModel>() {
    override fun bindingShop(phoneNumber: String) {
        var body = BindingRequBody();
        body.username = phoneNumber;
        mModel?.bindingShop(phoneNumber,body,object : MVPListener<String>{
            override fun onSuccess(data: String) {
                obtainView()?.bindingSuccess("11")
            }

            override fun onError(error: String) {
                obtainView()?.bindingSuccess(error)
            }
        })

    }

}