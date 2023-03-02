package learninging0910.Thread;
/*
* 获取线程对象
* 获取线程对象地名字
*修改线程对象的名字
*
* */
public class ThreadTest01 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Mythread());
        thread.start();
        for (int a = 0; a < 100; a++) {
            System.out.println("主线程--->"+a);
        }
    }
}
class Mythread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程---->"+i);
        }
    }
}