package SeventhExam;

import java.util.Scanner;

public class P04_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int priceTicket = 5;
        int totalPrice = 0;
        int counterPeople = 0;
        boolean isFull = false;
        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
            counterPeople = counterPeople + people;
            if (counterPeople > capacity) {
                isFull = true;
                break;
            }
            if (people % 3 == 0) {
                totalPrice = totalPrice + (people * priceTicket) - 5;
            } else {
                totalPrice = totalPrice + (people * priceTicket);
            }

            input = scanner.nextLine();
        }
        double diff = Math.abs(capacity - counterPeople);
        if (isFull) {
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %d lv.%n", totalPrice);
        } else {
            System.out.printf("There are %.0f seats left in the cinema.%n", diff);
            System.out.printf("Cinema income - %d lv.%n", totalPrice);
        }
    }
}
