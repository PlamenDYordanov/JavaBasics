package SeventhExam;

import java.util.Scanner;

public class P03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    price = 45000;
                    totalPrice = price * days;
                    totalPrice = totalPrice * 0.70;
                } else if (season.equals("Summer")) {
                    price = 40000;
                    totalPrice = price * days;
                    totalPrice = totalPrice * 0.70;

                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    price = 17000;
                    totalPrice = price * days;
                    totalPrice = totalPrice *1.25;
                } else if (season.equals("Summer")) {
                    price = 12500;
                    totalPrice = price * days;
                    totalPrice = totalPrice *1.25;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    price = 24000;
                    totalPrice = price * days;

                } else if (season.equals("Summer")) {
                    price = 20250;
                    totalPrice = price * days;

                }
                break;

        }
        double diff = Math.abs(budget-totalPrice);

        if (budget>=totalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!%n",diff);
        }else {
            System.out.printf("The director needs %.2f leva more!%n",diff);
        }
    }
}
