package EightExam;

import java.util.Scanner;

public class P06_MostPowerfulWord3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String word = "";
        double total = 0;
        double maxPoints = Double.NEGATIVE_INFINITY;
        String maxWord = "";


        while (!input.equals("End of words")) {
            word = input;
            int length = word.length();
            char firstLetter = word.charAt(0);
            for (int i = 1; i <= length; i++) {
                int asciiNumber = word.charAt(i - 1);
                total = total + asciiNumber;

            }
            if (firstLetter == 'a' || firstLetter == 'A' || firstLetter == 'e' || firstLetter == 'E'
                    || firstLetter == 'i' || firstLetter == 'I' || firstLetter == 'o' || firstLetter == 'O'
                    || firstLetter == 'u' || firstLetter == 'U' || firstLetter == 'y' || firstLetter == 'Y') {
                total = total * length;
            } else {
                total = Math.floor(total / length);
            }
            if (total > maxPoints) {
                maxPoints = total;
                maxWord = word;
            }
            total = 0;
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", maxWord, maxPoints);
    }
}
