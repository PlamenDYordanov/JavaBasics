package ForLoopExercise;

import java.util.Scanner;

public class Salary05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int salaryAfterPage = 0;
        int fine = 0;
        int totalFine = 0;
        for (int i = 0; i < numberOfPages; i++) {
            if (salary <=0) {
                break;
            }
            String pageName = scanner.nextLine();
            switch (pageName) {
                case "Facebook":
                    fine =+ 150;
                    totalFine= totalFine+fine;
                    salary = salary - fine;
                   salaryAfterPage = salary;


                    break;
                case "Instagram":
                    fine =+100;
                    totalFine= totalFine+fine;
                    salary = salary - fine;
                    salaryAfterPage= salary;

                    break;
                case "Reddit":
                    fine =+ 50;
                    totalFine= totalFine+fine;
                    salary = salary - fine;
                    salaryAfterPage= salary;

                    break;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(Math.abs(salary));
        }
    }
}
