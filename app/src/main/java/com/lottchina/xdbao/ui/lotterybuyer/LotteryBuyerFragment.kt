package com.lottchina.xdbao.ui.lotterybuyer

import com.lottchina.xdbao.R
import com.vcaidian.wclib.base.BaseFragment

/**
 * Author: Austin
 * Date: 19-5-6
 * Description:
 */
class LotteryBuyerFragment : BaseFragment() {

    companion object {
        // 单例模式： 双重校验锁式
        val instance: LotteryBuyerFragment by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            LotteryBuyerFragment()
        }
    }


    override fun layoutId(): Int {
        return R.layout.fragment_lottery_buyer
    }

    override fun initView() {
    }

    override fun initListener() {
    }

    override fun initData() {
    }

}