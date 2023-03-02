package learninging0910.reflect;

import java.lang.reflect.Method;

public class MyAnnotationTest01 {
    @MyAnnotation(name = "skadi",password = "w123")
    public void doSome() {

    }
    //通过反射机制获取注解
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("learninging0910.reflect.MyAnnotationTest01");
        //通过反射获取方法
        Method method= c.getDeclaredMethod("doSome");
        if (method.isAnnotationPresent(MyAnnotation.class)){
            //获取注解
            MyAnnotation myAnnotation=method.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.name());
            System.out.println(myAnnotation.password());
        }
    }
}
