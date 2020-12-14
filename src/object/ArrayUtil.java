package object;

/**
 * @author yong
 * @date 2020-12-14 오전 8:12
 * @mail yongri1115@163.com
 */
public class ArrayUtil {
    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int getMin(int[] arr) {
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MinValue > arr[i]) {
                MinValue = arr[i];
            }
        }
        return MinValue;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public void reverse(String[] arr){

    }
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void print(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i != arr.length-1) {
                str += ", ";
            }
        }
        str += "]";
        System.out.println(str);
    }

    public int getIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dest) {
                return i;
            }
        }
        return -1;
    }
}
