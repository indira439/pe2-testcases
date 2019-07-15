package com.stackroute.pe2;

import java.util.Scanner;

public class PowerOfFour {

    public static int isPowerOfFour(int n) {
        if(n == 0) {
            return 0;
        }
        while(n != 1) {
            if(n % 4 != 0) {
                return 0;
            }
            else {
                n = n / 4;
            }
        }
        return 1;
    }

    public static void main(String[] args)
    {
        int test_no;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test number");
        test_no = sc.nextInt();

        if(isPowerOfFour(test_no) == 1)
            System.out.println(test_no + " is a power of 4");
        else
            System.out.println(test_no + " is not a power of 4");
    }
}
