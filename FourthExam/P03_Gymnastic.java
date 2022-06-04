package FourthExam;

import java.util.Scanner;

public class P03_Gymnastic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String instrument = scanner.nextLine();
        double sum = 0;
        switch (country) {
            case "Bulgaria":
                if (instrument.equals("ribbon")) {
                    double difficulty = 9.600;
                    double performance = 9.400;
                    sum = difficulty + performance;
                } else if (instrument.equals("hoop")) {
                    double difficulty = 9.550;
                    double performance = 9.750;
                    sum = difficulty + performance;
                } else {
                    double difficulty = 9.500;
                    double performance = 9.400;
                    sum = difficulty + performance;
                }
                break;

            case "Russia":
                if (instrument.equals("ribbon")) {
                    double difficulty = 9.100;
                    double performance = 9.400;
                    sum = difficulty + performance;
                } else if (instrument.equals("hoop")) {
                    double difficulty = 9.300;
                    double performance = 9.800;
                    sum = difficulty + performance;
                } else {
                    double difficulty = 9.600;
                    double performance = 9.000;
                    sum = difficulty + performance;
                }
                break;

            case "Italy":
                if (instrument.equals("ribbon")) {
                    double difficulty = 9.200;
                    double performance = 9.500;
                    sum = difficulty + performance;
                } else if (instrument.equals("hoop")) {
                    double difficulty = 9.450;
                    double performance = 9.350;
                    sum = difficulty + performance;
                } else {
                    double difficulty = 9.700;
                    double performance = 9.150;
                    sum = difficulty + performance;
                }
                break;
        }
        double percent = (20-sum);
        double totalPercent = (percent/20)*100;
        System.out.printf("The team of %s get %.3f on %s.%n",country,sum,instrument);
        System.out.printf("%.2f%%%n",totalPercent);
    }
}
