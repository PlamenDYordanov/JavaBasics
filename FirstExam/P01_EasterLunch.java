package FirstExam;

import java.util.Scanner;

public class P01_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        •	Козунак  – 3.20 лв.
//        •	Яйца –  4.35 лв. за кора с 12 яйца
//        •	Курабии – 5.40 лв. за килограм
//        •	Боя за яйца - 0.15 лв. за яйце
        int countEasterBread = Integer.parseInt(scanner.nextLine());
        int countEasterEggs = Integer.parseInt(scanner.nextLine());
        int countEasterCookies = Integer.parseInt(scanner.nextLine());
        double eggsPaint = 0.15;

        double sumEasterBread = countEasterBread * 3.20;
        double sumEasterEggs = (countEasterEggs * 4.35)+((countEasterEggs*12)*eggsPaint);
        double sumEsterCookies = countEasterCookies * 5.40;
        double totalSum = sumEasterBread+sumEasterEggs+sumEsterCookies;
        System.out.printf("%.2f",totalSum);


    }
}
