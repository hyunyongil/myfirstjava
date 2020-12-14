package object;

/**
 * @author yong
 * @date 2020-12-14 오후 2:28
 * @mail yongri1115@163.com
 */
public class Circle {
    double radius;
    public double findArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
