package ConditionalStatementsAdvance;

import java.util.Scanner;

public class TradeCommission2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());



            if (sells >= 0 && sells <= 500) {
                commission = sells * 0.05;
            }
        }


    }

