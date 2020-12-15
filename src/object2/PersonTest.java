package object2;

/**
 * @author yong
 * @date 2020-12-15 오후 12:49
 * @mail yongri1115@163.com
 */
class Person{
    String name;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void eat(){
        System.out.println("chifan");
        this.study();
    }
    public void study(){
        System.out.println("xuexi");
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(1);
        System.out.println(p1.getAge());
        p1.eat();
    }
}



