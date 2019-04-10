package com.lottchina.xdbao.ui.login

import com.lottchina.cplib.data.body.login.BindingRespBody
import com.vcaidian.wclib.mvp.MVPListener

/**
 * Author: Austin
 * Date: 19-4-1
 * Description:
 */
class BindingModel: BindingContract.BindingModel() {
    override fun bindingShop(username: String, listener: MVPListener<BindingRespBody>) {

    }
    /*fun getData(cmd: String, userId: Long, token: String, digestType: String, body: BaseRequestBody, listener: MVPListener<String>) {
//        var body: UserDetailsRequestBody = UserDetailsRequestBody()
        var gsonBody = Gson().toJson(body)
        //时间戳
        var strTimeStamp = TimeUtils.timeStamp
        L.e("pwd: $token")
        L.e("body: $gsonBody")
        var digest = MD5Util.md5((token + gsonBody + strTimeStamp).toByteArray(charset("UTF-8")))

        var head = RequestHead()
        head.cmd = cmd
        head.digest = digest
        head.digestType = digestType
        head.userId = if (userId == 0L){""}else{userId.toString()}
        head.timeStamp = strTimeStamp
        head.userType = "customer"

        var requestBean = BaseRequestBean(head, gsonBody)

        var gsonHead = Gson().toJson(head)

        L.e("head: $gsonHead \nbody: $gsonBody")

//        ServiceFactory.getService(BaseApi.BASE_RUL)
        ServiceFactory.getService(WcApiService::class.java)
                .userDetailss(gsonHead,gsonBody)
                .compose(MyRxScheduler.ioMain())
                *//*.map {
                    var jsonObject: JSONObject = JSONObject(it.body)
                    var body = Gson().fromJson(it.body, BaseResponseBody::class.java)
                    body
                }*//*.subscribe(
                {
                    L.i("mvp--onNext: $it")
                    var jsonObject  = JSONObject(it.body)
                    var errBean: ErrBean = Gson().fromJson(jsonObject.getJSONObject("err").toString(),ErrBean::class.java)
                    L.i("mvp--err: $errBean")
                    if (ResponseCode.SUCCESS == errBean.code) {//请求成功
                        listener.onSuccess(it.body!!)
                    } else {//请求失败
                        listener.onError(errBean.des!!)
                    }

                },{
            L.i("mvp--Throwable: $it")
            it.toString()
            listener.onError(it.toString())

        },{
            L.i("mvp--complete")
        }
        )

    }*/


}