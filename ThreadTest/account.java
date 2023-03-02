package learninging0910.ThreadTest;

public class account {
    private String accountNo;
    private double balance;

    public account(String F, double v) {
        this.accountNo= F;
        this.balance =v;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //  public synchronized void withdraw(double money){//也可以这样
    public void withdraw(double money){
        double before = this.getBalance();
        double after = before-money;
        //在此模拟网络延迟
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setBalance(after);
    }
}
