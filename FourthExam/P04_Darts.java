package FourthExam;

import java.util.Scanner;

public class P04_Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfGamer = scanner.nextLine();

        String input = scanner.nextLine();
        String field = "";
        int totalPoints = 0;
        int counter = 0;
        int unsuccessfulCounter = 0;

        while (!input.equals("Retire")) {
            field = input;
            int points = Integer.parseInt(scanner.nextLine());

            switch (field) {
                case "Single":
                    totalPoints = totalPoints + points;
                    if (totalPoints <= 301) {
                        counter++;
                    }else {
                        totalPoints = totalPoints - points;
                        unsuccessfulCounter++;
                    }
                    break;

                case "Double":
                    totalPoints = totalPoints + (points*2);
                    if (totalPoints <= 301) {
                        counter++;
                    }else {
                        totalPoints = totalPoints - (points*2);
                        unsuccessfulCounter++;
                    }
                    break;

                case "Triple":
                    totalPoints = totalPoints + (points*3);
                    if (totalPoints <= 301) {
                        counter++;
                    }else {
                        totalPoints = totalPoints - (points*3);
                        unsuccessfulCounter++;
                    }
                    break;
            }
            if (totalPoints == 301){
                break;
            }

            input = scanner.nextLine();
        }
        if (totalPoints == 301){
            System.out.printf("%s won the leg with %d shots.%n",nameOfGamer,counter);
        }else {
            System.out.printf("%s retired after %d unsuccessful shots.%n",nameOfGamer,unsuccessfulCounter);
        }
    }
}
