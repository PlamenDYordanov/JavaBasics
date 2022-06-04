package WhileLoopExercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());//Въведена цена

        double coins = price * 100;//монети
        int counterCoins = 0;
        coins = Math.round(coins);
        while (coins > 0) {
            if (coins >= 200) {
                counterCoins++;
                coins = coins - 200;
            } else if (coins >= 100) {
                counterCoins++;
                coins = coins - 100;
            } else if (coins >= 50) {
                counterCoins++;
                coins = coins - 50;
            } else if (coins >= 20) {
                counterCoins++;
                coins = coins - 20;
            } else if (coins >= 10) {
                counterCoins++;
                coins = coins - 10;
            } else if (coins >= 5) {
                counterCoins++;
                coins = coins - 5;
            } else if (coins >= 2) {
                counterCoins++;
                coins = coins - 2;
            } else {
                coins = coins - 1;
                counterCoins++;
            }

        }
        System.out.println(counterCoins);
    }
}
