package learninging0910.Thread;

public class ThreadSleep01 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Mythread03());
        thread.setName("t");
        thread.start();

        try {
            Thread.sleep(1000*5);
            System.out.println(Thread.currentThread().getName()+"即将进入睡眠");
        } catch (InterruptedException e) {//模拟了主线程执行了五秒其他任务
            e.printStackTrace();
        }
        //此时需要终止thread线程的睡眠
        thread.interrupt();//干扰，靠的是触发异常强行终止线程睡眠

    }
}
class Mythread03 implements Runnable{

    @Override
    public void run() {
       System.out.println(Thread.currentThread().getName()+"--开始执行--");
        try {

            System.out.println(Thread.currentThread().getName()+"即将进入一年睡眠");
            Thread.sleep(1000*60*60*24*365);//睡一年的线程
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("线程被叫醒了");

        }
        System.out.println(Thread.currentThread().getName()+"--结束执行--");
    }
}