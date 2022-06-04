package SeventhExam;

import java.util.Scanner;

public class P01_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        double percentCinema = Double.parseDouble(scanner.nextLine());


        double priceForOneDay = tickets*priceTicket;
        double profit = priceForOneDay*days;
        double cinemaPercent = (profit * percentCinema)/100;
        double totalProfit = profit - cinemaPercent;

        System.out.printf("The profit from the movie %s is %.2f lv.",name,totalProfit);
    }
}
