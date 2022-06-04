package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Цена на екскурзията.
        double tripPrice = Double.parseDouble(scanner.nextLine());
        //1.Брой пъзели - цяло число в интервала [0… 1000]
        int puzzles = Integer.parseInt(scanner.nextLine());
        //3. Брой говорещи кукли - цяло число в интервала [0 … 1000]
        int dolls = Integer.parseInt(scanner.nextLine());
        //4. Брой плюшени мечета - цяло число в интервала [0 … 1000]
        int bears = Integer.parseInt(scanner.nextLine());
        //5. Брой миньони - цяло число в интервала [0 … 1000]
        int minions = Integer.parseInt(scanner.nextLine());
        //6. Брой камиончета - цяло число в интервала [0 … 100
        int trucks = Integer.parseInt(scanner.nextLine());
        //Пъзел - 2.60 лв.
        double puzzlePrice = puzzles * 2.60;
        //Говореща кукла - 3 лв.
        double dollsPrice = dolls * 3.0;
        //Плюшено мече - 4.10 лв.
        double bearPrice = bears * 4.10;
        //Миньон - 8.20 лв.
        double minionsPrice = minions * 8.20;
        // Камионче - 2 лв.
        double trucksPrice = trucks * 2.0;


        double totalOrder = puzzles + dolls + bears + minions + trucks;
        double sum = puzzlePrice + dollsPrice + bearPrice + minionsPrice + trucksPrice;
        if (totalOrder >= 50) {
            sum = sum - (sum * 0.25);
        }
        double profit = sum - (sum * 0.10);

        double totalMinusTrip = Math.abs(profit - tripPrice);
        if (profit >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", totalMinusTrip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", totalMinusTrip);
        }
    }

}