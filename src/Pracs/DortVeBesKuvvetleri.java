package Pracs;

import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        number = input.nextInt();

        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri.");
        for (int i=1;i<=number;i*=4){
            System.out.println(i);
        }

        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri.");
        for (int i=1;i<=number;i*=5){
            System.out.println(i);
        }

    }
}
