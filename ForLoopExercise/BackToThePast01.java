package ForLoopExercise;

import java.util.Scanner;

public class BackToThePast01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyFromHeritage = Double.parseDouble(scanner.nextLine());
        int lastYear = Integer.parseInt(scanner.nextLine());
double spendMoney = 0;
int yearsOfIvan= 18;
        for (int i = 1800; i <=lastYear ; i++) {
            if (i%2==0){
                spendMoney=spendMoney+12000;
                yearsOfIvan++;
            }else {
                spendMoney=spendMoney+12000+(50*yearsOfIvan);
                yearsOfIvan++;
            }

        }if (moneyFromHeritage>=spendMoney){
        System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",moneyFromHeritage-spendMoney);
        }else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(spendMoney-moneyFromHeritage));
        }
    }
}
