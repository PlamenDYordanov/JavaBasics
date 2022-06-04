package Exam02PB;

import java.util.Scanner;

public class P04_CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCats = Integer.parseInt(scanner.nextLine());


        double oneKgFood = 12.45;
        double totalGramsFood = 0;
        int groupOne = 0;
        int groupTwo = 0;
        int groupThree = 0;

        for (int i = 1; i <= countCats; i++) {
            double grFood = Double.parseDouble(scanner.nextLine());

            if (grFood >= 100 && grFood < 200) {
                groupOne++;
            } else if (grFood < 300) {
                groupTwo++;
            } else if (grFood < 400) {
                groupThree++;
            }
            totalGramsFood += grFood;
        }
        double totalGrToKg = totalGramsFood / 1000;
        double totalPrice = totalGrToKg * oneKgFood;

        System.out.printf("Group 1: %d cats.%n",groupOne);
        System.out.printf("Group 2: %d cats.%n",groupTwo);
        System.out.printf("Group 3: %d cats.%n",groupThree);
        System.out.printf("Price for food per day: %.2f lv.%n",totalPrice);
    }
}
