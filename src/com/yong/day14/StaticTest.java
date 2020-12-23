package com.yong.day14;

/**
 * @author yong
 * @date 2020-12-23 오후 1:54
 * @mail yongri1115@163.com
 */
public class StaticTest {
    public static void main(String[] args) {
        System.out.println(Chinese.nation);
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";
        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
        c2.nation = "CHINA";

        System.out.println(c2.nation);
        c2.gg();
        Chinese.gg();
    }
}

class Chinese{
    String name;
    int age;
    static String nation;

    public static void gg(){
        System.out.println(nation);
    }
}