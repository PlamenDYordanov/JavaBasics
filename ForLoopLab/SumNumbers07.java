package ForLoopLab;

import java.util.Scanner;

public class SumNumbers07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (int i = 0; i < number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
sum =sum +=currentNum;
        }
        System.out.println(sum);
    }
}
