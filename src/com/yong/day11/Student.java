package com.yong.day11;

/**
 * @author yong
 * @date 2020-12-18 오전 8:56
 * @mail yongri1115@163.com
 */
public class Student extends Person {
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
//        this.age = age;
        setAge(age);
        this.major = major;
    }

}
