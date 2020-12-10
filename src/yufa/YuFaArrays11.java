package yufa;

/**
 * @author yong
 * @date 2020-12-10 오전 8:42
 * @mail yongri1115@163.com
 */
public class YuFaArrays11 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.println(arr[i]);
        }
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("최대치는: "+maxValue);
    }
}
