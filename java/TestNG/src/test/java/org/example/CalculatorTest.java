package org.example;

import static org.testng.Assert.*;

public class CalculatorTest {
    Calculator c=new Calculator();

    @org.testng.annotations.Test
    public void testAdd() {
        assertEquals(30,c.add(10,20));

    }

    @org.testng.annotations.Test
    public void testSub() {
        assertEquals(10,c.sub(30,20));
    }

    @org.testng.annotations.Test
    public void testMul() {
        assertEquals(200,c.mul(10,20));
    }

    @org.testng.annotations.Test
    public void testDiv() {
        assertEquals(2,c.div(6,3));
        assertThrows(IIException.class,()->c.div(0,12));
    }
}