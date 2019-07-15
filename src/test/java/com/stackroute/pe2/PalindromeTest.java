package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        this.palindrome = new Palindrome();
    }


    @After
    public void tearDown() throws Exception {
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

}