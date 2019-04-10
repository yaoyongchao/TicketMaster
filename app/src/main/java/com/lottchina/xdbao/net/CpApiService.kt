package com.lottchina.xdbao.net

import com.vcaidian.wclib.wc.BaseResponseBean
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Author: Austin
 * Date: 19-4-1
 * Description:
 */
interface CpApiService{
    @FormUrlEncoded
    @POST("service")
    abstract fun userDetailss(@Field("head") head: String, @Field("body") body: String): Observable<BaseResponseBean>

}