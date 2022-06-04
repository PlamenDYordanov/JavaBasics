package Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        //Входни данн:
        Scanner scanner = new Scanner(System.in);
        //Годишната такса за тренировки по баскетбол – цяло число в интервала
       double yearlyTax = Integer.parseInt(scanner.nextLine());
        // Баскетболни кецове – цената им е 40% по-малка от таксата за една година
     double percentShoes = yearlyTax * 40 / 100;
     double shoesPrice = yearlyTax - percentShoes;

        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        double outfitPercent = shoesPrice * 20 / 100;
        double outfitPrice = shoesPrice - outfitPercent;

        // Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        double basketball = outfitPrice / 4;

        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double accessories = basketball / 5;

        //Колко ще са разходите (общо)
        double totalAmount = yearlyTax + shoesPrice + outfitPrice +basketball + accessories;
        System.out.println(totalAmount);


    }
}
