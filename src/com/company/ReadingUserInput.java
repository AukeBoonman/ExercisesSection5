package com.company;

import java.util.Scanner;

public class ReadingUserInput {
//    public static void ReadingUserInput() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//
//        //this next bit is in case the input is NOT an int.
//        boolean hasNextInt = scanner.hasNextInt(); // this checks if the input is an int. if it doesn't qualify as int, method will return false. if true, continue our code.
//
//        if(hasNextInt){
//
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // to handle next line character (the enter key, which is pressed as 'okay' after the year was entered)
//            // without this, you don't get a chance to enter your name.
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2020 - yearOfBirth;
//
//            // if statement for valid input. So if negative year of birth or something unrealistic
//            if(age >= 0 && age <= 100){
//                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//
//        } else {
//            System.out.println("Unable to parse year of birth.");
//        }
//
//        scanner.close();
//    }





    public static void ReadingUserInputChallenge() {
//read 10 numbers from the console entered by the user and print the sum of those numbers
// create a scanner
// use hasNextInt() to check if the user has entered an int value
// if hasNextInt() is false, print "Invalid Number". Continue reading until you have read 10 numbers
// use nextInt() to get number and add it to the sum.

        Scanner scanner = new Scanner(System.in);

        int nextNumber = 1;
        int sum = 0;
        while (nextNumber <= 10) {


            System.out.println("Enter number #" + nextNumber + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {

                int number = scanner.nextInt();

                sum += number;
                nextNumber++;

            } else {
                System.out.println("Invalid value");

            }
            scanner.nextLine();
        }
        System.out.println("The sum is " + sum + ".");

        scanner.close();
    }

}
