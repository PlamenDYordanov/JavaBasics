package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double workers = Integer.parseInt(scanner.nextLine());
        double priceForOutfit = Double.parseDouble(scanner.nextLine());
        //	Декорът за филма е на стойност 10% от бюджета.
        double decor = budget * 0.10;

        if (workers >= 150) {
            priceForOutfit = priceForOutfit - (priceForOutfit * 0.10);

        }
        double priceForOutfitSum = priceForOutfit * workers;
        double sumForMovie = priceForOutfitSum + decor;
        double diff = Math.abs(budget - sumForMovie);
        // На конзолата трябва да се отпечатат два реда:
        //Ако  парите за декора и дрехите са повече от бюджета:
        if (sumForMovie > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
            //(sumForMovie < budget)
                //System.out.println("Action!");
               // System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }


    }
}
