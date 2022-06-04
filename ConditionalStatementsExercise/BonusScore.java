package ConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double operationNum = 0;
        double bonus = 0;

        if (number <= 100) {
            operationNum = number + 5;
            bonus = 5;
        } else if (number > 100 && number <= 1000) {
            bonus = number * 0.20;
            operationNum = number + bonus;

        } else {
            bonus = number * 0.10;
            operationNum = number + bonus;
        }
        if (number % 2 == 0) {
            bonus = bonus + 1;
        } else if (number % 5 == 0) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }

}

