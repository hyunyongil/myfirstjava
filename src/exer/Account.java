package exer;

/**
 * @author yong
 * @date 2020-12-15 오후 3:02
 * @mail yongri1115@163.com
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRatesetAccount) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("잔액부족, 출금실패");
            return;
        }
        balance -= amount;
        System.out.println("출금성공: " + amount);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("저축성공: " + amount);
        }
    }
}
