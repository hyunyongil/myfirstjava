package object;

/**
 * @author yong
 * @date 2020-12-14 오전 8:12
 * @mail yongri1115@163.com
 */
public class ArrayUtil {
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int getMin(int[] arr){
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(MinValue > arr[i]){
                MinValue = arr[i];
            }
        }
        return MinValue;
    }

    public int getSum(int[] arr){
        return 0;
    }

    public int getAvg(int[] arr){
        return 0;
    }

    public void reverse(int[] arr){

    }

    public int[] copy(int[] arr){
        return null;
    }

    public void sort(int[] arr){

    }

    public void print(int[] arr){

    }

    public int getIndex(int[] arr, int dest){
        return 0;
    }
}
