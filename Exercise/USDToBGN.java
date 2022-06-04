package Exercise;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Въвеждаме данните в конзолата
        double USD = Double.parseDouble(scanner.nextLine());
        // Въвеждаме колко струва 1 долар за лев.
        double OneUSDToBGN = 1.79549;
        //Пресмятаме задачата като умножим  долара зададен от конзолата по стойността на лев за долар
        double USDToBGN = USD * OneUSDToBGN;
        System.out.println(USDToBGN);
    }

}