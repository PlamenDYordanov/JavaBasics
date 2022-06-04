package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int otherNum = 0;

        int totalSum = 0;
        int sumWithOutMaxNum = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            totalSum = totalSum + currentNum;

            if (currentNum > maxNum) {
                maxNum = currentNum;

            }
           sumWithOutMaxNum = totalSum - maxNum;
            }

            if ((totalSum - maxNum) == maxNum) {
                System.out.printf("Yes%n Sum = %d", maxNum);
            } else {
                System.out.printf("No%n Diff = %d", Math.abs(sumWithOutMaxNum-maxNum));
            }
        }
    }

