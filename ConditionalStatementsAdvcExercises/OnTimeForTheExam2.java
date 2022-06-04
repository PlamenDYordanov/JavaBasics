package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class OnTimeForTheExam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int totalExamMin = (examHour * 60) + examMin;
        int totalArrivalMin = (arrivalHour * 60) + arrivalMin;
        int diff = Math.abs(totalExamMin - totalArrivalMin);
        int minutes = 0;
        int hours = 0;

        if (totalExamMin < totalArrivalMin) {
            System.out.println("Late");
            if (diff >= 60) {
                hours = diff / 60;
                minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }

        } else if (totalExamMin == totalArrivalMin || (diff > 1 && diff <= 30)) {
            System.out.println("On time");
            if (diff > 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                hours = diff / 60;
                minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}