package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOError;
import java.io.IOException;

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

    @Test(expected = IOException.class)
    public void givenLongIntegerShouldThrowNullPointException() {
        //act
        String actualResult = powerOfFour.isPowerOfFour(1111111111);
    }

}