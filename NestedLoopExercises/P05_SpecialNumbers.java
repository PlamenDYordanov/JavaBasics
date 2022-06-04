package NestedLoopExercises;

import java.util.Scanner;

public class P05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int specialNumber = Integer.parseInt(scanner.nextLine());

        int startNumber = 1111;
        int finalNumber = 9999;
        int currentNum = 0;
        boolean isSpecial = false;

        for (int i = startNumber; i <= finalNumber; i++) {
            currentNum = i;
            int counter = 0;
            for (int j = 4; j >= 1; j--) {
                int lastSymbol = currentNum % 10; //Откриваме последната цифра
                if (lastSymbol != 0) {
                    if (specialNumber % lastSymbol == 0) {
                        counter++;
                    }
                }
                if (counter == 4) {
                    System.out.print(i + " ");
                    isSpecial = true;
                }
                if (isSpecial) {
                    isSpecial =false;
                    break;
                }

                currentNum = currentNum / 10; //Премахваме последната цифра

            }
        }
    }
}
