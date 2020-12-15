package object;

/**
 * @author yong
 * @date 2020-12-15 오후 12:23
 * @mail yongri1115@163.com
 */
public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age);
        User u1 = new User(2);
        System.out.println(u1.age);
        u1.setAge(3);
        System.out.println(u1.age);
        Customer ct = new Customer();
    }
}

class User{
    String name;
    int age = 1;

    public User(){

    }

    public User(int a){
        age = a;
    }

    public void setAge(int a){
        age = a;
    }
}