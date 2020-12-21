package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 12:13
 * @mail yongri1115@163.com
 */
public class Student extends Person {
    String major;
    int id = 1002;
    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习。专业是： " + major);
    }

    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show(){
        super.eat();
        System.out.println(this.id+","+super.id);
    }

}
