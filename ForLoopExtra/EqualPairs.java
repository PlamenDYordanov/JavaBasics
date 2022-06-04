package ForLoopExtra;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPairs = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int lastSum = 0;
        int counter = 0;
        int maxDiff = 0;

        for (int i = 1; i <= numberOfPairs; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            sum = a + b;

            if (sum == lastSum) {
                counter++;
            }

            if (maxDiff < Math.abs(sum - lastSum) && i >= 2) {
                maxDiff = Math.abs(sum - lastSum);

            }

            if (sum != lastSum) {
                lastSum = sum;
            }

        }
        if (numberOfPairs - 1 == counter) {
            System.out.println("Yes, value=" + lastSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
