package Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        //Входни данни:
        Scanner scanner = new Scanner(System.in);
        //1.Дължина в см – цяло число в интервала [10 … 500]
        int length = Integer.parseInt(scanner.nextLine());
        //2. Широчина в см – цяло число в интервала [10 … 300]
        int width = Integer.parseInt(scanner.nextLine());
        //3. Височина в см – цяло число в интервала [10… 200]
        int height = Integer.parseInt(scanner.nextLine());
        //4. Процент – реално число в интервала [0.000 … 100.000]
        double percent = Double.parseDouble(scanner.nextLine());


        //За рождения си ден Любомир получил аквариум с формата на паралелепипед. Първоначално прочитаме от
        //конзолата на отделни редове размерите му – дължина, широчина и височина в сантиметри. Трябва да се
        //пресметне колко литра вода ще събира аквариума, ако се знае, че определен процент от вместимостта му е
        //заета от пясък, растения, нагревател и помпа.
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм 3 /.
        //Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.

        //Намираме обемът като умножим дължина * ширина * височин

        int volume = length * width * height;
        double totalAmountWater = volume * 0.001;
        double realPercent = percent / 100;
        double totalAmountOfWater = totalAmountWater - (totalAmountWater * realPercent);
        System.out.println(totalAmountOfWater);

    }
}
