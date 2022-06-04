package SeventhExam;

import java.util.Scanner;

public class P03_FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String typeMenu = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
//        "Drink", "Popcorn" или "Menu"
        double price = 0;
        double totalPrice = 0;
        switch (movie) {
            case "John Wick":
                if (typeMenu.equals("Drink")) {
                    price = 12;
                    totalPrice += price * countTickets;
                } else if (typeMenu.equals("Popcorn")) {
                    price = 15;
                    totalPrice += price * countTickets;
                } else if (typeMenu.equals("Menu")) {
                    price = 19;
                    totalPrice += price * countTickets;
                }
                break;
            case "Star Wars":
                if (typeMenu.equals("Drink")) {
                    price = 18;
                    totalPrice += price * countTickets;
                } else if (typeMenu.equals("Popcorn")) {
                    price = 25;
                    totalPrice += price * countTickets;
                } else if (typeMenu.equals("Menu")) {
                    price = 30;
                    totalPrice += price * countTickets;
                }
                if (countTickets >= 4) {
                    totalPrice = totalPrice * 0.70;
                }
                break;
            case "Jumanji":
                if (typeMenu.equals("Drink")) {
                    price = 9;
                    totalPrice += price * countTickets;
                } else if (typeMenu.equals("Popcorn")) {
                    price = 11;
                    totalPrice += price * countTickets;
                } else if (typeMenu.equals("Menu")) {
                    price = 14;
                    totalPrice += price * countTickets;
                }
                if (countTickets == 2) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.%n", totalPrice);
    }
}
