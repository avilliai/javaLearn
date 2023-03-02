package learninging0910.WN;

import java.util.ArrayList;
import java.util.List;

/*让正在o对象上活动的线程进入等待并释放t之前占有的o对象的锁
* o.wait();
*--------------------------------
* 模拟如下需求
* 仓库采用list集合，假设集合中只能存储一个元素
*
*
*
*
* */
public class ThreadR {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        Thread p1 = new Thread(new producer(list));
        Thread c1 = new Thread(new consumer(list));
        p1.setName("生产者线程");
        c1.setName("消费者线程");
        p1.start();
        c1.start();



    }
}

//生产者线程
class producer implements Runnable{
    private List list;//这样才能有一个共享的对象,假设他就是仓库

    public producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list) {//锁定list集合（仓库）
                if (list.size() > 10) {//大于0说明当前仓库里已经有一个元素了
                    //当前线程进入等待状态，并且释放list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这里说明仓库是空的，可以生产
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+" 生产成功");
                list.notify();
            }
        }
    }
}

//消费者线程
class consumer implements Runnable{
    private List list;

    public consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if (list.size()==0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.remove(0);//清除对应元素仓库模拟消费
                System.out.println(Thread.currentThread().getName()+" 消费了线程");
                //执行到这里需要唤醒生产者生产
                list.notify();//唤醒list对象上的所有线程。注意notify不会释放锁，只有在这里结束后才能释放锁
            }
        }
    }
}