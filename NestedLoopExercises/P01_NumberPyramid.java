package NestedLoopExercises;

import java.util.Scanner;

public class P01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;
        boolean isEqual = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {

                if (currentNum<=n){
                    System.out.print(currentNum + " ");
                    currentNum++;
                }
                if (currentNum>n){
                    isEqual = true;
                    break;
                }

            }
            if (isEqual){
                break;
            }
            System.out.println();
        }

    }
}
