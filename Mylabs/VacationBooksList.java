package Mylabs;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        // Въвеждане от конзолата
        Scanner scanner = new Scanner(System.in);
        //1. Брой страници в текущата книга – цяло число в интервала [1…1000]
        int numberPages = Integer.parseInt(scanner.next());
        //2. Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        int pagesForHour = Integer.parseInt(scanner.next());
        //3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
        int requireDays = Integer.parseInt(scanner.next());
        //Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.
        int pagesPerHour = numberPages / pagesForHour;
        int requireHourPerDay = pagesPerHour / requireDays;
        System.out.println(requireHourPerDay);
    }
}
