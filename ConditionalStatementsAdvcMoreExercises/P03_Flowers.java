package ConditionalStatementsAdvcMoreExercises;

import java.util.Scanner;

public class P03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double totalPrice = 0;
        if (season.equals("Spring") || season.equals("Summer")) {
            if (holiday.equals("Y")) {
                totalPrice = (chrysanthemums * (2 * 1.15)) + (roses * (4.10 * 1.15)) + (tulips * (2.50 * 1.15));
                if (tulips > 7&& season.equals("Spring")) {
                    totalPrice = totalPrice * 0.95;
                }
                if (chrysanthemums + tulips + roses > 20) {
                    totalPrice = totalPrice * 0.80;
                }
            } else {
                totalPrice = (chrysanthemums * 2) + (roses * 4.10) + (tulips * 2.50);
                if (tulips > 7 && season.equals("Spring")) {
                    totalPrice = tulips * 0.95;
                }
                if (chrysanthemums + tulips + roses > 20) {
                    totalPrice = totalPrice * 0.80;
                }
            }
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            if (holiday.equals("Y")) {
                totalPrice = (chrysanthemums * (3.75 * 1.15)) + (roses * (4.50 * 1.15)) + (tulips * (4.15 * 1.15));
                if (roses >= 10&& season.equals("Winter")) {
                    totalPrice = totalPrice * 0.90;
                }
                if (chrysanthemums + tulips + roses > 20) {
                    totalPrice = totalPrice * 0.80;
                }
            } else {
                totalPrice = (chrysanthemums * 3.75) + (roses * 4.50) + (tulips * 4.15);
                if (roses >= 10 && season.equals("Winter")) {
                    totalPrice = totalPrice * 0.90;
                }
                if (chrysanthemums + tulips + roses > 20) {
                    totalPrice = totalPrice * 0.80;
                }
            }
        }
        totalPrice = totalPrice + 2;
        System.out.printf("%.2f", totalPrice);
    }

}
