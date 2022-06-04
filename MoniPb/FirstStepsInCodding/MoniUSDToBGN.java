package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class MoniUSDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD = Double.parseDouble(scanner.nextLine());
        double BNG = USD * 1.79549;
        System.out.println(BNG);
    }
}
