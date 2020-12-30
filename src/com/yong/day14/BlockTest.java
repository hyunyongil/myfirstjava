package com.yong.day14;

/**
 * @author yong
 * @date 2020-12-28 오전 8:22
 * @mail yongri1115@163.com
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);
        Person p1 = new Person();
        Person p2 = new Person();
        Person.info();
    }
}

class Person {
    String name;
    int age;
    static String desc = "我是一个人";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    {
        System.out.println("hello, block2");
        age = 2;
    }
    {
        System.out.println("hello, block1");
        age = 1;
    }

    static {
        System.out.println("hello, static block-2");
        desc = "我是一个爱工作的人";
    }

    static {
        System.out.println("hello, static block-1");
        desc = "我是一个爱学习的人";
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info() {
        System.out.println("我是一个快乐的人！");
    }
}