package exer;

/**
 * @author yong
 * @date 2020-12-15 오후 2:43
 * @mail yongri1115@163.com
 */
public class Girl {
    private String name;
    private int age;
    public Girl() {

    }

    public Girl(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我要娶"+boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl){
        return this.age - girl.getAge();
    }
}
