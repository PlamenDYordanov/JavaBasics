package FirstExam;

import java.util.Scanner;

public class P06_EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCustomers = Integer.parseInt(scanner.nextLine());

        double basketEggs = 1.50;
        double wreath = 3.80;
        double chocolateBunny = 7;

        double sumBaskets = 0;
        double sumWreath = 0;
        double sumChocolateBunny = 0;
        int countParches = 0;
        double totalSum = 0;
        double diffSum = 0;

        for (int i = 1; i <= countCustomers; i++) {
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {

                if (input.equals("basket")) {
                    sumBaskets = sumBaskets + basketEggs;
                    countParches++;
                } else if (input.equals("wreath")) {
                    sumWreath = sumWreath + wreath;
                    countParches++;
                } else if (input.equals("chocolate bunny")) {
                    sumChocolateBunny = sumChocolateBunny + chocolateBunny;
                    countParches++;
                }


                input = scanner.nextLine();
            }
            totalSum = sumBaskets + sumWreath + sumChocolateBunny;
            if (countParches % 2 == 0) {
                totalSum = totalSum * 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", countParches, totalSum);
            diffSum = diffSum +totalSum;
            if (i == countCustomers) {
                break;
            }
            sumBaskets = 0;
            sumChocolateBunny = 0;
            sumWreath = 0;
            countParches = 0;
        }

        System.out.printf("Average bill per client is: %.2f leva.%n", diffSum / countCustomers);
    }
}
