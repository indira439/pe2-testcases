package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour powerOfFour;

    @Before
    public void setUp() throws Exception {
        this.powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        powerOfFour= null;
    }

    @Test
    public void givenAnIntegerShouldReturnIsPowerOfFour() {
        //act
        String actualResult = powerOfFour.isPowerOfFour(16);
        //assert
        assertEquals("Given integer is power of 4",actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnIsNotAPowerOfFour() {
        //act
        String actualResult = powerOfFour.isPowerOfFour(20);
        //assert
        assertEquals("Given integer is not a power of 4",actualResult);
    }

    @Test
    public void givenAnNegativeIntegerShouldReturnIsPowerOfFour() {
        //act
        String actualResult = powerOfFour.isPowerOfFour(-16);
        //assert
        assertEquals("Given integer is power of 4",actualResult);
    }

    @Test
    public void givenZeroShouldReturnErrorMessage() {
        //act
        String actualResult = powerOfFour.isPowerOfFour(0);
        //assert
        assertEquals("Enter input greater than zero",actualResult);
    }

    @Test(expected = InvalidParameterException.class)
    public void givenLongIntegerShouldThrowInvalidParameterException() {
        //act
        String actualResult = powerOfFour.isPowerOfFour(1111111111);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        //act
        String actualResult = powerOfFour.isPowerOfFour(null);
    }

}