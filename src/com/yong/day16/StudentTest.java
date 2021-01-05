package com.yong.day16;

/**
 * @author yong
 * @date 2021-01-05 오전 9:01
 * @mail yongri1115@163.com
 */
public class StudentTest {

    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
class Student{
    private int  id;

    @Override
    public String toString() {
        return "StudentTest{" +
                "id=" + id +
                '}';
    }

    public void regist(int id) throws Exception{
        if(id > 0){
            this.id = id;
        }else{
//            System.out.println("数据非法！");
            //throw new RuntimeException("数据非法！");
            throw new Exception("数据非法！");
        }
    }
}