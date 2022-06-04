package SecondExam;

import java.util.Scanner;

public class P04_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int countDivision = 0;
        int totalBalls = 0;
        int otherColor = 0;

        for (int i = 1; i <= countBalls; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    totalPoints += 5;
                    redBalls++;
                    totalBalls++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orangeBalls++;
                    totalBalls++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowBalls++;
                    totalBalls++;
                    break;
                case "white":
                    totalPoints += 20;
                    whiteBalls++;
                    totalBalls++;
                    break;
                case "black":
                    totalPoints = totalPoints / 2;
                    countDivision++;
                    totalBalls++;
                    break;
                default:
                    otherColor++;

            }


        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherColor);
        System.out.printf("Divides from black balls: %d%n", countDivision);

    }
}
