package FirstExam;

import java.util.Scanner;

public class P05_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEggs = Integer.parseInt(scanner.nextLine());

//        "red", "orange", "blue", "green"
        int countRed = 0;
        int countOrange = 0;
        int countBlue = 0;
        int countGreen = 0;
        int maxValue = Integer.MIN_VALUE;
        String maxColor = "";

        for (int i = 1; i <= countEggs; i++) {

            String colorEggs = scanner.nextLine();

            switch (colorEggs) {

                case "red":
                    countRed++;
                    if (countRed > maxValue) {
                        maxValue = countRed;
                        maxColor = colorEggs;
                    }
                    break;
                case "orange":
                    countOrange++;
                    if (countOrange > maxValue) {
                        maxValue = countOrange;
                        maxColor = colorEggs;
                    }
                    break;
                case "blue":
                    countBlue++;
                    if (countBlue > maxValue) {
                        maxValue = countBlue;
                        maxColor = colorEggs;
                    }
                    break;

                case "green":
                    countGreen++;
                    if (countGreen > maxValue) {
                        maxValue = countGreen;
                        maxColor = colorEggs;
                    }
                    break;
            }


        }

        System.out.printf("Red eggs: %d%n", countRed);
        System.out.printf("Orange eggs: %d%n", countOrange);
        System.out.printf("Blue eggs: %d%n", countBlue);
        System.out.printf("Green eggs: %d%n", countGreen);
        System.out.printf("Max eggs: %d -> %s%n", maxValue, maxColor);
    }
}
