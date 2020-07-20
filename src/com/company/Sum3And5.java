package com.company;

public class Sum3And5 {
    public static void sum3and5() {
        int count = 0;
        int sum = 0;
        for(int i=1; i<= 1000; i++){
            if((i % 3 == 0) && (i % 5 ==0)){
                System.out.println("Found number = " + i);
                count++;
                sum += i;
            }
            if(count == 5){
                System.out.println("Exiting Loop");
                System.out.println("The sum of these numbers is " + sum);
                break;

            }
        }
    }
}
