package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double veganMenuPrice = veganMenu * 8.15;
        double delivery = 2.50;

        double sum = chickenMenuPrice+fishMenuPrice+veganMenuPrice;
        double desert = sum*20/100;
        double finalPrice = sum+desert+delivery;

        System.out.println(finalPrice);



        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.
        //Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.

    }
}
