package com.yong.day13;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author yong
 * @date 2020-12-23 오후 12:17
 * @mail yongri1115@163.com
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector v = new Vector();
        int maxScore = 0;
        for (; ; ) {
            System.out.println("请输入学生成绩（以负数代表输入结束）");
            int score = scan.nextInt();
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("输入非法，请重新输入。");
                continue;
            }
            //Integer inScore = new Integer(score);
            //v.addElement(inScore);
            v.addElement(score);
            if (maxScore < score) {
                maxScore = score;
            }
        }
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
//            Integer inScore = (Integer) obj;
//            int score = inScore.intValue();
            int score = (int) obj;
            if (maxScore - score <= 10) {
                level = 'A';
            } else if (maxScore - score <= 20) {
                level = 'B';
            } else if (maxScore - score <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student: " + i + " score is " + score + ",level is " + level);
        }
    }
}
