package WhileLoopLab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        while (true) {
            if (input.equals("Stop")) {
                break;
            }
            int currentNum = Integer.parseInt(input);
            if (currentNum > maxNumber) {
                maxNumber = currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
