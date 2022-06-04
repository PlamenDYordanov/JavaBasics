package Drawing;

import java.util.Scanner;

public class P09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String firstRowStars = "";
        String firstRowDash = "";
        int counter = 0;

        for (int i = 1; i <= (n + 1) / 2; i++) {
            if (i > 1) {
                counter += 2;
            }
            if (n % 2 == 1 && i == 1) {
                firstRowDash = repeatStr("-", (n - 1) / 2);
                firstRowStars = repeatStr("*", 1);
            } else if (n % 2 == 0 && i == 1) {
                firstRowStars = repeatStr("*", 2);
                firstRowDash = repeatStr("-", (n - 1) / 2);
            }
            if (i > 1 && n % 2 == 0) {
                firstRowDash = repeatStr("-", ((n - 1) / 2) - (i - 1));
                firstRowStars = repeatStr("**", i);
            } else if (i > 1 && n % 2 == 1) {
                firstRowDash = repeatStr("-", ((n - 1) / 2) - (i - 1));
                firstRowStars = repeatStr("*", 1 + counter);
            }

            System.out.println(firstRowDash + firstRowStars + firstRowDash);
        }

        for (int i = 1; i <= n / 2; i++) {
            String rows = repeatStr("|", 1) +
                    repeatStr("*", n - 2) +
                    repeatStr("|", 1);
            System.out.println(rows);
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
