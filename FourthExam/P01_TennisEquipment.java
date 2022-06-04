package FourthExam;

import java.util.Scanner;

public class P01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceRacket = Double.parseDouble(scanner.nextLine());
        int countRacket = Integer.parseInt(scanner.nextLine());
        int countSnickers = Integer.parseInt(scanner.nextLine());

        double racketPrice = priceRacket * countRacket;
        double snickersOnePairSnickers = priceRacket / 6;
        double totalSnickers = countSnickers * snickersOnePairSnickers;
        double racketAndSnickers = totalSnickers+racketPrice;
        double otherEquipment = racketAndSnickers * 0.20;
        double total = otherEquipment+totalSnickers+racketPrice;

        double priceByDj = Math.floor(total/8);
        double priceBySponsors = Math.ceil(total * 7 /8) ;

        System.out.printf("Price to be paid by Djokovic %.0f%n",priceByDj);
        System.out.printf("Price to be paid by sponsors %.0f%n",priceBySponsors);


    }
}
