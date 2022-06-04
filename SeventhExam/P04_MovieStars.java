package SeventhExam;

import java.util.Scanner;

public class P04_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());


        String nameOfActor = "";


        String input = scanner.nextLine();
        double budgetDiff = budget;
        double totalHonorarium = 0;
        double honorarium = 0;
        boolean isBudgetEnough = true;
        while (!input.equals("ACTION")){
            nameOfActor = input;
            int lengthName = nameOfActor.length();
            if (lengthName>15){
                honorarium =  budgetDiff*0.20;
                budgetDiff = budgetDiff - honorarium;
                input = scanner.nextLine();
                continue;
            }
            input = scanner.nextLine();
            honorarium = Double.parseDouble(input);
            budgetDiff = budgetDiff - honorarium;
            if (budgetDiff<=0){
                isBudgetEnough = false;
                break;
            }

            input = scanner.nextLine();
        }
        budgetDiff = Math.abs(budgetDiff);
        if (!isBudgetEnough){
            System.out.printf("We need %.2f leva for our actors.%n",budgetDiff);
        }else {
            System.out.printf("We are left with %.2f leva.%n",budgetDiff);
        }
    }
}
