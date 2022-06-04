package SecondExam;

import java.util.Scanner;

public class P06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        int currentFirstNum = firstNum;
        int currentSecondNum = secondNum;

        int firstNumberLast = currentFirstNum % 10;
        currentFirstNum = currentFirstNum / 10;
        int firstNumberThird = currentFirstNum % 10;
        currentFirstNum = currentFirstNum / 10;
        int firstNumberSecond = currentFirstNum % 10;
        currentFirstNum = currentFirstNum / 10;
        int firstNumberFirst = currentFirstNum % 10;

        int secondNumberLast = currentSecondNum % 10;
        currentSecondNum = currentSecondNum / 10;
        int secondNumberThird = currentSecondNum % 10;
        currentSecondNum = currentSecondNum / 10;
        int secondNumberSecond = currentSecondNum % 10;
        currentSecondNum = currentSecondNum / 10;
        int secondNumberFirst = currentSecondNum % 10;
        int counter = 0;

        int oddNumFirst = 0;
        int oddNumSecond = 0;
        int oddNumThird = 0;
        int oddNumFourth = 0;

        for (int i = firstNumberFirst; i <= secondNumberFirst; i++) {
            if (i % 2 == 1) {

                oddNumFirst = i;
            }
            if (i % 2 == 0) {
                continue;
            }
            for (int j = firstNumberSecond; j <= secondNumberSecond; j++) {
                if (j % 2 == 1) {
                    oddNumSecond = j;
                }
                if (j % 2 == 0) {
                    continue;
                }
                for (int k = firstNumberThird; k <= secondNumberThird; k++) {
                    if (k % 2 == 1) {
                        oddNumThird = k;
                    }
                    if (k % 2 == 0) {
                        continue;
                    }
                    for (int l = firstNumberLast; l <= secondNumberLast; l++) {
                        if (l % 2 == 0) {
                            continue;
                        }
                        if (l % 2 == 1) {
                            oddNumFourth = l;
                        }
                        if (l % 2 == 1) {
                            System.out.print(i + "" + j + k + l + " ");
                        }

                    }

                }

            }

        }

    }
}









