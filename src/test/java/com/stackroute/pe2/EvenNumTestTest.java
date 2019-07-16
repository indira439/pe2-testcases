package com.stackroute.pe2;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest evenNumTest;

    @BeforeClass
    public void setUp() {
        this.evenNumTest = new EvenNumTest();
    }

    @After
    public void tearDown() {
        evenNumTest= null;
    }

    @Test
    public void givenAnEVentIntegerShouldReturnTrue() {
        //act
        boolean actualResult = evenNumTest.isEven(6);
        //assert
        assertEquals("True",actualResult);

    }

    @Test
    public void givenAnOddIntegerShouldReturnFalse() {
        //act
        boolean actualResult = evenNumTest.isEven(7);
        //assert
        assertEquals("False",actualResult);

    }
    @Test
    public void givenAnEVentIntegerShouldReturnTrueFailure() {
        //act
        boolean actualResult = evenNumTest.isEven(6);
        //assert
        assertNotEquals("False",actualResult);

    }

    @Test
    public void givenAnOddIntegerShouldReturnFalseFailure() {
        //act
        boolean actualResult = evenNumTest.isEven(7);
        //assert
        assertNotEquals("True",actualResult);

    }

    @Test
    public void givenAnNegativeIntegerShouldThrowError() {
        //act
        boolean actualResult = evenNumTest.isEven(-6);
        //assert
        assertEquals("Only positive numbers",actualResult);

    }

    @Test(expected = InvalidParameterException.class)
    public void givenStringShouldThrowInvalidParameterException() {
        //act
        boolean actualResult = evenNumTest.isEven("indu");
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        //act
        boolean actualResult = evenNumTest.isEven(null);
    }

}