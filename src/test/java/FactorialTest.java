package test.java;

import Main.Factorial;
import org.testng.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FactorialTest {

    Factorial factorial;

    @BeforeTest
    public void setUp(){
        factorial = new Factorial();
    }

    @Test
    public void factorTest1(){
        Assert.assertEquals(1,factorial.factor(0));
    }

    @Test
    public void factorialTest2(){
        Assert.assertEquals(1,factorial.factor(1));
    }

    @Test
    public void factorialTest3(){
        Assert.assertEquals(120,factorial.factor(5));
    }

    @Test
    public void factorialTest4(){
        Assert.assertEquals(5040,factorial.factor(7));
    }

}
