package NestedLoopExtra;

import java.util.Scanner;

public class P08_SecretDoorsLock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hundreds = Integer.parseInt(scanner.nextLine());
        int dozens = Integer.parseInt(scanner.nextLine());
        int unit = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= hundreds ; i++) {
            if (i%2==1){
                continue;
            }
            for (int j = 1; j <= dozens ; j++) {
                if (j==1 || j==4|| j== 6 || j==8 || j ==9){
                    continue;
                }
                for (int k = 1; k <= unit ; k++) {
                    if (k%2==1){
                        continue;
                    }
                    System.out.printf("%d %d %d%n",i,j,k);
                }
            }
        }
    }
}
