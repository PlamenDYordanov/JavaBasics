package MoniPb.ConditionalStatement.Exercises;

import java.util.Scanner;

public class Ex05GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double suitPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        if (people > 150) {
            suitPrice = suitPrice - (suitPrice * 0.10);
        }

        double difference = 0.0;
        double sumDecorAndSuit = people * suitPrice + decor;
        if (sumDecorAndSuit > budget) {
            difference = sumDecorAndSuit - budget;
            System.out.printf("Not enough money!%nWingard needs %.02f leva more.",difference);
        } else if (sumDecorAndSuit <= budget) {
            difference = Math.abs(sumDecorAndSuit - budget);
            System.out.printf("Action!%nWingard starts filming with %.02f leva left.",difference);
        }
    }
}
