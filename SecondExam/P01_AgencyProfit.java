package SecondExam;

import java.util.Scanner;

public class P01_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameCompany = scanner.nextLine();
        int countAdultTickets = Integer.parseInt(scanner.nextLine());
        int countKidsTickets = Integer.parseInt(scanner.nextLine());
        double priceAdultTickets = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double totalPriceAdult = (priceAdultTickets * countAdultTickets) + (priceService * countAdultTickets);
        double totalPriceKids = (priceAdultTickets * 0.30) * countKidsTickets + (countKidsTickets * priceService);
        double totalPrice = totalPriceAdult + totalPriceKids;
        double profit = totalPrice * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.%n",nameCompany,profit);

    }
}
