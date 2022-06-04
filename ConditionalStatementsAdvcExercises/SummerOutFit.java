package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class SummerOutFit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String morningAfternoonEvening = scanner.nextLine();
        String outFit = "";
        String shoes = "";

        if (morningAfternoonEvening.equals("Morning")) {
            if (temperature >= 10 && temperature <= 18) {
                outFit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (temperature > 18 && temperature <= 24) {
                outFit = "Shirt";
                shoes = "Moccasins";
            } else{
                outFit = "T-Shirt";
                shoes = "Sandals";}

        }
        if (morningAfternoonEvening.equals("Afternoon")) {
            if (temperature >= 10 && temperature <= 18) {
                outFit = "Shirt";
                shoes = "Moccasins";
            } else if (temperature > 18 && temperature <= 24) {
                outFit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outFit = "Swim Suit";
                shoes = "Barefoot";
            }
        }
            if (morningAfternoonEvening.equals("Evening")) {
                if (temperature >= 10 && temperature <= 18) {
                    outFit = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature > 18 && temperature <= 24) {
                    outFit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outFit = "Shirt";
                    shoes = "Moccasins";
                }
            }
            System.out.printf("It's %d degrees, get your %s and %s.", temperature, outFit, shoes);

    }
}
