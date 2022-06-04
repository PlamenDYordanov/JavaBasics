package ConditionalStatementsAdvcMoreExercises;

import java.util.Scanner;

public class P04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classCar = "";
        double totalPrice = 0;
        String car = "";


        if (budget <= 100) {
            classCar = "Economy class";
        } else if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
        } else if (budget > 500) {
            classCar = "Luxury class";
        }

        switch (classCar) {
            case "Economy class":
                if (season.equals("Summer")) {
                    totalPrice = budget * 0.35;
                    car = "Cabrio";
                } else if (season.equals("Winter")) {
                    totalPrice = budget * 0.65;
                    car = "Jeep";
                }
                break;
            case "Compact class":
                if (season.equals("Summer")) {
                    totalPrice = budget * 0.45;
                    car = "Cabrio";
                } else if (season.equals("Winter")) {
                    totalPrice = budget * 0.80;
                    car = "Jeep";
                }
                break;
            case "Luxury class":
                if (season.equals("Summer")) {
                    totalPrice = budget * 0.90;
                    car = "Jeep";
                } else if (season.equals("Winter")) {
                    totalPrice = budget * 0.90;
                    car = "Jeep";
                }
                break;
        }

        System.out.printf("%s%n",classCar);
        System.out.printf("%s - %.2f",car,totalPrice);
    }
}

