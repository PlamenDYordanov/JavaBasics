package ConditionalStatementsAdvcMoreExercises;

import java.util.Scanner;

public class P02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int junior = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String typeRace = scanner.nextLine();

        double totalPriceJunior = 0;
        double totalPriceSeniors = 0;
        double totalCharity = 0;
        switch (typeRace) {
            case "trail":
                totalPriceJunior = junior * 5.50;
                totalPriceSeniors = seniors * 7;
                break;
            case "cross-country":
                if (junior + seniors >= 50) {
                    totalPriceJunior = junior * 6;
                    totalPriceSeniors = seniors * 7.125;
                } else {
                    totalPriceJunior = junior * 8;
                    totalPriceSeniors = seniors * 9.50;
                }
                break;
            case "downhill":
                totalPriceJunior = junior * 12.25;
                totalPriceSeniors = seniors * 13.75;
                break;
            case "road":
                totalPriceJunior = junior * 20;
                totalPriceSeniors = seniors * 21.50;
                break;
        }
        totalCharity = totalPriceJunior + totalPriceSeniors;
        totalCharity = totalCharity *0.95;
        System.out.printf("%.2f",totalCharity);

    }
}
