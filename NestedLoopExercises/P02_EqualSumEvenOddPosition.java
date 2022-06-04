package NestedLoopExercises;

import java.util.Scanner;

public class P02_EqualSumEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        for (int i = firstNum; i <=secondNum ; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int currentNum = i;
            for (int j = 6; j >=1 ; j--) {
                int lastSymbol = currentNum%10;
                if (j%2==0){
                    evenSum = evenSum + lastSymbol;
                }else{
                    oddSum = oddSum + lastSymbol;
                }

                currentNum = currentNum/10;

            }

            if (oddSum==evenSum){
                System.out.print(i + " ");
            }
        }
    }
}
