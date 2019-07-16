package com.stackroute.pe2;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @BeforeClass
    public void setUp() {
        this.palindrome = new Palindrome();
    }


    @After
    public void tearDown() {
        palindrome= null;
    }

    @Test
    public void givenAStringShouldReturnIsPalindrome() {
        //assert
        assertEquals("Given string is a palindrome",palindrome.isPalindrome("madam"));
    }

    @Test
    public void givenAStringShouldReturnNotAPalindrome() {
        //assert
        assertEquals("Given string is not a palindrome",palindrome.isPalindrome("indu"));
    }

    @Test
    public void givenEmptyStringShouldReturnAsPalindrome() {
        //assert
        assertEquals("Given string is a palindrome",palindrome.isPalindrome(" "));
    }

    @Test
    public void givenStringWithWhitespacesShouldReturnAsPalindrome() {
        //assert
        assertEquals("Given string is a palindrome",palindrome.isPalindrome("madam madam   madam"));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointException() {
        //act
        String actualResult = palindrome.isPalindrome(null);
    }

    @Test(expected = InvalidParameterException.class)
    public void givenNegativeValueShouldThrowInvalidParameterException() {
        //act
        String actualResult = palindrome.isPalindrome(-1234);
    }

}