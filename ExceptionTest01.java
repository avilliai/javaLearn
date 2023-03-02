package learninging0910;

public class ExceptionTest01 {

    public static void main(String[] args) {
        /*以下程序执行过程中出现了异常
        *java提供了对异常的处理方式
        *Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at learninging0910.ExceptionTest01.main(ExceptionTest01.java:7)

       int a=10;
       int b=0;
       int c=a/b;
       System.out.println(a+"/"+b+"="+c);

         */
        //通过异常类实例化异常对象
        NumberFormatException nife = new NumberFormatException("数字格式化似乎出现问题了呢");
        System.out.println(nife);

        //通过异常类创建异常对象
        NullPointerException nisfas = new NullPointerException("这是一个空指针异常的提示");
        System.out.println(nisfas);

        //说明异常在java中以类的形式存在
    }
}
