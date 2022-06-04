package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volumeOfPool = Integer.parseInt(scanner.nextLine());
        int debitFirstPipe = Integer.parseInt(scanner.nextLine());
        int debitSecondPipe = Integer.parseInt(scanner.nextLine());
        double awayHours = Double.parseDouble(scanner.nextLine());


        double firstPipeSum = debitFirstPipe*awayHours;
        double secondPipeSum = debitSecondPipe*awayHours;
        double totalSum = firstPipeSum+secondPipeSum;

        double totalPercent = (totalSum/volumeOfPool)*100;
        double percentFirstPipe = (firstPipeSum/totalSum)*100;
        double percentSecondPipe = (secondPipeSum/totalSum)*100;

        double diff = totalSum-volumeOfPool;
        if (volumeOfPool>=totalSum){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",totalPercent,percentFirstPipe,percentSecondPipe);
        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",awayHours,diff);
        }

    }
}
