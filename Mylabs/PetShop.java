package Mylabs;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        //Напишете програма, която пресмята нужните разходи за закупуването на храна за кучета и котки. На входа трбява да имаме броя храна за кучета(2,50лв.)
        // и котки(4лв.)
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());
        double sumdogs = dogs * 2.5;
        double sumcat = cats * 4;
        double result = sumdogs + sumcat;
        System.out.println(result);

    }

}
