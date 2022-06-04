package FirstExam;

import java.util.Scanner;

public class P02_EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGuests = Integer.parseInt(scanner.nextLine());
        double priceForOneMeal = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (countGuests >= 10 && countGuests <= 15) {
            priceForOneMeal = priceForOneMeal * 0.85;
        } else if (countGuests >= 15 && countGuests <= 20) {
            priceForOneMeal = priceForOneMeal * 0.80;
        } else if (countGuests>20){
            priceForOneMeal = priceForOneMeal * 0.75;
        }
        double priceCake = budget * 0.10;
        double totalPriceMeal = priceForOneMeal * countGuests;
        double totalSum = priceCake + totalPriceMeal;
        double diff = Math.abs(totalSum - budget);

        if (budget >= totalSum) {
            System.out.printf("It is party time! %.2f leva left.",diff);
        }else {
            System.out.printf("No party! %.2f leva needed.",diff);
        }



    }
}
