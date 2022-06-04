package FourthExam;

import java.util.Scanner;

public class P05_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int pointsFromTournaments = 0;
        double counter = 0;
        double counterWins = 0;
        for (int i = 1; i <= countTournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    counter++;
                    startingPoints = startingPoints + 2000;
                    pointsFromTournaments = pointsFromTournaments + 2000;
                    counterWins++;
                    break;
                case "F":
                    counter++;
                    startingPoints = startingPoints + 1200;
                    pointsFromTournaments = pointsFromTournaments + 1200;
                    break;
                case "SF":
                    counter++;
                    startingPoints = startingPoints + 720;
                    pointsFromTournaments = pointsFromTournaments + 720;
                    break;
            }
        }
        double averagePoint = Math.floor(pointsFromTournaments/counter);
        System.out.printf("Final points: %d%n",startingPoints);
        System.out.printf("Average points: %.0f%n%.2f%%",averagePoint,(counterWins/counter)*100);
    }
}
