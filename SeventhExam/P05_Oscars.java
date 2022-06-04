package SeventhExam;

import java.util.Scanner;

public class P05_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfActor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countJury = Integer.parseInt(scanner.nextLine());

        double maxPoint = 1250.5;
        double totalPoints = academyPoints;
        boolean isNominated = false;
        for (int i = 1; i <= countJury ; i++) {
            String nameOfAssessor = scanner.nextLine();
            double pointsOfAssessor = Double.parseDouble(scanner.nextLine());

            int lengthName = nameOfAssessor.length();
            pointsOfAssessor = (pointsOfAssessor*lengthName)/2;

            totalPoints = totalPoints +pointsOfAssessor;

            if (totalPoints>maxPoint){
                isNominated=true;
                break;
            }
        }
        double diff  = Math.abs(totalPoints-maxPoint);
        if (isNominated){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameOfActor,totalPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!",nameOfActor,diff);
        }
    }
}
