package FifthExam;

import java.util.Scanner;

public class P02_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double requireFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        double priceJourney = 100;
        double totalFuel = 0;
        double price =0;
        double totalPrice =0;
        switch (day){
            case "Saturday":
                totalFuel = requireFuel*2.10;
                price = totalFuel+priceJourney;
              totalPrice = price*0.90;
                break;
            case "Sunday":
                totalFuel = requireFuel*2.10;
                price = totalFuel+priceJourney;
                totalPrice = price*0.80;
                break;
        }
        double diff = Math.abs(budget-totalPrice);
        if (budget>=totalPrice){
            System.out.printf("Safari time! Money left: %.2f lv. ",diff);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",diff);
        }
    }
}
