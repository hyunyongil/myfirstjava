package com.yong.day11;

/**
 * @author yong
 * @date 2020-12-21 오전 10:10
 * @mail yongri1115@163.com
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
