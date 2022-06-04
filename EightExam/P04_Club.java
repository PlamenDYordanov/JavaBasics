package EightExam;

import java.util.Scanner;

public class P04_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desireProfit = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();


        String nameOfCocktail = "";
        double priceOfCocktail = 0;
        double priceOfOrder = 0;
        double totalProfit = 0;
        boolean isEnoughProfit = false;
        while (!input.equals("Party!")) {
            nameOfCocktail = input;
            input = scanner.nextLine();
            int countOfCocktails = Integer.parseInt(input);

            int lengthOfWord = nameOfCocktail.length();
            priceOfCocktail = lengthOfWord;
            priceOfOrder = priceOfCocktail*countOfCocktails;
            if (priceOfOrder%2==1){
                priceOfOrder = priceOfOrder*0.75;
            }
            totalProfit = totalProfit + priceOfOrder;
            if (desireProfit<=totalProfit){
                isEnoughProfit = true;
                break;
            }

            input = scanner.nextLine();
        }
        double diff = Math.abs(desireProfit-totalProfit);
        if (isEnoughProfit){
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.",totalProfit);
        }else {
            System.out.printf("We need %.2f leva more.%n",diff);
            System.out.printf("Club income - %.2f leva.",totalProfit);
        }

    }
}
