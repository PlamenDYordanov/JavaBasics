package NestedLoopExtra;

import java.util.Scanner;

public class P06_WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int seatsOddRow = Integer.parseInt(scanner.nextLine());
        char firstSeat = ' ';
        int seats = 97;
        int counter = 0;
        int lastSectorNum = (char) lastSector;
        for (int i = 65; i <= lastSector; i++) {
            char  sector  = (char) i;
            for (int j = 1; j <= rows; j++) {
                for (int k = 1; k <= seatsOddRow; k++) {
                    if (j % 2 == 1) {
                        firstSeat = (char)seats;
                        System.out.printf("%c%d%c%n",sector,j,firstSeat);
                        counter++;
                        seats++;
                        continue;
                    } else {
                        break;
                    }
                }
                for (int l = 1; l <= seatsOddRow + 2; l++) {
                if (j%2==1){
                    break;
                }else {
                    firstSeat = (char)seats;
                    System.out.printf("%c%d%c%n",sector,j,firstSeat);
                    counter++;
                    seats++;
                    continue;
                }
                }
                seats = 97;

            }
            rows++;
        }
        System.out.println(counter);
    }
}
