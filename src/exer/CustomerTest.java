package exer;

/**
 * @author yong
 * @date 2020-12-15 오후 3:45
 * @mail yongri1115@163.com
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane", "Smith");
        Account acct = new Account(1001, 2000, 0.0123);
        cust.setAccount(acct);
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);
        System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() + "] has a count: id is " + cust.getAccount().getId() + ", annualInterestRate is " + cust.getAccount().getAnnualInterestRate() * 100 + "%, balance is " + cust.getAccount().getBalance());
    }
}
