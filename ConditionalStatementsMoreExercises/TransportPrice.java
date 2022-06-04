package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double sumTaxi = 0.70;
        double sumTrain = 0;
        double sumBus = 0;
        double minNum = Integer.MAX_VALUE;

        switch (dayOrNight) {
            case "day":
                sumTaxi = sumTaxi + (kilometers * 0.79);
                if (sumTaxi < minNum) {
                    minNum = sumTaxi;
                }
                if (kilometers >= 20) {
                    sumBus = sumBus + (kilometers * 0.09);
                    if (sumBus < minNum)
                        minNum = sumBus;
                }
                if (kilometers >= 100) {
                    sumTrain = sumTrain + (kilometers * 0.06);
                    if (sumTrain < minNum)
                        minNum = sumTrain;
                }
                break;


            case "night":
                sumTaxi = sumTaxi + (kilometers * 0.90);
                if (sumTaxi < minNum) {
                    minNum = sumTaxi;
                }
                if (kilometers >= 20) {
                    sumBus = sumBus + (kilometers * 0.09);
                    if (sumBus < minNum)
                        minNum = sumBus;
                }
                if (kilometers >= 100) {
                    sumTrain = sumTrain + (kilometers * 0.06);
                    if (sumTrain < minNum)
                        minNum = sumTrain;
                }
                break;
        }
        System.out.printf("%.2f", minNum);
    }

}
