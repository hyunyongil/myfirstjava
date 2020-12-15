package object;

/**
 * @author yong
 * @date 2020-12-15 오전 9:34
 * @mail yongri1115@163.com
 */
public class Person1 {
    private  int age;
    public  void setAge(int a){
        if(a < 0 || a > 130){
            System.out.println("불법");
            return;
        }
        age = a;
    }

    public int getAge(){
        return age;
    }
}
