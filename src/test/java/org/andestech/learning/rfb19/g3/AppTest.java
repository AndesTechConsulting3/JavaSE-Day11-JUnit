package org.andestech.learning.rfb19.g3;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.*;


public class AppTest 
{

    @BeforeClass
    public static void init(){
        System.out.println("@BeforeClass " );
    }

    @AfterClass
    public static void after(){
        System.out.println("@AfterClass " );
    }

    @Before
    public void beforeMethod(){
        System.out.println("beforeMethod ++");
    }

    @After
    public void afterMethod(){
        System.out.println("afterMethod ++");
    }

    public AppTest(){
        System.out.println("+++ ctor: " + this);
    }


    @Test
public void equalsTest()
{
    assertTrue( 1==1);
    // в учебных целях печатаем имя метода
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
}

    //@Ignore
    @Test
    public void equals2Test()
    {
        assertTrue( 1==1);
        // в учебных целях печатаем имя метода
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

@Test
    public void equals3Test()
    {
      // fail("Always failed!!!");
        int[] arr = {1,2,3};
        arr[2] = 12;
        // в учебных целях печатаем имя метода
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

}
