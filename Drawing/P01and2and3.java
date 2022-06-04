package Drawing;

import java.util.Scanner;

public class P01and2and3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= stars; i++) {

            for (int j = 1; j <=stars-1 ; j++) {
                System.out.print("*"+" ");

            }
            System.out.print("*");
            System.out.println();
        }
    }
}
