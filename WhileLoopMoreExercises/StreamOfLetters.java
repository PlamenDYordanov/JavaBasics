package WhileLoopMoreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        int counterC = 0;
        int counterN = 0;
        int counterO = 0;
        String word = "";
        String newWord = "";
        boolean isRight = true;
        while (!input.equals("End")) {
            char currentSymbol = input.charAt(0);
            int currentSymbolInt = currentSymbol;

            if (currentSymbolInt >= 65 && currentSymbolInt <= 90 || currentSymbolInt >= 97 && currentSymbolInt <= 122) {


                if (input.equals("c")) {
                    counterC++;
                    isRight = false;
                    if (counterC == 2||counterC>2) {
                        word = word + input;
                    }
                }
                if (input.equals("n")) {
                    counterN++;
                    isRight = false;
                    if (counterN == 2||counterN>2) {
                        word = word + input;
                    }
                }
                if (input.equals("o")) {
                    counterO++;
                    isRight = false;
                    if (counterO == 2||counterO>2) {
                        word = word + input;
                    }
                }
                if (counterC > 0 && counterN > 0 && counterO > 0) {
                    word = word + " ";
                    counterC = 0;
                    counterN = 0;
                    counterO = 0;
                    newWord = word;

                }

                if (!isRight) {

                    isRight = true;
                } else {
                    word = word + input;
                }
            }else {
                input= scanner.nextLine();
                continue;
            }
            input = scanner.nextLine();
        }
        System.out.println(newWord);
    }
}


