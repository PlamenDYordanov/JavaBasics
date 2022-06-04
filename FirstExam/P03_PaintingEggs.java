package FirstExam;

import java.util.Scanner;

public class P03_PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int countPackage = Integer.parseInt(scanner.nextLine());//бройПартиди

        double totalSum = 0;
        int price = 0;

        switch (size){
            case "Large":
                if (color.equals("Red")){
                price = 16;
                }else if (color.equals("Yellow")){
                    price = 9;
                }else if (color.equals("Green")){
                    price = 12;
                }
                totalSum = countPackage*price;
                break;

            case "Medium":
                if (color.equals("Red")){
                    price = 13;
                }else if (color.equals("Yellow")){
                    price = 7;
                }else if (color.equals("Green")){
                    price = 9;
                }
                totalSum = countPackage*price;
                break;

            case "Small":
                if (color.equals("Red")){
                    price = 9;
                }else if (color.equals("Yellow")){
                    price = 5;
                }else if (color.equals("Green")){
                    price = 8;
                }
                totalSum = countPackage*price;
                break;
        }
        double expenses = totalSum * 0.35;
        double total = totalSum -expenses;

        System.out.printf("%.2f%n",total);

    }
}
