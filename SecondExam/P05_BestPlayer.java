package SecondExam;

import java.util.Scanner;

public class P05_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int topGoal = Integer.MIN_VALUE;

        String name = "";
        while (!input.equals("END")) {

            int goals = Integer.parseInt(scanner.nextLine());


            if (goals > topGoal) {
                name = input;
                topGoal = goals;
            } if (goals >= 10) {
                break;
            }


            input = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", name);
        if (topGoal >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", topGoal);
        }else {
            System.out.printf("He has scored %d goals.%n", topGoal);
        }
    }
}
