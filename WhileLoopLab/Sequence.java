package WhileLoopLab;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumNumbers = 1;
        while (number>=sumNumbers){
            System.out.println(sumNumbers);

            sumNumbers = (sumNumbers*2) +1;
        }


        }
    }

