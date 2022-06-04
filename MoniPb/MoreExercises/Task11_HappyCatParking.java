package MoniPb.MoreExercises;

import java.util.Scanner;

public class Task11_HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfHours = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double sumDay = 0;
        double totalSum = 0;
        int countDay = 0;


        for (int i = 1; i <=numberOfDays ; i++) {
            sumDay = 0;
            countDay++;
            for (int j = 1; j <=numberOfHours ; j++) {
                if (i%2 == 0 && j %2 ==1) {
                    price = 2.50;
                } else if (i%2==1 && j%2==0) {
                    price = 1.25;
                } else {
                    price = 1;
                }
                sumDay = sumDay + price;
            }
                totalSum = totalSum + sumDay;
                System.out.printf("Day: %d - %.2f leva%n",countDay,sumDay);
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
