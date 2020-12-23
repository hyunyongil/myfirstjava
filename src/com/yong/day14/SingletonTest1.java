package com.yong.day14;

/**
 * @author yong
 * @date 2020-12-23 오후 3:37
 * @mail yongri1115@163.com
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bb1 = Bank.getInstance();
        Bank bb2 = Bank.getInstance();
        System.out.println(bb1);
        System.out.println(bb2);
    }
}

class Bank {
    private Bank() {

    }

    private static Bank instance = new Bank();

    public static Bank getInstance() {
        return instance;
    }
}
