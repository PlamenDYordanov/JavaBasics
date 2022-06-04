package MoniPb.MoreExercises;

import java.util.Scanner;

public class Таск13_PrimePairs {
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

                boolean isPrime = i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0;
                if (isPrime) {
                System.out.printf("%d%d%n",i,j);
                }
            }
        }
    }
}
