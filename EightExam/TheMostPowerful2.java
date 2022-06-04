package Exams.Exam_6And7July2019;

import java.util.Scanner;

public class TheMostPowerful2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumAscii = 0;
        int mostPowerfulWordValue = Integer.MIN_VALUE;
        String mostPowerfulWordText = "";

        while (!input.equals("End of words")) {
            String currentWord = input;
            int currentWordLength = currentWord.length();
            char firstLetter = currentWord.charAt(0);
            boolean isVowel = firstLetter == 'a' || firstLetter == 'A' || firstLetter == 'e' || firstLetter == 'E'
                    || firstLetter == 'i' || firstLetter == 'I' || firstLetter == 'o' || firstLetter == 'O'
                    || firstLetter == 'u' || firstLetter == 'U' || firstLetter == 'y' || firstLetter == 'Y';

            sumAscii = 0;

            for (int i = 0; i < currentWordLength; i++) {
                int asciiNum = currentWord.charAt(i);
                sumAscii = sumAscii + asciiNum;
            }

            if (isVowel) {
                sumAscii = sumAscii * currentWordLength;
            } else {
                sumAscii = sumAscii / currentWordLength;
            }

            if (mostPowerfulWordValue <= sumAscii) {
                mostPowerfulWordValue = sumAscii;
                mostPowerfulWordText = currentWord;
            }

            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d",mostPowerfulWordText,mostPowerfulWordValue);
    }
}