package com.yong.day14;

/**
 * @author yong
 * @date 2020-12-23 오후 4:02
 * @mail yongri1115@163.com
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(12);
        String[] st = new String[10];
        Main.main(st);
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(34);
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_"+i;
            System.out.println(args[i]);
        }
    }
}
