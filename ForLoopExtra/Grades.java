package ForLoopExtra;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents =  Integer.parseInt(scanner.nextLine());
        int topStudent =0;
        int aboveAverage = 0;
        int average = 0;
        int fail = 0;
        double failStudentsGrade = 0;
        double averageStudentsGrade = 0;
        double aboveAverageStudentsGrade = 0;
        double topStudentsGrade = 0;
        double totalGrade=0;

        for (int i = 1; i <=countStudents ; i++) {
            double grades = Double.parseDouble(scanner.nextLine());
            if (grades <=2.99){
                failStudentsGrade=failStudentsGrade+grades;
            fail++;
            }else if (grades<=3.99){
                averageStudentsGrade=averageStudentsGrade+grades;
            average++;
            }else if (grades<=4.99){
                aboveAverageStudentsGrade=aboveAverageStudentsGrade+grades;
            aboveAverage++;
            }else {
                topStudentsGrade=topStudentsGrade+grades;
            topStudent++;
            }
            totalGrade=failStudentsGrade+averageStudentsGrade+aboveAverageStudentsGrade+topStudentsGrade;
        }
        System.out.printf("Top students: %.2f%%%n",topStudent*1.0/countStudents*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",aboveAverage*1.0/countStudents*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",average*1.0/countStudents*100);
        System.out.printf("Fail: %.2f%%%n",fail*1.0/countStudents*100);
        System.out.printf("Average: %.2f%n",totalGrade/countStudents);
    }
}
