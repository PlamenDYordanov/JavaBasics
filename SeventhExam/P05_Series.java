package SeventhExam;

import java.util.Scanner;

public class P05_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countSeries = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        for (int i = 1; i <= countSeries; i++) {
            String nameOfSeries = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            switch (nameOfSeries){
                case "Thrones":
                    price = price * 0.50;

                    break;
                case "Lucifer":
                    price = price * 0.60;
                    break;
                case "Protector":
                    price = price * 0.70;
                    break;
                case "TotalDrama":
                    price = price * 0.80;
                    break;
                case "Area":
                    price = price * 0.90;
                    break;
            }
            totalPrice = totalPrice + price;
        }
        double diff = Math.abs(budget-totalPrice);
        if (budget>=totalPrice){
            System.out.printf("You bought all the series and left with %.2f lv.%n",diff);
        }else {
            System.out.printf("You need %.2f lv. more to buy the series!%n",diff);
        }
    }
}
