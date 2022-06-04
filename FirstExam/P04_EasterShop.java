package FirstExam;

import java.util.Scanner;

public class P04_EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beggingCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        String fillOrBuy= "";
        int sumEggs=beggingCount;
        int counterSellEggs = 0;
        boolean isEnough = true;
        while (!input.equals("Close")){
            fillOrBuy=input;
            int buyOrFillEggs = Integer.parseInt(scanner.nextLine());
            if (input.equals("Buy")){
                if (sumEggs<buyOrFillEggs){
                    isEnough=false;
                    break;
                }
                sumEggs = sumEggs - buyOrFillEggs;
                counterSellEggs += buyOrFillEggs;

            }else {
                sumEggs = sumEggs + buyOrFillEggs;
            }

            input = scanner.nextLine();
        }
        if (!isEnough){
            System.out.printf("Not enough eggs in store!%nYou can buy only %d.%n",sumEggs);
        }else {
            System.out.printf("Store is closed!%n%d eggs sold.%n",counterSellEggs);
        }
    }
}
