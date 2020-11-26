import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        HellowWorld hw = new HellowWorld();
        hw.dd = 5.4;
        System.out.println(hw.dd);
        int classNum = 2; //반급수량
        int stuNum = 3; //매개 반급 학생수
        double avg = 0; //매개 반급 평균 성적
        for (int i = 1; i <= classNum; i++) {
            int sum = 0; //매개 반급 총성적
            System.out.println("**" + i + "반 성적********");
            for (int j = 1; j <= stuNum; j++) {
                System.out.print(j + "번째 학생의 성적을 입력해주세요: ");
                int score = new Scanner(System.in).nextInt();
                sum += score;
                System.out.println("학생 성적은 " + score + "점 입니다.");
            }

            avg = sum / stuNum;
            System.out.println("**" + i + "반 총 성적: " + sum);
            System.out.println("**" + i + "반 평균 성적: " + avg);
        }
    }
}
