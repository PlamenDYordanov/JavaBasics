package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThicker = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + (paint * 10.0 / 100)) * 14.50;
        double paintThickerPrice = paintThicker * 5.00;
        double bags = 0.40;
        double sumOfMaterials = nylonPrice + paintPrice + paintThickerPrice + bags;
        double payPerHour = (sumOfMaterials * 30.0 / 100) * hours;
        double finalPrice = sumOfMaterials + payPerHour;

        System.out.println(finalPrice);


    }
}
