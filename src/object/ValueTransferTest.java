package object;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author yong
 * @date 2020-12-14 오전 10:37
 * @mail yongri1115@163.com
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        System.out.println("****************基本数据类型： ***************");
        int m = 10;
        int n = 20;
        System.out.println("m:" + m + ", " + "n:" + n);
/*        n = 20;
        System.out.println("m:" + m + ", " + "n:" + n);
        System.out.println("*******************************");
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;
        System.out.println(o1.orderId + ", " + o2.orderId);
        o2.orderId = 1002;
        System.out.println(o1.orderId + ", " + o2.orderId);*/
        ValueTransferTest test = new ValueTransferTest();
        test.swap(m, n);
        System.out.println("m:" + m + ", " + "n:" + n);

        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("d-m:" + data.m + ", " + "d-n:" + data.n);
        test.swap(data);
        System.out.println("d-m:" + data.m + ", " + "d-n:" + data.n);
        int[] it = new int[]{12, 3, 6, 50, 90, 36};
        for (int i = it.length - 1; i >= 0; i--) {
            it[i] = it[i] / it[0];
        }
        for (int i = 0; i < it.length; i++) {
            System.out.print(it[i] + "\t");
        }
        System.out.println();
        char[] arr1 = new char[]{'a', 'b', 'c'};
        System.out.println(arr1);
    }

    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m:" + m + ", " + "n:" + n);
    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Order {
    int orderId;
}

class Data {
    int m;
    int n;
}
