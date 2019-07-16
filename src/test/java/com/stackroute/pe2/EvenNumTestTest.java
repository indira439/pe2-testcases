package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest evenNumTest;

    @Before
    public void setUp() throws Exception {
        this.evenNumTest = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
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

    @Test(expected = InvalidParameterException.class)
    public void givenInputAsACharacterShouldThrowException() {
        //act
        boolean actualResult = evenNumTest.isEven("a");
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        //act
        boolean actualResult = evenNumTest.isEven(null);
    }

}