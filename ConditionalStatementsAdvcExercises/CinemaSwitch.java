package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class CinemaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        int seats = row * column;
double totalSum = 0.0;
        switch (projection) {
            case "Premiere":
                totalSum = seats *12;
                break;
            case "Normal":
                totalSum = seats*7.5;
                break;
            default:
                totalSum = seats*5.00;
            }
        System.out.printf("%.2f leva",totalSum);



        }
    }


