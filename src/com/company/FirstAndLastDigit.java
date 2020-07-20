package com.company;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int lastDigit = number%10;
        while(number > 9){
            number /= 10;
        }
        int sum = lastDigit + number;
        return sum;
    }
}
