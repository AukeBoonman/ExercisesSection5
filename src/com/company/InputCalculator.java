package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        int number = 0;

        while(true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round( (double) sum / counter));
        scanner.close();
    }
}
