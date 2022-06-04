package FirstExam;

import java.util.Scanner;

public class P04_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEggsFirst = Integer.parseInt(scanner.nextLine());
        int countEggsSecond = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int sumSecond = countEggsSecond;
        int sumFirst = countEggsFirst;

        boolean isZeroFirst = false;
        boolean isZeroSecond = false;

        while (!input.equals("End of battle")) {

            if (input.equals("one")) {
                sumSecond--;
            } else if (input.equals("two")) {
                sumFirst--;
            }
            if (sumFirst == 0) {
                isZeroFirst=true;
                break;
            } else if (sumSecond == 0) {
                isZeroSecond=true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isZeroFirst) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", sumSecond);
        } else if (isZeroSecond) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", sumFirst);
        } else {
            System.out.printf("Player one has %d eggs left.%n", sumFirst);
            System.out.printf("Player two has %d eggs left.%n", sumSecond);
        }
    }
}
