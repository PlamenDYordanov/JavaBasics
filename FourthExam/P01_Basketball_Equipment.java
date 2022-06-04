package FourthExam;

import java.util.Scanner;

public class P01_Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int annualTax = Integer.parseInt(scanner.nextLine());

        double snickers = annualTax * 0.60;
        double outfit = snickers * 0.80;
        double ball = outfit / 4;
        double accessories = ball/5;

        double total = snickers+outfit+ball+accessories + annualTax;

        System.out.printf("%.2f",total);

    }
}
