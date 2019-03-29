package com.vcaidian.wclib.utils

/**
 * @author: Page
 * @time: 17-7-24
 * @description: Activity堆栈管理
 */

import android.app.Activity
import java.util.*

class ActivityManager {

    /**
     * 获取当前显示Activity（堆栈中最后一个传入的activity）
     */
    val lastActivity: Activity
        get() {
            val activity = activityStack!!.lastElement()
            return activity
        }

    /**
     * 获取所有Activity
     */
    val allActivityStacks: Stack<Activity>?
        get() = activityStack

    object SingleActivityManager {
        var INSTANCE = ActivityManager()
    }

    /**
     * 添加Activity到堆栈
     */
    fun addActivity(activity: Activity) {
        if (activityStack == null) {
            activityStack = Stack()
        }
        activityStack!!.add(activity)
    }

    /**
     * 移除Activity
     */
    fun removeActivity(activity: Activity) {
        activityStack!!.remove(activity)
    }

    /**
     * 结束指定的Activity
     */
    fun finishActivity(activity: Activity?) {
        if (activity != null) {
            if (!activity.isFinishing) {
                activity.finish()
                activityStack!!.remove(activity)
            }
        }
    }

    /**
     * 结束指定类名的Activity
     */
    fun finishActivity(cls: Class<*>) {
        for (activity in activityStack!!) {
            if (activity.javaClass == cls) {
                finishActivity(activity)
                break
            }
        }
    }

    /**
     * 结束除当前传入以外所有Activity
     */
    fun finishOthersActivity(cls: Class<*>) {
        if (activityStack != null)
            for (activity in activityStack!!) {
                if (activity.javaClass != cls) {
                    activity.finish()
                }
            }
    }

    /**
     * 结束所有Activity
     */
    fun finishAllActivity() {
        if (activityStack != null)
            for (activity in activityStack!!) {
                activity.finish()
            }
        activityStack!!.clear()
    }


    /**
     * 退出应用程序
     */
    fun AppExit() {
        try {
            finishAllActivity()
            android.os.Process.killProcess(android.os.Process.myPid())// 杀死该应用进程
            System.exit(0)
        } catch (e: Exception) {
        }

    }

    companion object {

        private var activityStack: Stack<Activity>? = null

        /**
         * 单一实例
         */
        val instance: ActivityManager
            get() = SingleActivityManager.INSTANCE

        /**
         * 获取指定的Activity
         */
        fun getActivity(cls: Class<*>): Activity? {
            if (activityStack != null)
                for (activity in activityStack!!) {
                    if (activity.javaClass == cls) {
                        return activity
                    }
                }
            return null
        }
    }


}
