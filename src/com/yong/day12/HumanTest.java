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
        System.out.println("***************************");
        Man m1 = (Man)p2;
        m1.earnMoney();
        m1.isSmoking = true;
        if(p3 instanceof Woman){
            System.out.println("12121212");
        }
        System.out.println(p3.getClass().getSuperclass());
        System.out.println("***************************");
        Person pp1 = new Person("木木",21);
        Person pp2 = new Person("木木",21);
        System.out.println(pp1.equals(pp2));
    }


}
