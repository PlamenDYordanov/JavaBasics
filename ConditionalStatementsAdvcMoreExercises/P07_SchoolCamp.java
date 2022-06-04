package ConditionalStatementsAdvcMoreExercises;

import java.util.Scanner;

public class P07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double price = 0;
        double totalPrice = 0;


        switch (season) {
            case "Winter":
                if (typeGroup.equals("boys")) {
                    sport = "Judo";
                } else if (typeGroup.equals("girls")) {
                    sport = "Gymnastics";
                } else if (typeGroup.equals("mixed")) {
                    sport = "Ski";
                }
                if (typeGroup.equals("boys") || typeGroup.equals("girls")) {
                    price = 9.60;
                } else if (typeGroup.equals("mixed")) {
                    price = 10;
                }
                break;
            case "Spring":
                if (typeGroup.equals("boys")) {
                    sport = "Tennis";
                } else if (typeGroup.equals("girls")) {
                    sport = "Athletics";
                } else if (typeGroup.equals("mixed")) {
                    sport = "Cycling";
                }
                if (typeGroup.equals("boys") || typeGroup.equals("girls")) {
                    price = 7.20;
                } else if (typeGroup.equals("mixed")) {
                    price = 9.50;
                }
                break;
            case "Summer":
                if (typeGroup.equals("boys")) {
                    sport = "Football";
                } else if (typeGroup.equals("girls")) {
                    sport = "Volleyball";
                } else if (typeGroup.equals("mixed")) {
                    sport = "Swimming";
                }
                if (typeGroup.equals("boys") || typeGroup.equals("girls")) {
                    price = 15;
                } else if (typeGroup.equals("mixed")) {
                    price = 20;
                }
                break;
        }
        totalPrice = (price * countStudents) * countNights;
        if (countStudents >= 50) {
            totalPrice = totalPrice / 2;
        } else if (countStudents >= 20) {
            totalPrice = totalPrice * 0.85;
        } else if (countStudents >= 10) {
            totalPrice = totalPrice * 0.95;
        }

        System.out.printf("%s %.2f lv.%n",sport,totalPrice);
    }
}
