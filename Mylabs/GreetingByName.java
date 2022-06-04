package Mylabs;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        //Да се напише програма, която чете от конзолата текст (име на човек) и отпечатва Hello, <name>!, където "name" е въведеното име от конзолата.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name +"!");
    }
}
