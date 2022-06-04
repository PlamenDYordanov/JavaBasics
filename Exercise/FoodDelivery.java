package Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входни данни:
        //Брой пилешки менюта – цяло число в интервала [0 … 99]
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        //Брой менюта с риба – цяло число в интервала [0 … 99]
        int fishMenus = Integer.parseInt(scanner.nextLine());
        //Брой вегетариански менюта – цяло число в интервала [0 … 99]
        int veganMenus = Integer.parseInt(scanner.nextLine());


        // Пилешко меню – 10.35 лв.
        double chickenPrice = chickenMenus * 10.35;
        //Меню с риба – 12.40 лв.
        double fishPrice = fishMenus * 12.40;
        //Вегетарианско меню – 8.15 лв.
        double veganPrice = veganMenus * 8.15;
        //Десерт
        double desert = (chickenPrice + fishPrice + veganPrice) * 20 / 100;
        //Доставка
        double delivery = 2.50;
        double totalPrice = chickenPrice +fishPrice + veganPrice + desert + delivery;
        System.out.println(totalPrice);

        //Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.
    }
}


