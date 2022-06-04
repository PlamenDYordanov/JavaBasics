package SixthExam;

import java.util.Scanner;

public class P06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String nameOfMovie = "";
        double standardTicket = 0;
        double studentTicket = 0;
        double kidTicket = 0;
        double totalCounter = 0;
        double totalDiffCounter = 0;
        boolean isFinish = false;
        boolean isEnoughSeats = true;


        while (!input.equals("Finish")){
            totalDiffCounter=0;
            nameOfMovie = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            input = scanner.nextLine();
            while (!input.equals("End")){
                totalCounter++;
                totalDiffCounter++;
               switch (input){
                   case "standard":
                       standardTicket++;
                       break;
                   case "student":
                       studentTicket++;
                       break;
                   case "kid":
                       kidTicket++;
                       break;
               }
                if (totalDiffCounter==freeSeats){
                    break;
                }
                input = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n",nameOfMovie,(totalDiffCounter/freeSeats)*100);

            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %.0f%n",totalCounter);
        System.out.printf("%.2f%% student tickets.%n",(studentTicket/totalCounter)*100);
        System.out.printf("%.2f%% standard tickets.%n",(standardTicket/totalCounter)*100);
        System.out.printf("%.2f%% kids tickets.%n",(kidTicket/totalCounter)*100);
    }
}
