package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = Integer.parseInt(scanner.nextLine());
    int sum =0;
    while (true){
        if (number<=sum){
            break;
        }
        int currentNum = Integer.parseInt(scanner.nextLine());
        sum += currentNum;

    }
        System.out.println(sum);
    }

}
