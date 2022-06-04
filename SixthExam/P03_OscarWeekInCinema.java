package SixthExam;

import java.util.Scanner;

public class P03_OscarWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        String typeOfRoom = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;

        switch (nameOfMovie) {
            case "A Star Is Born":
                if (typeOfRoom.equals("normal")) {
                    price = 7.50;
                    totalPrice = (totalPrice + price)*countTickets;
                } else if (typeOfRoom.equals("luxury")) {
                    price = 10.50;
                    totalPrice = (totalPrice + price)*countTickets;
                } else if (typeOfRoom.equals("ultra luxury")) {
                    price = 13.50;
                    totalPrice = (totalPrice + price)*countTickets;
                }
                break;
            case "Bohemian Rhapsody":
                if (typeOfRoom.equals("normal")) {
                    price = 7.35;
                    totalPrice = (totalPrice + price)*countTickets;
                } else if (typeOfRoom.equals("luxury")) {
                    price = 9.45;
                    totalPrice = (totalPrice + price)*countTickets;
                } else if (typeOfRoom.equals("ultra luxury")) {
                    price = 12.75;
                    totalPrice = (totalPrice + price)*countTickets;
                }
                break;
            case "Green Book":
                if (typeOfRoom.equals("normal")) {
                    price = 8.15;
                    totalPrice = (totalPrice + price)*countTickets;
                } else if (typeOfRoom.equals("luxury")) {
                    price = 10.25;
                    totalPrice = (totalPrice + price)*countTickets;
                } else if (typeOfRoom.equals("ultra luxury")) {
                    price = 13.25;
                    totalPrice = (totalPrice + price)*countTickets;
                }
                break;
            case "The Favourite":
                if (typeOfRoom.equals("normal")) {
                    price = 8.75;
                    totalPrice = (totalPrice + price)*countTickets;
                } else if (typeOfRoom.equals("luxury")) {
                    price = 11.55;
                    totalPrice = (totalPrice + price)*countTickets;
                } else if (typeOfRoom.equals("ultra luxury")) {
                    price = 13.95;
                    totalPrice = (totalPrice + price)*countTickets;
                }
                break;

        }
        System.out.printf("%s -> %.2f lv.",nameOfMovie,totalPrice);
    }
}
