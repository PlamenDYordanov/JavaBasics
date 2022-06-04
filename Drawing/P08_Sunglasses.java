package Drawing;

import java.util.Scanner;

public class P08_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String spaces ="";

        String firstRow = repeatStr("*",n*2)+
                repeatStr(" ",n)+
                repeatStr("*",n*2);
        System.out.println(firstRow);
        for (int i = 0; i < n-2; i++) {
            String middleRows = repeatStr("*",1)+
                    repeatStr("/",(n+n)-2)+
                    repeatStr("*",1);
            if (i==(n-1)/2-1){
                spaces = repeatStr("|",n);

            }else {
                spaces = repeatStr(" ", n);
            }
            String middleEnd = repeatStr("*",1)+
                    repeatStr("/",(n+n)-2)+
                    repeatStr("*",1);

            System.out.println(middleRows+spaces+middleEnd);

        }
        String lastRow = repeatStr("*",n*2)+
                repeatStr(" ",n)+
                repeatStr("*",n*2);
        System.out.println(lastRow);

    }static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text+=strToRepeat;
        }
        return text;
    }
}
