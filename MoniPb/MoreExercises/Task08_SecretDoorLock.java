package MoniPb.MoreExercises;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Task08_SecretDoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine()); // горна граница 1-9
        int secondNum = Integer.parseInt(scanner.nextLine()); // горна граница 1-9
        int thirdNum = Integer.parseInt(scanner.nextLine()); // горна граница 1-9

        int countSecond = 0;

        for (int i = 1; i <= firstNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                for (int l = 1; l <= thirdNum; l++) {
                    if (i % 2 == 0 && l % 2 == 0) {
                        if (j % 2 == 0) {
                            countSecond++;
                        }
                        if (j % 3 == 0) {
                            countSecond++;
                        }
                        if (j % 4 == 0) {
                            countSecond++;
                        }
                        if (j % 5 == 0) {
                            countSecond++;
                        }
                        if (j % 6 == 0) {
                            countSecond++;
                        }
                        if (j % 7 == 0) {
                            countSecond++;
                        }
                    }
                    if (countSecond == 1 && j >=2 && j <=7) {
                        System.out.printf("%d %d %d%n", i, j, l);
                    }

                    countSecond=0;
                }
            }
        }
    }
}

