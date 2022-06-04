package FifthExam;

import java.util.Scanner;

public class P01_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        2.	Количество на бананите в килограми – реално число в интервала [0.00 … 1 0000.00]
//        3.	Количество на портокалите в килограми – реално число в интервала [0.00 … 10000.00]
//        4.	Количество на малините в килограми – реално число в интервала [0.00 … 10000.00]
//        5.	Количество на ягодите в килограми – реално число в интервала [0.00 … 10000.00]
        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double bananasCount = Double.parseDouble(scanner.nextLine());
        double orangeCount = Double.parseDouble(scanner.nextLine());
        double raspberriesCount = Double.parseDouble(scanner.nextLine());
        double countStrawberry = Double.parseDouble(scanner.nextLine());

        double totalStrawberries = countStrawberry*priceStrawberry;
        double priceRaspberries = priceStrawberry/2;
        double totalRaspberries = priceRaspberries *raspberriesCount;
        double priceOrange = priceRaspberries * 0.60;
        double totalOrange = priceOrange * orangeCount;
        double priceBananas = priceRaspberries*0.20;
        double totalBananas =  priceBananas * bananasCount;

        double total = totalStrawberries+totalRaspberries+totalOrange+totalBananas;

        System.out.printf("%.2f",total);

    }
}
