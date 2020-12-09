package yufa;

import java.util.Scanner;

public class YuFaWhile07 {
    public static void main(String[] args) {
/*        int i = 50;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/

/*        int j = 1;
        int ct = 0;
        int sum = 0;
        do {
            if (j % 2 == 0) {
                sum += j;
                ct++;
                System.out.println(j);
            }
            j++;
        } while (j <= 100);
        System.out.println(sum);
        System.out.println(ct);*/
        Scanner scan = new Scanner(System.in);
        int ct1 = 0;
        int ct2 = 0;
        //while (true) {
        for (;;){
            int number = scan.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                ct1++;
            } else {
                ct2++;
            }
        }
        System.out.println("정수는:" + ct1);
        System.out.println("부수는:" + ct2);
    }
}
