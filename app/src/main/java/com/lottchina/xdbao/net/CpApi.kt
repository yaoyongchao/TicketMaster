package com.lottchina.xdbao.net

import com.lottchina.xdbao.BuildConfig

/**
 * Author: Austin
 * Date: 19-3-28
 * Description:
 */
object CpApi {
    val CP_RUL = BuildConfig.HTTP_API  + ":5000/api/"
    val CP_FILE_URL = CP_RUL + "file/"
}