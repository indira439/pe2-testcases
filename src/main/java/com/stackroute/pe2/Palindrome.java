package com.stackroute.pe2;


public class Palindrome {

    public String isPalindrome(String inputString) {
        /*
        If a null value is passed to isPalindrome() method then it will
        throw Null Pointer Exception.
        Else, It will return "Given string is a palindrome" if the passed value
        and the reverse of that passed value equals. else it will return
        "Given string is not a palindrome".
         */
        try {
            StringBuilder stringBuilder = new StringBuilder(inputString);
            if (stringBuilder.toString().contentEquals(stringBuilder.reverse().toString())){
                return "Given string is a palindrome";
            }
            else {
                return "Given string is not a palindrome";
            }
        } catch (NullPointerException nullPointerException){
            throw nullPointerException;
        }
    }

    public String isPalindrome(int inputNumber){
        /*
        If any Integer value lesser than 0 is passed to isPalindrome() method
        then it will return "Only give positive numbers greater than 0".
         */
        return "Only give positive numbers greater than 0";
    }


}
