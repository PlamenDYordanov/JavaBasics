package ForLoopLab;

import java.util.Scanner;

//буква	    a	e	i	o	u
//стойност	1	2	3	4	5
public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            char symbol = text.charAt(i);
            if (symbol == 'a') {
                sum += 1;
            } else if (symbol == 'e') {
                sum += 2;
            } else if (symbol == 'i') {
                sum += 3;
            } else if (symbol == 'o') {
                sum += 4;
            } else if (symbol == 'u') {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
