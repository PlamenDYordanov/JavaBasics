package FirstExam;

import java.util.Scanner;

public class P05_EasterBeak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEasterBread = Integer.parseInt(scanner.nextLine());

        double oneSugarPackage = 950;
        double oneFlourPackage = 750;
        double sumSugar = 0;
        double sumFlour = 0;
        int maxFlour = Integer.MIN_VALUE;
        int maxSugar = Integer.MIN_VALUE;

        for (int i = 1; i <= countEasterBread; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            if (sugar>maxSugar){
                maxSugar = sugar;
            }
            if (flour>maxFlour){
                maxFlour=flour;
            }

            sumSugar += sugar;
            sumFlour += flour;

        }
        double requirePackageFlour = Math.ceil(sumFlour/oneFlourPackage);
        double requirePackageSugar = Math.ceil(sumSugar/oneSugarPackage);

        System.out.printf("Sugar: %.0f%n",requirePackageSugar);
        System.out.printf("Flour: %.0f%n",requirePackageFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.%n",maxFlour,maxSugar);



    }
}
