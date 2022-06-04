package MoniPb.MoreExercises;

import java.util.Scanner;

public class Task10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneLvNum = Integer.parseInt(scanner.nextLine());
        int twoLvNum = Integer.parseInt(scanner.nextLine());
        int fiveLvNum = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <=oneLvNum ; i++) {
            for (int j = 0; j <=twoLvNum ; j++) {
                for (int k = 0; k <=fiveLvNum ; k++) {
                    if ((i*1) + (j*2) + (k*5) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i,j,k,sum);
                    }
                }
            }
        }
    }
}
