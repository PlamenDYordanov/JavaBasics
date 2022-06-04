package WhileLoopExercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minPoorGrade = Integer.parseInt(scanner.nextLine());//Минимална оценка




        int countPoorGrade = 0;
        double totalGrades = 0;
        int countGrades = 0;
        String lastInput = "";


        while (minPoorGrade>countPoorGrade){
            String nameOfProblem = scanner.nextLine();
            if (nameOfProblem.equals("Enough")){
                break;
            }
            int currentGrade = Integer.parseInt(scanner.nextLine());

            totalGrades+=currentGrade;
            countGrades++;
            if (currentGrade<=4){
                countPoorGrade++;
            }

            lastInput = nameOfProblem;

        }
        double averageGrades = totalGrades/countGrades;
        if (countPoorGrade>=minPoorGrade){
            System.out.printf("You need a break, %d poor grades.",countPoorGrade);
        }else {
            System.out.printf("Average score: %.2f%n",averageGrades);
            System.out.printf("Number of problems: %d%n",countGrades);
            System.out.printf("Last problem: %s",lastInput);
        }
    }
}
