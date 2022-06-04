package FourthExam;

import java.util.Scanner;

public class P05_FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customer = Integer.parseInt(scanner.nextLine());

        double totalCounter = 0;
        int counterBack = 0;
        int counterChest = 0;
        int counterLegs = 0;
        int counterAbs = 0;
        int counterProteinShake = 0;
        int counterProteinBar = 0;

        for (int i = 1; i <= customer ; i++) {

            String action = scanner.nextLine();


            switch (action){
                case "Back":
                totalCounter++;
                counterBack++;
                    break;
                case "Chest":
                    totalCounter++;
                    counterChest++;
                    break;
                case "Legs":
                    totalCounter++;
                    counterLegs++;
                    break;
                case "Abs":
                    totalCounter++;
                    counterAbs++;
                    break;
                case "Protein shake":
                    totalCounter++;
                    counterProteinShake++;
                    break;
                case "Protein bar":
                    totalCounter++;
                    counterProteinBar++;
                    break;

            }
        }

        double percentWorkOut = (counterBack+counterChest+counterLegs+counterAbs)/totalCounter*100;
        double percentProtein = (counterProteinBar+counterProteinShake)/totalCounter*100;

        System.out.printf("%d - back%n",counterBack);
        System.out.printf("%d - chest%n",counterChest);
        System.out.printf("%d - legs%n",counterLegs);
        System.out.printf("%d - abs%n",counterAbs);
        System.out.printf("%d - protein shake%n",counterProteinShake);
        System.out.printf("%d - protein bar%n",counterProteinBar);
        System.out.printf("%.2f%% - work out%n",percentWorkOut);
        System.out.printf("%.2f%% - protein%n",percentProtein);
    }
}
