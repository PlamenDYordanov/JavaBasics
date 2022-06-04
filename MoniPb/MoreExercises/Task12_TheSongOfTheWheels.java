package MoniPb.MoreExercises;

import java.util.Scanner;

public class Task12_TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int controlNum = Integer.parseInt(scanner.nextLine());

        int count = 0;
        String password = "";
        boolean isPass = false;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d) {
                            if ((a * b) + (c * d) == controlNum) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                count++;
                                if (count == 4) {
                                    isPass = true;
                                    password = "" + a + b + c + d;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (isPass) {
            System.out.println();
            System.out.printf("Password: %s", password);
        } else {
            System.out.println();
            System.out.println("No!");
        }
    }
}
