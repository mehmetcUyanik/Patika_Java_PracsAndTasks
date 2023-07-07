package Pracs;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.println("Türkçe Notunuz :");
        turkce = input.nextInt();

        System.out.println("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.println("Müzik Notunuz :");
        muzik = input.nextInt();

        double avarage = (mat+fizik+turkce+kimya+muzik) / 5;

        if (avarage <= 55){
            System.out.println("Sınıfta Kaldınız.");
        }else {
            System.out.println("Sınıfı Geçtiniz.");
        }
        System.out.println("Ortalamanız : " + avarage);



    }
}
