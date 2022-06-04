package FirstExam;

import java.util.Scanner;

public class P06_EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEasterBread = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int maxPoints = Integer.MIN_VALUE;
        boolean isWinner = false;
        String input = scanner.nextLine();
        String nameOfChef = "";
        String bestChef = "";

        for (int i = 1; i <= countEasterBread ; i++) {
            nameOfChef = input;
            input= scanner.nextLine();
            while (!input.equals("Stop")){

                int points = Integer.parseInt(input);
                totalPoints+=points;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n",nameOfChef,totalPoints);
            if (totalPoints>maxPoints){
                maxPoints=totalPoints;
                bestChef = nameOfChef;
                System.out.printf("%s is the new number 1!%n",nameOfChef);
                isWinner =true;
            }

            if (i == countEasterBread){
                break;
            }

            totalPoints=0;

            input= scanner.nextLine();

        }

        System.out.printf("%s won competition with %d points!",bestChef,maxPoints);
    }
}
