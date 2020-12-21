package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 12:11
 * @mail yongri1115@163.com
 */
public class Person {
    String name;
    int age;
    int id = 1001;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk(int disance) {
        System.out.println("走路， 走的距离是： " + disance + "公里");
    }

}
