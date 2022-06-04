package Exam02PB;

import java.util.Scanner;

public class P02_Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double widthShip = Double.parseDouble(scanner.nextLine());
        double lengthShip = Double.parseDouble(scanner.nextLine());
        double heightShip = Double.parseDouble(scanner.nextLine());
        double averageHeightPeople = Double.parseDouble(scanner.nextLine());

        double volumeShip = widthShip*lengthShip*heightShip;
        double volumeOneRoom = (averageHeightPeople+0.40)*2*2;
        double freeSpace = Math.floor(volumeShip/volumeOneRoom);
        if (freeSpace>=3&&freeSpace<=10){
            System.out.printf("The spacecraft holds %.0f astronauts.",freeSpace);
        }else if (freeSpace<3){
            System.out.println("The spacecraft is too small.");
        }else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
