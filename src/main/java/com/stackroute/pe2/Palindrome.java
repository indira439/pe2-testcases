package com.stackroute.pe2;


public class Palindrome {

    public String isPalindrome(String inputString) throws NullPointerException{
        try {
            StringBuilder stringBuilder = new StringBuilder(inputString);
            if (stringBuilder.toString().contentEquals(stringBuilder.reverse().toString())){
                return "Given string is a palindrome";
            }
            else {
                return "Given string is not a palindrome";
            }
        } catch (NullPointerException ex){
            throw ex;
        }
    }

    public String isPalindrome(int inputNumber){
        return "Only give positive numbers greater than 0";
    }


}
