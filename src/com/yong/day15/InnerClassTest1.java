package com.yong.day15;

/**
 * @author yong
 * @date 2020-12-31 오후 12:36
 * @mail yongri1115@163.com
 */
public class InnerClassTest1 {
    public void method() {
        class AA {

        }
    }

    public Comparable getComparable() {
/*        class MyComparable implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();*/
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
