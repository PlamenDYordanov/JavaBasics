package MoniPb.ConditionalStatement.MoreExercises;

import java.util.Scanner;

public class Ex03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double grapesPerSqM = Double.parseDouble(scanner.nextLine());
        int wineForSaleLitres = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double sumGrape = vineyardArea * grapesPerSqM;
        double grapesForWineKilos = sumGrape * 0.4;

        double totalWine = grapesForWineKilos / 2.5;
        double difference = Math.abs(totalWine - wineForSaleLitres);
        double winePerWorkerL = difference / workers;

        if (totalWine < wineForSaleLitres) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(difference));
        } else if (totalWine >= wineForSaleLitres) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.", Math.floor(totalWine), Math.ceil(difference), Math.ceil(winePerWorkerL));
        }

    }
}
