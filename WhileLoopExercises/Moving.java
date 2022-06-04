package WhileLoopExercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthFree = Integer.parseInt(scanner.nextLine());
        int lengthFree = Integer.parseInt(scanner.nextLine());
        int heightFree = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int totalFreeSpace = widthFree * lengthFree * heightFree;
        int totalSumCurrentBoxes = 0;
        boolean isFull = false;

        while (!input.equals("Done")) {
            int currentBoxes = Integer.parseInt(input);

            totalSumCurrentBoxes += currentBoxes;
            if (totalFreeSpace < totalSumCurrentBoxes) {
                isFull = true;
                break;
            }
            input = scanner.nextLine();

        }
        double diff = Math.abs(totalFreeSpace - totalSumCurrentBoxes);
        if (isFull) {
            System.out.printf("No more free space! You need %.0f Cubic meters more.", diff);
        } else {
            System.out.printf("%.0f Cubic meters left.", diff);
        }
    }
}
