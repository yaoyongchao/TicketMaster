package com.lottchina.xdbao.ui.dialog

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
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
        return view;
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        return super.onCreateDialog(savedInstanceState)
    }
}