package Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        // Входни данни в конзолата:
        Scanner scanner = new Scanner(System.in);
        //1.Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        int nylon = Integer.parseInt(scanner.nextLine());
        //2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        int paint = Integer.parseInt(scanner.nextLine());
        //3. Количество разредител (в литри) - цяло число в интервала [1…30]
        int thinner = Integer.parseInt(scanner.nextLine());
        //4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        int hours = Integer.parseInt(scanner.nextLine());


        //Изход СУМА ЗА ВСИЧКИ РАЗХОДИ


        // За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството боя и 2 кв.м.
        //найлон, разбира се и 0.40 лв. за торбички. Сумата, която се заплаща на майсторите за 1 час работа, е равна
        // на 30% от сбора на всички разходи за материали.


        //Предпазен найлон - 1.50 лв. за кв. метър
        //Боя - 14.50 лв. за литър
        //Разредител за боя - 5.00 лв. за литър
        double priceNylon = (nylon + 2) * 1.50;


        double pricePaint = paint * 14.50;
        double percentPaint = pricePaint * 10 / 100;
        double totalPaint = pricePaint + percentPaint;

        double priceThinner = thinner * 5.00;

        double pricePlastic = 0.40;

        double priceForWork = (priceNylon + totalPaint + priceThinner + pricePlastic);
        double priceForWork1 = priceForWork * 30 / 100;
        double totalPriceForWork = hours * priceForWork1;

        double totalPrice = priceNylon + totalPaint + priceThinner + pricePlastic + totalPriceForWork;

        System.out.println(totalPrice);


    }
}
