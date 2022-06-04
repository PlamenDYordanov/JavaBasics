package Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Депозирана сума – реално число в интервала [100.00 … 10000.00]
        double deposit = Double.parseDouble(scanner.nextLine());
        //2.Срок на депозита (в месеци) – цяло число в интервала [1…12]
        int depositTermMounts = Integer.parseInt(scanner.nextLine());
        //3.Годишен лихвен процент – реално число в интервала [0.00 …100.00]
        double interestPercent = Double.parseDouble(scanner.nextLine());


        //формула сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double sumForPeriod = deposit + depositTermMounts * (deposit * interestPercent / 100) / 12;
        System.out.println(sumForPeriod);


    }
}
