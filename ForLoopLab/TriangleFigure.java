package ForLoopLab;

import java.util.Scanner;

public class TriangleFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSymbols = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= numberOfSymbols; row++) {


            for (int col = 1; col <= row; col++) {
                System.out.print("$");

            }
            System.out.println();
        }
    }
}
