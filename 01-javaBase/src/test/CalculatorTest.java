package test;

import JUnit.Calculator;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void init() {
        System.out.println("init...");
    }

    @After
    public void close() {
        System.out.println("close...");
    }

    @Test
    public void testAdd() {
        System.out.println("我被执行了");
        System.out.println("testAdd...");
        Calculator c = new Calculator();
        int result = c.add(1, 3);
        System.out.println(result);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSub() {
        System.out.println("我被执行了");
        System.out.println("testAdd...");
        Calculator c = new Calculator();
        int result = c.sub(1, 3);
        System.out.println(result);
        Assert.assertEquals(-2, result);
    }
}
