package learninging0910.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask ft = new FutureTask(new Callable() {//这是一个匿名内部类
            @Override
            public Object call() throws Exception {
                //Callable方法相当于run方法，但是Callable方法有返回值
                System.out.println("collable begin!");
                Thread.sleep(1000*10);
                System.out.println("collable end!");
                return 100;//随便返回个东西
            }
        });
        //创建线程对象
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println("1");
        //这是main方法，也就是主线程
        //需要获取thread线程的结果
        ft.get();//会造成main方法堵塞
        System.out.println("拿到的线程执行结果------>"+ft.get());
        System.out.println("123");
    }
}
