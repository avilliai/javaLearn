package learninging0910.Thread;

public class ThreadSleep {
    public static void main(String[] args) {
       /* try {
            Thread.sleep(1000*5);//让当前线程睡眠五秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");

        */
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"------->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
