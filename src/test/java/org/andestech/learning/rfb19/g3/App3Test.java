package org.andestech.learning.rfb19.g3;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
//import org.junit.runners.


public class App3Test {

    @Rule
   // public static TestRule timeOut = Timeout.millis(10);
    public  Timeout timeOut = Timeout.millis(20);


    @Test(timeout = 100)
    public void calc1Test() throws InterruptedException {
        // calcs
        Thread.sleep(20);
        Assert.assertEquals(1.000345,1.000344,1e-5);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }


    @Test
    public void calc2Test() throws InterruptedException {
        // calcs
        Thread.sleep(10);
        Assert.assertEquals(1.000345,1.000344,1e-5);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }




}
