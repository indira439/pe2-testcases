package com.stackroute.pe2;

import java.security.InvalidParameterException;

public class EvenNumTest {

    public String isEven(int inputNumber){
        if (inputNumber >= 0) {
            return (inputNumber % 2 == 0) ? "True" : "False";
        }
        else{
            return "Only positive numbers";
        }
    }

    public void isEven(String inputNumber){
        if (inputNumber != null) throw new InvalidParameterException();
        else throw new NullPointerException();
    }


}
