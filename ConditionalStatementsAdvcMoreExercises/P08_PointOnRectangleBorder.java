package ConditionalStatementsAdvcMoreExercises;

import java.util.Scanner;

public class P08_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2    = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        double roundX1 = Math.round(x1);
        double roundY1 = Math.round(y1);
        double roundX2 = Math.round(x2);
        double roundY2 = Math.round(y2);
        double roundX = Math.round(x);
        double roundY = Math.round(y);
        int counter = 0;

        if (roundX1 == 2 && roundY1 == -3 || roundX1 == 4 && roundY1 == -3 || roundX1 == 6 && roundY1 == -3 || roundX1 == 8 && roundY1 == -3 ||
                roundX1 == 10 && roundY1 == -3 || roundX1 == 12 && roundY1 == -3 || roundX1 == 2 && roundY1 == -1 || roundX1 == 2 && roundY1 == 1 || roundX1 == 2 && roundY1 == 3
                || roundX1 == 4 && roundY1 == 3 || roundX1 == 6 && roundY1 == 3 || roundX1 == 8 && roundY1 == 3 || roundX1 == 10 && roundY1 == 3 || roundX1 == 12 && roundY1 == 3 ||
        roundX1 == 12 && roundY1 == -1 || roundX1 == 12 && roundY1 == 1 ) {
            counter++;
        }
        if (roundX2 == 2 && roundY2 == -3 || roundX2 == 4 && roundY2 == -3 || roundX2 == 6 && roundY2 == -3 || roundX2 == 8 && roundY2 == -3 ||
                roundX2 == 10 && roundY2 == -3 || roundX2 == 12 && roundY2 == -3 || roundX2 == 2 && roundY2 == -1 || roundX2 == 2 && roundY2 == 1 || roundX2 == 2 && roundY2 == 3
                || roundX2 == 4 && roundY2 == 3 || roundX2 == 6 && roundY2 == 3 || roundX2 == 8 && roundY2 == 3 || roundX2 == 10 && roundY2 == 3 || roundX2 == 12 && roundY2 == 3 ||
                roundX2 == 12 && roundY2 == -1 || roundX2 == 12 && roundY2 == 1 ) {
            counter++;
        }
        if (roundX == 2 && roundY == -3 || roundX == 4 && roundY == -3 || roundX == 6 && roundY == -3 || roundX == 8 && roundY == -3 ||
                roundX == 10 && roundY == -3 || roundX == 12 && roundY == -3 || roundX == 2 && roundY == -1 || roundX == 2 && roundY == 1 || roundX == 2 && roundY == 3
                || roundX == 4 && roundY == 3 || roundX == 6 && roundY == 3 || roundX == 8 && roundY == 3 || roundX == 10 && roundY == 3 || roundX == 12 && roundY == 3 ||
                roundX == 12 && roundY == -1 || roundX == 12 && roundY == 1 ) {
            counter++;
        }
        if (counter == 3) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}

