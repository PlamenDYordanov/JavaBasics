package ConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalSeconds = timeSecond + timeFirst + timeThird;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%d:%02d", minutes, seconds);

    }
}
