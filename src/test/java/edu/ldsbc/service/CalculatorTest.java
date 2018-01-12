package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    public void add() throws Exception {

        assertEquals(2, calculator.add(1,1));
        assertEquals(0, calculator.add(1,-1));
        assertEquals(3, calculator.add(2,1));
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(0, calculator.subtract(1,1));

    }

    @Test
    public void multiply() throws Exception {
        assertEquals(2, calculator.multiply(1,2));

    }

    @Test
    public void divide() throws Exception {
        assertEquals(2, calculator.divide(4,2));

    }
}