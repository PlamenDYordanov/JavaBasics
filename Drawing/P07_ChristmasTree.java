package Drawing;

import java.util.Scanner;

public class P07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        String firstRow = repeatStr(" ",n+1)+
                repeatStr("|",1);

        System.out.println(firstRow);
        for (int i = 1; i <= n; i++) {
            String spaces = repeatStr(" ",n-i);
            String stars = repeatStr("*",i)+
                    repeatStr(" | ",1)+
                    repeatStr("*",i);
            System.out.println(spaces+stars);
        }

    }static String repeatStr(String repeatToStr, int count){
        String text = "";
        for (int i = 1; i<=count ; i++) {
            text+=repeatToStr;
        }
        return text;
    }
}
