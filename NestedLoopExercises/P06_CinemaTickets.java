package NestedLoopExercises;

import java.util.Scanner;

public class P06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String nameOfProjection = "";
        double counterTotal = 0;
        double countStudents = 0;
        double countKids = 0;
        double countStandards = 0;
        while (!input.equals("Finish")) {
            nameOfProjection = input;
            input = scanner.nextLine();
            int freeSeats = Integer.parseInt(input);
            double counter = 0;
            input = scanner.nextLine();
            while (!input.equals("End")){

                switch (input) {
                    case "standard":
                        counterTotal++;
                        counter++;
                        countStandards++;
                        break;

                    case "kid":
                        counterTotal++;
                        counter++;
                        countKids++;
                        break;

                    case "student":
                        counterTotal++;
                        counter++;
                        countStudents++;
                        break;
                }
                if (counter==freeSeats){
                    break;
                }
               input = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", nameOfProjection, (counter / freeSeats) * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %.0f%n", counterTotal);
        System.out.printf("%.2f%% student tickets.%n", countStudents / counterTotal * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandards / counterTotal * 100);
        System.out.printf("%.2f%% kids tickets.%n", countKids / counterTotal * 100);

    }
}
