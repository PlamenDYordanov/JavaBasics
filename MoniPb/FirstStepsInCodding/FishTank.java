package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
    double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * weight * height;
        double volumeLiters = volume /1000;
        double realPercent = percent /100;

        double litres = volumeLiters - (volumeLiters * realPercent);

        System.out.println(litres);

    }

}
