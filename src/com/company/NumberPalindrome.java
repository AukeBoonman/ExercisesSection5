package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number *= -1;
        }

        int stored = number;
        int reverse = 0;


        while (stored > 0) {
            int lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            stored /= 10;
        }
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}
