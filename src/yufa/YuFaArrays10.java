package yufa;

/**
 * @author yong
 * @date 2020-12-09 오후 1:43
 * @mail yongri1115@163.com
 */
public class YuFaArrays10 {
    public static void main(String[] args) {
        //int[] arr = new int[]{1, 2, 3};
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
        }

    }
}
