package ForLoopExercise;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Oscars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfActor = scanner.nextLine();
        double pointsOfAcademy = Double.parseDouble(scanner.nextLine());
        int numberOfAssessors = Integer.parseInt(scanner.nextLine());
        double totalPointsFromAssessors = 0;
        double totalPoints = 0 + pointsOfAcademy;

        double pointsForAward = 1250.5;
        for (int i = 1; i <= numberOfAssessors; i++) {
            String nameOfAssessor = scanner.nextLine();
            double pointsOfAssessors = Double.parseDouble(scanner.nextLine());

            if (pointsForAward > totalPoints)
                totalPointsFromAssessors = (nameOfAssessor.length() * pointsOfAssessors) / 2;
            totalPoints = totalPoints + totalPointsFromAssessors;


            if (totalPoints >= pointsForAward) {
                break;
            }
        }

        if (totalPoints < pointsForAward) {
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, Math.abs(pointsForAward - totalPoints));
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, totalPoints);
        }
    }
}
