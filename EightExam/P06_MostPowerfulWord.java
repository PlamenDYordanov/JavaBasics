package EightExam;

import java.util.Scanner;

public class P06_MostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String word = "";
        double maxPoints = Double.NEGATIVE_INFINITY;
        String maxWord = "";
        boolean isVowel = false;
        double totalPoints = 0;

        while (!input.equals("End of words")) {
            word = input;
            int length = word.length();
            for (int i = 1; i <= length; i++) {

                int asciiNumber = word.charAt(i - 1);
                if (i==1) {
                    if (asciiNumber == 65 || asciiNumber == 97) {           //a,A
                        isVowel = true;
                    } else if (asciiNumber == 69 || asciiNumber == 101) {   //e,E
                        isVowel = true;
                    } else if (asciiNumber == 73 || asciiNumber == 105) {   //i,I
                        isVowel = true;
                    } else if (asciiNumber == 79 || asciiNumber == 111) {   //o,O
                        isVowel = true;
                    } else if (asciiNumber == 85 || asciiNumber == 117) {   //u,U
                        isVowel = true;
                    } else if (asciiNumber == 89 || asciiNumber == 121) {   //y,Y
                        isVowel = true;
                    }
                }
                totalPoints = totalPoints + asciiNumber;
            }
            if (isVowel) {
                totalPoints = totalPoints * length;
            } else {
                totalPoints = Math.floor(totalPoints/length);
            }
            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                maxWord = word;
            }
            totalPoints = 0;
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", maxWord, maxPoints);
    }
}