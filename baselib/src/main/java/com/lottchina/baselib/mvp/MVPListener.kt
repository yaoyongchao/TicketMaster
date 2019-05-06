package com.vcaidian.wclib.mvp

import com.vcaidian.wclib.wc.ErrBean

/**
 * Author: Austin
 * Time: 2018/7/18
 * Description: Model层数据处理后的回调接口。
 */
interface MVPListener<T> {
    fun onSuccess(data: T)

    fun onError(error: String)

    fun onErrorBean(errorBean: ErrBean){}
}
