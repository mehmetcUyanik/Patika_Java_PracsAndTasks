package Pracs;

import java.util.Scanner;

public class HipotenusBulma {

    public static void main(String[] args) {

        double a,b,c;
        double area;
        double perimeter;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Kenarı Giriniz : ");
        a=input.nextDouble();
        System.out.println("İkinci Kenarı Giriniz : ");
        b=input.nextDouble();
        System.out.println("Üçüncü Kenarı Giriniz : ");
        c=input.nextDouble();

        perimeter=(a+b+c) / 2;

        area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));


        System.out.println("Alan : "+area);
    }
}
