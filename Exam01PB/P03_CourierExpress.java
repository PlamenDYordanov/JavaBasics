package Exam01PB;

import java.util.Scanner;

public class P03_CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kgPackage = Double.parseDouble(scanner.nextLine());
        String typeService = scanner.nextLine();
        int kilometers = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        double overPrice = 0;
        switch (typeService) {
            case "standard":
                if (kgPackage < 1) {
                    totalPrice = 0.03 * kilometers;
                } else if (kgPackage <= 10) {
                    totalPrice = 0.05 * kilometers;
                } else if (kgPackage <= 40) {
                    totalPrice = 0.10 * kilometers;
                } else if (kgPackage <= 90) {
                    totalPrice = 0.15 * kilometers;
                } else if (kgPackage <= 150) {
                    totalPrice = 0.20 * kilometers;
                }
                break;
            case "express":
                if (kgPackage < 1) {
                    overPrice = kgPackage *(0.03 * 0.80);
                    totalPrice = (overPrice*kilometers)+0.03 * kilometers;
                } else if (kgPackage <= 10) {
                    overPrice = kgPackage *(0.05 * 0.40);
                    totalPrice = (overPrice*kilometers)+0.05 * kilometers;
                } else if (kgPackage <= 40) {
                    overPrice = kgPackage *(0.10 * 0.05);
                    totalPrice = (overPrice*kilometers)+0.10 * kilometers;
                } else if (kgPackage <= 90) {
                    overPrice = kgPackage *(0.15 * 0.02);
                    totalPrice = (overPrice*kilometers)+0.15 * kilometers;
                } else if (kgPackage <= 150) {
                    overPrice = kgPackage *(0.20 * 0.01);
                    totalPrice = (overPrice*kilometers)+0.20 * kilometers;
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",kgPackage,totalPrice);
    }
}
