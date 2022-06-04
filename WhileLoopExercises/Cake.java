package WhileLoopExercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthCake = Integer.parseInt(scanner.nextLine());
        int lengthCake = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int onePiece = 1;
        int totalPieces = widthCake * lengthCake;
        int totalPiecesSum = widthCake * lengthCake;
        boolean isEnd = false;
        double eatenPieces = 0;
        while (!input.equals("STOP")) {
            int currentPieces = Integer.parseInt(input);

            totalPiecesSum = totalPiecesSum - currentPieces;
            eatenPieces = eatenPieces + currentPieces;
            if (totalPiecesSum <= 0) {
                break;
            }
            input = scanner.nextLine();
        }
        double piecesLeft = Math.abs(totalPieces - eatenPieces);
        if (totalPiecesSum <= 0) {
            System.out.printf("No more cake left! You need %.0f pieces more.", piecesLeft);
        }
        if (input.equals("STOP")) {
            System.out.printf("%.0f pieces are left.%n", piecesLeft);
            if ( totalPiecesSum <= 0) {
                System.out.printf("No more cake left! You need %.0f pieces more.", piecesLeft);
            }
        }
    }
}