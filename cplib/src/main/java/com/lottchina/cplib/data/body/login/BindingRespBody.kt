package com.lottchina.cplib.data.body.login

import com.vcaidian.wclib.wc.BaseResponseBody

/**
 * Author: Austin
 * Date: 19-4-1
 * Description:绑定店铺请求体
 */

class BindingRespBody(val showTerminal: Boolean = true,
                      val username: String = ""): BaseResponseBody() {



}