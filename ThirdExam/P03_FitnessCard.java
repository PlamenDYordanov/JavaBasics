package ThirdExam;

import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class P03_FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0;

        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    price = 42;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                } else {
                    price = 35;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                }
                break;
            case "Boxing":
                if (gender.equals("m")) {
                    price = 41;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                } else {
                    price = 37;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                }
                break;
            case "Yoga":
                if (gender.equals("m")) {
                    price = 45;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                } else {
                    price = 42;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                }
                break;
            case "Zumba":
                if (gender.equals("m")) {
                    price = 34;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                } else {
                    price = 31;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                }
                break;
            case "Dances":
                if (gender.equals("m")) {
                    price = 51;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                } else {
                    price = 53;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                }
                break;
            case "Pilates":
                if (gender.equals("m")) {
                    price = 39;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                } else {
                    price = 37;
                    if (age <= 19) {
                        price = price * 0.80;
                    }
                }
                break;

        }
        double diff = price - budget;
        if (budget>=price){
            System.out.printf("You purchased a 1 month pass for %s.%n",sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.%n",diff);
        }
    }
}
