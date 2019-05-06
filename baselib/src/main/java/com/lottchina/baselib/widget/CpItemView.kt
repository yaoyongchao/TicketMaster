package com.lottchina.baselib.widget

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.layout_cp_item_view.view.*
import android.view.ViewGroup
import com.lottchina.baselib.R


/**
 * Author: Austin
 * Date: 19-5-6
 * Description:
 */
class CpItemView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {
    private val isLog = true
    private val imgLeft: ImageView? = null
    private val IMG_LEFT_ID = 0x1000
    private val imgLeftSize = 40
    private lateinit var view: View
    private lateinit var attributes: TypedArray

    init {
        initViews(context, attrs)
    }

    private fun initViews(context: Context, attrs: AttributeSet?) {
        log("initViews")

        val mInflater = LayoutInflater.from(context)
        view = mInflater.inflate(R.layout.layout_cp_item_view, null)
        addView(view)

        attributes = context.obtainStyledAttributes(attrs, R.styleable.CpItemView)
        if (attributes != null) {
            initLeftImg()
            initTv()
            initBorder()
            attributes.recycle()
        }
    }

    private fun initLeftImg1(attributes: TypedArray) {

    }


    private fun initLeftImg() {
        val leftDrawable = attributes.getResourceId(R.styleable.CpItemView_left_img_drawable, -1)
        if (leftDrawable == -1) {
            view.img_left.visibility = View.GONE
        } else {
            view.img_left.setImageResource(leftDrawable)
        }
    }

    private fun initTv() {
        val text = attributes.getString(R.styleable.CpItemView_cp_text)
        val textTips = attributes.getString(R.styleable.CpItemView_cp_text_tips)
        view.tv.setText(text)
        view.tv_tips.setText(textTips)

    }

    private fun initBorder() {
        val showTop = attributes.getBoolean(R.styleable.CpItemView_show_border_top,false)
        val showBottom = attributes.getBoolean(R.styleable.CpItemView_show_border_bottom,true)
        view.border_top.visibility = if (showTop) View.VISIBLE else View.GONE
        view.border_bottom.visibility = if (showBottom) View.VISIBLE else View.GONE
        val imgLeftDrawable = attributes.getResourceId(R.styleable.SettingItemView_imgleft_drawable, -1)

        val showViewTop = attributes.getBoolean(R.styleable.CpItemView_show_view_top, false)
        view.view_top.visibility = if (showViewTop) View.VISIBLE else View.GONE

//        layoutParams = setViewMargin(this,0,0,20,0)


    }

    /*
     * converts dip to px
     */
    private fun dip2Px(dip: Float): Int {
        return (dip * context.resources.displayMetrics.density + 0.5f).toInt()
    }

    private fun log(str: String) {
        if (isLog)
            Log.i(TAG, str)
    }

    companion object {
        private val TAG = "CpItemView"
    }
}
