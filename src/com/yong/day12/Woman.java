package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 3:41
 * @mail yongri1115@163.com
 */
public class Woman extends Person{
    boolean isBeauty;
    public void goShopping(){
        System.out.println("女人喜欢购物");
    }
    public void eat() {
        System.out.println("女人少吃，为了减肥");
    }

    public void walk(int disance) {
        System.out.println("女人走路");
    }
}
