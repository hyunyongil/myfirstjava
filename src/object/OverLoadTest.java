package object;

/**
 * @author yong
 * @date 2020-12-14 오전 8:42
 * @mail yongri1115@163.com
 */
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum(1, 2);
    }
/*    public void getSum(int i,int j){
        System.out.println("1: "+(i+j));
    }*/
    public void getSum(double i,double j){
        System.out.println("2: "+(i+j));
    }
    public void getSum(String i,double j){
        System.out.println("3: "+(i+j));
    }
}
