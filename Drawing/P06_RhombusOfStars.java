package Drawing;

import java.util.Scanner;

public class P06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String firstRow = repeatStr(" ",n-i)+
                    repeatStr("*",1)+
                    repeatStr(" *",i-1);
            System.out.println(firstRow);
        }
        for (int i = 1; i <=n-1 ; i++) {
            String secondRow = repeatStr(" ",i)+
                    repeatStr("*",1)+
                    repeatStr(" *",n-(i+1));
            System.out.println(secondRow);
        }

    }static  String repeatStr (String strToRepeat,int count){
        String text = "";
        for (int i = 1; i <=count ; i++) {
            text+=strToRepeat;
        }
        return text;
    }

}
