package com.example.primenumbers;

import junitparams.Parameters;
import org.junit.Test;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CommonOperationsTest {

    public CommonOperationsTest() {
    }

    @Test
    @Parameters({"5,2","9,3"})
    public void floorRootValue_returnsCorrectResult_correctParameterGiven(int number, int expResult) {
        System.out.println("floorRootValue");
        CommonOperations instance = new CommonOperations();
        int result = instance.floorRootValue(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsDivisible() {
        System.out.println("isDivisible");
        int divident = 4;
        int divisor = 3;
        CommonOperations instance = new CommonOperations();
        boolean expResult = false;
        boolean result = instance.isDivisible(divident, divisor);
        assertEquals(expResult, result);
    }

}

