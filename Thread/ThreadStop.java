package learninging0910.Thread;

public class ThreadStop {
    public static void main(String[] args) {
        MuThread muThread = new MuThread();
        Thread thread = new Thread(muThread);
        thread.setName("t");
        thread.start();
        //模拟运行五秒
        try {
            System.out.println(Thread.currentThread().getName()+"开始运行");
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //主线程结束，
        System.out.println(Thread.currentThread().getName()+"即将终止t");
        muThread.run=false;//想要终止运行时，修改属性为false
    }
}
class MuThread implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName()+"-------->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //可以在这里保存数据
                System.out.println(Thread.currentThread().getName()+"即将执行结束");
                return;
            }
        }
    }
}