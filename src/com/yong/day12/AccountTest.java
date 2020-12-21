package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 3:02
 * @mail yongri1115@163.com
 */
public class AccountTest {
    public static void main(String[] args) {
        Acount acct = new Acount(1122, 20000, 0.045);
        acct.withdraw(30000);
        System.out.println("您的账户余额为: "+acct.getBalance());
        acct.withdraw(2500);
        System.out.println("您的账户余额为: "+acct.getBalance());
        acct.deposit(3000);
        System.out.println("您的账户余额为: "+acct.getBalance());
        System.out.println("月利率为: "+(acct.getMonthlyInterest() * 100) + "%");
    }
}
