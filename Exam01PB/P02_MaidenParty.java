package Exam01PB;

import java.util.Scanner;

public class P02_MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceOfParty = Double.parseDouble(scanner.nextLine());
        int numOfLoveMassages = Integer.parseInt(scanner.nextLine());
        int numOfWaxRoses = Integer.parseInt(scanner.nextLine());
        int numOfKeychains = Integer.parseInt(scanner.nextLine());
        int numOfCaricatures = Integer.parseInt(scanner.nextLine());
        int numOfLuckySurprises = Integer.parseInt(scanner.nextLine());

        double totalPrice = numOfLoveMassages * 0.60 + numOfWaxRoses * 7.20 + numOfKeychains * 3.60 +
                numOfCaricatures * 18.20 + numOfLuckySurprises * 22;
        int numberOfProducts = numOfLoveMassages + numOfWaxRoses + numOfKeychains
                + numOfCaricatures + numOfLuckySurprises;

        if (numberOfProducts >= 25) {
            totalPrice = totalPrice * 0.65;
        }

        double profit = totalPrice * 0.90;

        double diff = Math.abs(priceOfParty - profit);

        if (profit >= priceOfParty) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}