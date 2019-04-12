package com.lottchina.baselib.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.LinearLayout
import com.lottchina.baselib.R
import com.lottchina.baselib.utils.L
import com.vcaidian.baselib.utils.ToastUtil
import com.vcaidian.wclib.utils.ActivityManager
import com.vcaidian.wclib.utils.ActivityUtil
import com.vcaidian.wclib.widget.CustomToolBar
import com.vcaidian.wclib.widget.LoadingDialog

/**
 * Author: Austin
 * Date: 19-3-28
 * Description: Activity基类
 */
abstract class BaseActivity : AppCompatActivity() , CustomToolBar.OnClickLeftListener, CustomToolBar.OnClickRightListener {
    private val BASE_VIEW_ID: Int = R.layout.activity_base
    lateinit var mContext: Context
    lateinit var customToolBar: CustomToolBar
    var loadingDialog: LoadingDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        mContext = this
        if (isFullScreen())
            ActivityUtil.transparentStatusBar(window)
        super.onCreate(savedInstanceState)
        setContentView(initRootView())
        ActivityManager.instance.addActivity(this)
        loadingDialog = LoadingDialog(mContext)
        initView()
        initListener()
        initData()

    }

    /**
     * 初始化根部View 并添加自定义的ToolBar
     */
    private fun initRootView(): View {
        var baseView: LinearLayout = layoutInflater.inflate(BASE_VIEW_ID,null) as LinearLayout
        customToolBar = CustomToolBar(this)
        customToolBar.onClickLeftListener = this
        customToolBar.onClickRightListener = this
        baseView.addView(customToolBar)
        if (layoutId() != 0) {
            var subView: View = getLayoutInflater().inflate(layoutId(), null)
            var params: LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, 1.0f)
            subView.setLayoutParams(params)
            baseView.addView(subView)
        }
        return baseView
    }

    /**
     * 加载布局
     */
    abstract fun layoutId(): Int

    /**
     * 初始化 View
     */
    abstract fun initView()

    /**
     * 初始化数据
     */
    abstract fun initData()

    /**
     * 设置事件
     */
    abstract fun initListener()

    /**
     * 设置标题
     */
    fun setToolbarTitle(title: String) {

        customToolBar!!.setTitle(title)
    }

    /**
     * 设置标题
     */
    fun setToolbarTitle(title: Int) {
        customToolBar!!.setTitle(title)
    }

    /**
     * 是否显示标题栏
     */
    fun showToolbar(visibility: Int) {
        customToolBar!!.visibility = visibility
    }

    /**
     * Toolbar 左边ICON点击事件
     */
    override fun onClickLeft(view: View) {
        finish();
    }

    /**
     * Toolbar 右边ICON点击事件
     */
    override fun onClickRight(view: View) {
    }

    override fun onStart() {
        super.onStart()
        L.d("onStart")
    }

    override fun onResume() {
        super.onResume()
        L.d("onResume")
    }

    override fun onPause() {
        super.onPause()
        L.d("onPause")
    }

    override fun onStop() {
        super.onStop()
        L.d("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        L.d("")
        dismissDialog()
        ActivityManager.instance.removeActivity(this)
    }

    /**
     * 显示进度条
     */
    open fun showDialog() {
        if (loadingDialog != null && !loadingDialog?.isShowing!!)
            loadingDialog?.show()
    }

    /**
     * 取消进度条显示
     */
    open fun dismissDialog() {
        if (loadingDialog?.isShowing!!)
            loadingDialog?.dismiss()
    }

    /**
     * 显示短时间吐司
     */
    fun toast(msg : String) {
        ToastUtil.show(mContext,msg)
    }

    /**
     * 显示一个长时间的吐司
     */
    fun toastLong(msg : String) {
        ToastUtil.showLong(mContext,msg)
    }

    open fun isFullScreen(): Boolean {
        return false
    }

    fun addFragment(viewId: Int,fragment: Fragment) {
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(viewId,fragment)
        fragmentTransaction.commit()
    }


}