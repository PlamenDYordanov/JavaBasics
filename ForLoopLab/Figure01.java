package ForLoopLab;

import java.util.Scanner;

public class Figure01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.print("+"+" ");
        for (int i = 1; i <= number-2; i++) {
            System.out.print("-"+" ");
        }
        System.out.println("+");

        for (int row = 1; row <= number-2; row++) {
            System.out.print("|"+" ");
            for (int i = 1; i <= number-2 ; i++) {
                System.out.print("-"+" ");
            }
            System.out.println("|");
        }
        System.out.print("+"+" ");
        for (int i = 1; i <= number-2; i++) {
            System.out.print("-"+" ");
        }
        System.out.println("+");
    }
}
