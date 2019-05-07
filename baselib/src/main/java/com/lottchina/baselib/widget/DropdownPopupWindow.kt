package com.lottchina.baselib.widget

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.lottchina.baselib.R
import com.lottchina.baselib.adapter.BaseAdapter
import com.lottchina.cplib.data.bean.Terminal
import kotlinx.android.synthetic.main.item_drop_down.view.*

class DropdownPopupWindow @JvmOverloads constructor(private val mContext: Context, attrs: AttributeSet?, defStyleAttr: Int = 0) : LinearLayout(mContext, attrs, defStyleAttr) {
    private lateinit var rv: RecyclerView
    private var list: ArrayList<ArrayList<String>> = ArrayList<ArrayList<String>>()
    private lateinit var adapter: BaseAdapter<List<String>>

//    constructor(list: List<List<String>>, context: Context) : this(context, null) {
//        this.list = list
//    }

    init {
        initViews()
    }

    private fun initViews() {
        rv = RecyclerView(mContext)
        orientation = LinearLayout.VERTICAL
        addView(rv)
        val layoutManager = LinearLayoutManager(mContext)
        //设置布局管理器
        rv!!.layoutManager = layoutManager
        //设置为垂直布局，这也是默认的
        layoutManager.orientation = RecyclerView.VERTICAL
        //设置Adapter
        //        rv.setAdapter(recycleAdapter);
        adapter = BaseAdapter(R.layout.item_drop_down,list){ itemView: View, l: List<String>, i: Int ->
            itemView.tv_pop.setText(l.get(0))


        }
        rv.adapter = adapter


    }

    public fun setList(lists : ArrayList<ArrayList<String>>) {
        this.list.clear()
        this.list.addAll(lists)

        adapter.notifyDataSetChanged()

    }


}