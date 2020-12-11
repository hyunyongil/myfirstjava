package object;

/**
 * @author yong
 * @date 2020-12-11 오전 8:11
 * @mail yongri1115@163.com
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
    }
}

class Person {
    String name;
    int age = 1;
    boolean isMale;

    public void eat() {
        System.out.println("밥먹고");
    }

    public void sleep() {
        System.out.println("잠자고");
    }

    public void talk(String language) {
        System.out.println("나의 언어는:" + language);
    }
}