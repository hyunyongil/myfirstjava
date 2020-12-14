package object;

/**
 * @author yong
 * @date 2020-12-14 오전 10:15
 * @mail yongri1115@163.com
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        String[] strArr = new String[]{"AA", "BB", "CC", "DD"};
        test.show(3, "AA", "BB", "CC");
    }

    public void show(int i) {

    }

    public void show(int w, String... strs) {
        System.out.println("show(String ... strs)");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}
