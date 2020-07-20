package com.company;

// Exercise 17

public class EvenDigitSum {

//    public static boolean evenNumber(int number) {
//        if((number % 2) == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static int getEvenDigitSum(int number){
        // return -1 if negative
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        while(number > 0){
            int lastDigit = number % 10;
            number /= 10;
            if((lastDigit % 2) != 0){
                continue;
            } else {
                sum += lastDigit;
            }

        }
        return sum;

    }
}
