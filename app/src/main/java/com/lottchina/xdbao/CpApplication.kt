package com.lottchina.xdbao

import android.util.Log
import com.lottchina.baselib.BaseApplication
import com.lottchina.baselib.utils.L

/**
 * Author: Austin
 * Date: 19-3-27
 * Description: 需要继承基础依赖包的 BaseApplication.
 */
class CpApplication: BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        L.initLogger(BuildConfig.isDebug)
        L.d("启动Application")
    }
}