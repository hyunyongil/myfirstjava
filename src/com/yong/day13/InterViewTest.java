package com.yong.day13;

import org.junit.Test;

/**
 * @author yong
 * @date 2020-12-23 오전 10:13
 * @mail yongri1115@163.com
 */
public class InterViewTest {
    @Test
    public void test1() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);
    }

    @Test
    public void test2() {
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);
    }

    @Test
    public void test3() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        // -127 ~ 127
        Integer m = -127;
        Integer n = -127;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
