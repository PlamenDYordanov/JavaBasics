package SixthExam;

import java.util.Scanner;

public class P05_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMovie = Integer.parseInt(scanner.nextLine());

        double maxRating = Double.MIN_VALUE;
        String maxMovie = "";
        double minRating = Double.MAX_VALUE;
        String minMovie = "";
        int counterMovie = 0;
        double totalRating = 0;

        for (int i = 1; i <= countMovie; i++) {
            String nameOfMovie = scanner.nextLine();
            counterMovie++;
            double rating = Double.parseDouble(scanner.nextLine());

            if (rating > maxRating) {
                maxRating = rating;
                maxMovie=nameOfMovie;
            }
            if (rating < minRating) {
                minRating = rating;
                minMovie = nameOfMovie;
            }
            totalRating = totalRating + rating;


        }
        double averageRating = totalRating/counterMovie;

        System.out.printf("%s is with highest rating: %.1f%n",maxMovie,maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n",minMovie,minRating);
        System.out.printf("Average rating: %.1f",averageRating);


    }
}
