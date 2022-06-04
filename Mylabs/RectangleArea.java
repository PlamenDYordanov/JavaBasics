package Mylabs;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        // Да се въведат две цели числа, с помоща на който да пресметнем лицето на триъгълник от конзолата.
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int arena = a * b;
        System.out.println(arena);

    }
}
