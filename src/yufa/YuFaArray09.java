package yufa;

import java.util.Scanner;

public class YuFaArray09 {
    public static void main(String[] args) {
        int[] ids;
        ids = new int[]{1001, 1002, 1003, 1004};
        String[] names = new String[5];
        double[] dd = new double[4];
        names[0] = "ab";
        names[1] = "cd";
        names[2] = "ef";
        names[3] = "gh";
        names[4] = "ij";
        char name1 = names[2].charAt(0);
        char[] Chars = new char[5];
        System.out.println("----" + Chars[0] + "****");
//        System.out.println(name1);
        boolean[] arr4 = new boolean[2];
        System.out.println(arr4[1]);
        for (int i = 0; i < dd.length; i++) {
            System.out.println(dd[i]);
        }

/*        int[] arr = new int[] {8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println(tel);*/

        Scanner scan = new Scanner(System.in);
        System.out.println("인원수를 입력해주세요.");
        int number = scan.nextInt();
        int[] scores = new int[number];
        System.out.println("각각 점수를 입력해주세요.");
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println("student max score is " + maxScore);
        char level;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore - scores[i] <= 10) {
                level = 'A';
            } else if (maxScore - scores[i] <= 20) {
                level = 'B';
            } else if (maxScore - scores[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i] + ", grade is " + level);
        }
    }
}
