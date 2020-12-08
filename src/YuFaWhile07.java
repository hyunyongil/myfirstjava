public class YuFaWhile07 {
    public static void main(String[] args) {
        int i = 50;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        int j = 60;
        do {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        } while (j <= 100);
    }
}
