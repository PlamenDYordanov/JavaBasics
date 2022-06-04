package ForLoopLab;

import java.util.Scanner;

public class NumberSequence08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
            if (currentNum < minNum) {
                minNum = currentNum;
            }

        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d%n", minNum);
    }
}
