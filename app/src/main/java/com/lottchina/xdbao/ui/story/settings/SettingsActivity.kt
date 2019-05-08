package com.lottchina.xdbao.ui.story.settings

import android.util.Log
import android.widget.CompoundButton
import com.alibaba.android.arouter.facade.annotation.Route
import com.lottchina.baselib.base.BaseActivity
import com.lottchina.xdbao.R
import com.vcaidian.customer.utils.RouteUrl
import kotlinx.android.synthetic.main.activity_settings.*

/**
 * @Author: Austin
 * @Date: 19-5-8
 * @Description: 参数设置
 */
@Route(path = RouteUrl.settings)
class SettingsActivity : BaseActivity(),CompoundButton.OnCheckedChangeListener {


    override fun layoutId(): Int {
        return R.layout.activity_settings
    }

    override fun initView() {
        setToolbarTitle(getString(R.string.parameter_settings))
    }

    override fun initData() {
    }

    override fun initListener() {
        ask.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        Log.e("aa", "--" + isChecked )

    }
}
