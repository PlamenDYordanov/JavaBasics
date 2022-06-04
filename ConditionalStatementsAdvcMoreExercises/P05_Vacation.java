package ConditionalStatementsAdvcMoreExercises;

import java.util.Scanner;

public class P05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String country ="";
        double price = 0;
        if (budget <= 1000) {
            location = "Camp";
            switch (season) {
                case "Summer":
                    country = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    country = "Morocco";
                    price = budget * 0.45;
                    break;
            }
        } else if (budget > 1000 && budget <= 3000) {
            location = "Hut";
            switch (season) {
                case "Summer":
                    country = "Alaska";
                    price = budget * 0.80;
                    break;
                case "Winter":
                    country = "Morocco";
                    price = budget * 0.60;
                    break;
            }
        } else if (budget > 3000) {
            location = "Hotel";
            switch (season) {
                case "Summer":
                    country = "Alaska";
                    price = budget * 0.90;
                    break;
                case "Winter":
                    country = "Morocco";
                    price = budget * 0.90;
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f",country,location,price);
    }
}
