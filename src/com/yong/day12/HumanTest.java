package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 3:43
 * @mail yongri1115@163.com
 */
public class HumanTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();
        //对象多态性: 父类的引用指向子类的对象//////////////////////////////////////////////
        System.out.println("***************************");
        Person p2 = new Man();
        p2.eat();
        p2.walk(1000);
        Person p3 = new Woman();
    }
}
