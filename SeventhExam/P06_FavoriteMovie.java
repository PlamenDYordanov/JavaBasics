package SeventhExam;

import java.util.Scanner;

public class P06_FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String nameOfMovie = "";

        int maxPoints = Integer.MIN_VALUE;
        String nameOfMaxPoints = "";

        int counter = 0;
        int totalPoints = 0;

        boolean isSevenMovie = false;

        while (!input.equals("STOP")) {
            nameOfMovie = input;
            int lengthWord = input.length();

            for (int i = 0; i < lengthWord; i++) {
                char symbol = input.charAt(i);
                int asciiNumber = symbol;
                if (asciiNumber >= 97 && asciiNumber <= 122) {
                    totalPoints = totalPoints + (asciiNumber - (lengthWord * 2));
                } else if (asciiNumber >= 65 && asciiNumber <= 90) {
                    totalPoints = totalPoints + asciiNumber - lengthWord;
                } else if (asciiNumber==32){
                    totalPoints = totalPoints + 32;
                }else {
                    totalPoints = totalPoints + asciiNumber;
                }


            }
            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                nameOfMaxPoints = nameOfMovie;
            }
            totalPoints = 0;
            counter++;
            if (counter == 7) {
                isSevenMovie = true;
                break;
            }


            input = scanner.nextLine();
        }
            if (isSevenMovie){
                System.out.println("The limit is reached.");
                System.out.printf("The best movie for you is %s with %d ASCII sum.",nameOfMaxPoints,maxPoints);
            }else {
                System.out.printf("The best movie for you is %s with %d ASCII sum.",nameOfMaxPoints,maxPoints);
            }
    }
}
