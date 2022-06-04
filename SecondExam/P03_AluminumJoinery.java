package SecondExam;

import java.util.Scanner;

public class P03_AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJoinery = Integer.parseInt(scanner.nextLine());
        String sizeJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;
        boolean isEnough = true;
        if (countJoinery > 10) {
            switch (sizeJoinery) {
                case "90X130":
                    price = 110;
                    if (countJoinery > 30 && countJoinery <= 60) {
                        price = price * 0.95;
                    } else if (countJoinery > 60 ) {
                        price = price * 0.92;
                    }
                    break;
                case "100X150":
                    price = 140;
                    if (countJoinery > 40 && countJoinery <= 80) {
                        price = price * 0.94;
                    } else if (countJoinery > 80 ) {
                        price = price * 0.90;
                    }
                    break;
                case "130X180":
                    price = 190;
                    if (countJoinery > 20 && countJoinery <= 50) {
                        price = price * 0.93;
                    } else if (countJoinery > 50) {
                        price = price * 0.88;
                    }
                    break;
                case "200X300":
                    price = 250;
                    if (countJoinery > 25 && countJoinery <= 50) {
                        price = price * 0.91;
                    } else if (countJoinery > 50) {
                        price = price * 0.86;
                    }
                    break;
            }
        }
        if (delivery.equals("With delivery")){
            totalPrice = 60;
        }
        if (countJoinery > 99) {
            totalPrice =totalPrice+ (price * countJoinery);
            totalPrice = totalPrice * 0.96;
        }else  if (countJoinery>10){
            totalPrice =totalPrice+ (price*countJoinery);
        }else {
            totalPrice =0;
            price =0;
            isEnough =false;
        }
        if (!isEnough){
            System.out.println("Invalid order");
        }else {
            System.out.printf("%.2f BGN",totalPrice);
        }
    }
}






