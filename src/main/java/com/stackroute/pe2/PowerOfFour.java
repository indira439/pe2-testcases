package com.stackroute.pe2;


import java.security.InvalidParameterException;

public class PowerOfFour {
    public String isPowerOfFour(int inputNumber){
        inputNumber = Math.abs(inputNumber);
        while (inputNumber >= 3 || inputNumber == 1){
            if (inputNumber % 4 == 0) {
                inputNumber = inputNumber / 4;
            }
            else if (inputNumber != 1){
                break;
            }
            if (inputNumber == 1){
                return "Given integer is power of 4";
            }
        }
        return "Given integer is not a power of 4";
    }

    public String isPowerOfFour(String inputNumber) {
        if (inputNumber != null) {
            throw new InvalidParameterException();
        }
        throw new NullPointerException();
    }
}
