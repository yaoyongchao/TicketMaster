package com.lottchina.xdbao.ui.login

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.lottchina.baselib.base.BaseActivity
import com.lottchina.baselib.utils.L
import com.lottchina.cplib.data.bean.BindingStationBean
import com.lottchina.xdbao.R
import com.lottchina.xdbao.ui.dialog.TermialsDialogFragment
import com.vcaidian.customer.utils.RouteUrl
import com.vcaidian.wclib.utils.ActivityManager
import kotlinx.android.synthetic.main.activity_login.*



/**
 * @Author: Austin
 * @Date: 19-3-29
 * @Description: 登录页
 */
@Route(path = RouteUrl.login)
class LoginActivity : BaseActivity() {

    @Autowired(name = "bean")
    lateinit var bean: BindingStationBean

    override fun layoutId(): Int {
        return R.layout.activity_login
    }

    override fun initView() {
        showToolbar(View.GONE)
        ARouter.getInstance().inject(this)
        L.d("传递过来的bean：" + bean)

        tv_shop_name.text = bean?.nickname
        tv_owner_name.text = bean?.name
    }

    override fun initData() {
    }

    override fun initListener() {
        btn.setOnClickListener {

            /*CommomDialog(mContext, com.lottchina.xdbao.R.style.dialog,"您确定删除此信息？", CommomDialog.OnCloseListener { dialog, confirm ->
                Log.e("aa","11111111")

            }).setTitle("提示").show()*/

            TermialsDialogFragment().show(supportFragmentManager,"dialog")
        }
    }

    override fun isFullScreen(): Boolean {
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        ActivityManager.instance.AppExit()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
