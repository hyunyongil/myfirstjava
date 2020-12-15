package exer;

/**
 * @author yong
 * @date 2020-12-15 오후 2:36
 * @mail yongri1115@163.com
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    public Boy(String name, int age) {
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

    public void marry(Girl girl){
        System.out.println("我要娶"+girl.getName());
    }
    public void shout(){
        if(this.age >= 22){
            System.out.println("你可以合法登记了");
        }else{
            System.out.println("先谈恋爱吧");
        }
    }

    /**
     *
     * @param girl
     * @return
     */
    public int compare(Girl girl){
        return this.age - girl.getAge();
    }
}
