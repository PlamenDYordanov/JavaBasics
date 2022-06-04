package WhileLoopMoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Ако продуктът надвишава 100лв., за него не може да се плати в брой
//        •	Ако продуктът е на цена под 10лв., за него не може да се плати с кредитна карта
//          Програмата приключва или след като получим команда "End" или след като средствата бъдат събрани.
        int requireSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int totalSumLeft = requireSum;
        int counter = 0;
        boolean isSave = false;
        int counterCash = 0;
        int counterCard = 0;
        int totalSumCash = 0;
        int totalSumCard = 0;


        while (!input.equals("End")) {
            int priceForGift = Integer.parseInt(input);
            counter++;
            if (counter % 2 == 1) {
                if (priceForGift > 100) {
                    System.out.println("Error in transaction!");

                } else {
                    totalSumLeft = totalSumLeft - priceForGift;
                    System.out.println("Product sold!");
                    counterCash++;
                    totalSumCash += priceForGift;
                }
            }
            if (counter % 2 == 0) {
                if (priceForGift < 10) {
                    System.out.println("Error in transaction!");

                } else {
                    totalSumLeft = totalSumLeft - priceForGift;
                    System.out.println("Product sold!");
                    counterCard++;
                    totalSumCard += priceForGift;

                }
                if (totalSumLeft <= 0) {
                    isSave = true;
                    break;
                }

            }
            input = scanner.nextLine();

        }
        if (isSave) {
            double averageCash = totalSumCash * 1.0 / counterCash;
            double averageCard = totalSumCard * 1.0 / counterCash;
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        }else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}