package Pracs;

import java.util.Scanner;

public class KdvTutariHesaplama {

    public static void main(String[] args) {

        double tutar;
        double kdvOran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutar Giriniz : ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : "+ tutar);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı :"+kdvTutar);
        System.out.println("KDV'li Tutar : "+kdvliTutar);
    }
}
