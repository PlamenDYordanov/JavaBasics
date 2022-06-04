package NestedLoopExercises;

import java.util.Scanner;

public class P04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJury = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        String nameOfPresentation = "";

        double sumEvaluation = 0;
        double totalSum = 0;
        int counter = 0;

        while (!input.equals("Finish")) {

            nameOfPresentation = input;
            input = scanner.nextLine();

            for (int i = 1; i <= countJury; i++) {
                double evaluation = Double.parseDouble(input);
                sumEvaluation = sumEvaluation + evaluation;
                totalSum = totalSum + evaluation;
                counter++;
                if (i == countJury) {
                    System.out.printf("%s - %.2f.%n", nameOfPresentation, sumEvaluation / countJury);
                    sumEvaluation = 0;
                }
                input = scanner.nextLine();


            }
        }
        System.out.printf("Student's final assessment is %.2f.",totalSum/counter);
    }
}
