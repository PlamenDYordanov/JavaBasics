package ForLoopLab;

import java.util.Scanner;

public class OddEvenSum10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven+=currentNum;
            }else {
                sumOdd+=currentNum;
            }
        }
        if (sumEven==sumOdd){
            System.out.printf("Yes%n Sum = %d",sumEven);
        }else {
            System.out.printf("No%n Diff = %d",Math.abs(sumEven-sumOdd));
        }
    }
}
