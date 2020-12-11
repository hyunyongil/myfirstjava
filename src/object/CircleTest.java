package object;

/**
 * @author yong
 * @date 2020-12-11 오후 12:50
 * @mail yongri1115@163.com
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3.6;
        double area = c1.findArea();
        System.out.println(area);
    }
}
class Circle{
    double radius;
    public double findArea(){
        double area = 3.14 * radius * radius;
        return area;
    }
}
