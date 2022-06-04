package FourthExam;

import java.util.Scanner;

public class P04_GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstGamer = scanner.nextLine();
        String secondGamer = scanner.nextLine();

        String input = scanner.nextLine();

        boolean isNumberWars = false;

        int firstPoints = 0;
        int firstPointsTotal = 0;
        int secondPoints = 0;
        int secondPointsTotal = 0;

        while (!input.equals("End of game")) {

            int firstGamerCard = Integer.parseInt(input);
            input = scanner.nextLine();
            int secondGamerCard = Integer.parseInt(input);

            if (firstGamerCard > secondGamerCard) {
                firstPoints = firstGamerCard - secondGamerCard;
                firstPointsTotal = firstPointsTotal + firstPoints;
            } else if (firstGamerCard < secondGamerCard) {
                secondPoints = secondGamerCard - firstGamerCard;
                secondPointsTotal = secondPointsTotal + secondPoints;
            } else {
                isNumberWars = true;
                break;
            }

            input = scanner.nextLine();
        }
        if (isNumberWars) {
            int firstGameCard = Integer.parseInt(scanner.nextLine());
            int secondGameCard = Integer.parseInt(scanner.nextLine());

            if (firstGameCard > secondGameCard) {
                System.out.println("Number wars!");
                System.out.printf("%s is winner with %d points", firstGamer, firstPointsTotal);
            } else if (secondGameCard > firstGameCard) {
                System.out.println("Number wars!");
                System.out.printf("%s is winner with %d points", secondGamer, secondPointsTotal);
            }
        } else {
            System.out.printf("%s has %d points%n", firstGamer, firstPointsTotal);
            System.out.printf("%s has %d points%n", secondGamer, secondPointsTotal);
        }
    }
}
