package com.lottchina.baselib

import android.app.Application
import android.util.Log

/**
 * Author: Austin
 * Date: 19-3-27
 * Description: Application基础类
 */

open class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        // 单例模式： 双重校验锁式
        val instance: Application by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            BaseApplication()
        }
    }

}