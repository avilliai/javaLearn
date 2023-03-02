package learninging0910.ThreadTest;

public class Test {
    public static void main(String[] args) {
        account account = new account("funny",10000.00);
        accountThread accountThread1 = new accountThread(account);
        accountThread accountThread2 = new accountThread(account);
        accountThread1.setName("T1");
        accountThread2.setName("T2");
        accountThread1.start();
        accountThread2.start();
    }
}
