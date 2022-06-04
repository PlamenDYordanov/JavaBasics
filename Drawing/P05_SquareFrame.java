package Drawing;

import java.util.Scanner;

public class P05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String firstLastRow = stringRepeat("+ ", 1) +
                stringRepeat("- ", n - 2) +
                stringRepeat("+", 1);
        System.out.println(firstLastRow);
        for (int i = 1; i <=n-2 ; i++) {
            String middleRows = stringRepeat("| ", 1) +
                    stringRepeat("- ", n - 2) +
                    stringRepeat("|", 1);
            System.out.println(middleRows);
        }
        System.out.print(firstLastRow);


    }

    static String stringRepeat(String strToRepeat, int count) {
        String text = "";
        for (int i = 1; i <= count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
