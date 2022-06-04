package MoniPb.ConditionalStatement.Exercises;

import java.util.Scanner;

public class Ex06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double meterPerSec = Double.parseDouble(scanner.nextLine());

        double time = meters * meterPerSec;
        double delay = Math.floor(meters / 15.0) * 12.5;
        double sumTime = time + delay;
        double addSec = sumTime - record;

        if (sumTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumTime);
        }
        else if (sumTime > record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs (addSec));
        }
    }

}
