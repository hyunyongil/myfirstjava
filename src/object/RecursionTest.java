package object;

/**
 * @author yong
 * @date 2020-12-14 오후 2:45
 * @mail yongri1115@163.com
 */
public class RecursionTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        int uu = 0;
        RecursionTest test = new RecursionTest();
        uu = test.getSum(100);
        System.out.println(uu);
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }
}
