package MoniPb.ConditionalStatement.Exercises;

import java.util.Scanner;

public class Ex08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double dinner = breakDuration /8.0;
        double rest = breakDuration /4.0;
        double freeTime = breakDuration - dinner - rest;
        double result = (freeTime - episodeDuration)*1.0;

        if (freeTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, result);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.abs(result));
        }
    }
}