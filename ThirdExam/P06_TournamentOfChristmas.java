package ThirdExam;

import java.util.Scanner;

public class P06_TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfTournament = Integer.parseInt(scanner.nextLine());

        int counterWin = 0;
        int totalWin = 0;
        int counterLose = 0;
        int totalLose = 0;
        double profit = 0;
        double totalProfit = 0;

        for (int i = 1; i <= daysOfTournament; i++) {
            totalProfit = totalProfit + profit;
            counterWin = 0;
            counterLose = 0;
            profit = 0;
            String sport = scanner.nextLine();
            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    profit = profit + 20;
                    counterWin++;
                    totalWin++;
                } else {
                    counterLose++;
                    totalLose++;
                }

                sport = scanner.nextLine();
                if (sport.equals("Finish") && counterWin > counterLose) {
                    profit = profit * 1.10;
                }

            }

        }
        totalProfit = totalProfit + profit;
        if (totalWin > totalLose) {
            totalProfit = totalProfit * 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f%n",totalProfit);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f%n",totalProfit);
        }
    }
}
