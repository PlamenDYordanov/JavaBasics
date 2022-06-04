package EightExam;

import java.util.Scanner;

public class P04_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentNoPaint = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        int totalSpace = 0;
        int totalSpaceDiff = 0;
        int totalPaint = 0;
        boolean isFinish = false;
        totalSpaceDiff = ((height * width)*4);
        totalSpaceDiff = totalSpaceDiff - (percentNoPaint*totalSpaceDiff)/100;

        while (!input.equals("Tired!")) {
            int paintLit = Integer.parseInt(input);


            totalPaint = totalPaint + paintLit;

            if (totalPaint>totalSpaceDiff){
                isFinish = true;
                break;
            }

            if (totalPaint==totalSpaceDiff){
                break;
            }
            input = scanner.nextLine();
        }
        double diff = Math.abs(totalSpaceDiff-totalPaint);
        if (isFinish){
            System.out.printf("All walls are painted and you have %.0f l paint left!",diff);
        }else if (input.equals("Tired!")){
            System.out.printf("%.0f quadratic m left.",diff);
        }else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
