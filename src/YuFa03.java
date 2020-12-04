public class YuFa03 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1);

        double result3 = (double) num1 / num2;
        System.out.println(result3);
        //연습1
        int i = 1;
        i *= 0.1;
        System.out.println(i);
        //연습2
        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m=" + m);//3
        System.out.println("n=" + n);//6
        //연습3
        int ns = 10;
        ns += (ns++) + (++ns);
        System.out.println(ns);//32

        int i1 = 10;
        int j1 = 20;
        System.out.println(i1 == j1);
        System.out.println(i1 = j1);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);
        System.out.println(b2 = b1);

        boolean bo1 = true;
        bo1 = false;
        int numb1 = 10;
        if (bo1 & (numb1++ > 0)) {
            System.out.println("111");
        } else {
            System.out.println("222");
        }
        System.out.println(numb1);

        boolean bo2 = true;
        bo2 = false;
        int numb2 = 10;
        if (bo2 && (numb2++ > 0)) {
            System.out.println("111");
        } else {
            System.out.println("222");
        }
        System.out.println(numb2);

        boolean bo3 = false;
        //bo3 = true;
        int numb3 = 10;
        if (bo3 | (numb3++ > 0)) {
            System.out.println("1111111");
        } else {
            System.out.println("2222222");
        }
        System.out.println(numb3);

        boolean bo4 = false;
        //bo4 = true;
        int numb4 = 10;
        if (bo4 || (numb4++ > 0)) {
            System.out.println("1111111");
        } else {
            System.out.println("2222222");
        }
        System.out.println(numb4);

        int x = 1;
        int y = 1;
        if (x++ == 2 & ++y == 2) {
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);//2,2

        int x1 = 1, y1 = 1;
        if (x1++ == 1 | ++y1 == 1) {
            x1 = 7;
        }
        System.out.println("x1=" + x1 + ",y1=" + y1);//7,2

        boolean x2 = true;
        boolean y2 = false;
        short z2 = 42;
        if ((z2++ == 42) && (y2 = true)) z2++;//44
        System.out.println("z=" + z2);
        if ((x2 = false) || (++z2 == 45)) z2++;
        System.out.println("z=" + z2);//46

        int si = 21;
        System.out.println("si << 2: " + (si << 2));
        System.out.println("si << 3: " + (si << 3));

        int m2 = 12;
        int n2 = 5;
        System.out.println("m & n :" + (m2 & n2));
        System.out.println("m & n :" + (m2 | n2));
        System.out.println("m & n :" + (m2 ^ n2));

        int num11 = 10;
        int num22 = 20;
        int nums;
        nums = num11;
        num11 = num22;
        num22 = nums;
        System.out.println(num11);
        System.out.println(num22);
        num11 = num11 + num22;
        num22 = num11 - num22;
        num11 = num11 - num22;
        System.out.println(num11);
        System.out.println(num22);

        int num33 = 54;
        int num44 = 57;
        int max = (num33 > num44) ? num33 : num44;
        System.out.println(max);
        String num55 = (num33 > num44) ? "33큼" : (num33 == num44) ? "m=n같음" : "n큼";
        System.out.println(num55);

        int ns1 = 12;
        int ns2 = 32;
        int ns3 = -61;
        int max1 = (ns1 > ns2)?ns1:ns2;
        int max2 = (max1 > ns3)?max1:ns3;
        System.out.println(max2);

        if(ns1 > ns2){
            System.out.println(ns1);
        }else{
            System.out.println(ns2);
        }
    }
}
