package Pracs;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        int r,a;
        double pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        r=input.nextInt();
        System.out.println("Merkez açısını giriniz : ");
        a = input.nextInt();

        double area = pi * r * r ;
        double perimeter = 2 * pi * r;
        double circleSlice = ((area * a) / 360);

        System.out.println("Alan : " + area);
        System.out.println("Çevre : " + perimeter);
        System.out.println("Dilim Alanı : " + circleSlice);
    }
}
