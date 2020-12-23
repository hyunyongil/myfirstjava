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
    public void test5(){
        String str1 = "123";
        int num2 = Integer.parseInt(str1);
        System.out.println(num2+1);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }
    @Test
    public void test4() {
        int num1 = 10;
        String str1 = num1 + "";
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        System.out.println(str2);
        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str3);
    }

    @Test
    public void test3() {
        int num1 = 10;
        Integer i1 = num1;
        method(num1);
        method(i1);

        int num3 = i1;
        method(num3);
    }

    public void method(Object obj) {
        System.out.println(obj);
    }

    @Test
    public void test2() {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

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

class Order {
    boolean isMale;
    Boolean isFemale;
}