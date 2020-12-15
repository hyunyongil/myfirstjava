package object;

/**
 * @author yong
 * @date 2020-12-15 오후 12:19
 * @mail yongri1115@163.com
 */
public class TriAngelTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.4);
        System.out.println(t1.getBase() +", "+ t1.getHeight());

        TriAngle t2 = new TriAngle(2.6,9.3);
        System.out.println(t2.getBase() +", "+ t2.getHeight());
    }
}
