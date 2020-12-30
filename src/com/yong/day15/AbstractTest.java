package com.yong.day15;

/**
 * @author yong
 * @date 2020-12-30 오전 9:15
 * @mail yongri1115@163.com
 */
public class AbstractTest {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.eat();
        Person ps = new Student();
        ps.eat();
        ps.breath();
    }
}

abstract class Creature {
    public abstract void breath();
}

abstract class Person extends Creature {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("人走路");
    }
}

class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }

    @Override
    public void breath() {
        System.out.println("学生应该深呼吸");
    }
}