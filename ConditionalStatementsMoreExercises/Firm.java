package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requireHours = Integer.parseInt(scanner.nextLine());
        int availableDays = Integer.parseInt(scanner.nextLine());
        int countWorkersOverTime = Integer.parseInt(scanner.nextLine());

        double   timeForWork = (availableDays*8)*0.90;
        //double trainingTime = totalTime*0.10;
        double totalOverTime = (countWorkersOverTime*2)*availableDays;
        double totalTime = Math.floor(timeForWork + totalOverTime);
        double diff = Math.abs(requireHours-totalTime);
        if (requireHours>totalTime){
            System.out.printf("Not enough time!%.0f hours needed.",diff);
        }else {
            System.out.printf("Yes!%.0f hours left.",diff);
        }

    }
}
