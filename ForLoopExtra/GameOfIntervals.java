package ForLoopExtra;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfMove = Integer.parseInt(scanner.nextLine());
        //•	От 0 до 9  20 % от числото
        //•	От 10 до 19  30 % от числото
        //•	От 20 до 29  40 % от числото
        //•	От 30 до 39  50 точки
        //•	От 40 до 50  100 точки
        //•	Невалидно число  резултата се дели на 2
        double points = 0;
        double pointsToNine = 0;
        double pointsToNineteen = 0;
        double pointsToTwentyNine = 0;
        double pointsToThirtyNine = 0;
        double pointsToFifty = 0;
        double pointsOfInvalidNumber = 0;
        for (int i = 1; i <= numbersOfMove; i++) {
            int numbersForCheck = Integer.parseInt(scanner.nextLine());

            if (numbersForCheck <= 9 && numbersForCheck >= 0) {
                points = points + numbersForCheck * 0.2;
                pointsToNine++;
            } else if (numbersForCheck <= 19 && numbersForCheck > 9) {
                points = points + numbersForCheck * 0.3;
                pointsToNineteen++;
            } else if (numbersForCheck <= 29 && numbersForCheck > 19) {
                points = points + numbersForCheck * 0.4;
                pointsToTwentyNine++;
            } else if (numbersForCheck <= 39 && numbersForCheck > 29) {
                points = points + 50;
                pointsToThirtyNine++;
            } else if (numbersForCheck <= 50 && numbersForCheck > 39) {
                points = points + 100;
                pointsToFifty++;
            } else {
                points = points / 2;
                pointsOfInvalidNumber++;
            }

        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n",pointsToNine/numbersOfMove*100);
        System.out.printf("From 10 to 19: %.2f%%%n",pointsToNineteen/numbersOfMove*100);
        System.out.printf("From 20 to 29: %.2f%%%n",pointsToTwentyNine/numbersOfMove*100);
        System.out.printf("From 30 to 39: %.2f%%%n",pointsToThirtyNine/numbersOfMove*100);
        System.out.printf("From 40 to 50: %.2f%%%n",pointsToFifty/numbersOfMove*100);
        System.out.printf("Invalid numbers: %.2f%%%n",pointsOfInvalidNumber/numbersOfMove*100);

    }
}
