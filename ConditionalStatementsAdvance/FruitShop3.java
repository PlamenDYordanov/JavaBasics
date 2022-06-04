package ConditionalStatementsAdvance;

import java.util.Scanner;

public class FruitShop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.0;
        boolean isValid = true;
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            if (fruit.equals("banana")) {
                price = quantity * 2.50;
            } else if (fruit.equals("apple")) {
                price = quantity * 1.20;
            } else if (fruit.equals("orange")) {
                price = quantity * 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = quantity * 1.45;
            } else if (fruit.equals("kiwi")) {
                price = quantity * 2.70;
            } else if (fruit.equals("pineapple")) {
                price = quantity * 5.50;
            } else if (fruit.equals("grapes")) {
                price = quantity * 3.85;
            } else {
                isValid = false;
            }
        } else if ((dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday"))) {
                if (fruit.equals("banana")) {
                    price = quantity * 2.70;
                } else if (fruit.equals("apple")) {
                    price = quantity * 1.25;
                } else if (fruit.equals("orange")) {
                    price = quantity * 0.90;
                } else if (fruit.equals("grapefruit")) {
                    price = quantity * 1.60;
                } else if (fruit.equals("kiwi")) {
                    price = quantity * 3.00;
                } else if (fruit.equals("pineapple")) {
                    price = quantity * 5.60;
                } else if (fruit.equals("grapes")) {
                    price = quantity * 4.20;
                } else {
                    isValid = false;
                }
            } else {
                isValid = false;
            }
            if (!isValid) {
                System.out.println("error");
            } else {
                System.out.printf("%.2f", price);
            }


        }
    }
