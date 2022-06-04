package MoniPb.MoreExercises;

import java.util.Scanner;

public class Task02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String typeRace = scanner.nextLine();

        double juniorTax = 0;
        double seniorTax = 0;

        double moneyForCharity = 0;
        int fullGroup = seniors + juniors;

        switch (typeRace) {
            case "trail":
                if (fullGroup >= 50) {
                    juniorTax = (5.50 * 0.75) * juniors;
                    seniorTax = (7 * 0.75) * seniors;
                } else {
                    juniorTax = 5.50 * juniors;
                    seniorTax = 7.00 * seniors;
                }
                break;
            case "cross-country":
                if (fullGroup >= 50) {
                    juniorTax = (8 * 0.75) * juniors;
                    seniorTax = (9.50 * 0.75) * seniors;
                } else {
                    juniorTax = 8 * juniors;
                    seniorTax = 9.50 * seniors;
                }

                break;
            case "downhill":
                if (fullGroup >= 50) {
                    juniorTax = (12.25 * 0.75) * juniors;
                    seniorTax = (13.75 * 0.75) * seniors;
                } else {
                    juniorTax = 12.25 * juniors;
                    seniorTax = 13.75 * seniors;
                }

                break;
            case "road":
                if (fullGroup >= 50) {
                    juniorTax = (20 * 0.75) * juniors;
                    seniorTax = (21.5 * 0.75) * seniors;
                } else {
                    juniorTax = 20 * juniors;
                    seniorTax = 21.50 * seniors;
                }
                break;
        }
        moneyForCharity = (juniorTax + seniorTax) * 0.95;
        System.out.printf("%.2f", moneyForCharity);
    }
}
