package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        //Ляво
        for (int i = 0; i < number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sumLeft += currentNum;

        }
        //Дясно
        for (int i = 0; i < number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sumRight += currentNum;

        }
       if (sumLeft==sumRight){
           System.out.printf("Yes, sum = %d",sumLeft);
       }else {
           System.out.printf("No, diff = 1",Math.abs(sumLeft-sumRight));
       }
    }
}
