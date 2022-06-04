package ThirdExam;

import java.util.Scanner;

public class P01_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double rent = Double.parseDouble(scanner.nextLine());


        double priceCake = rent * 0.20;

        double drinks = priceCake * 0.55;

        double animator = rent / 3;

        double requireBudget = rent + priceCake + drinks + animator;

        System.out.println(requireBudget);
    }
}
