package Mylabs;

import java.util.Scanner;

public class YardGreening {
    //Божидара разполага с няколко къщи на Черноморието и желае да озелени дворовете на някои от тях, като
    //по този начин създаде уютна обстановка и комфорт на гостите си. За целта е наела фирма.
    //Напишете програма, която изчислява необходимате сума, които Божидара ще трябва да заплати на фирмата
    //изпълнител на проекта. Цената на един кв. м. е 7.61 лв със ДДС. Понеже нейният двор е доста голям,
    //фирмата изпълнител предлага 18% отстъпка от крайната цена.
    public static void main(String[] args) {
        //В конзолата въвеждаме квадратните метри, които ще бъдат озеленени
        Scanner scanner = new Scanner(System.in);
        double greeningarea = Double.parseDouble(scanner.nextLine());
        double priceWithoutsDis = greeningarea * 7.61;
        double discount = priceWithoutsDis * 18 / 100;
        double finalPrice = priceWithoutsDis - discount;
        System.out.println(finalPrice);
        System.out.println(discount);


    }
}
