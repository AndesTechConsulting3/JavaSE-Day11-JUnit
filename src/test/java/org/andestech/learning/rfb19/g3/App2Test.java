package org.andestech.learning.rfb19.g3;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class App2Test {

    public App2Test(){
        System.out.println("+++ ctor: " + this);
    }

    @Test
    public void equals4TestMy()
    {
        assertTrue( 1==1);
        // в учебных целях печатаем имя метода
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }


    @BeforeClass
    public static void init(){
        System.out.println("@BeforeClass  App2Test" );
    }

    @AfterClass
    public static void after(){
        System.out.println("@AfterClass App2Test" );
    }

    @Before
    public void beforeMethod(){
        System.out.println("before2Method ++");
    }

    @After
    public void afterMethod(){
        System.out.println("after2Method ++");
    }

}
