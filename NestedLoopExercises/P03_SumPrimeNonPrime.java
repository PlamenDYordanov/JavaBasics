package NestedLoopExercises;

import java.util.Scanner;

public class P03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int counter = 0;
        int prime = 0;
        int nonPrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            if (number != 1 && number != 0) {
                if (number % 2 == 0 && number > 2) {
                    counter++;
                } else if (number % 3 == 0 && number > 3) {
                    counter++;
                } else if (number % 5 == 0 && number > 5) {
                    counter++;
                }
                if (counter > 0) {
                    nonPrime = nonPrime + number;
                } else {
                    prime = prime + number;
                }
                counter = 0;
            }
            input = scanner.nextLine();

        }
        System.out.printf(  "Sum of all prime numbers is: %d%n",prime);
        System.out.printf("Sum of all non prime numbers is: %d%n",nonPrime);

    }
}