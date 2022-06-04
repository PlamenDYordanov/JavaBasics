package FifthExam;

import java.util.Scanner;

public class P06_VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;
        double totalPriceDiff = 0;


        for (int i = 1; i <= days; i++) {
                totalPrice = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    price = 2.50;
                    totalPrice = totalPrice + price;
                    totalPriceDiff = totalPriceDiff + price;

                } else if (i % 2 == 1 && j % 2 == 0){
                    price = 1.25;
                    totalPrice = totalPrice + price;
                    totalPriceDiff = totalPriceDiff + price;

                }else {
                    price = 1;
                    totalPrice = totalPrice + price;
                    totalPriceDiff = totalPriceDiff + price;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n",i,totalPrice);

        }
        System.out.printf("Total: %.2f leva",totalPriceDiff);
    }
}
