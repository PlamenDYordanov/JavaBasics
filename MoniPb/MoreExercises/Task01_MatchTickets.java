package MoniPb.MoreExercises;

import java.util.Scanner;

public class Task01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());

        double budgetWithoutTransport = 0;
        double moneyForTickets = 0;

        double vip = 499.99;
        double normal = 249.99;

        switch (type) {
            case "VIP":
                if (group >= 1 && group <= 4) {
                    budgetWithoutTransport = budget * 0.25;
                    moneyForTickets = vip * group;
                }
                if (group >= 5 && group <= 9) {
                    budgetWithoutTransport = budget * 0.40;
                    moneyForTickets = vip * group;
                }
                if (group >= 10 && group <= 24) {
                    budgetWithoutTransport = budget * 0.50;
                    moneyForTickets = vip * group;
                }
                if (group >= 25 && group <= 49) {
                    budgetWithoutTransport = budget * 0.60;
                    moneyForTickets = vip * group;
                }
                if (group >= 50) {
                    budgetWithoutTransport = budget * 0.75;
                    moneyForTickets = vip * group;
                }

                break;

            case "Normal":
                if (group >= 1 && group <= 4) {
                    budgetWithoutTransport = budget * 0.25;
                    moneyForTickets = normal * group;
                }
                if (group >= 5 && group <= 9) {
                    budgetWithoutTransport = budget * 0.40;
                    moneyForTickets = normal * group;
                }
                if (group >= 10 && group <= 24) {
                    budgetWithoutTransport = budget * 0.50;
                    moneyForTickets = normal * group;
                }
                if (group >= 25 && group <= 49) {
                    budgetWithoutTransport = budget * 0.60;
                    moneyForTickets = normal * group;
                }
                if (group >= 50) {
                    budgetWithoutTransport = budget * 0.75;
                    moneyForTickets = normal * group;
                }

                break;
        }
        double diff = Math.abs(budgetWithoutTransport - moneyForTickets);
        if (budgetWithoutTransport >= moneyForTickets) {
        System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
        System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
