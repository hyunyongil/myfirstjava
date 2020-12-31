package com.yong.day15.java1;

/**
 * @author yong
 * @date 2020-12-30 오후 2:14
 * @mail yongri1115@163.com
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferData(flash);
        System.out.println("*************");
        com.transferData(new Printer());
        System.out.println("*************");
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });
    }
}

class Computer {
    public void transferData(USB usb) {
        usb.start();
        System.out.println("具体传输数据细节");
        usb.stop();
    }
}

interface USB {
    void start();

    void stop();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}


