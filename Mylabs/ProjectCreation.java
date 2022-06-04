package Mylabs;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        //Въвеждаме в конзолата Името на архитекта - текст и Брой на проектите, които трябва да изготви - цяло число в интервала.
        Scanner scanner = new Scanner(System.in);
        String nameOfArh = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int requirehours = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameOfArh, requirehours, projects);


    }
}
