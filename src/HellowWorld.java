import java.util.Arrays;
import java.util.Scanner;

public class HellowWorld {
    double dd;
    public static void main(String[] args) {
        System.out.print("请输入用户初始分数：");
        int num = new Scanner(System.in).nextInt();
        int count = 0;
        if (num >= 0 && num <= 999999999) {
            while (num != 0) {
                count++;
                num = num / 10;
            }

            System.out.println("它是个" + count + "位的数！");
        } else {
            System.out.println("输入有误 ~");
        }
        int[] scores = {11, 22, 33, 44};
        System.out.println(scores[1]);
        String[] hobbys = {"h1", "h2", "h3", "h4"};
        for(int i = 0;i<hobbys.length;i++){
            System.out.println(hobbys[i]);
        }


        // 定义一个整型数组，并赋初值
        int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };

        int max = nums[0]; // 假定最大值为数组中的第一个元素
        int min = nums[0]; // 假定最小值为数组中的第一个元素
        double sum = 0;// 累加值
        double avg = 0;// 平均值

        for (int i = 0; i < nums.length; i++) { // 循环遍历数组中的元素
            // 如果当前值大于max，则替换max的值
            if(nums[i]>max){
                max = nums[i];
            }


            // 如果当前值小于min，则替换min的值
            if(nums[i]<min){
                min = nums[i];
            }


            // 累加求和
            sum+=nums[i];

        }

        // 求平均值
        avg=sum/nums.length;

        System.out.println("数组中的 最大值： " + max);
        System.out.println("数组中的 最小值： " + min);
        System.out.println("数组中的 平均值： " + avg);
        int[] scoreArr = {89, -23, 64, 91, 119, 52, 73, 42, 99, 88};

        System.out.println("考试成绩的前三名为: ");
        HellowWorld hello = new HellowWorld();
        hello.showTop3(scoreArr);
    }

    //定义方法完成成绩排序并输出前三名的功能
    public void showTop3(int[] scores){
        Arrays.sort(scores);
        int num = 0;
        for(int i = scores.length - 1; i>=0; i--){
            if(scores[i] < 0 || scores[i] > 100){
                continue;
            }
            num++;
            if(num > 3){
                break;
            }
            System.out.println(scores[i]);
        }
    }
}
