package ConditionalStatementsAdvance;

import java.util.Scanner;

public class FruitShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        boolean isValid = true;
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    price = quantity * 2.5;
                    break;
                case "apple":
                    price = quantity * 1.20;
                    break;
                case "orange":
                    price = quantity * 0.85;
                    break;
                case "grapefruit":
                    price = quantity * 1.45;
                    break;
                case "kiwi":
                    price = quantity * 2.70;
                    break;
                case "pineapple":
                    price = quantity * 5.50;
                    break;
                case "grapes":
                    price = quantity * 3.85;
                    break;
                default:
                    isValid = false;
                    break;
            }
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            switch (fruit) {
                case "banana":
                    price = quantity * 2.70;
                    break;
                case "apple":
                    price = quantity * 1.25;
                    break;
                case "orange":
                    price = quantity * 0.90;
                    break;
                case "grapefruit":
                    price = quantity * 1.60;
                    break;
                case "kiwi":
                    price = quantity * 3.00;
                    break;
                case "pineapple":
                    price = quantity * 5.60;
                    break;
                case "grapes":
                    price = quantity * 4.20;
                    break;
                default:
                    isValid = false;
                    break;
            }
        } else {
            isValid = false;
        }
      if(!isValid){
          System.out.println("error");
      }else {
          System.out.printf("%.2f",price);
      }
    }
}

