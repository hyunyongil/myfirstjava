package object;

/**
 * @author yong
 * @date 2020-12-15 오전 9:02
 * @mail yongri1115@163.com
 */
public class Orders {
    private  int orderPrivate;
    int orderDefault;
    public int orderPublic;
    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 1;
        orderPublic = 1;
    }
    void methodDefault(){

    }
    public  void methodPublic(){

    }
}
