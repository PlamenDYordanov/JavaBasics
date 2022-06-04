package Exam02PB;

import java.util.Scanner;

public class P06_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations = Integer.parseInt(scanner.nextLine());

        double totalExtraction = 0;
        double averageGoldPerDay =0;

        for (int i = 1; i <= locations; i++) {
            double averagePerDay = Double.parseDouble(scanner.nextLine());
            int workingDays = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= workingDays; j++) {
            double extractionGold = Double.parseDouble(scanner.nextLine());

            totalExtraction +=extractionGold;
             averageGoldPerDay = totalExtraction/workingDays;
            }
            if (averageGoldPerDay>=averagePerDay){
                System.out.printf("Good job! Average gold per day: %.2f.%n",averageGoldPerDay);
            }else {
                double diff = averagePerDay-averageGoldPerDay;
                System.out.printf("You need %.2f gold.%n",diff);
            }
            totalExtraction =0;
        }
    }
}
