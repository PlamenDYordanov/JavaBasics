package EightExam;

import java.util.Scanner;

public class P05_PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldGames = Integer.parseInt(scanner.nextLine());


        int totalCounter  = 0;
        int hearthstoneCount = 0;
        int fortniteCount = 0;
        int overWatchCount = 0;
        int other = 0;

        for (int i = 1; i <=soldGames ; i++) {
            String nameOfGame = scanner.nextLine();
            totalCounter++;
            switch (nameOfGame){
                case "Hearthstone":
                    hearthstoneCount++;
                    break;
                case "Fornite":
                    fortniteCount++;
                    break;
                case "Overwatch":
                    overWatchCount++;
                    break;
                default:
                    other++;
                    break;
            }

        }
        System.out.printf("Hearthstone - %.2f%%%n",(hearthstoneCount*1.0/totalCounter)*100);
        System.out.printf("Fornite - %.2f%%%n",(fortniteCount*1.0/totalCounter)*100);
        System.out.printf("Overwatch - %.2f%%%n",(overWatchCount*1.0/totalCounter)*100);
        System.out.printf("Others - %.2f%%%n",(other*1.0/totalCounter)*100);

    }
}
