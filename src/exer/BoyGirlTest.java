package exer;

/**
 * @author yong
 * @date 2020-12-15 오후 2:52
 * @mail yongri1115@163.com
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",21);
        boy.shout();
        Girl girl = new Girl("朱丽叶", 18);
        girl.marry(boy);
        Girl girl1 = new Girl("祝英台", 19);
        int compare = girl.compare(girl1);
        System.out.println(compare);
    }
}
