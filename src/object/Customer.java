package object;

/**
 * @author yong
 * @date 2020-12-15 오후 12:36
 * @mail yongri1115@163.com
 */
public class Customer {
    private int id;
    private String name;
    public Customer(){
        System.out.println(this.name);
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
