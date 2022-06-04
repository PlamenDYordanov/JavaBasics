package ForLoopExercise;

import java.util.Scanner;

public class TennisRank08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTournament = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
double additionalPoints = 0;
double wonTournaments = 0;
        for (int i = 1; i <=numberTournament ; i++) {
            String stageOfTournament = scanner.nextLine();
            switch (stageOfTournament){
                case "W":
                    additionalPoints= additionalPoints+2000;
                    wonTournaments++;
                    break;
                case "F":
                    additionalPoints= additionalPoints+1200;
                    break;
                case "SF":
                    additionalPoints= additionalPoints+720;
                    break;
            }
            
        }
        System.out.printf("Final points: %.0f%n",additionalPoints+points);
        System.out.printf("Average points: %.0f%n",Math.floor(additionalPoints/numberTournament));
        System.out.printf("%.2f%%%n",wonTournaments/numberTournament*100);
    }
}
