package com.yong.day14;

import com.yong.day11.Circle;

/**
 * @author yong
 * @date 2020-12-23 오후 2:51
 * @mail yongri1115@163.com
 */


public class CircleTest {
    public static void main(String[] args) {
        Circles c1 = new Circles();
        Circles c2 = new Circles();
        Circles c3 = new Circles(10);
        System.out.println("c1->id:"+c1.getId());
        System.out.println("c2->id:"+c2.getId());
        System.out.println("c3->id:"+c3.getId());

        System.out.println("圆的个数是： "+Circles.getTotal());

        Double dd = c3.findArea();
        System.out.println(dd.intValue());
    }
}

class Circles{
    private double radius;
    private int id;
    private static int total;
    private static int init = 1001;



    public int getId() {
        return id;
    }



    public static int getTotal() {
        return total;
    }



    public static int getInit() {
        return init;
    }


    public Circles(){
        id = init++;
        total++;
    }

    public Circles(double radius) {
        this();
        this.radius = radius;
    }

    public double findArea(){
        return 3.14*radius*radius;
    }
}