package NestedLoopExtra;

import java.util.Scanner;

public class P_13EqualsPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPair = Integer.parseInt(scanner.nextLine());
        int secondPair = Integer.parseInt(scanner.nextLine());
        int firstPairSum = Integer.parseInt(scanner.nextLine());
        int secondPairSum = Integer.parseInt(scanner.nextLine());

        firstPairSum = firstPairSum + firstPair;
        secondPairSum = secondPair + secondPairSum;
        int counterI = 0;
        int counterJ = 0;
        for (int i = firstPair; i <= firstPairSum; i++) {
            counterI = 0;

            if (i % 2 == 0) {
                counterI++;
            }
            if (i % 3 == 0) {
                counterI++;
            }
            if (i % 5 == 0) {
                counterI++;
            }
            if (i % 7 == 0) {
                counterI++;
            }
            if (i % 8 == 0) {
                counterI++;
            }
            if (i % 9 == 0) {
                counterI++;
            }
            if (i % 25 == 0) {
                counterI++;
            }
            if (i % 11 == 0) {
                counterI++;
            }if (i>30&&i%10==1){
                counterI++;
            }


            for (int j = secondPair; j <= secondPairSum; j++) {
                counterJ = 0;

                if (j % 2 == 0) {
                    counterJ++;
                }
                if (j % 3 == 0) {
                    counterJ++;
                }
                if (j % 5 == 0) {
                    counterJ++;
                }
                if (j % 7 == 0) {
                    counterJ++;
                }
                if (j % 8 == 0) {
                    counterJ++;
                }
                if (j % 9 == 0) {
                    counterJ++;
                }
                if (j % 25 == 0) {
                    counterJ++;
                }
                if (j % 11 == 0) {
                    counterJ++;
                }if (j>30&&j%10==1){
                    counterJ++;
                }


                if ((i >= 2 || j >= 2) && counterI < 2 && counterJ < 2 && i % 2 == 1 && j % 2 == 1) {
                    System.out.printf("%d%d%n", i, j);
                }

            }

        }
    }
}
