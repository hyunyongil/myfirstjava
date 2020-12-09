package yufa;

/**
 * @author yong
 * @date 2020-12-09 오후 1:43
 * @mail yongri1115@163.com
 */
public class YuFaArrays10 {
    public static void main(String[] args) {
/*        //int[] arr = new int[]{1, 2, 3};
        int[] arrs = {1, 2, 3};
        //int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {6, 7}};
        System.out.println(arr1[1][2]);
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        System.out.println(arr2[1][0]);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }*/
/*        int[][] arrs1 = {{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int i = 0; i < arrs1.length; i++) {
            for (int j = 0; j < arrs1[i].length; j++) {
                sum += arrs1[i][j];
            }
        }
        System.out.println(sum);*/
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;
//            if (i > 1) {
                for (int j = 1; j < yangHui[i].length-1; j++) {
                    yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
                }
//            }
        }
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
