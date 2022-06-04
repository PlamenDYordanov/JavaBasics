package SixthExam;

import java.util.Scanner;

public class P01_OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        double figurines = rent * 0.70;
        double catering = figurines * 0.85;
        double sounds = catering / 2;

        System.out.printf("%.2f",rent+figurines+catering+sounds);
    }
}
