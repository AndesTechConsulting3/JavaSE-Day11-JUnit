package org.andestech.learning.rfb19.g3;

public class Account {

    private  static double MIN_BALANCE=10, MAX_BALANCE=1e6;
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdrawal(double money) throws AccountException
    {
        if(money<0) throw new AccountException("negative money: " + money);
        double result = balance - money;
        if(result < MIN_BALANCE) throw new AccountException("minimal balance violation: " + result);

        balance = result;
    }
}
