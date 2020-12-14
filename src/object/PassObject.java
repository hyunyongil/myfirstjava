package object;

/**
 * @author yong
 * @date 2020-12-14 오후 2:27
 * @mail yongri1115@163.com
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,5);
        System.out.println("now radius is "+c.radius);
    }
    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tArea");
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea());
        }
        c.radius = time+1;
    }
}
