package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerTypes = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = countFlowers * 5;
        double priceDalia = countFlowers * 3.80;
        double priceTulip = countFlowers * 2.80;
        double priceNarcissus = countFlowers * 3.00;
        double priceGladiolus = countFlowers * 2.50;
        double price = 0.0;
        if (flowerTypes.equals("Roses")) {
            if (countFlowers > 80) {
                price = priceRoses - (priceRoses * 0.10);
            } else {
                price = priceRoses;
            }
        } else if (flowerTypes.equals("Dahlias")) {
            if (countFlowers > 90) {
                price = priceDalia - (priceDalia * 0.15);
            } else {
                price = priceDalia;
            }
        } else if (flowerTypes.equals("Tulips")) {
            if (countFlowers > 80) {
                price = priceTulip - (priceTulip * 0.15);
            } else {
                price = priceTulip;
            }
        } else if (flowerTypes.equals("Narcissus")) {
            if (countFlowers >= 0 && countFlowers <= 120) {
                price = priceNarcissus + (priceNarcissus * 0.15);
            } else {
                price = priceNarcissus;
            }
        } else if (flowerTypes.equals("Gladiolus")) {
            if (countFlowers >= 0 && countFlowers <= 80) {
                price = priceGladiolus + (priceGladiolus * 0.20);
            } else {
                price = priceGladiolus;
            }

        }
        double leftSum = Math.abs(budget - price);
        if (budget > price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowerTypes, leftSum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", leftSum);
        }

    }
}
