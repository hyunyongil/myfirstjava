package com.yong.day11;

/**
 * @author yong
 * @date 2020-12-21 오전 10:11
 * @mail yongri1115@163.com
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return Math.PI * getRadius() * getRadius() * getLength();
    }
}
