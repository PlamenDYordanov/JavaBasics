package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());

        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int totalTimeExam = (hourExam * 60) + minExam;

        int totalTimeArrival = (hourArrival * 60) + minArrival;

        int diff = Math.abs(totalTimeExam - totalTimeArrival);
        int hours = diff / 60;
        int min = diff % 60;

        if (totalTimeExam >= totalTimeArrival) {
            if (diff > 30) {
                if (hours == 0) {
                    System.out.printf("Early%n %d minutes before the start", min);
                } else {
                    System.out.printf("Early%n %d:%02d hours before the start", hours, min);
                }
            } else {
                if (totalTimeExam==totalTimeArrival) {
                    System.out.println("On time");
                } else {
                    System.out.printf("On time%n %d minutes before the start", min);
                }
            }
        } else {
            if (diff >= 60) {
                System.out.printf("Late%n %d:%02d hours after the start", hours, min);
            }else{
                System.out.printf("Late%n %d minutes after the start",min);
            }


        }

    }
}
