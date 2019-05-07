package com.lottchina.xdbao.utils;

import com.lottchina.cplib.data.bean.BindingStationBean;
import com.lottchina.cplib.data.bean.Customer;
import com.lottchina.cplib.data.bean.Terminal;
import com.lottchina.xdbao.CpApplication;
import com.vcaidian.customer.common.CommonParam;

/**
 * Author: Austin
 * Date: 19-5-6
 * Description:
 */
public class CommonUtil {
    /**
     *  解析为两位小数
     * @param amount
     * @return
     */
    public static String parseTwoDecimal(long amount) {
        if (amount < 0 ) {
            amount = Math.abs(amount);
            double d = amount;
            return String.format("%,.2f",d/100);
        } else {
            double d = amount;
            return String.format("%,.2f",d/100);
        }
    }

    public static void saveUserId(int userId) {
        SPObjUtil.putInt(CpApplication.appContext,CommonParam.INSTANCE.getUSERID(),userId);
    }

    public static void saveToken(String token) {
        SPObjUtil.putString(CpApplication.appContext,CommonParam.INSTANCE.getTOKEN(),token);
    }

    public static void saveUserIdToken(int userId,String token) {
        saveUserId(userId);
        saveToken(token);
    }

    public static int getUserId() {
        return SPObjUtil.getInt(CpApplication.appContext,CommonParam.INSTANCE.getUSERID(),0);
    }

    public static String getToken() {
        return SPObjUtil.getString(CpApplication.appContext,CommonParam.INSTANCE.getTOKEN(), CommonParam.INSTANCE.getTOKEN_DEFAULT());
    }

    public static void saveTerminal(Terminal terminal) {
        SPObjUtil.putObject(CpApplication.appContext,terminal);
        saveTerminalId(terminal.id);
    }

    public static Terminal getTerminal() {
        return SPObjUtil.getObject(CpApplication.appContext,Terminal.class);
    }

    public static void saveTerminalId(int id) {
        SPObjUtil.putInt(CpApplication.appContext,CommonParam.INSTANCE.getTERMINAL_ID(),id);
    }

    public static int getTerminalId() {
        return SPObjUtil.getInt(CpApplication.appContext,CommonParam.INSTANCE.getTERMINAL_ID(),0);
    }

    public static void saveStation(BindingStationBean station) {
        SPObjUtil.putObject(CpApplication.appContext,station);
    }

    public static BindingStationBean getStation(){
        return SPObjUtil.getObject(CpApplication.appContext,BindingStationBean.class);
    }
    public static void saveCustomer(Customer customer) {
        SPObjUtil.putObject(CpApplication.appContext,customer);
    }

    public static Customer getCustomer(){
        return SPObjUtil.getObject(CpApplication.appContext,Customer.class);
    }



}
