package ThirdExam;

import java.util.Scanner;

public class P02_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int howManyWalkingDay = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());


        int totalMinutes = minutes * howManyWalkingDay;

        int totalCalories =  totalMinutes * 5;

        int halfCalories = calories/2;

        if (totalCalories>=halfCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",totalCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",totalCalories);
        }
    }
}
