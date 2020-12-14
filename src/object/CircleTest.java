package object;

/**
 * @author yong
 * @date 2020-12-11 오후 12:50
 * @mail yongri1115@163.com
 */
public class CircleTest {
    public static void main(String[] args) {
        Circles cl = new Circles();
        cl.radius = 3.8;
        double area = cl.findArea();
        System.out.println(area);
    }
}
class Circles{
    double radius;
    public double findArea(){
        double area = Math.PI * radius * radius;
        System.out.println(Math.PI);
        return area;
    }
}
