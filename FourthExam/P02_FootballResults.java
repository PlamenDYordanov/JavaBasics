package FourthExam;

import java.util.Scanner;

public class P02_FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int won = 0;
        int lose = 0;
        int draw = 0;

        for (int i = 1; i <= 3; i++) {
            String input = scanner.nextLine();
            char firstNumber = input.charAt(0);
            char secondNumber = input.charAt(2);
            int firstNum = Character.getNumericValue(firstNumber);
            int secondNum = Character.getNumericValue(secondNumber);

            if (firstNum > secondNum) {
                won++;
            } else if (firstNum < secondNum) {
                lose++;
            } else {
                draw++;
            }

        }
        System.out.printf("Team won %d games.%n", won);
        System.out.printf("Team lost %d games.%n", lose);
        System.out.printf("Drawn games: %d%n", draw);
    }
}
