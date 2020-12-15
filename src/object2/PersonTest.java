package object2;

/**
 * @author yong
 * @date 2020-12-15 오후 12:49
 * @mail yongri1115@163.com
 */
class Person{
    String name;
    int age;
    public Person(){
        System.out.println("40***");
    }
    public Person(int age){
        this();
        this.age = age;
    }
    public Person(String name,int age){
        this(age);
        this.name = name;
        this.age = age;
    }
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
        System.out.println(this.name+", chifan");
        this.study();
    }
    public void study(){
        System.out.println(this.age+", xuexi");
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("dd",43);
        System.out.println(p1.getAge());
        p1.eat();
    }
}



