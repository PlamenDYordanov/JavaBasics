package ConditionalStatementsExercise;

import java.util.Scanner;

public class Lunchbreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());


        double lunch = breakDuration / 8.0;
        double rest = breakDuration / 4.0;
        double watchDuringBreak = breakDuration - (lunch + rest);

        double timeNeeded = Math.abs(episodeLength - watchDuringBreak);


        if (watchDuringBreak >= episodeLength) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial,Math.ceil(timeNeeded));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(timeNeeded));
        }
    }
}
