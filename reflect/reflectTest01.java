package learninging0910.reflect;
/*
*
*获取类字节码的三种方式
*
*
* */
public class reflectTest01 {
    public static void main(String[] args) {
        //拿到一个类,第一种方式
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");
            Class c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第二种方式，java中任何对象都有一个方法 getClass()
        String s = "a";
        Class X= s.getClass();//X代表String.class字节码文件
        System.out.println(c1 ==X);//true 指向同一个字节码文件

        //第三种
        Class z = String.class;//String类
    }
}
