package SeventhExam;

import java.util.Scanner;

public class P06_MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        char symbol1 = ' ';
        int symbol2 = 0;
        int symbol3 = 0;
        int symbol4 = 0;
        for (int i = a1; i <= a2; i++) {
            if (i % 2 == 1) {
                symbol1 = (char) i;
            } else if (i % 2 == 0) {
                continue;
            }
            for (int j = n; j >= 1; j--) {
                symbol2 = j;

                for (int k = 1; k <= n; k++) {
                    symbol3 = k;
                    symbol4 = symbol1;
                    int sum234 = symbol2+symbol3+symbol4;
                    if (sum234 % 2 == 1) {
                        System.out.printf("%c-%d%d%d%n",symbol1,symbol2,symbol3,symbol4);
                    }
                }
            }

        }
    }
}
