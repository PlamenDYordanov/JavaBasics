package MoniPb.ConditionalStatement.Exercises;

import java.util.Scanner;

public class Ex07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250.0;
        double processorsPrice = processors * (videoCardsPrice * 0.35);
        double RAMPrice = RAM *(videoCardsPrice * 0.10);

        double sum = videoCardsPrice + processorsPrice + RAMPrice;
        double discount = 0.0;

        if (videoCards > processors) {
            discount = sum * 0.15;
        }
        double sumWithDiscount = sum - discount;
        double result = Math.abs(budget - sumWithDiscount);

        if (budget >= sum) {
            System.out.printf("You have %.02f leva left!", result);
        } else if (budget < sum) {
            System.out.printf("Not enough money! You need %.02f leva more!", result);

        }

    }
}
