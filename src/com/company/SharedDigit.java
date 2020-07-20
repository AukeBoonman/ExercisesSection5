package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        if(first < 10 || first > 99 || second > 99 || second < 10) {return false;}
        int firstSecond = first %10;
        int firstFirst = first / 10;
        int secondSecond = second %10;
        int secondFirst = second / 10;
        if(firstSecond == secondFirst || firstSecond == secondSecond) {
            return true;
        }
        if(firstFirst == secondFirst || firstFirst == secondSecond) {
            return true;
        } else {
            return false;
        }
    }
}
