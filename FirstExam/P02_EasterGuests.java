package FirstExam;

import java.util.Scanner;

public class P02_EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGuests = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double OneEasterBreadPrice = 4;
        double oneEggPrice = 0.45;

        double countEasterBread = Math.ceil(countGuests*1.0/3);
        double countEasterEggs = countGuests*2;

        double priceEasterBread = countEasterBread*OneEasterBreadPrice;
        double priceEasterEggs = countEasterEggs*oneEggPrice;
        double totalSum = priceEasterBread+priceEasterEggs;

        double diff = Math.abs(totalSum-budget);

        if (budget>=totalSum){
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n",countEasterBread,countEasterEggs);
            System.out.printf("He has %.2f lv. left.%n",diff);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.%n",diff);
        }


    }
}
