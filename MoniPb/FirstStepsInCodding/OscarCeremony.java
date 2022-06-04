package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class OscarCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());
        double statue = rent - (rent*30/100.0);
        double catering = statue - (statue*15/100.0);
        double sound = catering/2;
        double sum = rent+statue+catering+sound;
        System.out.println(sum);



    }
}
