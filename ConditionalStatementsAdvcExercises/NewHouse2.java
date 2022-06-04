package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class NewHouse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerTypes = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;


        if (flowerTypes.equals("Roses") && (countFlowers > 80)) {
            price = (countFlowers * 5) - (countFlowers * 5) * 0.10;
        } else if (flowerTypes.equals("Roses") && (countFlowers <= 80)) {
            price = countFlowers * 5;
        }else if (flowerTypes.equals("Dahlias") && (countFlowers > 90)) {
            price = (countFlowers * 3.80) - (countFlowers * 3.80) * 0.15;
        } else if (flowerTypes.equals("Dahlias") && (countFlowers <= 90)) {
            price = countFlowers * 3.80;
        }else if (flowerTypes.equals("Tulips") && (countFlowers > 80)) {
            price = (countFlowers * 2.80) - (countFlowers * 2.80) * 0.15;
        } else if (flowerTypes.equals("Tulips") && (countFlowers <= 80)) {
            price = countFlowers * 2.80;
        }else if (flowerTypes.equals("Narcissus") && (countFlowers < 120)) {
            price = (countFlowers * 3.00) + (countFlowers * 3.00) * 0.15;
        } else if (flowerTypes.equals("Narcissus") && (countFlowers >= 120)) {
            price = countFlowers * 3.00;
        }else if (flowerTypes.equals("Gladiolus") && (countFlowers < 80)) {
            price = (countFlowers * 2.50) + (countFlowers * 2.50) * 0.20;
        } else if (flowerTypes.equals("Gladiolus") && (countFlowers >= 80)) {
            price = countFlowers * 2.50;
        }

        double leftSum = Math.abs(budget-price);

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowerTypes, leftSum);
        } else if(price>budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", leftSum);
        }
    }
}

