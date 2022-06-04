package SixthExam;

import java.util.Scanner;

public class P02_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countParticipants = Integer.parseInt(scanner.nextLine());
        double priceOutfit = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double outfitPrice = priceOutfit * countParticipants;

        if (countParticipants>150){
            outfitPrice = outfitPrice * 0.90;
        }
        double totalPrice = decor+outfitPrice;
        double diff = Math.abs(budget-totalPrice);
        if (budget>=totalPrice){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);
        }
    }
}
