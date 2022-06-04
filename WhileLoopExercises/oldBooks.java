package WhileLoopExercises;

import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String neededBook = scanner.nextLine();
        String input  = scanner.nextLine();
        int counterBook = 0;

        while (!input.equals("No More Books")){
            if (input.equals(neededBook)){
                break;
            }
            counterBook++;

            input = scanner.nextLine();
        }

        if (input.equals(neededBook)){
            System.out.printf("You checked %d books and found it.",counterBook);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",counterBook);
        }

    }
}
