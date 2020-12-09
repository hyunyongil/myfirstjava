package yufa;

public class YuFa01 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = -128;
        System.out.println(b1);
        System.out.println(b2);

        short s1 = 12;
        int i1 = 123;
        long l1 = 1231244L;

        System.out.println(l1);

        double d1 = 234.54;
        System.out.println(d1+1);

        float f1 = 12.3F;
        System.out.println(f1);

        char c1 = 'a';
        char c2 = '\n';
        char c3 = '\u0049';
        char c4 = '囧';
        System.out.println(c1);
        System.out.print(c2);
        System.out.println(c3);
        System.out.println(c4);

        boolean bl1 = true;
        System.out.println(bl1);

        char c = 'a'; // a:97 A:65
        int num = 10;
        String str = "hello";
        System.out.println(c+ num + str); //107hello
        System.out.println(c+ str + num); //ahello10
        System.out.println(c+ (num + str));//a10hello
        System.out.println((c+ num) + str);//107hello
        System.out.println(str + num + c);//hello10a

    }
}
