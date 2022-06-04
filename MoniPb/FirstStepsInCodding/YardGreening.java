package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sqMeters = Double.parseDouble(scanner.nextLine());
        double pricePerSqMeter = 7.61;
        double price = sqMeters*pricePerSqMeter;
        double discount = price*18/100;
        double finalPrice = price-discount;

        System.out.printf("The final price is: %f lv.",finalPrice);
        System.out.println("");
        System.out.printf("The discount is: %f lv.", discount);


    }
}
