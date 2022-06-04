package ConditionalStatementsExercise;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());
        int priceVideo = videoCards * 250;
        double priceProcessors = priceVideo * 0.35 * processor;
        double priceMemory = priceVideo * 0.10 * ramMemory;
        double allSum = priceVideo + priceProcessors + priceMemory;
        if (videoCards > processor) {
            allSum = allSum - (allSum * 0.15);
        }
        double budgetMinusSum = Math.abs(budget - allSum);
        if (budget >= allSum) {
            System.out.printf("You have %.2f leva left!", budgetMinusSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", budgetMinusSum);
        }
    }
}

