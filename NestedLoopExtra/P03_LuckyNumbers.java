package NestedLoopExtra;

import java.util.Scanner;

public class P03_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
         int kPlusL = 0;
         int iPlushJ = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        kPlusL = k+l;
                        iPlushJ = i+j;
                        if (iPlushJ == kPlusL) {
                            if (number%kPlusL == 0)
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }

            }
        }
    }
}
