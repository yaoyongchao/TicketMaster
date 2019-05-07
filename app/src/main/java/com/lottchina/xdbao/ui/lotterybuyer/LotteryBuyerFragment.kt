package com.lottchina.xdbao.ui.lotterybuyer

import android.view.View
import com.lottchina.baselib.utils.ScreenUtils
import com.lottchina.baselib.widget.dropdownmenu.Dic
import com.lottchina.baselib.widget.dropdownmenu.DropDownMenu
import com.lottchina.baselib.widget.dropdownmenu.Madapter
import com.lottchina.baselib.widget.dropdownmenu.SearchAdapter
import com.lottchina.xdbao.R
import com.vcaidian.wclib.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_lottery_buyer.*
import kotlinx.android.synthetic.main.fragment_lottery_buyer.view.*




/**
 * Author: Austin
 * Date: 19-5-6
 * Description:
 */
class LotteryBuyerFragment : BaseFragment(),View.OnClickListener {



    private lateinit var adapter1: SearchAdapter
    private lateinit var adapter2: SearchAdapter
    private lateinit var listItem:View
    private lateinit var listView: View
    private lateinit var dropDownMenu: DropDownMenu

    companion object {
        // 单例模式： 双重校验锁式
        val instance: LotteryBuyerFragment by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            LotteryBuyerFragment()
        }
    }


    override fun layoutId(): Int {
        return com.lottchina.xdbao.R.layout.fragment_lottery_buyer
    }

    override fun initView() {

        dropDownMenu = DropDownMenu.getInstance(mContext, object : DropDownMenu.OnListCkickListence {
            override fun search(code: String, type: String) {
                println("======$code=========$type")
            }

            override fun changeSelectPanel(madapter: Madapter, view: View) {

            }
        })
        dropDownMenu.setIndexColor(com.lottchina.xdbao.R.color.colorAccent);
        dropDownMenu.setShowShadow(true);
        dropDownMenu.setShowName("name");
        dropDownMenu.setSelectName("code");


    }


    override fun initListener() {
        rootView.sex.setOnClickListener(this)
        rootView.nation.setOnClickListener(this)



    }

    override fun initData() {
        adapter1 = SearchAdapter(mContext)
        var sexResult = mutableListOf<Dic>()
        sexResult.add(Dic("000", "全部"))
        sexResult.add(Dic("001", "男"))
        sexResult.add(Dic("002", "女"))
        adapter1.setItems(sexResult)

        adapter2 = SearchAdapter(mContext)
        var nationResult = mutableListOf<Dic>()
        nationResult.add(Dic("000", "全部"))
        nationResult.add(Dic("001", "汉族"))
        nationResult.add(Dic("002", "回族"))
        nationResult.add(Dic("003", "满族"))
        nationResult.add(Dic("004", "布依族"))
        nationResult.add(Dic("005", "保安族"))
        nationResult.add(Dic("006", "保安族"))
        nationResult.add(Dic("007", "保安族"))
        nationResult.add(Dic("008", "保安族"))

        adapter2.setItems(nationResult)

        listItem = layoutInflater.inflate(com.lottchina.xdbao.R.layout.item_listview,null,false)
        listView = layoutInflater.inflate(com.lottchina.xdbao.R.layout.pup_selectlist,null,false)

    }
    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.sex ->
                dropDownMenu.showSelectList(ScreenUtils.getScreenWidth(mContext),
                        ScreenUtils.getScreenHeight(mContext), adapter1,
                        listView, listItem,sex, sex_text, "cyry.xbdm", false)
            R.id.nation ->
                dropDownMenu.showSelectList(ScreenUtils.getScreenWidth(mContext),
                        ScreenUtils.getScreenHeight(mContext), adapter2,
                        listView, listItem,nation, nation_text, "cyry.mzdm", false)
        }

    }

}