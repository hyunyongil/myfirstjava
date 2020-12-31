package com.yong.day15.java1;

/**
 * @author yong
 * @date 2020-12-30 오후 1:28
 * @mail yongri1115@163.com
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{
   public static final int MAX_SPEED = 7900;
   int MIN_SPEED = 1;
   void fly();
   public abstract void stop();
}

interface Attackable{
    public abstract void attack();
}

interface AA{
    void method1();
}

interface BB{
    void method12();
}

interface CC extends AA,BB{

}
class Bullet implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method12() {

    }
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过飞机引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{

    @Override
    public void stop() {

    }
}