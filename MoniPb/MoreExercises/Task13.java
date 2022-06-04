package MoniPb.MoreExercises;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstStart = Integer.parseInt(scanner.nextLine());
        int secondStart = Integer.parseInt(scanner.nextLine());
        int firstDivision = Integer.parseInt(scanner.nextLine());
        int secondDivision = Integer.parseInt(scanner.nextLine());

        int firstEnd = firstStart + firstDivision;
        int secondEnd = secondStart + secondDivision;


        for (int i = firstStart; i <= firstEnd; i++) {
            for (int j = secondStart; j <= secondEnd; j++) {

                if (i % 2 != 0) {
                    if (i % 3 != 0) {
                        if (i % 5 != 0) {
                            if (i % 7 != 0) {
                                if (j % 2 != 0) {
                                    if (j % 3 != 0) {
                                        if (j % 5 != 0) {
                                            if (j % 7 != 0) {
                                                System.out.printf("%d%d%n", i, j);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
