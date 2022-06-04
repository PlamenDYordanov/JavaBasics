package WhileLoopMoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        //int totalAmount = countBottles * 750;
        int totalAmountDiff = countBottles * 750;
        int counter = 0;
        int countPot = 0;
        int countDish = 0;
        int totalNeeded = 0;
        boolean isLeft = true;

        while (!input.equals("End")) {
            int utensils = Integer.parseInt(input);//Една чиния 5мл.  Една тенджера 15мл.

            counter++;
            if (counter % 3 == 0) {
                //totalAmount = totalAmount - (utensils * 15);
                totalNeeded = totalNeeded + (utensils * 15);
                countPot = countPot + utensils;
            } else {

                //totalAmount = totalAmount - (utensils * 5);
                totalNeeded = totalNeeded + (utensils * 5);
                countDish = countDish + utensils;
            }
            if (totalAmountDiff < totalNeeded) {
                isLeft = false;
                break;
            }
            input = scanner.nextLine();
        }
        int diff = Math.abs(totalAmountDiff - totalNeeded);
        if (!isLeft) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", diff);
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", countDish, countPot);
            System.out.printf("Leftover detergent %d ml.", diff);

        }

    }
}

