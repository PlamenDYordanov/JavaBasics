package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double totalTime = distance * timeForOneMeter;

        double piceOfDelay = Math.floor(distance / 15);
        double totalDelayTime = (piceOfDelay * 12.5);
        double totalTimeWithDelay = (totalTime + totalDelayTime);


        double needForRecord =Math.abs(record - totalTimeWithDelay);

        if (totalTimeWithDelay < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTimeWithDelay);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", needForRecord);
        }


    }
}
