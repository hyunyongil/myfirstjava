import java.util.Scanner;

public class YuFa05 {
    public static void main(String[] args) {
/*        int number = 2;
        switch (number){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = scan.nextInt();
        System.out.print("请输入月数:");
        int month = scan.nextInt();
        System.out.print("请输入日数:");
        int day = scan.nextInt();
        int allDay = 0;
        switch (month){
            case 12:
                allDay += 30;
            case 11:
                allDay += 31;
            case 10:
                allDay += 30;
            case 9:
                allDay += 31;
            case 8:
                allDay += 31;
            case 7:
                allDay += 30;
            case 6:
                allDay += 31;
            case 5:
                allDay += 30;
            case 4:
                allDay += 31;
            case 3:
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    allDay += 29;
                }else{
                    allDay += 28;
                }
            case 2:
                allDay += 31;
            case 1:
                allDay += day;
        }
        System.out.println(allDay);
    }
}
