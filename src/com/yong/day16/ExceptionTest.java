package com.yong.day16;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * @author yong
 * @date 2020-12-31 오후 3:44
 * @mail yongri1115@163.com
 */
public class ExceptionTest {
    @Test
    public void test7(){
/*        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.println(data);
            data = fis.read();
        }
        fis.close();*/
    }
    @Test
    public void test6() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    @Test
    public void test5() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);
        scanner.close();
    }

    @Test
    public void test4() {
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    @Test
    public void test3() {
        Object obj = new Date();
        String str = (String) obj;
    }

    @Test
    public void test2() {
//        int[] arr = new int[10];
//        System.out.println(arr[10]);

        String str = "abc";
        System.out.println(str.charAt(3));
    }

    @Test
    public void test1() {
//        int[] arr = new int[3];
//        System.out.println(arr[3]);
        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }
}
