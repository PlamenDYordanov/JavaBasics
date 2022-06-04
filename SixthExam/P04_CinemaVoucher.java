package SixthExam;

import java.util.Scanner;

public class P04_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        String parches = "";
        int totalSum = 0;
        int counterMovie = 0;
        int counter = 0;

        while (!input.equals("End")) {

            parches = input;
            int longText = input.length();
            char symbol1 = input.charAt(0);
            char symbol2 = input.charAt(1);
            int symbolOne = symbol1;
            int symbolTwo = symbol2;

                if (longText > 8) {
                    int sum = symbolOne + symbolTwo;
                    totalSum = totalSum + sum;
                    if (totalSum>voucher){
                        break;
                    }
                    counterMovie++;
                } else {
                    totalSum = totalSum + symbolOne;
                    if (totalSum>voucher){
                        break;
                    }
                    counter++;
                }


            input = scanner.nextLine();
        }
        System.out.println(counterMovie);
        System.out.println(counter);
    }
}
