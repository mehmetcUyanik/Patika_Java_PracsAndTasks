package Pracs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int number;
        int random = rd.nextInt(100);
        int health = 0;
        int[] wrong = new int[5];
        boolean isWrong = false;
        boolean isWin = false;
        System.out.println("*************************************************");

        System.out.println("SAYI TAHMİN OYUNUNA HOŞ GELDİNİZ."
                + "\n0 ile 100 arasında bir sayı tahmin edeceksiniz."
                + "\nToplamda 5 hakkınız var."
                + "\nBol şanslar.");

        while (health < 5) {

            System.out.println("Lütfen bir tahmin giriniz: ");
            number = sc.nextInt();

            if (number < 0 || number > 99) {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz!");

                if (isWrong) {

                    wrong[health++] = number;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - health));
                } else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");
                }

            } else if (number == random) {

                System.out.println("Tebrikler doğru sayıyı tahmin ettiniz.");
                break;

            } else {
                System.out.println("Hatalı bir sayı girdiniz !");

                wrong[health++]= number;

                if (number < random) {
                    System.out.println("Gizli sayıdan küçük bir sayı girdiniz.");
                } else {
                    System.out.println("Gizli sayıdan büyük bir sayı girdiniz.");
                }
                System.out.println("Kalan hakkınız: " + (5 - health));
            }

        }

        if (!isWin) {

            System.out.println("Kaybetttiniz!");

            System.out.println("Tahminleriniz: "+Arrays.toString(wrong));
            System.out.println("Gizli sayı: "+ random);
        }

    }

}

