package FourthExam;

import java.util.Scanner;

public class P03_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stage = scanner.nextLine();
        String typeTicket = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        char photo = scanner.nextLine().charAt(0);
        int photoInt = photo;
        boolean isPhotoPay = true;
        double totalPrice = 0;
        switch (typeTicket) {
            case "Standard":
                if (stage.equals("Quarter final")) {
                    double price = 55.50;
                    totalPrice = countTickets * price;
                } else if (stage.contains("Semi final")) {
                    double price = 75.88;
                    totalPrice = countTickets * price;
                } else {
                    double price = 110.10;
                    totalPrice = countTickets * price;
                }
                if (totalPrice > 2500 && totalPrice <= 4000) {
                    totalPrice = totalPrice * 0.90;
                } else if (totalPrice > 4000) {
                    totalPrice = totalPrice * 0.75;
                    isPhotoPay = false;
                }
                if (isPhotoPay && (photoInt == 89)) {
                    totalPrice = totalPrice + 40 * countTickets;
                }
                break;
            case "Premium":
                if (stage.equals("Quarter final")) {
                    double price = 105.20;
                    totalPrice = countTickets * price;
                } else if (stage.contains("Semi final")) {
                    double price = 125.22;
                    totalPrice = countTickets * price;
                } else {
                    double price = 160.66;
                    totalPrice = countTickets * price;
                }
                if (totalPrice > 2500 && totalPrice <= 4000) {
                    totalPrice = totalPrice * 0.90;
                } else if (totalPrice > 4000) {
                    totalPrice = totalPrice * 0.75;
                    isPhotoPay = false;
                }
                if (isPhotoPay && (photoInt == 89)) {
                    totalPrice = totalPrice + 40 * countTickets;
                }
                break;
            case "VIP":
                if (stage.equals("Quarter final")) {
                    double price = 118.90;
                    totalPrice = countTickets * price;
                } else if (stage.contains("Semi final")) {
                    double price = 300.40;
                    totalPrice = countTickets * price;
                } else {
                    double price = 400;
                    totalPrice = countTickets * price;
                }
                if (totalPrice > 2500 && totalPrice <= 4000) {
                    totalPrice = totalPrice * 0.90;
                } else if (totalPrice > 4000) {
                    totalPrice = totalPrice * 0.75;
                    isPhotoPay = false;
                }
                if (isPhotoPay && (photoInt == 89)) {
                    totalPrice = totalPrice + 40 * countTickets;
                }
                break;

        }
        System.out.printf("%.2f", totalPrice);

    }
}
