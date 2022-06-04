package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        double totalSum = 0.0;
        int seats = row * column;
        if (projection.equals("Premiere")) {
            totalSum = seats * 12;
        } else if (projection.equals("Normal")) {
            totalSum = seats * 7.5;
        } else {
            projection.equals("Discount");
            totalSum = seats * 5.00;
        }
        System.out.printf("%.2f leva", totalSum);
    }
}
