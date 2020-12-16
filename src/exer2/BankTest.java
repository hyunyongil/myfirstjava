package exer2;

/**
 * @author yong
 * @date 2020-12-16 오전 8:57
 * @mail yongri1115@163.com
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "Smith");
        bank.getCustomer(0).setAccount(new Account(2000, bank.getCustomer(0)));
        bank.getCustomer(0).getAccount().withdraw(500);

        bank.addCustomer("신", "세경");
        bank.getCustomer(1).setAccount(new Account(3000, bank.getCustomer(1)));
        bank.getCustomer(1).getAccount().deposit(760);
        bank.getCustomer(1).getAccount().withdraw(890);


        bank.addCustomer("마", "동석");
        bank.getCustomer(2).setAccount(new Account(5000, bank.getCustomer(2)));
        bank.getCustomer(2).getAccount().withdraw(1000);

        int allCus = bank.getNumberOfCustomers();
        System.out.println("고객수는: " + allCus+"명");


        Customer[] csArr = bank.getCustomer();
        for (int i = 0; i < allCus; i++) {
            System.out.println(csArr[i].getFirstName()+csArr[i].getLastName());
        }

        for (int i = 0; i < allCus; i++) {
            double balance = bank.getCustomer(i).getAccount().getBalance();
            System.out.println("고객: " + bank.getCustomer(i).getFirstName()+bank.getCustomer(i).getLastName() + "의 잔액은: " + balance);
        }

    }
}
