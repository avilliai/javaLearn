package learninging0910.Thread;

public class ThreadProtect {
    public static void main(String[] args) {
        //这是一个守护线程
        Thread t = new BackData();
        t.setName("数据备份线程");
        t.setDaemon(true);//设置为守护线程，随主线程结束
        t.start();

        //在这里写用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"------>"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
class  BackData extends Thread{
    @Override
    public void run() {
        int i =0;
        while (true){
            System.out.println(Thread.currentThread().getName()+"------->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}