package Pracs;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {


    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");

        mat = input.nextInt();

        System.out.println("Fizik Notunuz : ");

        fizik = input.nextInt();

        System.out.println("Kimya Notunuz : ");

        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz : ");

        turkce = input.nextInt();

        System.out.println("Tarih Notunuz : ");

        tarih = input.nextInt();

        System.out.println("Müzik Notunuz : ");

        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);

        double sonuc = toplam/ 6.0;

        System.out.println("Ortalamanız : " +sonuc);
        System.out.println(sonuc < 60 ? "Sınıfta Kaldınız." : "Sınıfı Geçtiniz.");

    }
}
