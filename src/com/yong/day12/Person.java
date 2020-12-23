package com.yong.day12;

import org.junit.Test;

/**
 * @author yong
 * @date 2020-12-21 오후 12:11
 * @mail yongri1115@163.com
 */
public class Person {
    @Test
    public void test1() {
        System.out.println(21);
    }

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person per = (Person) obj;
            return this.age == per.age && this.name.equals(per.name);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                id == person.id &&
                this.name.equals(person.name);
    }*/
}
