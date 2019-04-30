package com.lottchina.xdbao.demo;

import java.util.HashMap;

/**
 * Author: Austin
 * Date: 19-4-28
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        /*User u = new User();
        u.setAge(0);
        u.setName("张三");
        String str1 = GsonUtil.GsonString(u);
        log(str1);

        User u1 = new User();
        u1.setAge(0);
        String str2 = GsonUtil.GsonString(u1);
        log(str2);*/
        HashMap<String ,String> map = new HashMap<>();
        map.put("1","张三");
        log(map.get("1"));
        log(map.get("2"));
        log("111" + map);
        log(map.get("1"));

        new Thread(){
            @Override
            public void run() {
                super.run();
                map.put("3","李四");
                log("小四 啊--" + map.get("3"));
            }
        }.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log(map.get("3"));


        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (int i = 0; i < list.size(); i++) {
            log("--" + i);
            if (i == 3)
                i--;
        }*/
    }

    private static void log(String str) {
        System.out.println(str);
    }
}
