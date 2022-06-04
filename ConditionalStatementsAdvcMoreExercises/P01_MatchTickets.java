package ConditionalStatementsAdvcMoreExercises;

import java.util.Scanner;

public class P01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String categories = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double vipPrice = 499.99;
        double normal = 249.99;
        double totalPrice = 0;
        double transport = 0;

        if (people >= 1 && people <= 4) {
            transport = budget * 0.75;
        } else if (people <= 9) {
            transport = budget * 0.60;
        } else if (people <= 24) {
            transport = budget * 0.50;
        } else if (people <= 49) {
            transport = budget * 0.40;
        } else {
            transport = budget * 0.25;
        }
        switch (categories) {
            case "VIP":
                totalPrice = (vipPrice * people) + transport;
                break;
            case "Normal":
                totalPrice = (normal * people) + transport;
                break;
        }
        double diff = Math.abs(budget-totalPrice);
        if (budget>=totalPrice){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }
    }
}
