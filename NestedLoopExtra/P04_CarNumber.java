package NestedLoopExtra;

import java.util.Scanner;

public class P04_CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());

        int jPlusK = 0;
        for (int i = startNum; i <= finalNum; i++) {
            for (int j = startNum; j <= finalNum; j++) {
                for (int k = startNum; k <= finalNum; k++) {
                    for (int l = startNum; l <= finalNum; l++) {
                        jPlusK = j + k;
                        if (i % 2 == 0) {
                            if (l % 2 == 0) {
                                continue;
                            } else if (i <= l) {
                                continue;
                            } else if (jPlusK % 2 == 1) {
                                continue;
                            }
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                        if (i % 2 == 1) {
                            if (l % 2 == 1) {
                                continue;
                            } else if (i <= l) {
                                continue;
                            } else if (jPlusK % 2 == 1) {
                                continue;
                            }
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}