package MoniPb.FirstStepsInCodding;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();;
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int hours = numberOfProjects*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name,hours,numberOfProjects);
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
    }
}
