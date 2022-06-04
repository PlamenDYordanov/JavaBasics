package FourthExam;

import java.util.Scanner;

public class P06_BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String nameOfTournament = "";
        int counterMatches = 0;
        int counterWin = 0;
        int counterLost = 0;
        double totalMatches = 0;

        while (!input.equals("End of tournaments")) {
            nameOfTournament = input;
            input = scanner.nextLine();
            int numberOfMatches = Integer.parseInt(input);

            counterMatches = 0;
            input = scanner.nextLine();
            for (int i = 1; i <= numberOfMatches; i++) {
                int pointsDesiTeam = Integer.parseInt(input);
                input = scanner.nextLine();
                int otherTeam = Integer.parseInt(input);
                counterMatches++;

                int diff = Math.abs(pointsDesiTeam-otherTeam);
                if (pointsDesiTeam > otherTeam) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", counterMatches,nameOfTournament,diff);
                    counterWin++;
                }else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",counterMatches,nameOfTournament,diff);
                    counterLost++;
                }
                totalMatches++;

                input = scanner.nextLine();

            }
        }
        System.out.printf("%.2f%% matches win%n",(counterWin/totalMatches)*100);
        System.out.printf("%.2f%% matches lost%n",(counterLost/totalMatches)*100);
    }
}
