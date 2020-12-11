package object;

/**
 * @author yong
 * @date 2020-12-10 오후 3:51
 * @mail yongri1115@163.com
 */
public class Oop01 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
        p.sendEmail();
        p.playGame();
        //匿名对象
        new Phone().price = 1999;
        new Phone().showPrice();
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());
    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}

class Phone {
    double price;
    public void sendEmail(){
        System.out.println("메일발송");
    }
    public void playGame(){
        System.out.println("게임하기");
    }
    public void showPrice(){
        System.out.println("핸드폰 가격은: "+price);
    }
}
