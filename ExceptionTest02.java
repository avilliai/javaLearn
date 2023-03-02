package learninging0910;

public class ExceptionTest02 {
    public static void main(String[] args) {
        //调用dosome时必须先对这种异常进行处理,否则报错
        try {
            dosome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //表示dosome运行过程中可能出现ClassNotFoundException异常
    public static void dosome() throws ClassNotFoundException{
        System.out.println("dosome");
    }
}
