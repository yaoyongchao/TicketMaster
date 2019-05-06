package com.lottchina.xdbao.ui.ticket

import com.lottchina.xdbao.R
import com.vcaidian.wclib.base.BaseFragment

/**
 * Author: Austin
 * Date: 19-5-6
 * Description:
 */
class TicketsFragment : BaseFragment() {

    companion object {
        // 单例模式： 双重校验锁式
        val instance: TicketsFragment by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            TicketsFragment()
        }
    }

    override fun layoutId(): Int {
        return R.layout.fragment_tickets
    }

    override fun initView() {
    }

    override fun initListener() {
    }

    override fun initData() {
    }

}