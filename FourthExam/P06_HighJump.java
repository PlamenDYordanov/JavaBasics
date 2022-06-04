package FourthExam;

import java.util.Scanner;

public class P06_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desireHigh = Integer.parseInt(scanner.nextLine());

        int startingLath = desireHigh - 30;
        int totalCounter = 0;
        int unsuccessfulCount = 0;
        boolean unsuccessfulAttempt = false;
        for (int i = 1; ; i++) {

            int jump = Integer.parseInt(scanner.nextLine());
            totalCounter++;
            if (jump <= startingLath) {
                unsuccessfulCount++;
                if (unsuccessfulCount == 3) {
                    unsuccessfulAttempt = true;
                    break;
                }

            } else {
                if (startingLath >= desireHigh) {
                    break;
                }
                unsuccessfulCount = 0;
                startingLath = startingLath + 5;
            }
        }


        if (unsuccessfulAttempt) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", startingLath, totalCounter);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", desireHigh, totalCounter);
        }
    }
}
