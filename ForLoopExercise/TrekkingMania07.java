package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        double mussala = 0;
        double monBlanc = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double totalSumOfPeople = 0;


        for (int i = 1; i <= numberOfGroups; i++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());

            if (numberOfPeople <= 5) {
                mussala = mussala + numberOfPeople;

            } else if (numberOfPeople <= 12) {
                monBlanc = monBlanc + numberOfPeople;
            } else if (numberOfPeople <= 25) {
                kilimandjaro = kilimandjaro + numberOfPeople;
            } else if (numberOfPeople <= 40) {
                k2 = k2 + numberOfPeople;
            } else {
                everest = everest + numberOfPeople;
            }
            totalSumOfPeople = mussala + monBlanc + kilimandjaro + k2 + everest;

        }
        System.out.printf("%.2f%%%n",(mussala/totalSumOfPeople)*100);
        System.out.printf("%.2f%%%n",(monBlanc/totalSumOfPeople)*100);
        System.out.printf("%.2f%%%n",(kilimandjaro/totalSumOfPeople)*100);
        System.out.printf("%.2f%%%n",(k2/totalSumOfPeople)*100);
        System.out.printf("%.2f%%%n",(everest/totalSumOfPeople)*100);
    }
}
