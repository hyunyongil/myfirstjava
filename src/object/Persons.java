package object;

/**
 * @author yong
 * @date 2020-12-11 오후 12:25
 * @mail yongri1115@163.com
 */
public class Persons {
    String name;
    int age;
    /**
     *  sex:1 남성
     *  sex:2 여성
     */
    int sex;
    public void  study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age:"+age);
    }
    public int addAge(int i){
        age += i;
        return age;
    }
}
