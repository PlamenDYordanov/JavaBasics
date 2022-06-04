package Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        //Входни данни:
        Scanner scanner = new Scanner(System.in);
        //Брой пакети химикали - цяло число в интервала [0...100]
        int pens = Integer.parseInt(scanner.nextLine());
        //Брой пакети маркери - цяло число в интервала [0...100]
        int markers = Integer.parseInt(scanner.nextLine());
        //Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        int cleaners = Integer.parseInt(scanner.nextLine());
        //Процент намаление - цяло число в интервала [0...100]
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        //Изходни данни Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.
       double sumPens = pens * 5.80;
       double sumMarkers = markers * 7.20;
       double sumCleaners = cleaners * 1.20;
       double finalSum = sumPens + sumMarkers + sumCleaners;
       double discount = finalSum * percentDiscount / 100;
       double total = finalSum - discount;
        System.out.println(total);



    }
}