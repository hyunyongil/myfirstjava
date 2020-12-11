package object;

/**
 * @author yong
 * @date 2020-12-11 오후 1:16
 * @mail yongri1115@163.com
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stus = new Student[20];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].number = (i + 1);
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int) (Math.random() * (100 - 0 + 1));
        }
        StudentTest test = new StudentTest();
        test.print(stus);
        System.out.println();
        test.searchState(stus, 3);
        System.out.println();
        test.sort(stus);
        test.print(stus);
    }

    public void print(Student[] stus) {
        for (int i = 0; i < stus.length; i++) {
            String nuku = stus[i].info();
            System.out.println(nuku);
        }
    }

    public void searchState(Student[] stus, int state) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == state) {
                String nuku = stus[i].info();
                System.out.println(nuku);
            }
        }
    }

    public void sort(Student[] stus) {
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }

}

class Student {
    int number;
    int state;
    int score;

    public String info() {
        return number + ", " + state + ", " + score;
    }
}
