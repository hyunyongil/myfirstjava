package com.yong.day15;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author yong
 * @date 2020-12-30 오후 12:56
 * @mail yongri1115@163.com
 */
public class PayrollSystem {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入当月的月份： ");
//        int month = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH)+1;
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 4, 28), 10000);
        emps[1] = new HourlyEmployee("潘雨生", 2001, new MyDate(1991, 12, 6), 60,240);
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salaray = emps[i].earnings();
            if(month == emps[i].getBirthday().getMonth()){
                salaray += 100;
                System.out.println("生日快乐! 奖励100元");
            }
            System.out.println("月工资为：" + salaray);
        }
    }
}
