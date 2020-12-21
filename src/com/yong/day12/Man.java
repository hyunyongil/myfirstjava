package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 3:39
 * @mail yongri1115@163.com
 */
public class Man extends Person {
    boolean isSmoking;
    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }
    public void eat() {
        System.out.println("男人多吃肉");
    }

    public void walk(int disance) {
        System.out.println("男人霸气的走入");
    }
}
