package com.stackroute.pe2;

import java.security.InvalidParameterException;

public class EvenNumTest {

    public String isEven(int inputNumber){
        /*
        This method will return "Only positive numbers" if the
        passed number is lesser than 0.
        If the passed number is greater than 0 then it will return
        true if the number is divided by 2 otherwise it will return
        false.
         */
        if (inputNumber >= 0) {
            return (inputNumber % 2 == 0) ? "True" : "False";
        }
        else{
            return "Only positive numbers";
        }
    }

    public void isEven(String inputNumber){
        /*
        If the String value is passed to the isEven() then it will
        throw InvalidParameter Exception.
        If null is received then it will return Null Pointer Exception
         */
        if (inputNumber != null) throw new InvalidParameterException();
        else throw new NullPointerException();
    }


}
