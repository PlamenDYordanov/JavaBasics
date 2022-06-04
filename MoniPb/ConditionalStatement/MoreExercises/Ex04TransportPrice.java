package MoniPb.ConditionalStatement.MoreExercises;

import java.util.Scanner;

public class Ex04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometres = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();

        double taxiDay = 0.0;
        double taxiNight = 0.0;

        if (dayNight.equals("day")) {
        taxiDay = 0.70 + (0.79 * kilometres);
        } else if (dayNight.equals("night")){
        taxiNight = 0.70 + (0.90 * kilometres);
        }
        double busDayNight = 0.0;
        if (kilometres>20) {
        busDayNight = 0.09 * kilometres; //>20km
        }
        double trainDayNight = 0.0;
        if (kilometres>100) {
        trainDayNight = 0.06 * kilometres; //>100km
        }

        boolean isBusCheaperThenTaxiDay = taxiDay>busDayNight;
        boolean isBusCheaperThenTaxiNight = taxiNight>busDayNight;
        boolean isTrainCheaperThenBus = busDayNight>trainDayNight;


        System.out.println();
        }

    }
