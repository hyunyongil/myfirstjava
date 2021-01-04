package com.yong.day16;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author yong
 * @date 2021-01-04 오후 2:21
 * @mail yongri1115@163.com
 */
public class ExceptionTest1 {
    @Test
    public void test2() {
        try {
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        String str = "123";
        str = "abc";
        int num = 0;
        try {
            num = Integer.parseInt(str);
            System.out.println("hello----1");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("出现数值转换异常！");
        } catch (Exception e) {
            System.out.println("出现数值转换异常！!!!");
        }

        System.out.println(num);
        System.out.println("hello----2");
    }
}
