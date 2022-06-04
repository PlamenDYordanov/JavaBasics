package Exam01PB;

import java.util.Scanner;

public class P01_ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPaperRolls = Integer.parseInt(scanner.nextLine());
        int numberOfFabricRolls = Integer.parseInt(scanner.nextLine());
        double litersOfGlue = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceOfPaperRolls = numberOfPaperRolls * 5.80;
        double priceOfFabricRolls = numberOfFabricRolls * 7.20;
        double priceOfGlue = litersOfGlue * 1.20;
        double totalPrice = priceOfPaperRolls + priceOfFabricRolls + priceOfGlue;
        double priceWithDiscount = totalPrice * (100 - percentDiscount) /100;
        System.out.printf("%.3f",priceWithDiscount);

    }
}