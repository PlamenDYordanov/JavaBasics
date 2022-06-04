package ForLoopExtra;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
        //•	На следващите редове(равни на броят на дните) – броя пациенти,
        // които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]

        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= period; i++) {
            int currentPatients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && untreatedPatients > treatedPatients) {
                doctors++;
            }
            if (currentPatients <= doctors) {
                treatedPatients = treatedPatients + currentPatients;
            } else {
                untreatedPatients = untreatedPatients + (currentPatients - doctors);
                treatedPatients = treatedPatients + doctors;
            }

        }
        System.out.printf("Treated patients: %d.%nUntreated patients: %d.",treatedPatients,untreatedPatients);
    }
}
