package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens =Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int boardCleaner = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens*5.80;
        double markersPrice = markers*7.20;
        double boardCleanerPrice = boardCleaner*1.20;
        double sum = pensPrice+markersPrice+boardCleanerPrice;
        double finalPrice = sum - (sum*percentDiscount/100);

        System.out.println(finalPrice);
    }
}
