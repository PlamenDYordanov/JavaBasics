package Exam02PB;

import java.util.Scanner;

public class P05_PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityFoodKg = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int totalGrFood = 0;

        while (!input.equals("Adopted")){

            int grFood = Integer.parseInt(input);
            totalGrFood+=grFood;

            input = scanner.nextLine();
        }
        int quantityKgToGr = quantityFoodKg*1000;
        double diff = Math.abs(quantityKgToGr-totalGrFood);
        if (quantityKgToGr>=totalGrFood){
            System.out.printf("Food is enough! Leftovers: %.0f grams.",diff);
        }else {
            System.out.printf("Food is not enough. You need %.0f grams more.",diff);
        }
    }
}
