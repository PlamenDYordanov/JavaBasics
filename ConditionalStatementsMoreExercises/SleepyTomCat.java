package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt(scanner.nextLine());
        int yearlyDays = 365;
        int requireGameTime = 30000;

        int totalPlayRestDays = restDays * 127;
        int totalPlayNonRestDays = (yearlyDays - restDays) * 63;
        int totalPlayTime = totalPlayNonRestDays + totalPlayRestDays;
        int diff = Math.abs(totalPlayTime - requireGameTime);
        int hours = diff / 60;
        int minutes = diff % 60;

        if (totalPlayTime > requireGameTime) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hours,minutes);
        }
    }
}
