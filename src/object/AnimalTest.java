package object;

/**
 * @author yong
 * @date 2020-12-15 오전 8:12
 * @mail yongri1115@163.com
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name ="大黄";
        a.age =1;
        a.legs =4;
        a.show();
        a.setLegs(5);
        a.show();
    }
}

class Animal {
    String name;
    int age;
    int legs;//脚的个数

    public void setLegs(int l){
        if(l >= 0 && l%2 == 0){
            legs = l;
        }else{
            legs = 0;
        }
    }

    public void eat() {
        System.out.println("먹다");
    }

    public void show() {
        System.out.println("name="+name+", age="+age+", legs="+legs);
    }
}
