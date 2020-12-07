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
        for (int i = 1; i <= 150; i++) {
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
        }
    }
}
