package Pracs;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void plus() {
        int counter, result = 0, number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane değer girilecek : ");
        counter = scan.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı : ");
            number = scan.nextInt();
            result += number;
        }
        System.out.print("Cevap : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        int numCount, result;
        int[] nums;

        System.out.print("Kaç sayı gireceksiniz? ");
        numCount = scan.nextInt();

        nums = new int[numCount];
        for (int i = 1; i < numCount; i++) {
            System.out.print(i + ". sayıyı girin: ");
            nums[i] = scan.nextInt();
        }
        result = nums[0];
        for (int i = 1; i < numCount; i++) {
            if (nums[i] > result) {
                result = nums[i] - result;
            } else {
                result -= nums[i];
            }
        }
        System.out.println("Cevap =  " + result);
    }

    static void times() {
        int number, result = 1, counter;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı girilecek : ");
        counter = scan.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            result *= number;
        }
        System.out.print("Cevap = " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        double number, result = 0.0;
        int counter;
        System.out.print("Kaç adet sayı girilecek : ");
        counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı : ");
            number = scan.nextInt();
            if (i != 1 && number == 0) {
                System.out.print("Böleni 0 giremezsiniz ");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.print("Cevap = " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        int base, exponent, result = 1;
        System.out.print("Taban değeri : ");
        base = scan.nextInt();
        System.out.print("Üs değeri girin : ");
        exponent = scan.nextInt();
        if (exponent == 0) {
            result = 1;
        }
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.print("Cevap = " + result);

    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        int result = 1;
        System.out.print("Sayı giriniz : ");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.print(number + " Faktoriyel = " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        int num1, num2, result = 0;
        System.out.print("İlk sayıyı giriniz : ");
        num1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        num2 = scan.nextInt();

        result += num1 % num2;
        System.out.print("Cevap : " + result);
    }
    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        int a ,b, cevre,alan;
        System.out.print("Uzun kenarı giriniz : ");
        a = scan.nextInt();
        System.out.print("Kısa kenarı giriniz : ");
        b = scan.nextInt();

        if (a == 0 || b == 0){
            System.out.print("Uzunluk değeri 0 olamaz ");
            rectangle();
        }
        alan = a * b;
        cevre = 2 * (a + b);
        System.out.print("Çevresi = "+cevre);
        System.out.println("Alanı = "+ alan);
    }


    public static void main(String[] args) {
        int select;
        String menu = "\n******************"
                + "\n1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış yap"
                + "\n******************";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            Scanner scan = new Scanner(System.in);
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
            }

        } while (select != 0);
    }

}
