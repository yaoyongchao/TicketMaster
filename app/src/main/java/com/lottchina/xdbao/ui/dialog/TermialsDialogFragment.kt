package com.lottchina.xdbao.ui.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.*
import com.lottchina.xdbao.R
import kotlinx.android.synthetic.main.dialog_fragment_terminals.view.*

/**
 * Author: Austin
 * Date: 19-4-22
 * Description: 终端账号选择框
 */
class TermialsDialogFragment: DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)//去除Title布局
        dialog.setCancelable(false)//取消
        dialog.setCanceledOnTouchOutside(false)//点击外部不消失
        dialog.window.setBackgroundDrawableResource(R.drawable.bg_round_white)

        var view = inflater.inflate(R.layout.dialog_fragment_terminals, container, false)
        view.tv_title.text = "选择登录账号"

        initViews()

        return view;
    }

    override fun onStart() {
        super.onStart()
        //获取手机屏幕的长和宽
        Log.e("aa","aaa" + context)
        val wm = context?.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val width = wm.defaultDisplay.width
        val height = wm.defaultDisplay.height
        //这个设置宽高的必须放在onstart方法里，不能放oncreateview里面
        var dialogWindow = dialog.window
        var lp = dialogWindow.attributes
        dialogWindow.setGravity(Gravity.CENTER)//布局文件居中
        //dialogWindow.setLayout(lp.MATCH_PARENT, lp.WRAP_CONTENT);// 为了让对话框宽度铺满
        //alpha在0.0f到1.0f之间。1.0完全不透明，0.0f完全透明，自身不可见。
        //设置弹窗的宽度，

        lp.width = width - resources.getDimensionPixelSize(R.dimen.dialog_margin)
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT
//        lp.alpha = 0.5f
        dialogWindow.attributes = lp


    }


    private fun initViews() {
        view?.rv?.layoutManager = LinearLayoutManager(context)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        return super.onCreateDialog(savedInstanceState)
    }

    inner class TerminalsDialogAdapter
}