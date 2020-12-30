package com.yong.day15;

/**
 * @author yong
 * @date 2020-12-30 오후 12:05
 * @mail yongri1115@163.com
 * 抽象类的匿名子类
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());
        Worker worker = new Worker();
        method1(worker);
        System.out.println("***********");
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("eat");
            }

            @Override
            public void breath() {
                System.out.println("breathing");
            }
        };
        method1(p);
        System.out.println("***********");
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("eat111");
            }

            @Override
            public void breath() {
                System.out.println("breathing111");
            }
        });
    }

    public static void method1(Person p){
        p.eat();
        p.breath();
    }
    public static void method(Student s){

    }
}

class Worker extends Person{

    @Override
    public void breath() {

    }

    @Override
    public void eat() {

    }
}
