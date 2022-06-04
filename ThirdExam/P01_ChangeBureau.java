package ThirdExam;

import java.util.Scanner;

public class P01_ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yoan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());


        double bitcoinsToBgn = bitcoins * 1168;
        double yoanToUsd = yoan * 0.15;
        double usdToBgn = yoanToUsd * 1.76;

        double totalBgn = bitcoinsToBgn + usdToBgn;
        double totalEuro = totalBgn / 1.95;
        double taxes = totalEuro * (commission / 100);
        double totalSum = totalEuro - taxes;
        System.out.printf("%.2f",totalSum);


    }
}
