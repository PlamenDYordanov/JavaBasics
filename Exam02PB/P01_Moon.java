package Exam02PB;

import java.util.Scanner;

public class P01_Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double requireFuelPer100 = Double.parseDouble(scanner.nextLine());

        double distance = 384400;
        double totalDistance = distance*2;
        double time = Math.ceil(totalDistance/averageSpeed);
        double totalTime = time+3;
        double totalFuel = (totalDistance*requireFuelPer100)/100;
        System.out.printf("%.0f%n",totalTime);
        System.out.printf("%.0f%n",totalFuel);
    }
}
