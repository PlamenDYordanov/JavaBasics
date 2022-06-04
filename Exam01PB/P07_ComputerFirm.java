package Exam01PB;

import java.util.Scanner;

public class P07_ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countComputers = Integer.parseInt(scanner.nextLine());

        double sellsDiff = 0;
        double totalSells = 0;
        int totalRating = 0;
        for (int i = 1; i <= countComputers; i++) {
            int sellsRating = Integer.parseInt(scanner.nextLine());
            int rating = sellsRating % 10;
            int sells = sellsRating / 10;
            if (rating == 2) {
                sellsDiff = sellsDiff + 0;
            } else if (rating == 3) {
                sellsDiff =  sells * 0.50;
            } else if (rating == 4) {
                sellsDiff =  sells * 0.70;
            } else if (rating == 5) {
                sellsDiff =  sells * 0.85;
            } else if (rating == 6) {
                sellsDiff =  sells;
            }
            totalSells = totalSells + sellsDiff;
            totalRating = totalRating + rating;
            sellsDiff=0;
        }
        System.out.printf("%.2f%n", totalSells);
        System.out.printf("%.2f%n", totalRating * 1.0 / countComputers);

    }
}

