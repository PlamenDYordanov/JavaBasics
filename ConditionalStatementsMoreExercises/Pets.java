package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double foodPerDayDog = Double.parseDouble(scanner.nextLine());//кг
        double foodPerDayCat = Double.parseDouble(scanner.nextLine());//кг
        double foodPerDayTurtle = Double.parseDouble(scanner.nextLine());//гр

        double totalFoodDog = foodPerDayDog*countDays;
        double totalFoodCat = foodPerDayCat*countDays;
        double totalFoodTurtle = (foodPerDayTurtle/1000)*countDays;
        double totalAmountFood = totalFoodDog+totalFoodCat+totalFoodTurtle;
        double diff = Math.abs(leftFood-totalAmountFood);
        if (leftFood>=totalAmountFood){
            System.out.printf("%.0f kilos of food left.",Math.floor(diff));
        }else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(diff));
        }
    }
}
