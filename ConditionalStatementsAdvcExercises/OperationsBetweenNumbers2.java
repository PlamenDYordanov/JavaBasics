package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class OperationsBetweenNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        double result = 0.0;
        String oddOrEven = "";
        boolean isZero = false;
        if (operator == '+') {
            result = number1 + number2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
        } else if (operator == '-') {
            result = number1 - number2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
        } else if (operator == '*') {
            result = number1 * number2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
        } else if (operator == '/') {
            if (number2 == 0) {
                isZero = true;
            } else {
                result = number1 * 1.0 / number2;
            }

        } else if (operator == '%') {
            if (number2 == 0) {
                isZero = true;
            } else {
                result = number1 * 1.0 / number2;
            }
        }
        if (operator == '+' || operator == '-' || operator == '*') {
            System.out.printf("%d %c %d = %.0f %s", number1, operator, number2, result, oddOrEven);
        } else if (operator == '/' && !isZero) {
            System.out.printf("%d %c %d = %.2f", number1, operator, number2, result);
        } else if (operator == '%' && !isZero) {
            System.out.printf("%d %c %d = %.0f", number1, operator, number2, result);
        } else if ((operator == '/' || operator == '%') && isZero) {
            System.out.printf("Cannot divide %d by zero", number1);
        }
    }
}
