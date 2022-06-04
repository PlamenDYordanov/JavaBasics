package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualTax = Integer.parseInt(scanner.nextLine());

        double shoes = annualTax - (annualTax * 40 / 100.0);
        double suit = shoes - (shoes * 20 / 100.0);
        double ball = suit / 4;
        double other = ball / 5;

        double annualCosts = annualTax + shoes + suit + ball + other;
        System.out.println(annualCosts);

    }
}
