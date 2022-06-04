package WhileLoopExercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int goalSteps = 10000;
        int totalSteps = 0;
        boolean isGoingHome = false;
        while (!input.equals("Going home")) {
            int currentSteps = Integer.parseInt(input);
            totalSteps += currentSteps;

            if (totalSteps > goalSteps) {
                break;
            }
            input = scanner.nextLine();

        }
        if (input.equals("Going home")) {
            int currentSteps = Integer.parseInt(scanner.nextLine());
            totalSteps += currentSteps;
        }
        int diff = Math.abs(goalSteps - totalSteps);
        if (goalSteps < totalSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
