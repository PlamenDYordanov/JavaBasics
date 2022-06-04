package EightExam;

import java.util.Scanner;

public class P06_NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String name = "";
        char symbol = ' ';
        int points = 0;
        int maxPoints = Integer.MIN_VALUE;
        String MaxName = "";


        while (!input.equals("Stop")){
        name = input;
        int lengthName = name.length();
            for (int i = 1; i <=lengthName ; i++) {
                input = scanner.nextLine();
                int asciiNumber = Integer.parseInt(input);
                symbol = name.charAt(i-1);
                if (symbol == asciiNumber){
                    points = points+ 10;
                }else {
                    points = points +2;
                }



            }
            if (maxPoints<=points){
                maxPoints = points;
                MaxName = name;
            }
            points =0;
            input = scanner.nextLine();


        }
        System.out.printf("The winner is %s with %d points!",MaxName,maxPoints);
    }
}
