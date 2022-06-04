package NestedLoopExtra;

import java.util.Scanner;

public class P10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOneLv = Integer.parseInt(scanner.nextLine());
        int countTwoLv = Integer.parseInt(scanner.nextLine());
        int countFiveLv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= countOneLv; i++) {
            for (int j = 0; j <= countTwoLv; j++) {
                for (int k = 0; k <= countFiveLv; k++) {
                    if (i * 1 + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }

        }
    }
}
