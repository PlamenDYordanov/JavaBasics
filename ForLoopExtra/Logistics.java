package ForLoopExtra;

import java.awt.event.WindowFocusListener;
import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCargo = Integer.parseInt(scanner.nextLine());
        int priceForTonBus = 200;
        int priceForTonTruck = 175;
        int priceForTonTrain = 120;

        int priceBus = 0;
        int priceTruck = 0;
        int priceTrain = 0;

        int sumBus = 0;
        int sumTruck = 0;
        int sumTrain = 0;

        int tonsBus = 0;
        int sumTonsBus = 0;
        int tonsTruck = 0;
        int sumTonsTruck = 0;
        int tonsTrain = 0;
        int sumTonsTrain = 0;

        int sumTonsCargo = 0;
        double averagePrice = 0;
        double percentBus = 0;
        double percentTruck = 0;
        double percentTrain = 0;
        for (int i = 1; i <= countCargo; i++) {
            int tonsOfCargo = Integer.parseInt(scanner.nextLine());

            if (tonsOfCargo <= 3) {
                tonsBus = tonsOfCargo;
                sumTonsBus = sumTonsBus + tonsBus;
                priceBus = tonsOfCargo * priceForTonBus;
                sumBus = sumBus + priceBus;
            } else if (tonsOfCargo <= 11) {
                tonsTruck = tonsOfCargo;
                sumTonsTruck = sumTonsTruck + tonsTruck;
                priceTruck = tonsOfCargo * priceForTonTruck;
                sumTruck = sumTruck + priceTruck;
            } else {
                tonsTrain = tonsOfCargo;
                sumTonsTrain = sumTonsTrain + tonsTrain;
                priceTrain = tonsOfCargo * priceForTonTrain;
                sumTrain = sumTrain + priceTrain;
            }

            sumTonsCargo += tonsOfCargo;
            int totalSum = sumBus + sumTruck + sumTrain;
            averagePrice = totalSum * 1.0 / sumTonsCargo;
            percentBus = sumTonsBus * 1.0 / sumTonsCargo * 100;
            percentTruck = sumTonsTruck * 1.0 / sumTonsCargo * 100;
            percentTrain = sumTonsTrain * 1.0 / sumTonsCargo * 100;

        }
        System.out.printf("%.2f%n",averagePrice);
        System.out.printf("%.2f%%%n", percentBus);
        System.out.printf("%.2f%%%n", percentTruck);
        System.out.printf("%.2f%%%n", percentTrain);
    }
}
