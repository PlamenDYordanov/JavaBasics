package FirstExam;

import java.util.Scanner;

public class P03_EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

       double totalPrice = 0;
        int pricePerNight = 0;

        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                    pricePerNight = 30;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 35;
                } else if (dates.equals("28-31")) {
                    pricePerNight = 40;
                }
                totalPrice = pricePerNight*nights;
                break;

            case "Italy":
                if (dates.equals("21-23")) {
                    pricePerNight = 28;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 32;
                } else if (dates.equals("28-31")) {
                    pricePerNight = 39;
                }
                totalPrice = pricePerNight*nights;
                break;

            case "Germany":
                if (dates.equals("21-23")) {
                    pricePerNight = 32;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 37;
                } else if (dates.equals("28-31")) {
                    pricePerNight = 43;
                }
                totalPrice = pricePerNight*nights;
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.",destination,totalPrice);

    }
}
