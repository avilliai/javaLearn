package learninging0910.Thread;

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread threadNow = Thread.currentThread();//获取当前线程对象，当前为主线程
        System.out.println(threadNow.getName());//主线程的名字是main

        Mythread2 mythread2 = new Mythread2();//创建线程对象
        mythread2.setName("线程A");//设置线程名字,默认名字是Thread-0
        System.out.println("当前线程的名字是-->"+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+"即将启动线程A");
        mythread2.start();
    }
}
class Mythread2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"线程执行--->"+i);
        }
    }
}