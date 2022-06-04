package NestedLoopExtra;

import java.util.Scanner;

public class P07_SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int maxPassword = Integer.parseInt(scanner.nextLine());
        char charI = ' ';
        char charJ = ' ';
        char charM = ' ';
        char charN = ' ';
        int counter = 0;
        boolean isFinish = false;
        boolean isEnd = false;
        int m = 64;
        int k = 1;
        int l =0;


        for (int i = 35; i <=55 ; i++) {
            isFinish = false;
            charI = (char) i;
            for ( m = m; m <=96 ; m++) {
                if (l==secondNum&&k==firstNum){
                    isEnd= true;
                    break;
                }
                if (l==secondNum){
                    k++;
                    l=0;
                }
                charM = (char) m;
                if (isFinish){
                    break;
                }
                l++;
                System.out.printf("%c%c%d%d%c%c",i,m,k,l,m,i);
                System.out.print("|");
                counter++;
                if (i==55){
                    i=34;
                }
                if (m==96){
                    m =63;
                }
                if (counter==maxPassword){
                    isEnd=true;
                    break;
                }
                isFinish=true;
            }
            if (isEnd){
                break;
            }
        }

        }

    }


