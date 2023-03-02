package learninging0910.ThreadTest;

public class accountThread extends Thread{
    private account account;

    public accountThread(learninging0910.ThreadTest.account account) {
        this.account = account;
    }
    public void run(){
        double money = 5000;
        //account.withdraw(money);//这样是不安全的，进行如下修改
        synchronized (account){
            account.withdraw(money);
        }
        System.out.println(Thread.currentThread().getName()+" 对 "+account.getAccountNo()+" 取款成功"+"-------->剩余"+ account.getBalance());
    }
}
