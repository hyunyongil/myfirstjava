package com.yong.p2.model;

/**
 * @author yong
 * @date 2020-12-16 오후 2:12
 * @mail yongri1115@163.com
 */
public class Customer {
    private String name;
    private char gender;
    private int age;
    private int money;
    private String phone;
    private String email;

    public Customer() {
    }

    public Customer(String name, char gender, int age, int money, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.money = money;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
