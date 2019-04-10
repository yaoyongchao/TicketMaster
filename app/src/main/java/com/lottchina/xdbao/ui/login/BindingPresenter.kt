package com.lottchina.xdbao.ui.login

import com.lottchina.cplib.data.body.login.BindingRespBody
import com.vcaidian.wclib.mvp.MVPListener

/**
 * Author: Austin
 * Date: 19-4-10
 * Description:
 */
class BindingPresenter : BindingContract.BindingPresenter<BindingModel>() {
    override fun bindingShop(phoneNumber: String) {
        mModel?.bindingShop(phoneNumber,object : MVPListener<BindingRespBody>{
            override fun onSuccess(data: BindingRespBody) {
                obtainView()?.bindingSuccess("11")
            }

            override fun onError(error: String) {
                obtainView()?.bindingSuccess(error)
            }
        })

    }

}