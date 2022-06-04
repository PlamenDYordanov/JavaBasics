package Exam01PB;

import java.util.Scanner;

public class P06_MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


        int firstNumber = number%10;
        number = number /10;
        int secondNum = number%10;
        number = number /10;
        int thirdNum = number%10;


        for (int i = 1; i <=firstNumber ; i++) {
            for (int j = 1; j <=secondNum ; j++) {
                for (int k = 1; k <=thirdNum ; k++) {
                    System.out.printf("%d * %d * %d = %d;%n",i,j,k,i*j*k);
                }
            }
        }
    }
}
