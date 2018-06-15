package com.chocolateminds.primetimetable;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * A JUnit test to check the functionality of the mutliplier
 * Created by mkonda on 15/06/2018.
 */
public class PrimeNumberMultiplierTest {

    PrimeNumberMultiplier multiplier = null;

    @Before
    public void setUp(){
        multiplier = new PrimeNumberMultiplier();
    }
    @Test
    public void testPrimeNumbers(){
        List<Integer> expectedPrimes = new LinkedList<>(Arrays.asList(2,3,5,7));
        List<Integer> actualPrimes = multiplier.getPrimeNumbers(4);
        assertTrue(expectedPrimes.equals(actualPrimes));
    }

    @Test
    public void testIsPrime(){
        assertTrue(multiplier.isPrime(7));
        assertFalse(multiplier.isPrime(28));
    }

    public void testMultiplicationTable(){

    }
}
