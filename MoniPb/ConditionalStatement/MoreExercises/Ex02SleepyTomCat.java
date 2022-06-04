package MoniPb.ConditionalStatement.MoreExercises;

import java.util.Scanner;

public class Ex02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekend = Integer.parseInt(scanner.nextLine());

        int yearPlayNormMin = 30000;
        int workDays = 365 - weekend;
        int workDayPlayTimeMin = workDays * 63;
        int weekendPlayTimeMin = weekend * 127;

        int yearPlayTime = workDayPlayTimeMin+weekendPlayTimeMin;
        int difference = Math.abs((yearPlayNormMin - yearPlayTime));
        int hours = difference / 60;
        int minutes = difference % 60;
        if (yearPlayTime>yearPlayNormMin) {
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play",hours,minutes);
        } else if (yearPlayTime<yearPlayNormMin) {
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play",hours,minutes);
        }

    }
}
