package exer2;

/**
 * @author yong
 * @date 2020-12-16 오전 8:19
 * @mail yongri1115@163.com
 */
public class Account {
    private double balance;
    private Customer customer;

    public Account(double init_balance, Customer init_customer) {
        this.balance = init_balance;
        this.setCustomer(init_customer);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
            System.out.println(this.getCustomer().getFirstName() + this.getCustomer().getLastName() + "\t저축성공: " + amt);
        }
    }

    public void withdraw(double amt) {
        if (this.balance < amt) {
            System.out.println(this.getCustomer().getFirstName() + this.getCustomer().getLastName() + "\t잔액부족, 출금실패");
            return;
        } else {
            this.balance -= amt;
            System.out.println(this.getCustomer().getFirstName() + this.getCustomer().getLastName() + "\t출금성공: -" + amt);
        }
    }
}
