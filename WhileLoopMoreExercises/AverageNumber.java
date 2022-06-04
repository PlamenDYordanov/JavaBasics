package WhileLoopMoreExercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber = Integer.parseInt(scanner.nextLine());
      String input = scanner.nextLine();
        double sum = 0;
        for (int i = 1; i <=countNumber ; i++) {
            int number = Integer.parseInt(input);
            sum +=number;
            if (i==countNumber){
                break;
            }
            input= scanner.nextLine();
        }
        double average = sum/countNumber;
        System.out.printf("%.2f",average);
    }
}
