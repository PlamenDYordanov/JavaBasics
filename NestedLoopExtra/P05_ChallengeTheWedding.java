package NestedLoopExtra;

import java.util.Scanner;

public class P05_ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMale = Integer.parseInt(scanner.nextLine());
        int countFemale = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        boolean isMaleAndFemaleFinish = false;
        int counter = 0;

        if (tables > 0 && countMale > 0 && countFemale > 0) {

            for (int j = 1; j <= countMale; j++) {
                for (int k = 1; k <= countFemale; k++) {
                    counter++;
                    System.out.printf("(%d <-> %d) ", j, k);
                    if (counter == tables) {
                        isMaleAndFemaleFinish = true;
                        break;
                    }
                }
                if (isMaleAndFemaleFinish) {
                    break;
                }
            }
        }

    }
}
