package Exercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитаме радианите от конзолата
        double radians = Double.parseDouble(scanner.nextLine());
        //Разписваме формулата за откркриване на градуси: градус = радиан * 180 / π.
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
