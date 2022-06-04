package Mylabs;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        //Да се напише програма, която чете от конзолата реално число и го преобразува от инчове в сантиметри. За
        //целта умножете инчовете по 2.54.
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
    }

