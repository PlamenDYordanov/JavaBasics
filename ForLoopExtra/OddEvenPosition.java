package ForLoopExtra;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Integer.parseInt(scanner.nextLine());
        double oddNumbers = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenNumber = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 1) {
                oddNumbers = oddNumbers + number;
                if (number < oddMin) {
                    oddMin = number;
                }
                if (number > oddMax) {
                    oddMax = number;

                }
            } else if (i % 2 == 0) {
                evenNumber = evenNumber + number;
                if (number < evenMin) {
                    evenMin = number;
                }
                if (number > evenMax) {
                    evenMax = number;

                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddNumbers);
        if (oddMin == Integer.MAX_VALUE) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == Integer.MIN_VALUE) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenNumber);
        if (evenMin==Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        }else {
        System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax==Integer.MIN_VALUE){
            System.out.println("EvenMax=No");
        }else {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
