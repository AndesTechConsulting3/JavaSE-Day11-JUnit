package org.andestech.learning.rfb19.g3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    private static final double BALANCE = 200.0;
    private static Account account;

    @Before
    public void initAccout(){
        account = new Account(BALANCE);

    }


    @Test
    public void positiveWithdrawlTest() throws AccountException
    {
        double delta = 20;
        double expected_balance = 180;

        account.withdrawal(delta);
        double actual = account.getBalance();

        Assert.assertEquals(expected_balance,actual,1e-13);


    }



    @Test(expected = AccountException.class)
    public void negativeWithdrawlTest() throws AccountException {
        double delta = 195;
        double expected_balance = 5;

        account.withdrawal(delta);
        double actual = account.getBalance();

       // Assert.assertEquals(expected_balance,actual,1e-13);

    }

}
