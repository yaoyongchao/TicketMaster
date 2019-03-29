package com.lottchina.xdbao.demo

import com.lottchina.baselib.base.BaseActivity
import com.lottchina.xdbao.R

class TwoActivity : BaseActivity() {
    override fun layoutId(): Int {
        return R.layout.activity_two
    }

    override fun initView() {
        addFragment(R.id.llyt_common,TwoFragment())
        showDialog()

    }

    override fun initData() {
    }

    override fun initListener() {
    }


    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
    }*/
}
