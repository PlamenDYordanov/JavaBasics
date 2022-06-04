package Drawing;

import java.util.Scanner;

public class P10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String starsFirstRow = "";
        String dashFirstRow = "";
        int counterDash = 0;

        if (n % 2 == 0) {
            starsFirstRow = repeatStr("**", 1);
            dashFirstRow = repeatStr("-", (n - 1) / 2);
        } else {
            starsFirstRow = repeatStr("*", 1);
            dashFirstRow = repeatStr("-", (n - 1) / 2);
        }
        System.out.println(dashFirstRow + starsFirstRow + dashFirstRow);
        if (n % 2 == 0 && n > 1) {

            for (int rows = 1; rows <= (n - 1) / 2; rows++) {
                String firstPart = repeatStr("-", ((n / 2) - 1) - rows) +
                        repeatStr("*", 1) +
                        repeatStr("-", rows * 2) +
                        repeatStr("*", 1) +
                        repeatStr("-", ((n / 2) - 1) - rows);

                System.out.println(firstPart);
            }
            for (int rows = 1; rows <= (n - 1) / 2; rows++) {
                counterDash += 2;
                String secondPart = repeatStr("-", rows) +
                        repeatStr("*", 1) +
                        repeatStr("-", (n - 2) - counterDash) +
                        repeatStr("*", 1) +
                        repeatStr("-", rows);
                System.out.println(secondPart);
            }
        } else if (n % 2 == 1 && n > 1) {
            for (int rows = 1; rows <= (n - 1) / 2; rows++) {
                counterDash += 2;
                String firstPart = repeatStr("-", (n / 2) - rows) +
                        repeatStr("*", 1) +
                        repeatStr("-", counterDash - 1) +
                        repeatStr("*", 1) +
                        repeatStr("-", (n / 2) - rows);
                System.out.println(firstPart);
            }
            counterDash = 0;
            for (int rows = 1; rows <= (n - 2) / 2; rows++) {
                counterDash += 2;
                String secondPart = repeatStr("-", rows) +
                        repeatStr("*", 1) +
                        repeatStr("-", (n - 2) - counterDash) +
                        repeatStr("*", 1) +
                        repeatStr("-", rows);
                System.out.println(secondPart);

            }
            String lastRow = repeatStr("-", n / 2) +
                    repeatStr("*", 1) +
                    repeatStr("-", n / 2);
            System.out.println(lastRow);
        }

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
