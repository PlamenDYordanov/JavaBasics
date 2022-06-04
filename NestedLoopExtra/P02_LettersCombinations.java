package NestedLoopExtra;

import java.util.Scanner;

public class P02_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        char symbol3 = scanner.nextLine().charAt(0);

        int asciiN1 = symbol1;
        int asciiN2 = symbol2;
        int asciiN3 = symbol3;
        int counter = 0;
        for (int i = asciiN1; i <= asciiN2 ; i++) {
            if (asciiN3==i){
                continue;
            }
            for (int j = asciiN1; j <= asciiN2 ; j++) {
                if (asciiN3==j){
                    continue;
                }
                for (int k = asciiN1; k <= asciiN2 ; k++) {

                    if (asciiN3==k){
                        continue;
                    }else {
                        counter++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
                
            }

        }
        System.out.print(counter);
    }
}
