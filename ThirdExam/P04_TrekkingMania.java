package ThirdExam;

import java.util.Scanner;

public class P04_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups = Integer.parseInt(scanner.nextLine());

        double mussala = 0;
        double montblanc = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double totalPeople = 0;

        for (int i = 1; i <= countGroups; i++) {

            int people = Integer.parseInt(scanner.nextLine());
            totalPeople = totalPeople + people;
            if (people <= 5) {
                mussala = mussala + people;
            } else if (people <= 12) {
                montblanc = montblanc + people;
            } else if (people <= 25) {
                kilimandjaro = kilimandjaro + people;
            } else if (people <= 40) {
                k2 = k2 + people;
            } else {
                everest = everest + people;
            }
        }
        double percentMussala = (mussala/totalPeople ) * 100;
        double percentMontBlanc = (montblanc / totalPeople ) * 100;
        double percentKilimandjaro = (kilimandjaro / totalPeople * 1.0) * 100;
        double percentK2 = (k2 / totalPeople ) * 100;
        double percentEverest = (everest / totalPeople ) * 100;
        System.out.printf("%.2f%%%n", percentMussala);
        System.out.printf("%.2f%%%n", percentMontBlanc);
        System.out.printf("%.2f%%%n", percentKilimandjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);
    }
}
