package Exam01PB;

import java.util.Scanner;

public class P04_GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());


        double totalDegrees = 0;
        double totalLitters = 0;
        for (int i = 1; i <=days ; i++) {
            double litersRakia = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());
            totalLitters = totalLitters +litersRakia;
            totalDegrees = totalDegrees + (degrees*litersRakia);
        }
        double averageDegrees = totalDegrees/totalLitters;
        System.out.printf("Liter: %.2f%n",totalLitters);
        System.out.printf("Degrees: %.2f%n",averageDegrees);
        if (averageDegrees<38){
            System.out.println("Not good, you should baking!");
        }else if (averageDegrees<=42){
            System.out.println("Super!");
        }else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
