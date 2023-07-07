package Tasks;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armut = 2.14, armutCost, armutKg;
        double elma = 3.67, elmaCost, elmaKg;
        double domates = 1.11, domatesCost, domatesKg;
        double muz = 0.95, muzCost, muzKg;
        double patlican = 5, patlicanCost, patlicanKg;
        double total;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo? : ");
        armutKg= input.nextDouble();
        armutCost= armut * armutKg;

        System.out.println("Elma Kaç Kilo? : ");
        elmaKg= input.nextDouble();
        elmaCost= elma * elmaKg;

        System.out.println("Domates Kaç Kilo? : ");
        domatesKg= input.nextDouble();
        domatesCost= domates * domatesKg;

        System.out.println("Muz Kaç Kilo? : ");
        muzKg= input.nextDouble();
        muzCost= muz * muzKg;

        System.out.println("Patlican Kaç Kilo? : ");
        patlicanKg= input.nextDouble();
        patlicanCost= patlican * patlicanKg;

        total=armutCost+elmaCost+domatesCost+muzCost+patlicanCost;

        System.out.println("Toplam Tutar : "+total+" TL");
    }
}
