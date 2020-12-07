import java.util.Scanner;

public class YuFaFor06 {
    public static void main(String[] args) {
/*        for (int i = 1; i <= 5; i++) {
            System.out.println("hw");
        }*/
/*        int sum = 0;
        for(int i = 1; i<=100 ; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);*/
/*        for (int i = 1; i <= 150; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.print("3의배수 ");
            }
            if (i % 5 == 0) {
                System.out.print("5의배수 ");
            }
            if (i % 7 == 0) {
                System.out.print("7의배수 ");
            }
            System.out.println();
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个正整数: ");
        int m = scan.nextInt();

        System.out.println("请输入第二个正整数: ");
        int n = scan.nextInt();

        int min = (m <= n) ? m : n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;
            }
        }

        int max = (m >= n) ? m : n;
        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
