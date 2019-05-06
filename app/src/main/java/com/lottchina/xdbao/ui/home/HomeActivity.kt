package com.lottchina.xdbao.ui.home

import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.lottchina.baselib.base.BaseActivity
import com.lottchina.xdbao.R
import com.lottchina.xdbao.ui.lotterybuyer.LotteryBuyerFragment
import com.lottchina.xdbao.ui.story.OurStoreFragment
import com.lottchina.xdbao.ui.ticket.TicketsFragment
import com.vcaidian.customer.utils.RouteUrl
import com.vcaidian.wclib.utils.TabUtils
import kotlinx.android.synthetic.main.activity_home.*

@Route(path = RouteUrl.home)
class HomeActivity : BaseActivity(), ViewPager.OnPageChangeListener {
    private  var tabTitles = mutableListOf(R.string.tab1,R.string.tab2,R.string.tab3)
    private  var tabImgs = mutableListOf(R.drawable.tab1_selector,R.drawable.tab2_selector,R.drawable.tab3_selector)
    private  var tabFragments = mutableListOf(TicketsFragment.instance,LotteryBuyerFragment.instance,OurStoreFragment.instance)
    private lateinit var homePagerAdapter: HomePagerAdapter
    override fun layoutId(): Int {
        return R.layout.activity_home
    }

    override fun initView() {
        showToolbar(View.GONE)
        initViewPager()
    }

    override fun onResume() {
        super.onResume()

        if (tabTitles.size > 2) {
            tabImgs.removeAt(1)
            tabTitles.removeAt(1)
            tabFragments.removeAt(1)
            TabUtils.setTabsImg(tablayout,layoutInflater,tabTitles,tabImgs)
            homePagerAdapter.notifyDataSetChanged()
        }

    }

    private fun initViewPager() {
//        tabTitles = arrayOf(R.string.tab1,R.string.tab2,R.string.tab3)
//        tabImgs = arrayOf(R.drawable.tab1_selector,R.drawable.tab2_selector,R.drawable.tab3_selector)
//        tabFragments = arrayOf(TicketsFragment.instance,LotteryBuyerFragment.instance,OurStoreFragment.instance)
        homePagerAdapter = HomePagerAdapter(supportFragmentManager)
//        TabUtils.setTabsImg(tablayout,layoutInflater,tabTitles,tabImgs)
        viewpager.adapter = homePagerAdapter

    }

    override fun initData() {
    }

    override fun initListener() {
        viewpager.setScroll(true)
        viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout))
        tablayout.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(viewpager))
        viewpager.setOnPageChangeListener(this)
        viewpager.offscreenPageLimit = 2
    }

    override fun isFullScreen(): Boolean {
        return false
    }

    /**
     * @description: ViewPager 适配器
     */
    inner class HomePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            return tabFragments[position]
        }

        override fun getCount(): Int {
            return tabFragments.size
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        }

    }

    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
    }
}
