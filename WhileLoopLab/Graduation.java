package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int years = 1;
        int excluded = 0;
        double totalGrade = 0;

        while (years <= 12) {
            if (excluded > 1) {
                break;
            }
            double annualGrade = Double.parseDouble(scanner.nextLine());
            if (annualGrade < 4) {
                excluded++;
                continue;
            }

            totalGrade += annualGrade;

            years++;


        }
        double averageGrade = totalGrade/12;
        if (excluded>1){
        System.out.printf("%s has been excluded at %d grade", name, years);}
        else {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}
