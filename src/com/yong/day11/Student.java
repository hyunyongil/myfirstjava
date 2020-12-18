package com.yong.day11;

/**
 * @author yong
 * @date 2020-12-18 오전 8:56
 * @mail yongri1115@163.com
 */
public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("먹다");
    }
}
