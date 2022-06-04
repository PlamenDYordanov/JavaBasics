package FourthExam;

import java.util.Scanner;

public class P02_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesControl = Integer.parseInt(scanner.nextLine());
        int secondsControl = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsPerHundred = Integer.parseInt(scanner.nextLine());

        int totalControlSeconds = (minutesControl*60) + secondsControl;
        double delay = length/120;
        double delaySec = delay * 2.5;
        double howManyTimesHasHundred = length/100;
        double totalTime = (howManyTimesHasHundred*secondsPerHundred) - delaySec;

        double diff =  totalTime - totalControlSeconds;
        if (totalTime<=totalControlSeconds){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",totalTime);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",diff);
        }
    }
}
