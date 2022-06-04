package ConditionalStatementsExercise;

import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTime = (hours * 60) + minutes + 15;
        int convertHours = totalTime / 60;
        int convertMinutes = totalTime % 60;
        if (convertHours > 23) {
            convertHours = 0;
        }
        if (convertMinutes < 10) {
            System.out.printf("%d:0%d", convertHours, convertMinutes);
        } else {
            System.out.printf("%d:%d", convertHours, convertMinutes);
        }
    }
}

