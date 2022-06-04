package SeventhExam;

import java.util.Scanner;

public class P02_MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeForShooting = Integer.parseInt(scanner.nextLine());
        int countScene = Integer.parseInt(scanner.nextLine());
        int timeForScene = Integer.parseInt(scanner.nextLine());

        double preparate = timeForShooting* 0.15;
        double timeForShootingScene = countScene*timeForScene;
        double requireTime = timeForShootingScene+preparate;

        double diff = Math.abs(timeForShooting-requireTime);
        if (timeForShooting>=requireTime){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",diff);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",diff);
        }
    }
}
