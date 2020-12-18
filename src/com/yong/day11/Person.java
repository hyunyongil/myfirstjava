package com.yong.day11;

/**
 * @author yong
 * @date 2020-12-18 오전 8:57
 * @mail yongri1115@163.com
 */
public class Person {
    String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("먹다");
        sleep();
    }

    private void sleep(){
        System.out.println("자다");
    }
}
