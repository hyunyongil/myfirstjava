package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 3:06
 * @mail yongri1115@163.com
 */
public class CheckAccount extends Acount {
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else if (this.overdraft >= amount - getBalance()) {
            this.overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        } else {
            System.out.println("您的余额透支了！！");
        }
    }
}
