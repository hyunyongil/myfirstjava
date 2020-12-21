package com.yong.day12;

/**
 * @author yong
 * @date 2020-12-21 오후 3:58
 * @mail yongri1115@163.com
 */
class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }
    public void func(Animal animal) {
        animal.eat();
        animal.shout();
    }
}

class Animal {
    public void eat() {
        System.out.println("动物，进食");
    }

    public void shout() {
        System.out.println("动物，叫");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("够吃骨头");
    }

    public void shout() {
        System.out.println("汪汪汪！");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void shout() {
        System.out.println("喵喵喵！");
    }
}