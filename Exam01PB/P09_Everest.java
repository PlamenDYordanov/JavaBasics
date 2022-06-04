package Exam01PB;

import java.util.Scanner;

public class P09_Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String yesOrNo = "";
        int days = 1;
        int totalMeters = 5364;
        int everestSummit = 8848;
        boolean isSummit = false;
        while (!input.equals("END")) {
            yesOrNo = input;
            input = scanner.nextLine();
            int meters = Integer.parseInt(input);
            if (yesOrNo.equals("Yes")) {
                days++;
                totalMeters = totalMeters + meters;
            } else {
                totalMeters = totalMeters + meters;
            }
            if (days == 5) {
                break;
            } else if (totalMeters >= everestSummit) {
                isSummit = true;
                break;
            }

            input = scanner.nextLine();

        }
        if (isSummit){
            System.out.printf("Goal reached for %d days!",days);
        }else {
            System.out.println("Failed!");
            System.out.printf("%d%n",totalMeters);
        }
    }
}
