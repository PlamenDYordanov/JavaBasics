package MoniPb.MoreExercises;

import java.util.Scanner;

public class Task09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int currentSum = 0;
        int i = 0;
        int j = 0;

        for (i = starInterval; i <= endInterval; i++) {
            for (j = starInterval; j <= endInterval; j++) {
                counter++;
                currentSum = i + j;
                if (currentSum == magicNum) {
                    break;
                }
            }
            if (currentSum == magicNum) {
                break;
            }
        }
        if (currentSum == magicNum) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, currentSum);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
