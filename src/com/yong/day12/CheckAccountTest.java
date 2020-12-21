package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 3:16
 * @mail yongri1115@163.com
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);
        acct.withdraw(5000);
        System.out.println("您的账户余额为： "+acct.getBalance());
        System.out.println("您的透支额度为： "+acct.getOverdraft());
        acct.withdraw(18000);
        System.out.println("您的账户余额为： "+acct.getBalance());
        System.out.println("您的透支额度为： "+acct.getOverdraft());
        acct.withdraw(3000);
        System.out.println("您的账户余额为： "+acct.getBalance());
        System.out.println("您的透支额度为： "+acct.getOverdraft());
    }
}
