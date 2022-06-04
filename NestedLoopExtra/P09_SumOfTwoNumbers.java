package NestedLoopExtra;

import java.util.Scanner;

public class P09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isFinish = false;

        for (int i = startNum; i <= finalNum; i++) {
            for (int j = startNum; j <= finalNum; j++) {
                counter++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, i + j);
                    isFinish = true;
                    break;
                }

            }
            if (isFinish){
                break;
            }
        }
        if (!isFinish){
            System.out.printf("%d combinations - neither equals %d",counter,magicNum);
        }
    }
}
