package object;

/**
 * @author yong
 * @date 2020-12-11 오전 8:11
 * @mail yongri1115@163.com
 */
public class PersonTest {
    public static void main(String[] args) {
/*        Person p1 = new Person();
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.walk());
        int[] arr = new int[]{3,5,8,6,5,2,1,9,5};
        String nuku = p2.sort(arr);
        System.out.println(nuku);*/
        Persons p1 = new Persons();
        p1.name="Tome";
        p1.sex = 1;
        p1.age = 18;
        p1.study();
        p1.showAge();
        p1.addAge(2);
        System.out.print(p1.name+" 신규 나이는 :");
        p1.showAge();
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

    public String walk(){
        return "걸어요";
    }
    public String sort(int[] arr){
        return "배열정렬완료";
    }
}