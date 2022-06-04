package NestedLoop;

import java.util.Scanner;

public class P04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;
        int counterComb = 0;
        boolean isComb = false;
        int numOnePrint = 0;
        int numTwoPrint = 0;


        for (numOnePrint = firstNum; numOnePrint <= secondNum; numOnePrint++) {
            for (numTwoPrint = firstNum; numTwoPrint <= secondNum; numTwoPrint++) {
                counterComb++;
                totalSum = numOnePrint + numTwoPrint;
                if (totalSum == magicNum) {
                    isComb = true;
                    break;
                }
            }
            if (isComb) {
                break;
            }
        }
        if (isComb) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counterComb, numOnePrint, numTwoPrint, totalSum);
        }else {
            System.out.printf("%d combinations - neither equals %d", counterComb, magicNum);
        }
    }
}
