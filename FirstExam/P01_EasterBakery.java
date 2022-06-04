package FirstExam;

import java.util.Scanner;

public class P01_EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1.	Цена на брашното за един килограм – реално число в интервала [0.00 … 10000.00]
//        2.	Килограми на брашното – реално число в интервала [0.00 … 10000.00]
//        3.	Килограми на захарта – реално число в интервала [0.00 … 10000.00]
//        4.	Брой кори с яйца – цяло число в интервала [0 … 10000]
//        5.	Пакети мая  – цяло число в интервала [0 … 10000]

        double priceFlourPerKg = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int shellEggs = Integer.parseInt(scanner.nextLine());
        int packageYeast = Integer.parseInt(scanner.nextLine());

        double totalPriceFlour = priceFlourPerKg * flourKg;

        double oneKgSugar = priceFlourPerKg * 0.75;
        double totalPriceSugar = oneKgSugar * sugarKg;

        double oneShellEggs = priceFlourPerKg * 1.10;
        double totalPriceEggs = oneShellEggs * shellEggs;

        double onePackageYeast = oneKgSugar * 0.20;
        double totalPriceYeast = onePackageYeast * packageYeast;

        double totalSum = totalPriceFlour+totalPriceSugar+totalPriceEggs+totalPriceYeast;
        System.out.printf("%.2f",totalSum);

//        •	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
//        •	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
//        •	цената на един пакет мая е с 80% по-ниска от цената на килограм захар

    }
}
