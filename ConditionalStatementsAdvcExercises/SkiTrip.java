package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vacationDays = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;

        switch (roomType) {
            case "room for one person":
                price = (vacationDays - 1) * 18.00;
                totalPrice = price;
                break;
            case "apartment":
                price = (vacationDays - 1) * 25.00;

                if (vacationDays < 10) {
                    totalPrice = price * 0.70;
                } else if (vacationDays >= 10 && vacationDays <= 15) {
                    totalPrice = price * 0.65;
                } else if (vacationDays > 15) {
                    totalPrice = price * 0.50;
                }
                break;
            case "president apartment":
                price = (vacationDays - 1) * 35.00;
                if (vacationDays < 10) {
                    totalPrice = price * 0.90;
                } else if (vacationDays > 10 && vacationDays <= 15) {
                    totalPrice = price * 0.85;
                } else if (vacationDays > 15) {
                    totalPrice = price * 0.80;
                }

                break;
        }
        if (rating.equals("positive")) {
            System.out.printf("%.2f", totalPrice + (totalPrice * 0.25));
        } else {
            System.out.printf("%.2f", totalPrice - (totalPrice * 0.10));
        }
    }
}
