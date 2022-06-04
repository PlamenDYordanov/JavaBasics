package ThirdExam;

import java.util.Scanner;

public class P03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int countOrder = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    double price = 112;
                    totalPrice = countOrder*price;
                } else {
                    double price = 28.70 * 5;
                    totalPrice = countOrder*price;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    double price = 73.32;
                    totalPrice = countOrder*price;
                } else {
                    double price = 19.60 * 5;
                    totalPrice = countOrder*price;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    double price = 84.2;
                   totalPrice = countOrder*price;
                } else {
                    double price = 24.80 * 5;
                    totalPrice = countOrder*price;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    double price = 40;
                   totalPrice = countOrder*price;
                } else {
                    double price = 15.20 * 5;
                   totalPrice = countOrder*price;
                }
                break;
        }
        if (totalPrice>=400&&totalPrice<=1000){
            totalPrice = totalPrice * 0.85;
        }else if (totalPrice>1000){
            totalPrice = totalPrice * 0.50;
        }

        System.out.printf("%.2f lv.%n",totalPrice);
    }
}
