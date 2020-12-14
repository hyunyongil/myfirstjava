package object;

/**
 * @author yong
 * @date 2020-12-14 오전 8:16
 * @mail yongri1115@163.com
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
        System.out.println(util.getMax(arr));
        System.out.println(util.getMin(arr));
        System.out.println(util.getSum(arr));
        System.out.println(util.getAvg(arr));
        util.reverse(arr);
        util.print(arr);
        util.sort(arr);
        util.print(arr);
        System.out.println(util.getIndex(arr, 5));
    }
}
