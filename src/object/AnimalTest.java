package object;

/**
 * @author yong
 * @date 2020-12-15 오전 8:12
 * @mail yongri1115@163.com
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.setAge(51);
        a.show();
        a.setLegs(8);
        a.show();
/*        int le = a.getLegs();
        System.out.println(le);

        int ag = a.getAge();
        System.out.println(ag);*/

    }
}

class Animal {
    String name;
    private int age;
    private int legs;//脚的个数

    public void setAge(int a) {
        if (a > 30 && a < 60) {
            age = a;
        } else {
            age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }

    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("먹다");
    }

    public void show() {
        System.out.println("name=" + name + ", age=" + age + ", legs=" + legs);
    }
}
