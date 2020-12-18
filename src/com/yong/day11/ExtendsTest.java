package com.yong.day11;

/**
 * @author yong
 * @date 2020-12-18 오전 8:58
 * @mail yongri1115@163.com
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(3);
        System.out.println(p1.getAge());
        p1.eat();

        Student s1 = new Student();
        s1.eat();
        System.out.println(s1.name);
    }
}
