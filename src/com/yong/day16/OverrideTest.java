package com.yong.day16;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author yong
 * @date 2021-01-05 오전 8:21
 * @mail yongri1115@163.com
 */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display( new SubClass());
    }
    public void display(SuperClass s){
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass{
    public void method() throws IOException{

    }
}

class SubClass extends SuperClass{
    public void method() throws FileNotFoundException {

    }
}