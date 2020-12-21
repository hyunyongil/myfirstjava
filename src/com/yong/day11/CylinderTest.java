package com.yong.day11;

/**
 * @author yong
 * @date 2020-12-21 오전 10:19
 * @mail yongri1115@163.com
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(2.1);
        cy.setLength(3.4);
        double volume = cy.findVolume();
        System.out.println("yuan mianji: " + volume);
        double area = cy.findArea();
        System.out.println("dimianji: " + area);
    }
}
