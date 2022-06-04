package SecondExam;

import java.util.Scanner;

public class P02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceLuggage = Double.parseDouble(scanner.nextLine());
        double luggageKilos = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countLuggage = Integer.parseInt(scanner.nextLine());

//        1.	Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
//        2.	Килограми на багажа – реално число в диапазона [1.0…32.0]
//        3.	Дни до пътуването – цяло число в диапазона [1…60]
//        4.	Брой багажи – цяло число в диапазона [1…10]

        if (luggageKilos<10){
            priceLuggage = priceLuggage * 0.20;
        }else  if (luggageKilos>=10&&luggageKilos<=20){
            priceLuggage = priceLuggage * 0.50;
        }else {
            priceLuggage = priceLuggage;
        }

        if (days<7){
            priceLuggage = priceLuggage * 1.40;
        }else  if (days<=30){
            priceLuggage = priceLuggage * 1.15;
        }else {
            priceLuggage = priceLuggage * 1.10;
        }
        double totalSum = countLuggage * priceLuggage;
        System.out.printf("The total price of bags is: %.2f lv.%n",totalSum);
    }
}
