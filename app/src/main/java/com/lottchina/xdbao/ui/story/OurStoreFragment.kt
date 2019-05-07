package com.lottchina.xdbao.ui.story

import android.view.View
import com.lottchina.baselib.utils.ImgUtilPc
import com.lottchina.cplib.data.bean.BindingStationBean
import com.lottchina.xdbao.R
import com.lottchina.xdbao.net.CpApi
import com.lottchina.xdbao.utils.CommonUtil
import com.vcaidian.wclib.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_our_store.view.*

/**
 * Author: Austin
 * Date: 19-5-6
 * Description:
 */
class OurStoreFragment : BaseFragment(),View.OnClickListener {
    private lateinit var station: BindingStationBean


    companion object {
        // 单例模式： 双重校验锁式
        val instance: OurStoreFragment by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            OurStoreFragment()
        }
    }

    override fun layoutId(): Int {
        return R.layout.fragment_our_store
    }

    override fun initView() {
        station = CommonUtil.getStation()
        rootView.tv_store_name.setText(station?.nickname)
//        rootView.tv_name.setText(station?.name)
        rootView.tv_phone.setText(station?.name + "  " + station?.tel_phone)

        ImgUtilPc.loadImgFace(mContext, CpApi.CP_FILE_URL+station?.face_pic_id,rootView.img_store_logo)
    }

    override fun initListener() {
        rootView.llyt_store_info.setOnClickListener(this)
        rootView.cv_parameter_settings.setOnClickListener(this)
        rootView.cv_product_information.setOnClickListener(this)
        rootView.cv_promotion.setOnClickListener(this)
        rootView.tv_sign_out.setOnClickListener(this)
    }

    override fun initData() {
    }

    override fun onClick(v: View?) {
        when(v?.id) {
//            R.id.llyt_store_info ->
        }

    }
}