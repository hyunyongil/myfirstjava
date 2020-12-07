import java.util.Scanner;

public class YuFa04 {
    public static void main(String[] args) {
/*        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 이름 적어주세요: ");
        String name = scan.next();
        System.out.print("당신의 몸무게를 적어주세요: ");
        double weight = scan.nextDouble();
        System.out.print("당신의 심장박동수를 적어주세요: ");
        int hearBeats = scan.nextInt();
        if(hearBeats < 60 || hearBeats >100){
            System.out.println("검사결과: 진일보 검사");
        }else{
            System.out.println("검사결과: 검강함");
        }
        System.out.println("검사끝");*/
/*        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 <= num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        } else {
            if (num3 >= num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num3 <= num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }*/
        int rand = (int)(Math.random() * (9-6+1)+6);//[6~9]
        System.out.println(rand);
/*        Scanner scan = new Scanner(System.in);
        int dogAge = scan.nextInt();
        if(dogAge >=0 && dogAge <=2){
            System.out.println("강아지 나이는:"+dogAge*10.5);
        }else if(dogAge > 2){
            System.out.println("강아지 나이는:"+(2*10.5+(dogAge -2) *4));
        }else{
            System.out.println("강아지 아직 태어안남");
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("당신의 키는(cm)");
        int height = scan.nextInt();
        System.out.println("당신의 재산은(천만):");
        double wealth = scan.nextDouble();
        System.out.println("당신의 미남인가요(네/아니오):");
        String isHandsome = scan.next();
        if(height >= 180 && wealth >=1 && isHandsome.equals("네")){
            System.out.println("당장 결혼합시다~!!");
        }else if(height >= 180 || wealth >=1 || isHandsome.equals("네")){
            System.out.println("결혼 가능성은 있다만..");
        }else{
            System.out.println("꺼져~!");
        }
    }
}
