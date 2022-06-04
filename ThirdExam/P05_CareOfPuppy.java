package ThirdExam;

import java.util.Scanner;

public class P05_CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int foodInGrams = food * 1000;
        int totalFood = 0;

        while (!input.equals("Adopted")) {

            int buyingFood = Integer.parseInt(input);
            totalFood = totalFood + buyingFood;

            input = scanner.nextLine();
        }
        int diff = Math.abs(foodInGrams-totalFood);

        if (foodInGrams>=totalFood){
            System.out.printf("Food is enough! Leftovers: %d grams.%n",diff);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.%n",diff);
        }
    }
}
