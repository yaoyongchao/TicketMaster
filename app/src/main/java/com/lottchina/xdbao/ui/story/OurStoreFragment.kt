package com.lottchina.xdbao.ui.story

import com.lottchina.xdbao.R
import com.vcaidian.wclib.base.BaseFragment

/**
 * Author: Austin
 * Date: 19-5-6
 * Description:
 */
class OurStoreFragment : BaseFragment() {

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
    }

    override fun initListener() {
    }

    override fun initData() {
    }

}