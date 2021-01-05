package com.yong.day16.exer;

/**
 * @author yong
 * @date 2021-01-05 오전 9:29
 * @mail yongri1115@163.com
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result = ecm(i,j);
            System.out.println(result);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组异常");
        }catch (EcDef ecDef) {
            ecDef.printStackTrace();
        }
    }

    public static int ecm(int i, int j) throws EcDef {
        if(i < 0 || j < 0){
            throw  new EcDef("分子或分母为负数了！");
        }
        return i/j;
    }
}
