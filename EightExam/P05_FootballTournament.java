package EightExam;

import java.util.Scanner;

public class P05_FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfTeam = scanner.nextLine();
        int numberOfMatches = Integer.parseInt(scanner.nextLine());

        int win = 0;
        int lose = 0;
        int draw = 0;
        double total = 0;

        int points = 0;
        for (int i = 1; i <= numberOfMatches; i++) {
            String result = scanner.nextLine();
            total++;
            switch (result) {
                case "W":
                    win++;
                    points = points + 3;
                    break;
                case "L":
                    lose++;
                    break;
                case "D":
                    points = points + 1;
                    draw++;
                    break;
            }
        }
        if (numberOfMatches==0){
            System.out.printf("%s hasn't played any games during this season.",nameOfTeam);
        }else {
            System.out.printf("%s has won %d points during this season.%n",nameOfTeam,points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",win);
            System.out.printf("## D: %d%n",draw);
            System.out.printf("## L: %d%n",lose);
            System.out.printf("Win rate: %.2f%%%n",(win/total)*100);
        }
    }
}
