package ForLoopExercise;

import java.util.Scanner;

public class CleverLily04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int birthDayMoney = 0;
        int totalBDMoney = 0;
        int toys = 0;
        int brotherMoney = 0;
        int totalToyPrice = 0;
        int totalMoneyFromBirthDay = 0;
        int totalSum = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                birthDayMoney = birthDayMoney + 10;
                totalBDMoney =totalBDMoney + birthDayMoney;

                brotherMoney=brotherMoney+1;
            } else {
                toys++;
            }
        }
        totalToyPrice = toys * toyPrice;
        totalMoneyFromBirthDay = totalBDMoney - brotherMoney;
        totalSum = totalToyPrice + totalMoneyFromBirthDay;
        if (totalSum>=washingMachinePrice){
        System.out.printf("Yes! %.2f", Math.abs(totalSum - washingMachinePrice));
        }else {
            System.out.printf("No! %.2f",Math.abs(totalSum - washingMachinePrice));
        }
    }
}
