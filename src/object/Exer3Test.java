package object;

/**
 * @author yong
 * @date 2020-12-11 오후 1:03
 * @mail yongri1115@163.com
 */
public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();
        int area = test.method(12,10);
        System.out.println("면적은: " + area);
    }

    public int method(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
