package yufa;

import java.util.Arrays;

/**
 * @author yong
 * @date 2020-12-10 오전 8:42
 * @mail yongri1115@163.com
 */
public class YuFaArrays11 {
    public static void main(String[] args) {
/*        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.println(arr[i]);
        }
        int maxValue = 0;
        int minValue = 100;
        int sumValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
            sumValue += arr[i];
        }
        double avgValue;
        avgValue = sumValue / arr.length;
        System.out.println("최대치는: " + maxValue);
        System.out.println("최소치는: " + minValue);
        System.out.println("평균치는: " + avgValue);
        System.out.println("총합은: " + sumValue);*/
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        array2 = array1;
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        String[] arr = {"JJ", "DD", "MM", "BB", "GG", "AA"};
/*        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }*/
/*        for (int i = 0,j=arr.length-1; i <j ; i++,j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/
/*        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        String dest = "DD";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(dest)) {
                System.out.println(i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("없습니다");
        }
        System.out.println();
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 3, 2, 4};
        //Arrays.equals(arr1,arr2)
        //Arrays.toString(arr1)
        Arrays.fill(arr1, 10);
        System.out.println(arr1);

        int[] arr21 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        int index = Arrays.binarySearch(arr21, 17);
        if (index > 0) {
            System.out.println(index);
        } else {
            System.out.println("없음");
        }
    }
}
