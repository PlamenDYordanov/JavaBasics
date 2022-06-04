package ConditionalStatementsAdvcExercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double budgetVacation = 0.0;
        String destination = "";
        String location = "";
        switch (season) {
            case "summer":
                if (budget <= 100) {
                    budgetVacation = budget - (budget * 0.30);
                } else if (budget <= 1000) {
                    budgetVacation = budget - (budget * 0.40);
                } else {
                    budgetVacation = budget - (budget * 0.90);
                }
                break;
            case "winter":
                if (budget <= 100) {
                    budgetVacation = budget - (budget * 0.70);
                } else if (budget <= 1000) {
                    budgetVacation = budget - (budget * 0.80);
                } else {
                    budgetVacation = budget - (budget * 0.90);
                }
                break;
        }
        if (budget <= 100) {
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            destination = "Balkans";
        } else {
            destination = "Europe";
        }

        if ((season.equals("winter") || season.equals("summer")) && destination.equals("Europe")) {
            location = "Hotel";
        } else if (season.equals("summer")) {
            location = "Camp";
        } else if (season.equals("winter")) {
            location = "Hotel";
        }


        double diff = Math.abs(budget - budgetVacation);
        System.out.printf("Somewhere in %s", destination);
        System.out.println("");
        System.out.printf("%s - %.2f", location, diff);
    }
}


