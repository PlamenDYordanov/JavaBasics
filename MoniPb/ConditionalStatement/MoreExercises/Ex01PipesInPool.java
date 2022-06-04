package MoniPb.ConditionalStatement.MoreExercises;

import java.util.Scanner;

public class Ex01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volumeOfThePool = Integer.parseInt(scanner.nextLine());
        int debitP1 = Integer.parseInt(scanner.nextLine());
        int debitP2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double litresP1 = debitP1 * hours;
        double litresP2 = debitP2 * hours;

        double sumLitres = litresP1 + litresP2;
        double percentFull = sumLitres / volumeOfThePool * 100.0;
        double percentP1 = litresP1 / sumLitres * 100.0;
        double percentP2 = litresP2 / sumLitres * 100.0;
        double litresMore = 0.0;

        System.out.println();
        if (sumLitres <= volumeOfThePool) {
            System.out.printf("The pool is %.02f%% full. Pipe 1: %.02f%%. Pipe 2: %.02f%%.", percentFull, percentP1, percentP2);
        } else if (sumLitres > volumeOfThePool) {
            litresMore = sumLitres - volumeOfThePool;
            System.out.printf("For %.02f hours the pool overflows with %.02f liters.", hours, litresMore);
        }
    }
}
