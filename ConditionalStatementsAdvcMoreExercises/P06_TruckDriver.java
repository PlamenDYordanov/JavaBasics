package ConditionalStatementsAdvcMoreExercises;

import java.util.Scanner;

public class P06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMount = Double.parseDouble(scanner.nextLine());
        double pricePerKm = 0;
        double totalProfit = 0;
        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmPerMount <= 5000) {
                    pricePerKm = 0.75;
                } else if (kmPerMount <= 10000) {
                    pricePerKm = 0.95;
                } else if (kmPerMount <= 20000) {
                    pricePerKm = 1.45;
                }
                break;
            case "Summer":
                if (kmPerMount <= 5000) {
                    pricePerKm = 0.90;
                } else if (kmPerMount <= 10000) {
                    pricePerKm = 1.10;
                } else if (kmPerMount <= 20000) {
                    pricePerKm = 1.45;
                }
                break;
            case "Winter":
                if (kmPerMount <= 5000) {
                    pricePerKm = 1.05;
                } else if (kmPerMount <= 10000) {
                    pricePerKm = 1.25;
                } else if (kmPerMount <= 20000) {
                    pricePerKm = 1.45;
                }
                break;
        }
        totalProfit = (pricePerKm * kmPerMount)*4;
        totalProfit = totalProfit * 0.90;
        System.out.printf("%.2f",totalProfit);
    }
}
