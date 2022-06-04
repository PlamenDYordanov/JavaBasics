package Exam02PB;

import java.util.Scanner;

public class P03_CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeCat = scanner.nextLine();
        char gender = scanner.nextLine().charAt(0);
        int years = 0;
        int counter  = 0;
        switch (typeCat){
            case "British Shorthair":
                counter++;
                if (gender=='m'){
                    years =13;
                }else {
                    years=14;
                }
                break;
            case "Siamese":
                counter++;
                if (gender=='m'){
                    years =15;
                }else {
                    years=16;
                }
                break;
            case "Persian":
                counter++;
                if (gender=='m'){
                    years =14;
                }else {
                    years=15;
                }
                break;
            case "Ragdoll":
                counter++;
                if (gender=='m'){
                    years =16;
                }else {
                    years=17;
                }
                break;
            case "American Shorthair":
                counter++;
                if (gender=='m'){
                    years =12;
                }else {
                    years=13;
                }
                break;
            case "Siberian":
                counter++;
                if (gender=='m'){
                    years =11;
                }else {
                    years=12;
                }
                break;
            default:
                System.out.printf("%s is invalid cat!",typeCat);
        }
        int totalPeopleMounts = years*12;
        int totalCatMounts = totalPeopleMounts/6;
        if (counter==1){
            System.out.printf("%d cat months",totalCatMounts);
        }
    }
}
