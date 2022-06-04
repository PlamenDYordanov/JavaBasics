package ThirdExam;

import java.nio.DoubleBuffer;
import java.util.Scanner;

public class P02_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double oneMeterPerSec = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(distance / 50);
        double totalDelay = delay * 30;
        double time = distance * oneMeterPerSec;
        double totalTime = time+totalDelay;

        double diff = Math.abs(record-totalTime);
        if (totalTime<record){
            System.out.printf("Yes! The new record is %.2f seconds.",totalTime);
        }else {
            System.out.printf("No! He was %.2f seconds slower.",diff);
        }
    }
}
