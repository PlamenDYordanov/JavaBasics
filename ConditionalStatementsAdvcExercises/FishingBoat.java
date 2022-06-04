package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new   Scanner(System.in);
       int budget = Integer.parseInt(scanner.nextLine());
       String season = scanner.nextLine();
       int numberOfFishermen = Integer.parseInt(scanner.nextLine());


        double rent = 0.0;

        if (season.equals("Spring")) {
            rent = 3000;
            if (numberOfFishermen <= 6) {
                rent = rent - (rent * 0.10);
            } else if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
                rent = rent - (rent * 0.15);
            } else if (numberOfFishermen >= 12) {
                rent = rent - (rent * 0.25);
            } else if (numberOfFishermen % 2 == 0) {
                rent = rent - (rent * 0.05);
            }
        }


        if (season.equals("Summer")) {
            rent=4200;
            if (numberOfFishermen <= 6) {
                rent = rent - (rent * 0.10);
            } else if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
                rent = rent - (rent * 0.15);
            } else if (numberOfFishermen >= 12) {
                rent = rent - (rent * 0.25);
            } else if (numberOfFishermen % 2 == 0) {
                rent = rent - (rent * 0.05);
            }
        }


        if (season.equals("Autumn")) {
            rent= 4200;
            if (numberOfFishermen <= 6) {
                rent = rent - (rent * 0.10);
            } else if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
                rent = rent - (rent * 0.15);
            } else if (numberOfFishermen >= 12) {
                rent = rent - (rent * 0.25);
            }
        }


        if (season.equals("Winter")) {
            rent = 2600;
            if (numberOfFishermen <= 6) {
                rent = rent - (rent * 0.10);
            } else if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
                rent = rent - (rent * 0.15);
            } else if (numberOfFishermen >= 12) {
                rent = rent - (rent * 0.25);
            } else if (numberOfFishermen % 2 == 0) {
                rent = rent - (rent * 0.05);
            }
        }
        double totalSum = Math.abs(budget-rent);
        if (budget>=rent){
            System.out.printf("Yes! You have %.2f leva left.",totalSum);
        }else if (rent>budget){
            System.out.printf("Not enough money! You need %.2f leva.",totalSum);
        }
    }
}
