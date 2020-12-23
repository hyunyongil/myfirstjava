package com.yong.day13;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;

/**
 * @author yong
 * @date 2020-12-23 오전 9:43
 * @mail yongri1115@163.com
 */
public class WrapperTest {
    @Test
    public void test1() {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println(in2.toString());
//        Integer in3 = new Integer("123ab");
//        System.out.println(in3.toString());
        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TrUe");
        Boolean b3 = new Boolean("true12");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        Order order = new Order();
        System.out.println(order.isMale);
        System.out.println(order.isFemale);
    }
}

class  Order{
    boolean isMale;
    Boolean isFemale;
}