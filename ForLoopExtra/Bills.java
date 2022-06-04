package ForLoopExtra;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mounts = Integer.parseInt(scanner.nextLine());

        double waterBill = 20 * mounts;
        double internetBill = 15 * mounts;
        double electricityBill = 0.0;
        double others = 0;
        double totalSum = 0;

        for (int i = 1; i <= mounts; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());


            electricityBill = electricityBill + electricity;
            others = (waterBill + internetBill + electricityBill) * 1.2;
            totalSum = waterBill + internetBill + electricityBill + others;
        }
        System.out.printf("Electricity: %.2f lv%n", electricityBill);
        System.out.printf("Water: %.2f lv%n", waterBill);
        System.out.printf("Internet: %.2f lv%n", internetBill);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv%n", totalSum / mounts);
    }
}
