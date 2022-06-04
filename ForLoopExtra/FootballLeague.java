package ForLoopExtra;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacityOfStadium = Integer.parseInt(scanner.nextLine());
        int numberOfFans = Integer.parseInt(scanner.nextLine());

        int fensA = 0;
        int fensB = 0;
        int fensV = 0;
        int fensG = 0;
        int totalFens = 0;
        for (int i = 1; i <= numberOfFans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                fensA++;
                    break;
                case "B":
                    fensB++;
                    break;
                case "V":
                    fensV++;
                    break;
                case "G":
                    fensG++;
                    break;
            }
            totalFens = fensA+fensB+fensV+fensG;
        }
        System.out.printf("%.2f%%%n",fensA*1.0/numberOfFans*100);
        System.out.printf("%.2f%%%n",fensB*1.0/numberOfFans*100);
        System.out.printf("%.2f%%%n",fensV*1.0/numberOfFans*100);
        System.out.printf("%.2f%%%n",fensG*1.0/numberOfFans*100);
        System.out.printf("%.2f%%%n",totalFens*1.0/capacityOfStadium*100);
    }
}
