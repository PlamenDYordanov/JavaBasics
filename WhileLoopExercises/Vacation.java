package WhileLoopExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        double totalSum = 0 + availableMoney;
        int countDays = 0;
        int spendingDays = 0;
        boolean isSave = true;
        while (totalSum < neededMoney) {
            String action = scanner.nextLine();
            double moneyForAction = Double.parseDouble(scanner.nextLine());
            if (action.equals("spend")) {
                totalSum = totalSum - moneyForAction;
                countDays++;
                spendingDays++;
                if (totalSum < 0) {
                    totalSum = 0;
                }
            }

            if (spendingDays == 5) {
                isSave = false;
                break;
            }

            if (action.equals("save")) {
                totalSum = totalSum + moneyForAction;
                countDays++;
                spendingDays = 0;
            }
        }
        if (!isSave) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDays);
        } else {
            System.out.printf("You saved the money for %d days.%n", countDays);
        }
    }
}
