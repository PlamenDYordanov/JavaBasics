package ThirdExam;

import java.util.Scanner;

public class P04_FoodOfPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double totalFood = 0;
        double biscuits = 0;
        double totalBiscuits = 0;
        double dogTotal = 0;
        double catTotal = 0;

        for (int i = 1; i <= days; i++) {
            int dogEaten = Integer.parseInt(scanner.nextLine());
            totalFood = totalFood + dogEaten;
            dogTotal = dogTotal + dogEaten;
            int catEaten = Integer.parseInt(scanner.nextLine());
            totalFood = totalFood + catEaten;
            catTotal = catTotal + catEaten;

            if (i % 3 == 0) {
                biscuits = (dogEaten + catEaten) * 0.10;
                totalBiscuits = totalBiscuits + biscuits;
            }
        }
        double percentEatenFood = (totalFood / food) * 100;
        double percentEatenDog = (dogTotal / totalFood) * 100;
        double percentEatenCat = (catTotal / totalFood) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", totalBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenDog);
        System.out.printf("%.2f%% eaten from the cat.", percentEatenCat);
    }
}
