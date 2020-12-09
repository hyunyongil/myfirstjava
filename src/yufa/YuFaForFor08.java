package yufa;

public class YuFaForFor08 {
    public static void main(String[] args) {
/*        for (int j=1;j<=10;j++){
            for (int i=1;i<=11-j;i++){
                System.out.print("*");
            }
            System.out.println();
        }*/
/*        int num = 9;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                String str = " ";
                if (i == j) {
                    str = "";
                }
                System.out.print(i + "*" + j + "=" + i * j + str);
            }
            System.out.println();
        }*/
        int num = 100000;
        int count = 0;
        long start = System.currentTimeMillis();
        boolean isFlag = true;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag == true) {
                count++;
            }
            isFlag = true;
        }

/*        ls:for (int i = 2; i <= num; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue ls;
                }
            }
            count++;
        }*/
        long end = System.currentTimeMillis();
        System.out.println("작동시간은:" + (end - start));
        System.out.println("개수는:" + count);
    }
}
