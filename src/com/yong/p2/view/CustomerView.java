package com.yong.p2.view;

import com.yong.p2.controller.CustomerList;
import com.yong.p2.model.Customer;
import com.yong.p2.util.CMUtility;

/**
 * @author yong
 * @date 2020-12-16 오후 2:12
 * @mail yongri1115@163.com
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("王涛", '男', 23, "13212341234", "wt@gmail.com");
        this.customerList.addCustomer(customer);
    }

    public void enterMainMenu() {
        boolean isFlag = true;

        while(isFlag) {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");
            char menu = CMUtility.readMenuSelection();
            switch(menu) {
                case '1':
                    this.addNewCustomer();
                    break;
                case '2':
                    this.modifyCustomer();
                    break;
                case '3':
                    this.deleteCustomer();
                    break;
                case '4':
                    this.listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }

    }

    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = this.customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("-------------------客户目录已满，添加失败---------------");
        }

    }

    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");

        while(true) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            int number = CMUtility.readInt();
            if (number == -1) {
                return;
            }

            Customer cust = this.customerList.getCustomer(number - 1);
            if (cust != null) {
                System.out.print("姓名(" + cust.getName() + "):");
                String name = CMUtility.readString(10, cust.getName());
                System.out.print("性别(" + cust.getGender() + "):");
                char gender = CMUtility.readChar(cust.getGender());
                System.out.print("年龄(" + cust.getAge() + "):");
                int age = CMUtility.readInt(cust.getAge());
                System.out.print("电话(" + cust.getPhone() + "):");
                String phone = CMUtility.readString(13, cust.getPhone());
                System.out.print("邮箱(" + cust.getEmail() + "):");
                String email = CMUtility.readString(30, cust.getEmail());
                Customer newCust = new Customer(name, gender, age, phone, email);
                boolean isRepalaced = this.customerList.replaceCustomer(number - 1, newCust);
                if (isRepalaced) {
                    System.out.println("---------------------修改完成---------------------");
                } else {
                    System.out.println("---------------------修改失败---------------------");
                }

                return;
            }

            System.out.println("无法找到指定客户！");
        }
    }

    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");

        while(true) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            int number = CMUtility.readInt();
            if (number == -1) {
                return;
            }

            Customer customer = this.customerList.getCustomer(number - 1);
            if (customer != null) {
                System.out.print("确认是否删除(Y/N)：");
                char isDelete = CMUtility.readConfirmSelection();
                if (isDelete == 'Y') {
                    boolean deleteSuccess = this.customerList.deleteCustomer(number - 1);
                    if (deleteSuccess) {
                        System.out.println("---------------------删除完成---------------------");
                    } else {
                        System.out.println("---------------------删除失败---------------------");
                    }

                    return;
                }

                return;
            }

            System.out.println("无法找到指定客户！");
        }
    }

    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------\n");
        int total = this.customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custs = this.customerList.getAllCustomers();

            for(int i = 0; i < custs.length; ++i) {
                Customer cust = custs[i];
                System.out.println(i + 1 + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
