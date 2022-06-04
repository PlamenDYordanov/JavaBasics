package Exam01PB;

import java.util.Scanner;

public class P05_ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int excursionsSea = Integer.parseInt(scanner.nextLine());
        int excursionMountain = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int seaPrice = 680;
        int mountainPrice = 499;

        double profit = 0;
        boolean isSoldEverything = false;

        while (!input.equals("Stop")){
            switch (input){
                case "sea":
                    if (excursionsSea==0){
                        break;
                    }
                    profit = profit+seaPrice;
                    excursionsSea--;
                    break;
                case "mountain":
                    if (excursionMountain == 0){
                        break;
                    }
                    profit = profit+mountainPrice;
                    excursionMountain--;
                    break;
            }
                if (excursionMountain==0&&excursionsSea==0){
                    isSoldEverything=true;
                    break;
                }
            input = scanner.nextLine();
        }
        if (isSoldEverything){
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %.0f leva.%n",profit);
        }else {
            System.out.printf("Profit: %.0f leva.%n",profit);
        }
    }
}
