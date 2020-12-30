package com.yong.day15;

/**
 * @author yong
 * @date 2020-12-30 오후 12:51
 * @mail yongri1115@163.com
 */
public class HourlyEmployee extends Employee {
    private int wage;
    private int hour;

    @Override
    public double earnings() {
        return wage * hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }
}
