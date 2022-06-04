package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mount = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.next());

        double studioPricePerNight = 0.0;
        double apartmentPricePerNight = 0.0;

        switch (mount) {
            case "May":
            case "October":
                studioPricePerNight = 50;
                apartmentPricePerNight = 65;
                if (countNights > 7 && countNights <= 14) {
                    studioPricePerNight = studioPricePerNight * 0.95;
                } else if (countNights>14){
                    studioPricePerNight = studioPricePerNight * 0.70;
                    apartmentPricePerNight = apartmentPricePerNight * 0.90;
                }
                break;

            case "June":
            case "September":
                studioPricePerNight = 75.20;
                apartmentPricePerNight = 68.70;
                if (countNights > 14) {
                    studioPricePerNight = studioPricePerNight * 0.80;
                    apartmentPricePerNight = apartmentPricePerNight * 0.90;
                }
                break;

            case "July":
            case "August":
                studioPricePerNight = 76;
                apartmentPricePerNight = 77;
                if (countNights > 14) {
                    apartmentPricePerNight = apartmentPricePerNight * 0.90;
                }
                break;

        }


        System.out.printf("Apartment: %.2f lv.", apartmentPricePerNight * countNights);
        System.out.println("");
        System.out.printf("Studio: %.2f lv.", studioPricePerNight * countNights);

    }

}

